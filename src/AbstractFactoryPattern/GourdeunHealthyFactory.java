package AbstractFactoryPattern;

public class GourdeunHealthyFactory implements Bocal {

	@Override
	public Gourde createGourde(String name) {
		// TODO Auto-generated method stub
		return new GourdeUnHealthy();
	}

	@Override
	public Bouteille createBouteille(String name) {
		// TODO Auto-generated method stub
		return new BouteilleUnHealthy();
	}
	
}
