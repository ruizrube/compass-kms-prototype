package compass.kms.kb.domain;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class PlannedAssistance
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Date assistanceDate;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int feedback;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String comments;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public AssistanceStatus status;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Volunteer voluntee;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public PlannedAssistance(){
		super();
	}

	/**
	 * @return the assistanceDate
	 */
	public Date getAssistanceDate() {
		return assistanceDate;
	}

	/**
	 * @param assistanceDate the assistanceDate to set
	 */
	public void setAssitanceDate(Date assitanceDate) {
		this.assistanceDate = assitanceDate;
	}

	/**
	 * @return the feedback
	 */
	public int getFeedback() {
		return feedback;
	}

	/**
	 * @param feedback the feedback to set
	 */
	public void setFeedback(int feedback) {
		this.feedback = feedback;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the status
	 */
	public AssistanceStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(AssistanceStatus status) {
		this.status = status;
	}

	/**
	 * @return the voluntee
	 */
	public Volunteer getVoluntee() {
		return voluntee;
	}

	/**
	 * @param voluntee the voluntee to set
	 */
	public void setVoluntee(Volunteer voluntee) {
		this.voluntee = voluntee;
	}

}

