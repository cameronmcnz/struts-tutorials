package com.mcnz.struts;
/* Hello World in Struts 2 Tutorial Action Class */
public class HelloWorldAction {
	
	public String execute() {
		System.out.println("Value of firstname is: " + firstName);
		return "success";
	}
	
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
