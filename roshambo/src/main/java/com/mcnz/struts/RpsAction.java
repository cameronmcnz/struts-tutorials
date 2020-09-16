package com.mcnz.struts;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

@Action("/rpsaction")
@Results({
	@Result(name = "success", location = "/rps.jsp"),
	@Result(name = "input", location = "/rps.jsp"),
	@Result(name = "error", location = "/error.jsp")
})
public class RpsAction extends ActionSupport {
	
	private String clientGesture;
	private String gameResult;

	@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "clientGesture", message = "Type rock, paper or scissors.")
	public String execute() throws Exception {
		System.out.print(clientGesture);
		
		if (clientGesture.equalsIgnoreCase("paper")) {
			gameResult="win";
		}
		if (clientGesture.equalsIgnoreCase("null")) {
			throw new NullPointerException();
		}
		
		return "success";
	}
	
	public String getGameResult() {
		return gameResult;
	}
	public void setGameResult(String gameResult) {
		this.gameResult = gameResult;
	}

	public String getClientGesture() {
		return clientGesture;
	}
	public void setClientGesture(String clientGesture) {
		this.clientGesture = clientGesture;
	}

}
