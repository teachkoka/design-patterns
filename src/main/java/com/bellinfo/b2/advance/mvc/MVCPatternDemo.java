package com.bellinfo.b2.advance.mvc;

public class MVCPatternDemo {

	public static void main(String[] args) {
		
		Register model = extractRegisterDetails();
		
		RegisterView view = new RegisterView();
		
		RegisterController controller = new RegisterController(model, view);
		controller.updateView();

	}

	private static Register extractRegisterDetails(){
		Register reg = new Register();
		reg.setId(1);
		reg.setName("koka");
		return reg;
	}
	
}
