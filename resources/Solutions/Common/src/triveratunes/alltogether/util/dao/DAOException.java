package triveratunes.alltogether.util.dao;

/**
 * Exception class to report that an exception occured during database operations
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


public class DAOException extends Exception {
  private static final long serialVersionUID = 1L;
  /**
   * the original SQL exception (if any)
   */
  java.sql.SQLException sqlException;

  /**
   * Standard constructor for Exceptions
   * @param msg The message explaining the exception
   */
  public DAOException(String msg) {
    super(msg);
System.out.println("From DAOExceptionL: msg='"+msg+"'.");
  }

  /**
   * Constructor that takes also the caught nested exception
   * @param msg The message explaining the exception
   * @param sqlException The original sqlException that will be wrapped
   */
  public DAOException(String msg, java.sql.SQLException sqlException) {
    super(msg);
    this.sqlException = sqlException;
System.out.println("From DAOException: msg='"+msg+"', exception follows.");
sqlException.printStackTrace();
  }

  /**
   * The Nested (caught) SQLException
   * @return The wrapped exception or null
   */

  public java.sql.SQLException getSQLException(){
    return sqlException;
  }
}
