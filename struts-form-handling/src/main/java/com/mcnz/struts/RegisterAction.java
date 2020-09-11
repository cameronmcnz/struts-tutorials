package com.mcnz.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Action("/register")
@Results({
	@Result(name = "success", location = "/thankyou.jsp"),
	@Result(name = "input", location = "/register.jsp")
})
public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String execute() throws Exception {
		System.out.println("The age is: " + personBean.getAge());
		return SUCCESS;
		//return "success";
	}
	
	public void validate() {
	    if (personBean.getFirstName().length() == 0) {
	        addFieldError("personBean.firstName", "First name is required.");
	    }
	    if (personBean.getEmail().length() == 0) {
	        addFieldError("personBean.email", "Email is required.");
	    }
	    if (personBean.getAge() < 18) {
	        addFieldError("personBean.age", "Age is required and must be 18 or older");
	    }
		
	}
	
	private Person personBean;

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

}
