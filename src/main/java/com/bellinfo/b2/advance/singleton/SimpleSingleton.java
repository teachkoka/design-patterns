package com.bellinfo.b2.advance.singleton;

public class SimpleSingleton {
	private static SimpleSingleton simpleSingleton = null;

	private SimpleSingleton(){
		
	}
 	public static SimpleSingleton getInstance(){
		if(simpleSingleton == null){
		simpleSingleton= new SimpleSingleton();
		}
		return simpleSingleton;
	}

}
