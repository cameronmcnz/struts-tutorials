package com.mcnz.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action("/ajaxhello")
@Result(name = "success", location = "/results.jsp")
public class AjaxHelloAction {
	
	public String execute() {
		System.out.print("The handle is: " + handle);
		return "success";
	}
	
	private String handle;

	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		this.handle = handle;
	}

}
