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

import javax.servlet.*;
import javax.servlet.http.*;

import triveratunes.util.HotCDSelector;


import java.io.*;

public class HotCDServlet extends HttpServlet{
  private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request,
                     HttpServletResponse response)
   throws ServletException, IOException{

      request.setAttribute("cdNumber", HotCDSelector.getRandomNumber());

      RequestDispatcher rd = request.getRequestDispatcher("hot_cd.jsp");
      rd.forward(request, response);
   }


}
