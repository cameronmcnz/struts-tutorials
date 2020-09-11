package com.mcnz.struts.test;

import org.apache.struts2.StrutsTestCase;
import org.junit.Test;

import com.mcnz.struts.RegisterAction;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterActionTest extends StrutsTestCase {
	
	@Test
	public void testNoData() throws Exception {
		
		ActionProxy actionProxy = getActionProxy("/register.action") ;
		RegisterAction action = (RegisterAction) actionProxy.getAction();
		assertNotNull("The action is null but should not be.", action);
		String result = actionProxy.execute();
		assertEquals("The execute method did not return " + ActionSupport.INPUT + " but should have.", ActionSupport.INPUT, result);
		
	}
	
	@Test
	public void testExecuteValidationPasses() throws Exception {
		
		request.setParameter("personBean.firstName", "Bruce");
		request.setParameter("personBean.lastName", "Phillips");
		request.setParameter("personBean.email", "bphillips@ku.edu");
		request.setParameter("personBean.age", "19");
		request.setParameter("personBean.website", "http://www.theserverside.com");
		request.setParameter("personBean.phone", "905-555-1212");
		
		
		ActionProxy actionProxy = getActionProxy("/register.action") ;
		RegisterAction action = (RegisterAction) actionProxy.getAction();
		assertNotNull("The action is null but should not be.", action);
		String result = actionProxy.execute();
		assertEquals("The execute method did not return " + ActionSupport.SUCCESS + " but should have.", ActionSupport.SUCCESS, result);
		
	}

}
