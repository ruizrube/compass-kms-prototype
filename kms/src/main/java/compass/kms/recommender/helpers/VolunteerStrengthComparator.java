/**
 * 
 */
package compass.kms.recommender.helpers;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;

import compass.kms.kb.domain.Volunteer;

/**
 * @author ivan
 *
 */
public class VolunteerStrengthComparator implements Comparator<Volunteer>{

    public int compare(Volunteer a, Volunteer b) {

        return new CompareToBuilder()

                .append(a.getAcquiredCompetences().size(), b.getAcquiredCompetences().size())

                .append(a.getName(), b.getName())

                .toComparison();

    }

}
