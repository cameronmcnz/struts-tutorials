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

	@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "clientGesture", message = "Type rock, paper or scissors.")
	public String execute() throws Exception {
		System.out.print(clientGesture);
		Map session = (Map) ActionContext.getContext().get("session");
		ArrayList<String> history =  (ArrayList<String>)session.get("history");
		if (history == null) {
			history = new ArrayList<String>(); 
			session.put("wins", 0);
			session.put("losses", 0);
			session.put("ties",  0);
		}
		history.add(clientGesture);
		session.put("history", history);
		if (clientGesture.equalsIgnoreCase("paper")) {
			int count = 1;
			Object wins = session.get("wins");
			if (wins!=null) {
				count = Integer.parseInt(wins.toString());
				count++;
			}
			gameResult="win"; 
			session.put("wins", count);
		}
		if (clientGesture.equalsIgnoreCase("null")) {
			throw new NullPointerException();
		}
		
		return "success";
	}
	
		private String clientGesture;
	private String gameResult;
	
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
