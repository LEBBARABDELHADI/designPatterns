package AbstractFactoryPattern;

public class GourdeHealthyFactory implements Bocal {

	@Override
	public Gourde createGourde(String name) {
		// TODO Auto-generated method stub
		return new GourdeHealthy();
	}

	@Override
	public Bouteille createBouteille(String name) {
		// TODO Auto-generated method stub
		return new BouteilleHealthy();
	}
	
}
