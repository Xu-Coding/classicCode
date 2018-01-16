package code.Singleton;

//public class SingletonClass2 {
//	private static SingletonClass2 instance=new SingletonClass2();
//	private SingletonClass2(){}
//	public static SingletonClass2 getInstance(){
//		return instance;
//	}
//}


public class SingletonClass2 {
	private static SingletonClass2 instance=null;
	static{
		instance=new SingletonClass2();
	}
	private SingletonClass2(){}
	public static SingletonClass2 getInstance(){
		return instance;
	}
}