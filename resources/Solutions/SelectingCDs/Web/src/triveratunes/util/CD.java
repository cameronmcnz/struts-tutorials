package triveratunes.util;

import java.util.Date;
import java.text.SimpleDateFormat;
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

public class CD implements java.io.Serializable {
  private static final long serialVersionUID = 1L;
private String m_id;
   private String m_name;
   private String m_artist;
   private Date m_releaseDate;
   private float m_listPrice;
   private float m_price;


   public CD() { }

   public CD(String id)
   {
      this.setID(id);
   }

   public CD(String id, String name, String artist,
                    Date releaseDate, float listPrice, float price)
   {
      this.setID(id);
      this.setName(name);
      this.setArtist(artist);
      this.setReleaseDate(releaseDate);
      this.setListPrice(listPrice);
      this.setPrice(price);
   }

   public String getID() { return m_id; }
   public String getName() { return m_name; }
   public String getArtist() { return m_artist; }
   public Date getReleaseDate() { return m_releaseDate; }
   public float getListPrice() { return m_listPrice; }
   public float getPrice() { return m_price; }

   public void setID(String id) { m_id = id; }
   public void setName(String name) { m_name = name; }
   public void setArtist(String artist) { m_artist = artist; }
   public void setReleaseDate(Date releaseDate) { m_releaseDate = releaseDate; }
   public void setListPrice(float listPrice) { m_listPrice = listPrice; }
   public void setPrice(float price) { m_price = price; }

   public String getReleaseDateString()
   {
      String dateString = null;
      Date releaseDate = this.getReleaseDate();

      if (releaseDate != null)
      {
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         dateString = sdf.format(releaseDate);
      }
      return dateString;
   }

   public String toString()
   {
      return "ItemValue: id=" + this.getID()  + ", name=" + this.getName() +
         ", artist=" + this.getArtist() + ", releaseDate=" + this.getReleaseDate() +
         ", listPrice=" + this.getListPrice() + ", price=" + this.getPrice();
   }
}
