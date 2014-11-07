/**
 * 
 */
package compass.kms.kb.dao;

import java.util.ArrayList;
import java.util.List;

import compass.kms.kb.domain.Volunteer;

/**
 * @author ivan
 *
 */
public class VolunteerDAO {
	public List<Volunteer> selectAllVolunteers() {

		List<Volunteer> store = new ArrayList<Volunteer>();

		Volunteer v1 = new Volunteer();
		v1.setName("Pepe voluntarioso");
		store.add(v1);

		Volunteer v2 = new Volunteer();
		v2.setName("Carlos lodatodo");
		store.add(v2);
	
		return store;
	}
}
