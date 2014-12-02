package compass.kms.recommender;

public interface Recommender {

	public abstract void startupRecommender();

	public abstract void shutdownRecommender();

	public abstract boolean getStatus();
	
	public abstract String getCurrentSolution();
	

}