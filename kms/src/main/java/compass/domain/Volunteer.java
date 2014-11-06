package compass.domain;
import java.util.Set;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Volunteer
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public double placeLatitude;
	
	/**
	 * @return the placeLatitude
	 */
	public double getPlaceLatitude() {
		return placeLatitude;
	}

	/**
	 * @param placeLatitude the placeLatitude to set
	 */
	public void setPlaceLatitude(double placeLatitude) {
		this.placeLatitude = placeLatitude;
	}

	/**
	 * @return the placeLongitude
	 */
	public double getPlaceLongitude() {
		return placeLongitude;
	}

	/**
	 * @param placeLongitude the placeLongitude to set
	 */
	public void setPlaceLongitude(double placeLongitude) {
		this.placeLongitude = placeLongitude;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the acquiredCompetences
	 */
	public Set<AcquiredCompetency> getAcquiredCompetences() {
		return acquiredCompetences;
	}

	/**
	 * @param acquiredCompetences the acquiredCompetences to set
	 */
	public void setAcquiredCompetences(Set<AcquiredCompetency> acquiredCompetences) {
		this.acquiredCompetences = acquiredCompetences;
	}

	/**
	 * @return the availableDates
	 */
	public Set<AvailabilityCalendar> getAvailableDates() {
		return availableDates;
	}

	/**
	 * @param availableDates the availableDates to set
	 */
	public void setAvailableDates(Set<AvailabilityCalendar> availableDates) {
		this.availableDates = availableDates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public double placeLongitude;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String name;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<AcquiredCompetency> acquiredCompetences;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<AvailabilityCalendar> availableDates;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Volunteer(){
		super();
	}
	
	public String toString(){
		return name;
	}


}

