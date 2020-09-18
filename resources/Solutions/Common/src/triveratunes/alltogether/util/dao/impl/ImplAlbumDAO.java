package triveratunes.alltogether.util.dao.impl;

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


import triveratunes.alltogether.util.AlbumVO;
import triveratunes.alltogether.util.dao.AlbumDAO;
import triveratunes.alltogether.util.dao.BaseDAO;
import triveratunes.alltogether.util.dao.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImplAlbumDAO extends BaseDAO implements AlbumDAO {

  public AlbumVO getAlbum(String id) throws DAOException{
    Connection con = ImplDAOFactory.getConnection();
    ResultSet rs = null;
    PreparedStatement pstat = null;
    try {
      String sql = "Select * from Cd where ARTNO ='"+id+"'";
      Statement stmt = con.createStatement();
      rs = stmt.executeQuery(sql);

      AlbumVO cd = new AlbumVO();
      if(rs.next()){
        cd.setId(rs.getString("ARTNO"));
        cd.setName(rs.getString("NAME"));
        cd.setArtist(rs.getString("ARTIST"));
        cd.setReleaseDate(rs.getDate("RELEASEDATE"));
        cd.setPrice(rs.getFloat("PRICE"));
        cd.setListPrice(rs.getFloat("LISTPRICE"));
        cd.setCategory(rs.getInt("CATEGORYID"));
      }
        return cd;
    } catch (SQLException sqle) {
         throw new DAOException("Cannot get CDs " + sqle.getMessage(), sqle);
    } finally {
       closeResultset(rs);
       closeStatement(pstat);
       ImplDAOFactory.closeConnection(con);
    }
  }

  public List searchAlbums(String categoryName) throws DAOException{
    Connection con = ImplDAOFactory.getConnection();
    ResultSet rs = null;
    PreparedStatement pstat = null;
    List<AlbumVO> l = new ArrayList<AlbumVO>();

    try {
      String sql = "Select * from Cd where Name Like '%"+categoryName+"%' OR ARTIST LIKE '%" + categoryName + "%'";
      Statement stmt = con.createStatement();
      rs = stmt.executeQuery(sql);

      while (rs.next()) {
        AlbumVO cd = new AlbumVO(rs.getString("ARTNO"));
        cd.setName(rs.getString("NAME"));
        cd.setArtist(rs.getString("ARTIST"));
        cd.setReleaseDate(rs.getDate("RELEASEDATE"));
        cd.setPrice(rs.getFloat("PRICE"));
        cd.setListPrice(rs.getFloat("LISTPRICE"));
        cd.setCategory(rs.getInt("CATEGORYID"));
        l.add(cd);
      }
      return l;

    } catch (SQLException sqle) {
         throw new DAOException("Cannot get CDs " + sqle.getMessage(), sqle);
    } finally {
       closeResultset(rs);
       closeStatement(pstat);
       ImplDAOFactory.closeConnection(con);
    }
  }

  public void insertAlbum(AlbumVO cd) throws DAOException {
    Connection con = ImplDAOFactory.getConnection();
     PreparedStatement pstat=null;

     if(cd == null){
       throw new DAOException("No data to insert");
     }

    try {
      pstat = con.prepareStatement("INSERT INTO Cd (ARTNO ,NAME ,ARTIST, RELEASEDATE, PRICE, LISTPRICE, CATEGORYID) VALUES(?,?,?,?,?,?,?) ");
      pstat.setString(1, cd.getId());
      pstat.setString(2, cd.getName());
      pstat.setString(3,cd.getArtist());
      java.util.Date date = cd.getReleaseDate();

      if(date == null){
        pstat.setNull(4,java.sql.Types.DATE);
      }else{
        long l = date.getTime();
        pstat.setDate(4,new java.sql.Date(l));
      }
      pstat.setFloat(5,cd.getPrice());
      pstat.setFloat(6,cd.getListPrice());
      pstat.setInt(7,cd.getCategory());
      pstat.executeUpdate();
    } catch (SQLException sqle) {
      System.out.println("ID =" + cd.getId());
      sqle.printStackTrace(System.out);
        throw new DAOException("Cannot insert Cd see log for detail", sqle);
    } finally {
         closeStatement(pstat);
         ImplDAOFactory.closeConnection(con);
    }
  }

  public void deleteAlbum(String cdID) throws DAOException {
     Connection con = ImplDAOFactory.getConnection();
     PreparedStatement pstat=null;

     if(cdID == null){
       throw new DAOException("No id has been provided");
     }
    try {
      pstat = con.prepareStatement("DELETE FROM Cd WHERE ARTNO = ? ");
      pstat.setString(1, cdID);

      int i = pstat.executeUpdate();
      if(i == 0){
        throw new DAOException("ID " + cdID + " could not be found in database");
      }
    } catch (SQLException sqle) {
        throw new DAOException("Cannot delete Cd" +sqle.getMessage(), sqle);
    } finally {
         closeStatement(pstat);
         ImplDAOFactory.closeConnection(con);
    }
  }

  public void updateAlbum(AlbumVO cd) throws DAOException {
    Connection con = ImplDAOFactory.getConnection();
     PreparedStatement pstat=null;

     if(cd == null){
       throw new DAOException("No data to Update");
     }
    try {
      pstat = con.prepareStatement("UPDATE Cd SET NAME = ? ,ARTIST = ?, RELEASEDATE = ?, PRICE = ? , LISTPRICE = ?, CATEGORYID = ? WHERE ARTNO = ? ");
      pstat.setString(7, cd.getId());
      pstat.setString(1, cd.getName());
      pstat.setString(2,cd.getArtist());
      java.util.Date date = cd.getReleaseDate();
      if(date == null){
        pstat.setNull(3,java.sql.Types.DATE);
      }else{
        long l = date.getTime();
        pstat.setDate(3,new java.sql.Date(l));
      }
      pstat.setFloat(4,cd.getPrice());
      pstat.setFloat(5,cd.getListPrice());
      pstat.setInt(6,cd.getCategory());
      pstat.executeUpdate();
    } catch (SQLException sqle) {
        throw new DAOException("Cannot update Cd " + sqle.getMessage(), sqle);
    } finally {
         closeStatement(pstat);
         ImplDAOFactory.closeConnection(con);
    }
  }

}
