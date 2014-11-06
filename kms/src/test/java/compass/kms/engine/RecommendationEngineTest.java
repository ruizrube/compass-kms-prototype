/**
 * 
 */
package compass.kms.engine;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import compass.domain.Volunteer;

/**
 * @author ivan
 *
 */
public class RecommendationEngineTest {

	private static RecommendationEngine recommender;
	
	@BeforeClass
	public static void initTest(){
		recommender=new RecommendationEngine();
		recommender.startupRecommender();	
	}
	
	@AfterClass
	public static void finishTest(){
		recommender.shutdownRecommender();
	}

	
	@Test
	public void testNewVolunteer() {
		Volunteer v=new Volunteer();
		v.setName("hola");
		recommender.changeVolunterFact(v);
	}

	@Test
	public void testStatus() {
		recommender.showStatus();
	}

	
	
	
}

