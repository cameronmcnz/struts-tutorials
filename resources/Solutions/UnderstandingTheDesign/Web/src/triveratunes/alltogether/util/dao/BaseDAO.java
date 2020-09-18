package triveratunes.alltogether.util.dao;

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


 import java.sql.*;

public class BaseDAO {

  public BaseDAO() {
  }
  protected void closeStatement(Statement stat) throws DAOException {
      try {if (stat != null) stat.close();
      }catch (SQLException sqle) {
         throw new DAOException("Cannot close prepared statement", sqle);
      }
  }

  protected void closeResultset(ResultSet rs) throws DAOException {
    try {if (rs != null) rs.close();
    }catch (SQLException sqle) {
       throw new DAOException("Cannot close resultset", sqle);
    }
  }
}