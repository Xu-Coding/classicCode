package code.Singleton;

public class SingletonClass1 {
	private static SingletonClass1 instance;
	private SingletonClass1(){}
	public static SingletonClass1 getInsteance(){
		if(instance==null){
			instance=new SingletonClass1();
		}
		return instance;
	}
	
//	public static synchronized SingletonClass1 getInsteance(){
//		if(instance==null){
//			instance=new SingletonClass1();
//		}
//		return instance;
//	}
	
//	public static SingletonClass1 getInsteance(){
//		if(instance==null){
//			synchronized (SingletonClass1.class) {
//				if(instance==null){
//					instance=new SingletonClass1();
//				}
//			}
//		}
//		return instance;
//	}
	
	private static class LazyHolder{
		private static final SingletonClass1 INSTANCE=new SingletonClass1(); 
	}
	public static final SingletonClass1 getInstance(){
		return LazyHolder.INSTANCE;
	}
	
}
