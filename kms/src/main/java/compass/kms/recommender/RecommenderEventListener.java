/**
 * 
 */
package compass.kms.recommender;

import org.optaplanner.core.api.solver.event.BestSolutionChangedEvent;
import org.optaplanner.core.api.solver.event.SolverEventListener;

/**
 * @author ivan
 *
 */
public class RecommenderEventListener implements SolverEventListener<AssistanceSchedulingPlan>{

			
	@Override
	public void bestSolutionChanged(BestSolutionChangedEvent<AssistanceSchedulingPlan> event) {
		// Ignore invalid solutions
		if (event.isEveryProblemFactChangeProcessed()
				&& event.isNewBestSolutionInitialized()
				&& event.getNewBestSolution().getScore().isFeasible()) {

			System.out.println("Se ha producido un evento");

		}


	}
}
