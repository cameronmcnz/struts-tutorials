package com.mcnz.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

@Action("/myhelloworld")
//@Result(name = "success", location = "/results.jsp")
@Results({
	@Result(name = "success", location = "/results.jsp"),
	@Result(name = "input", location = "/input.jsp"),
	@Result(name = "error", location = "/error.jsp")
})
public class HelloAction extends ActionSupport {

	@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "firstName", message = "Enter a first name.")
	public String execute() throws Exception {
		System.out.println("Inside execute of hello.action");
		System.out.println("Value of firstName is: " + firstName);
		firstName = "Accountant " + firstName;
		
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
