/**
 * 
 */
package compass.kms.engine;

import java.io.Serializable;
import java.util.Date;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

import compass.domain.AssistanceRequest;
import compass.domain.AttendancePriority;
import compass.domain.Beneficiary;
import compass.domain.PlannedAssistance;
import compass.domain.RequestStatus;
import compass.domain.Service;
import compass.domain.Volunteer;

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
	 * @see compass.domain.AssistanceRequest#getCreationDate()
	 */
	public Date getCreationDate() {
		return request.getCreationDate();
	}

	/**
	 * @param creationDate
	 * @see compass.domain.AssistanceRequest#setCreationDate(java.util.Date)
	 */
	public void setCreationDate(Date creationDate) {
		request.setCreationDate(creationDate);
	}

	/**
	 * @return
	 * @see compass.domain.PlannedAssistance#getAssistanceDate()
	 */
	//@PlanningVariable(nullable = true,valueRangeProviderRefs = {"dateRange"})
	public Date getAssistanceDate() {
		return assistance.getAssistanceDate();
	}

	/**
	 * @param assistanceDate
	 * @see compass.domain.PlannedAssistance#setAssistanceDate(java.util.Date)
	 */
	public void setAssistanceDate(Date assistanceDate) {
		assistance.setAssitanceDate(assistanceDate);
	}

	/**
	 * @return
	 * @see compass.domain.PlannedAssistance#getFeedback()
	 */
	public int getFeedback() {
		return assistance.getFeedback();
	}

	/**
	 * @param feedback
	 * @see compass.domain.PlannedAssistance#setFeedback(int)
	 */
	public void setFeedback(int feedback) {
		assistance.setFeedback(feedback);
	}

	/**
	 * @return
	 * @see compass.domain.PlannedAssistance#getComments()
	 */
	public String getComments() {
		return assistance.getComments();
	}

	/**
	 * @param comments
	 * @see compass.domain.PlannedAssistance#setComments(java.lang.String)
	 */
	public void setComments(String comments) {
		assistance.setComments(comments);
	}

	/**
	 * @return	
	 * @see compass.domain.PlannedAssistance#getVoluntee()
	 */
    @PlanningVariable(valueRangeProviderRefs = {"volunteerRange"},strengthComparatorClass = VolunteerStrengthComparator.class, nullable = true)
	public Volunteer getVoluntee() {
		return assistance.getVoluntee();
	}

	/**
	 * @param voluntee
	 * @see compass.domain.PlannedAssistance#setVoluntee(compass.domain.Volunteer)
	 */
	public void setVoluntee(Volunteer voluntee) {
		assistance.setVoluntee(voluntee);
	}

	/**
	 * @return
	 * @see compass.domain.AssistanceRequest#getPriority()
	 */
	public AttendancePriority getPriority() {
		return request.getPriority();
	}

	/**
	 * @param priority
	 * @see compass.domain.AssistanceRequest#setPriority(compass.domain.AttendancePriority)
	 */
	public void setPriority(AttendancePriority priority) {
		request.setPriority(priority);
	}

	/**
	 * @return
	 * @see compass.domain.AssistanceRequest#getState()
	 */
	public RequestStatus getState() {
		return request.getState();
	}

	/**
	 * @param state
	 * @see compass.domain.AssistanceRequest#setState(compass.domain.RequestStatus)
	 */
	public void setState(RequestStatus state) {
		request.setState(state);
	}

	/**
	 * @return
	 * @see compass.domain.AssistanceRequest#getDesiredDate()
	 */
	public Date getDesiredDate() {
		return request.getDesiredDate();
	}

	/**
	 * @param desiredDate
	 * @see compass.domain.AssistanceRequest#setDesiredDate(java.util.Date)
	 */
	public void setDesiredDate(Date desiredDate) {
		request.setDesiredDate(desiredDate);
	}

	/**
	 * @return
	 * @see compass.domain.AssistanceRequest#getDesiredPlaceLatitude()
	 */
	public long getDesiredPlaceLatitude() {
		return request.getDesiredPlaceLatitude();
	}

	/**
	 * @param desiredPlaceLatitude
	 * @see compass.domain.AssistanceRequest#setDesiredPlaceLatitude(long)
	 */
	public void setDesiredPlaceLatitude(long desiredPlaceLatitude) {
		request.setDesiredPlaceLatitude(desiredPlaceLatitude);
	}

	/**
	 * @return
	 * @see compass.domain.AssistanceRequest#getDesiredPlaceLongitude()
	 */
	public long getDesiredPlaceLongitude() {
		return request.getDesiredPlaceLongitude();
	}

	/**
	 * @param desiredPlaceLongitude
	 * @see compass.domain.AssistanceRequest#setDesiredPlaceLongitude(long)
	 */
	public void setDesiredPlaceLongitude(long desiredPlaceLongitude) {
		request.setDesiredPlaceLongitude(desiredPlaceLongitude);
	}

	/**
	 * @return
	 * @see compass.domain.AssistanceRequest#getService()
	 */
	public Service getService() {
		return request.getService();
	}

	/**
	 * @param service
	 * @see compass.domain.AssistanceRequest#setService(compass.domain.Service)
	 */
	public void setService(Service service) {
		request.setService(service);
	}

	/**
	 * @return
	 * @see compass.domain.AssistanceRequest#getBeneficiary()
	 */
	public Beneficiary getBeneficiary() {
		return request.getBeneficiary();
	}

	/**
	 * @param beneficiary
	 * @see compass.domain.AssistanceRequest#setBeneficiary(compass.domain.Beneficiary)
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
