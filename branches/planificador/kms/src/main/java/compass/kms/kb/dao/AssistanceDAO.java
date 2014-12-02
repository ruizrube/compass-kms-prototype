/**
 * 
 */
package compass.kms.kb.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import compass.kms.kb.domain.Beneficiary;
import compass.kms.kb.domain.Volunteer;
import compass.kms.recommender.SimpleAssistance;

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
