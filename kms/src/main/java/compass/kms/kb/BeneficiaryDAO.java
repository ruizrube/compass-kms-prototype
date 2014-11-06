/**
 * 
 */
package compass.kms.kb;

import java.util.ArrayList;
import java.util.List;

import compass.domain.Beneficiary;
import compass.domain.Volunteer;

/**
 * @author ivan
 *
 */
public class BeneficiaryDAO {
	public List<Beneficiary> selectAllBeneficiaries(){
		List<Beneficiary> store = new ArrayList<Beneficiary>();
		
		Beneficiary b1 = new Beneficiary();
		b1.setName("Juanito necesitado");
		store.add(b1);

		Beneficiary b2 = new Beneficiary();
		b2.setName("manolo pobrecito");
		store.add(b2);

		return store;
	}

}
