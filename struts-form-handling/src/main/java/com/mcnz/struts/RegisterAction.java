package com.mcnz.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.UrlValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;


@Action("/register")
@Results({
	@Result(name = "success", location = "/thankyou.jsp"),
	@Result(name = "input", location = "/register.jsp"),
	@Result(name = "error", location = "/error.jsp")
})
@ExceptionMapping(exception="java.lang.NullPointerException", result = "error")
@InterceptorRefs(value = { @InterceptorRef(value = "timer"), 
		                   @InterceptorRef( value = "logger" ), 
		                   @InterceptorRef(value = "defaultStack", params = {"exception.logEnabled", "true","exception.logLevel" ,"TRACE"}) })
public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@SkipValidation @Action( value="/badcall", 
			exceptionMappings = {
            @ExceptionMapping(exception = "java.lang.Exception", 
            					result = "error")}
    )
	public String badcall() throws Exception {
		System.out.println("In display action");
		if(true) {throw new Exception();}
		return ERROR;
	}
	

	@SkipValidation @Action( "/display")
	public String display() throws Exception {
		System.out.println("In display action");
		return INPUT;
	}


    @Validations(
        requiredStrings =
        		{ @RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "personBean.lastName", message = "Enter a last name."),
        			@RequiredStringValidator(type = ValidatorType.SIMPLE, fieldName = "personBean.firstName", message = "Enter a first name.")},
        emails =
    			{ @EmailValidator(type = ValidatorType.SIMPLE, fieldName = "personBean.email", message = "You must enter a valid email.")},
        urls =
            	{ @UrlValidator(type = ValidatorType.SIMPLE, fieldName = "personBean.website", message = "Enter a valid URL.")},
        regexFields =
            	{ @RegexFieldValidator(type = ValidatorType.SIMPLE, message="Provide a valid phone number.", fieldName = "personBean.phone", regex = "^\\+?[0-9\\-]+\\*?$")},
        intRangeFields =
            { @IntRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "personBean.age", min = "18", message = "Must be over ${min}.")}
    )
	
	public String execute() throws Exception {
		System.out.println("The age is: " + personBean.getAge());
		return SUCCESS;
	}
	
//	public void validate() {
//	    if (personBean.getFirstName().length() == 0) {
//	        addFieldError("personBean.firstName", "First name is required.");
//	    }
//	    if (personBean.getEmail().length() == 0) {
//	        addFieldError("personBean.email", "Email is required.");
//	    }
//	    if (personBean.getAge() < 18) {
//	        addFieldError("personBean.age", "Age is required and must be 18 or older");
//	    }
//		
//	}
	
	private Person personBean;

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

}
