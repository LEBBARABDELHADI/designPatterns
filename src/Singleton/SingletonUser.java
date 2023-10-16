package Singleton;

public class SingletonUser {

	private static SingletonUser singletonUser;
	
	private SingletonUser() {
		
	}
	public static SingletonUser getInstance() {
		if(singletonUser==null) {
			singletonUser =new SingletonUser();
		}
		return singletonUser;
	}
	
    public void showMessage() {
        System.out.println("Hello, Singleton Pattern!");
    }

}
