package triveratunes.alltogether.util.dao;

 /*
 * DAOFactory: General Data Access Object Factory class
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


public abstract class DAOFactory {

  public abstract AlbumDAO getAlbumDAO();
  public abstract CategoryDAO getCategoryDAO();

  protected static DAOFactory getDAOFactory(String dbName) throws DAOException {
    String factoryName = "triveratunes.alltogether.util.dao.impl.ImplDAOFactory";
    try {
      Class clazz = Class.forName(factoryName);
      return (DAOFactory) clazz.newInstance();
    } catch (IllegalAccessException iae) {
      throw new DAOException("Not allowed to access " + factoryName);
    } catch (InstantiationException ie) {
      throw new DAOException("Cannot instantiate " + factoryName);
    } catch (ClassNotFoundException cnfe) {
      throw new DAOException("Unsuported database cannot find " + factoryName);

    }

  }

  public static DAOFactory getDefaultfactory() throws DAOException {
    return getDAOFactory(null);
  }
}
