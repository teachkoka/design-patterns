package com.bellinfo.b2.advance.singleton;

public class RobustSingleton {
	
	private static volatile RobustSingleton robustSingleton = null;
	
	private RobustSingleton(){
		
	}
	
	public static RobustSingleton getInstance(){
		if(robustSingleton == null){
			synchronized (RobustSingleton.class) {
				robustSingleton = new RobustSingleton();
			}
		}
		return robustSingleton;
	}

}
