package Singleton;
// Singleton Pattern : Ce modèle garantit qu'une classe 
//n'a qu'une seule instance et fournit un point d'accès global à cette instance.
public class SingletonTest {

	public static void main(String[] args) {
		SingletonUser singletonUser = SingletonUser.getInstance();
		
		singletonUser.showMessage();
	}
}
