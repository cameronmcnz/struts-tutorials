package triveratunes.alltogether.util;

 /*
 * Utility class for mapping web data to Value objects
 *
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


import java.text.SimpleDateFormat;

public class WebVOMapper {

  public WebVOMapper() {
  }
  public static AlbumVO CD2Album(CDVO cd){
    AlbumVO album = new AlbumVO();
    album.setId(cd.getId());
    album.setName(cd.getName());
    album.setArtist(cd.getArtist());
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    try{
      album.setReleaseDate(sdf.parse(cd.getReleaseDate()));
    }catch(java.text.ParseException pe){
       //Should not occur, Form has been validated
    }
    album.setListPrice(Float.parseFloat(cd.getListPrice()));
    album.setPrice(Float.parseFloat(cd.getPrice()));
    if(cd.getCategory() != null && !(cd.getCategory().trim().equals(""))){
      album.setCategory(Integer.parseInt(cd.getCategory()));
    }
    return album;
  }

  public static CDVO Album2CD(AlbumVO album){
    return Album2CD(album, null);
  }

  public static CDVO Album2CD(AlbumVO album, CDVO cd){
    if (cd == null){
     cd = new CDVO();
    }
    cd.setId(album.getId());
    cd.setName(album.getName());
    cd.setArtist(album.getArtist());
    cd.setReleaseDate(album.getReleaseDateString());
    cd.setListPrice(Float.toString(album.getListPrice()));
    cd.setPrice(Float.toString(album.getPrice()));
    cd.setCategory(Integer.toString(album.getCategory()));
    return cd;
  }
}