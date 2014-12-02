/**
 * 
 */
package compass.kms.recommender.impl;

import java.util.List;

import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

import compass.kms.kb.dao.AssistanceDAO;
import compass.kms.kb.dao.BeneficiaryDAO;
import compass.kms.kb.dao.VolunteerDAO;
import compass.kms.kb.domain.Beneficiary;
import compass.kms.kb.domain.Volunteer;
import compass.kms.recommender.AssistanceSchedulingPlan;
import compass.kms.recommender.Recommender;
import compass.kms.recommender.RecommenderEventListener;
import compass.kms.recommender.SimpleAssistance;
import compass.kms.recommender.helpers.VolunteerChange;

/**
 * @author ivan
 *
 */
public class RecommenderImpl implements Recommender {

	private AssistanceDAO assistancesDAO;

	private VolunteerDAO volunteersDAO;

	private BeneficiaryDAO beneficiariesDAO;

	private Solver solver;

	AssistanceSchedulingPlan bestPlanning;

	public RecommenderImpl() {
		assistancesDAO = new AssistanceDAO();
		volunteersDAO = new VolunteerDAO();
		beneficiariesDAO = new BeneficiaryDAO();

		// Build the Solver
		SolverFactory solverFactory = SolverFactory
				.createFromXmlResource("compass/kms/engine/solverconfig.xml");
		solver = solverFactory.buildSolver();
		//solver.addEventListener(new RecommenderEventListener());

	}

	/* (non-Javadoc)
	 * @see compass.kms.recommender.impl.Recommender#startupRecommender()
	 */
	@Override
	public void startupRecommender() {

		// Solve the problem
		System.out.println("[KMS] Creando solucion inicial...");

		bestPlanning=populateInitialSolution();
		
		System.out.println("[KMS] Resolviendo solución inicial...");
		solver.solve(bestPlanning);
		
		System.out.println("[KMS] Se ha encontrado una solucion optima...");
		bestPlanning = (AssistanceSchedulingPlan) solver.getBestSolution();
		

	}

	
	/* (non-Javadoc)
	 * @see compass.kms.recommender.impl.Recommender#shutdownRecommender()
	 */
	@Override
	public void shutdownRecommender() {
		System.out.println("[KMS] Deteniendo recomendador...");
		solver.terminateEarly();
	}

	@Override
	public boolean getStatus() {
		System.out.println("[KMS] Obteniendo estado del recomendador...");
		// TODO Auto-generated method stub
		return solver.isSolving();
	}

	@Override
	public String getCurrentSolution() {
		System.out.println("[KMS] Obteniendo solucion actual...");
		return "[KMS] Current Solution:" + bestPlanning.toString();
		
	}

	
	public void changeVolunterFact(Volunteer changedVolunteer) {

		System.out.println("[KMS] Planificando datos de voluntario...");

		VolunteerChange volunterChange = new VolunteerChange(changedVolunteer);

		solver.addProblemFactChange(volunterChange);

	}

	public void changeBeneficiaryFact(Beneficiary changedVolunteer) {

		System.out.println("[KMS] Planificando datos de beneficiario...");

	}

	public void changeSimpleAssistance(SimpleAssistance changedVolunteer) {

		System.out.println("[KMS] Planificando datos de peticion de asistencia...");

	}

	private AssistanceSchedulingPlan populateInitialSolution() {

		List<Volunteer> volunteers = volunteersDAO.selectAllVolunteers();
		List<Beneficiary> beneficiaries = beneficiariesDAO
				.selectAllBeneficiaries();

		// Load a problem
		AssistanceSchedulingPlan unsolvedPlanning = new AssistanceSchedulingPlan();

		unsolvedPlanning.setVolunteers(volunteers);
		unsolvedPlanning.setBeneficiaries(beneficiaries);
		unsolvedPlanning.setAssistences(assistancesDAO
				.prepareAssistances(beneficiaries));

		return unsolvedPlanning;
	}

	
}
