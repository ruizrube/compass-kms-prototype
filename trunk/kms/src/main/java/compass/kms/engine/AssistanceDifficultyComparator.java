/**
 * 
 */
package compass.kms.engine;

import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;

/**
 * @author ivan
 *
 */
public class AssistanceDifficultyComparator implements Comparator<SimpleAssistance>{
	public int compare(SimpleAssistance a, SimpleAssistance b) {

        return new CompareToBuilder()

                .append(a.getPriority(), b.getPriority())

                .append(a.getCreationDate(), b.getCreationDate())

                .toComparison();

    }
}
