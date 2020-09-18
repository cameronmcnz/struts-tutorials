package triveratunes.alltogether.util;
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




public class CDVO {
  private String id;
  private String name;
  private String artist;
  private String releaseDate;
  private String listPrice;
  private String price;
  private String category;

  public CDVO() {
  }

  public String getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getArtist() {
    return artist;
  }
  public String getReleaseDate() {
    return releaseDate;
  }
  public String getListPrice() {
    return listPrice;
  }
  public String getPrice() {
    return price;
  }
  public String getCategory() {
    return category;
  }

  public void setId(String id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setArtist(String artist) {
    this.artist = artist;
  }
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }
  public void setListPrice(String listPrice) {
    this.listPrice = listPrice;
  }
  public void setPrice(String price) {
    this.price = price;
  }
  public void setCategory(String category) {
    this.category = category;
  }

}
