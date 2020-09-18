package triveratunes.web;
/**
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to The Trivera Group, Inc., Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of the Trivera Group, Inc.
 *
 * Copyright (c) 2020 The Trivera Group, LLC.
 * http://www.triveratech.com   http://www.triveragroup.com
 * </p>
 * @author The Trivera Group Tech Team.
 */

import junit.framework.TestCase;
import com.opensymphony.xwork2.ActionSupport;


public class CheckInstallTest extends TestCase {
    public void testHelloWorld() throws Exception {

        CheckInstall check_install = new CheckInstall();
        String result = check_install.execute();

        assertTrue("Expected a success result!",
          ActionSupport.SUCCESS.equals(result));

        assertTrue("Expected the default message!",
            check_install.getMessage().equals("Struts 2 is up and running ..."));

        }

}
