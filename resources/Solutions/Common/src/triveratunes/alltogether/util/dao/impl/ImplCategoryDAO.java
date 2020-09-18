package triveratunes.alltogether.util.dao.impl;

/*
 * Generic implementation of the CategoryDAO interface
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


import triveratunes.alltogether.util.Category;
import triveratunes.alltogether.util.dao.BaseDAO;
import triveratunes.alltogether.util.dao.CategoryDAO;
import triveratunes.alltogether.util.dao.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ImplCategoryDAO extends BaseDAO implements CategoryDAO{

  public int getGategory(String categoryName) throws DAOException{
    Connection con = ImplDAOFactory.getConnection();
    ResultSet rs = null;
    PreparedStatement pstat = null;
    try {
      String sql = "Select * from CATEGORY where NAME ='"+categoryName+"'";
      Statement stmt = con.createStatement();
      rs = stmt.executeQuery(sql);

      if(!rs.next()){
        throw new DAOException("Category "+categoryName+ " not found");
      }
        return rs.getInt("CATEGORYID");
    } catch (SQLException sqle) {
         throw new DAOException("Cannot get Category", sqle);
    } finally {
       closeResultset(rs);
       closeStatement(pstat);
       ImplDAOFactory.closeConnection(con);
    }
  }

  public List getAllCategories() throws DAOException{
    Connection con = ImplDAOFactory.getConnection();
    ResultSet rs = null;
    PreparedStatement pstat = null;
    List<Category> l = new ArrayList<Category>();

    try {
      String sql = "Select * from CATEGORY";
      Statement stmt = con.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        int id = rs.getInt("CATEGORYID");
        String name = rs.getString("NAME");
        if(id != Category.UNKNOWN){
          l.add(new Category(id,name));
        }
      }
      return l;

    } catch (SQLException sqle) {
         throw new DAOException("Cannot get Gategories", sqle);
    } finally {
       closeResultset(rs);
       closeStatement(pstat);
       ImplDAOFactory.closeConnection(con);
    }
  }

}