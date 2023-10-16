package AbstractFactoryPattern;

public interface Bocal {
	Gourde createGourde(String name);
	Bouteille createBouteille(String name);
	
}
