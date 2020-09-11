package com.mcnz.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action("/register")
@Result(name = "success", location = "/thankyou.jsp")
public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String execute() throws Exception {
		System.out.println("The age is: " + personBean.getAge());
		return SUCCESS;
		//return "success";
	}
	
	private Person personBean;

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

}
