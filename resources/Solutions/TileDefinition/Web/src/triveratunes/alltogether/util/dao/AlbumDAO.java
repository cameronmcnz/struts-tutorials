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


 import java.util.*;

import triveratunes.alltogether.util.*;
public interface AlbumDAO {
  public AlbumVO getAlbum(String id) throws DAOException;
  public List<AlbumVO> searchAlbums(String categoryName) throws DAOException;
  public void insertAlbum(AlbumVO cd) throws DAOException;
  public void deleteAlbum(String cdID) throws DAOException;
  public void updateAlbum(AlbumVO cd) throws DAOException;
}