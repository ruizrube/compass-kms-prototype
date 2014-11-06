/**
 * 
 */
package compass.kms.engine;

import org.apache.commons.lang.ObjectUtils;
import org.optaplanner.core.impl.score.director.ScoreDirector;
import org.optaplanner.core.impl.solver.ProblemFactChange;

import compass.domain.Volunteer;

/**
 * @author ivan
 *
 */
public class VolunteerChange implements ProblemFactChange {

	Volunteer volunteer;

	public VolunteerChange(Volunteer volunteer) {
		this.volunteer = volunteer;
	}

	@Override
	public void doChange(ScoreDirector scoreDirector) {

		// Obtain the current planning
		AssistanceSchedulingPlan schedulingPlanning = (AssistanceSchedulingPlan) scoreDirector
				.getWorkingSolution();

		// First remove the planning fact from all planning entities that use it

		for (SimpleAssistance asssitance : schedulingPlanning.getAssistences()) {

			if (ObjectUtils.equals(asssitance.getVoluntee(), volunteer)) {

				scoreDirector.beforeVariableChanged(asssitance, "volunteer");

				asssitance.setVoluntee(null);

				scoreDirector.afterVariableChanged(asssitance, "volunteer");

			}

		}

		/*
		 * // A SolutionCloner does not clone problem fact lists (such as
		 * computerList)
		 * 
		 * // Shallow clone the computerList so only workingSolution is
		 * affected, not bestSolution or guiSolution
		 * 
		 * cloudBalance.setComputerList(new
		 * ArrayList<CloudComputer>(cloudBalance.getComputerList()));
		 * 
		 * // Next remove it the planning fact itself
		 * 
		 * for (Iterator<CloudComputer> it =
		 * cloudBalance.getComputerList().iterator(); it.hasNext(); ) {
		 * 
		 * CloudComputer workingComputer = it.next();
		 * 
		 * if (ObjectUtils.equals(workingComputer, computer)) {
		 * 
		 * scoreDirector.beforeProblemFactRemoved(workingComputer);
		 * 
		 * it.remove(); // remove from list
		 * 
		 * scoreDirector.beforeProblemFactRemoved(workingComputer);
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * }
		 */
	}
}
