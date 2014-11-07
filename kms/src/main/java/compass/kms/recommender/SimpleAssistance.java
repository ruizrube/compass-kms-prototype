/**
 * 
 */
package compass.kms.recommender;

import java.io.Serializable;
import java.util.Date;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

import compass.kms.kb.domain.AssistanceRequest;
import compass.kms.kb.domain.AttendancePriority;
import compass.kms.kb.domain.Beneficiary;
import compass.kms.kb.domain.PlannedAssistance;
import compass.kms.kb.domain.RequestStatus;
import compass.kms.kb.domain.Service;
import compass.kms.kb.domain.Volunteer;
import compass.kms.recommender.helpers.AssistanceDifficultyComparator;
import compass.kms.recommender.helpers.VolunteerStrengthComparator;

/**
 * @author ivan
 *
 */
@PlanningEntity(difficultyComparatorClass = AssistanceDifficultyComparator.class)
public class SimpleAssistance implements Serializable{

	private PlannedAssistance assistance=new PlannedAssistance();
	
	private AssistanceRequest request=new AssistanceRequest();

	private int day;
	
	
	/**
	 * @return the day
	 */
	@PlanningVariable(valueRangeProviderRefs = {"dayRange"})
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.AssistanceRequest#getCreationDate()
	 */
	public Date getCreationDate() {
		return request.getCreationDate();
	}

	/**
	 * @param creationDate
	 * @see compass.kms.kb.domain.AssistanceRequest#setCreationDate(java.util.Date)
	 */
	public void setCreationDate(Date creationDate) {
		request.setCreationDate(creationDate);
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.PlannedAssistance#getAssistanceDate()
	 */
	//@PlanningVariable(nullable = true,valueRangeProviderRefs = {"dateRange"})
	public Date getAssistanceDate() {
		return assistance.getAssistanceDate();
	}

	/**
	 * @param assistanceDate
	 * @see compass.kms.kb.domain.PlannedAssistance#setAssistanceDate(java.util.Date)
	 */
	public void setAssistanceDate(Date assistanceDate) {
		assistance.setAssitanceDate(assistanceDate);
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.PlannedAssistance#getFeedback()
	 */
	public int getFeedback() {
		return assistance.getFeedback();
	}

	/**
	 * @param feedback
	 * @see compass.kms.kb.domain.PlannedAssistance#setFeedback(int)
	 */
	public void setFeedback(int feedback) {
		assistance.setFeedback(feedback);
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.PlannedAssistance#getComments()
	 */
	public String getComments() {
		return assistance.getComments();
	}

	/**
	 * @param comments
	 * @see compass.kms.kb.domain.PlannedAssistance#setComments(java.lang.String)
	 */
	public void setComments(String comments) {
		assistance.setComments(comments);
	}

	/**
	 * @return	
	 * @see compass.kms.kb.domain.PlannedAssistance#getVoluntee()
	 */
    @PlanningVariable(valueRangeProviderRefs = {"volunteerRange"},strengthComparatorClass = VolunteerStrengthComparator.class, nullable = true)
	public Volunteer getVoluntee() {
		return assistance.getVoluntee();
	}

	/**
	 * @param voluntee
	 * @see compass.kms.kb.domain.PlannedAssistance#setVoluntee(compass.kms.kb.domain.Volunteer)
	 */
	public void setVoluntee(Volunteer voluntee) {
		assistance.setVoluntee(voluntee);
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.AssistanceRequest#getPriority()
	 */
	public AttendancePriority getPriority() {
		return request.getPriority();
	}

	/**
	 * @param priority
	 * @see compass.kms.kb.domain.AssistanceRequest#setPriority(compass.kms.kb.domain.AttendancePriority)
	 */
	public void setPriority(AttendancePriority priority) {
		request.setPriority(priority);
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.AssistanceRequest#getState()
	 */
	public RequestStatus getState() {
		return request.getState();
	}

	/**
	 * @param state
	 * @see compass.kms.kb.domain.AssistanceRequest#setState(compass.kms.kb.domain.RequestStatus)
	 */
	public void setState(RequestStatus state) {
		request.setState(state);
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.AssistanceRequest#getDesiredDate()
	 */
	public Date getDesiredDate() {
		return request.getDesiredDate();
	}

	/**
	 * @param desiredDate
	 * @see compass.kms.kb.domain.AssistanceRequest#setDesiredDate(java.util.Date)
	 */
	public void setDesiredDate(Date desiredDate) {
		request.setDesiredDate(desiredDate);
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.AssistanceRequest#getDesiredPlaceLatitude()
	 */
	public long getDesiredPlaceLatitude() {
		return request.getDesiredPlaceLatitude();
	}

	/**
	 * @param desiredPlaceLatitude
	 * @see compass.kms.kb.domain.AssistanceRequest#setDesiredPlaceLatitude(long)
	 */
	public void setDesiredPlaceLatitude(long desiredPlaceLatitude) {
		request.setDesiredPlaceLatitude(desiredPlaceLatitude);
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.AssistanceRequest#getDesiredPlaceLongitude()
	 */
	public long getDesiredPlaceLongitude() {
		return request.getDesiredPlaceLongitude();
	}

	/**
	 * @param desiredPlaceLongitude
	 * @see compass.kms.kb.domain.AssistanceRequest#setDesiredPlaceLongitude(long)
	 */
	public void setDesiredPlaceLongitude(long desiredPlaceLongitude) {
		request.setDesiredPlaceLongitude(desiredPlaceLongitude);
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.AssistanceRequest#getService()
	 */
	public Service getService() {
		return request.getService();
	}

	/**
	 * @param service
	 * @see compass.kms.kb.domain.AssistanceRequest#setService(compass.kms.kb.domain.Service)
	 */
	public void setService(Service service) {
		request.setService(service);
	}

	/**
	 * @return
	 * @see compass.kms.kb.domain.AssistanceRequest#getBeneficiary()
	 */
	public Beneficiary getBeneficiary() {
		return request.getBeneficiary();
	}

	/**
	 * @param beneficiary
	 * @see compass.kms.kb.domain.AssistanceRequest#setBeneficiary(compass.kms.kb.domain.Beneficiary)
	 */
	public void setBeneficiary(Beneficiary beneficiary) {
		request.setBeneficiary(beneficiary);
	}
	
	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append("Beneficiary:").append(this.getBeneficiary());
		sb.append("Volunteer:").append(this.getVoluntee());
		sb.append("Date:").append(this.getDay());
		
		return sb.toString();
		
	}

	
}
