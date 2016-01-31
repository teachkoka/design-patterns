package com.bellinfo.b2.advance.mvc;

public class RegisterController {
	private Register model;
	private RegisterView view;
	
	public RegisterController(Register model, RegisterView view){
		this.model = model;
		this.view =view;
	}
   public void setRegisterName(String name){
	   model.setName(name);
   }
   
   public void setRegisterId(int id){
	   model.setId(id);
   }
  
   public String getRegisterName(){
	  return model.getName();
   }
   
   public int getRegisterId(){
	   return model.getId();
   }
   
   public void updateView(){
	   view.printRegistrationDetails( model.getId(), model.getName());
   }
}
