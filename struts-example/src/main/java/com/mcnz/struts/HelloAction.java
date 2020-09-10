package com.mcnz.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action("/hello")
@Result(name = "success", location = "/results.jsp")
public class HelloAction {
	
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
