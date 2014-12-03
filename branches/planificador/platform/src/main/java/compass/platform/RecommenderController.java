/**
 * 
 */

package compass.platform;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import compass.kms.recommender.Recommender;
import compass.kms.recommender.impl.RecommenderImpl;

/**
 * @author ivan
 *
 */
@Controller
@RequestMapping("/recommender")
public class RecommenderController {
	@Autowired
	private Recommender recommender;

	
	public RecommenderController() {
		System.out.println("[COMPASS] Arrancando plataforma COMPASS ");
		
	}

	@RequestMapping(value="/startup", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public Callable<String> startUpRecommender() {
		System.out.println("[COMPASS] Iniciando recomendador de COMPASS ");
		
		  return new Callable<String>() {
		    public String call() throws Exception {
		    	recommender.startupRecommender();
		      return "El recomendador ha sido arrancado";
		    }
		  };
		}
	
	
	/*@RequestMapping(value="/startUp", method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public String startUpRecommender() {
		//recommender.startupRecommender();
		try {
			recommender2.startupRecommender();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[COMPASS] Finalizada inicializacion recomendador de COMPASS ");
		
		
		return "Fin del arranque!";
	}
*/
	
	/**
	 * @return
	 * @see es.uca.educacion.sagrega2.sa2.service.SA2Service#selectAllNodes()
	 */
	@RequestMapping(value="/status",method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public boolean getStatus() {
		System.out.println("[COMPASS] Consultando el estado del recomendador de COMPASS ");
			return recommender.getStatus();
	}

	/**
	 * @return
	 * @see es.uca.educacion.sagrega2.sa2.service.SA2Service#selectAllNodes()
	 */
	@RequestMapping(value="/solution",method = RequestMethod.GET, headers = "Accept=application/json")
	@ResponseBody
	public String getCurrentSolution() {
		System.out.println("[COMPASS] Consultando la solucion actual del recomendador de COMPASS ");
		
		return recommender.getCurrentSolution();
	}
}
