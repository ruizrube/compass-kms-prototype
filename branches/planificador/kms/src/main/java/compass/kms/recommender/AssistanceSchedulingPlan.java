/**
 * 
 */
package compass.kms.recommender;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.api.domain.valuerange.CountableValueRange;
import org.optaplanner.core.api.domain.valuerange.ValueRangeFactory;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import compass.kms.kb.domain.Beneficiary;
import compass.kms.kb.domain.Volunteer;

/**
 * @author ivan
 *
 */
@PlanningSolution
public class AssistanceSchedulingPlan implements Solution<HardSoftScore> {

	private List<SimpleAssistance> assistences;

	private List<Volunteer> volunteers;

	private List<Beneficiary> beneficiaries;

	/**
	 * @return the beneficiaries
	 */
	public List<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}

	/**
	 * @param beneficiaries
	 *            the beneficiaries to set
	 */
	public void setBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}


	/**
	 * @return the assistences
	 */
	@PlanningEntityCollectionProperty
	public List<SimpleAssistance> getAssistences() {
		return assistences;
	}

	/**
	 * @param assistences
	 *            the assistences to set
	 */
	public void setAssistences(List<SimpleAssistance> assistences) {
		this.assistences = assistences;
	}

	/**
	 * @return the volunteers
	 */
	@ValueRangeProvider(id = "volunteerRange")
	public List<Volunteer> getVolunteers() {
		return volunteers;
	}

	/**
	 * @param volunteers
	 *            the volunteers to set
	 */
	public void setVolunteers(List<Volunteer> volunteers) {
		this.volunteers = volunteers;
	}

	@ValueRangeProvider(id = "dayRange")
    public CountableValueRange<Integer> getDaysRange() {

        return ValueRangeFactory.createIntValueRange(1, 30);

    }
	/**
	 * @return the score
	 */
	public HardSoftScore getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(HardSoftScore score) {
		this.score = score;
	}

	private HardSoftScore score;

	@Override
	public Collection<? extends Object> getProblemFacts() {
		List<Object> facts = new ArrayList<Object>();
		facts.addAll(beneficiaries);
		facts.addAll(volunteers);
		// Metodo necesario si usamos Drools
		// Do not add the planning entity's because that will be done
		// automatically
		return facts;
	}
	
	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append("This solution has the following score: " + score.getHardScore() + " (hard) " + score.getSoftScore() + "(soft)\n");
		for(SimpleAssistance assistence:this.assistences){
			sb.append(assistence).append("\n  ");
		}
		return sb.toString();
		
	}
}
