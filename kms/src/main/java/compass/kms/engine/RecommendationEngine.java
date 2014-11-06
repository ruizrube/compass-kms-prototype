/**
 * 
 */
package compass.kms.engine;

import java.util.List;

import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;

import compass.domain.Beneficiary;
import compass.domain.Volunteer;
import compass.kms.kb.AssistanceDAO;
import compass.kms.kb.BeneficiaryDAO;
import compass.kms.kb.VolunteerDAO;

/**
 * @author ivan
 *
 */
public class RecommendationEngine {

	private AssistanceDAO assistancesDAO;

	private VolunteerDAO volunteersDAO;

	private BeneficiaryDAO beneficiariesDAO;

	private Solver solver;

	AssistanceSchedulingPlan bestPlanning;

	public RecommendationEngine() {
		assistancesDAO = new AssistanceDAO();
		volunteersDAO = new VolunteerDAO();
		beneficiariesDAO = new BeneficiaryDAO();

		// Build the Solver
		SolverFactory solverFactory = SolverFactory
				.createFromXmlResource("compass/kms/engine/solverconfig.xml");
		solver = solverFactory.buildSolver();
		solver.addEventListener(new RecommenderEventListener());

	}

	public void startupRecommender() {

		// Solve the problem
		System.out.println("Arrancando recomendador...");

		solver.solve(populateInitialSolution());
		AssistanceSchedulingPlan solvedPlanning = (AssistanceSchedulingPlan) solver
				.getBestSolution();

	}

	public void shutdownRecommender() {
		System.out.println("Deteniendo recomendador...");
		solver.terminateEarly();
	}

	public void showStatus() {
		// Display the result toDisplayString(solvedPlanning));
		System.out.println("\nSolved planning:\n" + bestPlanning.toString());
	}

	public void changeVolunterFact(Volunteer changedVolunteer) {

		System.out.println("Planificando datos de voluntario...");

		VolunteerChange volunterChange = new VolunteerChange(changedVolunteer);

		solver.addProblemFactChange(volunterChange);

	}

	public void changeBeneficiaryFact(Beneficiary changedVolunteer) {

		System.out.println("Planificando datos de beneficiario...");

	}

	public void changeSimpleAssistance(SimpleAssistance changedVolunteer) {

		System.out.println("Planificando datos de peticion de asistencia...");

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
