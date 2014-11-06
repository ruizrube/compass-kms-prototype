/**
 * 
 */
package compass.kms.kb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import compass.domain.Beneficiary;
import compass.domain.Volunteer;
import compass.kms.engine.SimpleAssistance;

/**
 * @author ivan
 *
 */
public class AssistanceDAO {

	public List<SimpleAssistance> selectAllAssistances() {

		List<SimpleAssistance> store = new ArrayList<SimpleAssistance>();

		return store;
	}

	public List<SimpleAssistance> prepareAssistances(List<Beneficiary> beneficiaries) {
		List<SimpleAssistance> store = new ArrayList<SimpleAssistance>();

		for(Beneficiary b:beneficiaries){
			SimpleAssistance a = new SimpleAssistance();
			a.setBeneficiary(b);
			a.setCreationDate(new Date(System.currentTimeMillis()));
			store.add(a);
	
		}
		
		return store;

	}
}
