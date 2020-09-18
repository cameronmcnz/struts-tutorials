package triveratunes.alltogether.util.dao.impl;

/**
 * Generic implementation of the DAOFactory
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


import triveratunes.alltogether.util.dao.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

public class ImplDAOFactory extends DAOFactory {

  /**
   * Obtains the DAO for cds
   * @return A new instance of the AlbumDAO
   */
  public AlbumDAO getAlbumDAO() {
    return new ImplAlbumDAO();
  }

  /**
   * Obtains the DAO for categories
   * @return A new instance of the CategoryDAO
   */
  public CategoryDAO getCategoryDAO() {
    return new ImplCategoryDAO();
  }
  /**
   * Obtains the connection to the Database
   * @return a new connection
   * @throws DAOException When Driver class cannot be found or when a SQLException occurs while getting the connection
   */
  public static Connection getConnection() throws DAOException{
      try {
          Context ctx = new InitialContext();
          // Note: In RAD/WebSphere, the following is an indirect JNDI lookup, which
          //       requires a binding in web.xml to the TriveraTunesDS 
          //       datasource defined in WAS administration.
          //       In Tomcat, the datasource is defined in META-INF\context.xml.
          DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/triveratunesDS");
          return ds.getConnection();
      } catch (NamingException e) {
          throw new DAOException("jdbc/triveratunesDS could not be found in JNDI");
      } catch (SQLException e) {
          throw new DAOException("SQLException while getting connection to database ",e);
      }
  }

  /**
   * Method to close the connection
   * @param con The connection to close;
   */
  public static void closeConnection(Connection con) throws DAOException{
    try{
      con.close();
    } catch(SQLException sqle){
     throw new DAOException("Unable to close connection to database", sqle);
    }
  }
}