package compass.domain;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class AssistanceRequest
{
	
	private Date creationDate;
	
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public AttendancePriority priority;
	
	/**
	 * @return the priority
	 */
	public AttendancePriority getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(AttendancePriority priority) {
		this.priority = priority;
	}

	/**
	 * @return the state
	 */
	public RequestStatus getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(RequestStatus state) {
		this.state = state;
	}

	/**
	 * @return the desiredDate
	 */
	public Date getDesiredDate() {
		return desiredDate;
	}

	/**
	 * @param desiredDate the desiredDate to set
	 */
	public void setDesiredDate(Date desiredDate) {
		this.desiredDate = desiredDate;
	}

	/**
	 * @return the desiredPlaceLatitude
	 */
	public long getDesiredPlaceLatitude() {
		return desiredPlaceLatitude;
	}

	/**
	 * @param desiredPlaceLatitude the desiredPlaceLatitude to set
	 */
	public void setDesiredPlaceLatitude(long desiredPlaceLatitude) {
		this.desiredPlaceLatitude = desiredPlaceLatitude;
	}

	/**
	 * @return the desiredPlaceLongitude
	 */
	public long getDesiredPlaceLongitude() {
		return desiredPlaceLongitude;
	}

	/**
	 * @param desiredPlaceLongitude the desiredPlaceLongitude to set
	 */
	public void setDesiredPlaceLongitude(long desiredPlaceLongitude) {
		this.desiredPlaceLongitude = desiredPlaceLongitude;
	}

	/**
	 * @return the service
	 */
	public Service getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(Service service) {
		this.service = service;
	}

	/**
	 * @return the currentAssistance
	 */
	public PlannedAssistance getCurrentAssistance() {
		return currentAssistance;
	}

	/**
	 * @param currentAssistance the currentAssistance to set
	 */
	public void setActiveAssistance(PlannedAssistance currentAssistance) {
		this.currentAssistance = currentAssistance;
	}

	/**
	 * @return the beneficiary
	 */
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	/**
	 * @param beneficiary the beneficiary to set
	 */
	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}

	/**
	 * @return the cancelledAssistances
	 */
	public Set<PlannedAssistance> getCancelledAssistances() {
		return cancelledAssistances;
	}

	/**
	 * @param cancelledAssistances the cancelledAssistances to set
	 */
	public void setCancelledAssistances(Set<PlannedAssistance> cancelledAssistances) {
		this.cancelledAssistances = cancelledAssistances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public RequestStatus state;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Date desiredDate;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public long desiredPlaceLatitude;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public long desiredPlaceLongitude;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Service service;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public PlannedAssistance currentAssistance;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Beneficiary beneficiary;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<PlannedAssistance> cancelledAssistances;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public AssistanceRequest(){
		super();
	}

}

