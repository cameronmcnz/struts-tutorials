package triveratunes.util;
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
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SearchUtility
{
   // Catalog of ItemValue objects.
   private static Collection<CD> c_catalog = new ArrayList<CD>();

   // For converting our "database" of date strings into Date objects
   private static SimpleDateFormat c_sdf = new SimpleDateFormat("yyyy-MM-dd");


   // Searches catalog for keyword.
   public static Collection search(String keyword)
   {
      // Remove case sensitivity.
      keyword = keyword.toLowerCase();

      // Create a bucket for results.
      Collection<CD> results = new ArrayList<CD>();

      // Iterate through every item in our little catalog, looking for a match.
      Iterator i = c_catalog.iterator();
      while (i.hasNext())
      {
         CD item = (CD) i.next();
         if (item.getName().toLowerCase().indexOf(keyword) != -1 ||
             item.getArtist().toLowerCase().indexOf(keyword) != -1)
         {
            results.add(item);
         }
      }
      return results;
   }


   // Loads the catalog with data.
   static
   {
      add("CD501", "Diva", "Annie Lennox", "1992-01-04", 17.97, 13.99);
      add("CD502", "Dream of the Blue Turtles", "Sting", "1985-02-05", 17.97, 14.99);
      add("CD503", "Trouble is...", "Kenny Wayne Shepherd Band", "1997-08-08", 17.97, 14.99);
      add("CD504", "Lie to Me", "Jonny Lang", "1997-08-26", 17.97, 14.99);
      add("CD505", "Little Earthquakes", "Tori Amos", "1992-01-18", 17.97, 14.99);
      add("CD506", "Seal", "Seal", "1991-08-18", 17.97, 14.99);
      add("CD507", "Ian Moore", "Ian Moore", "1993-12-05", 9.97, 9.97);
      add("CD508", "So Much for the Afterglow", "Everclear", "1997-01-19", 16.97, 13.99);
      add("CD509", "Surfacing", "Sarah McLachlan", "1997-12-04", 17.97, 13.99);
      add("CD510", "Hysteria", "Def Leppard", "1987-06-20", 17.97, 14.99);
      add("CD511", "A Life of Saturdays", "Dexter Freebish", "2000-12-06", 16.97, 12.99);
      add("CD512", "Human Clay", "Creed", "1999-10-21", 18.97, 13.28);
      add("CD513", "My, I'm Large", "Bobs", "1987-02-20", 11.97, 11.97);
      add("CD514", "So", "Peter Gabriel", "1986-10-03", 17.97, 13.99);
      add("CD515", "Big Ones", "Aerosmith", "1994-05-08", 18.97, 14.99);
      add("CD516", "90125", "Yes", "1983-10-16", 11.97, 11.97);
      add("CD517", "1984", "Van Halen", "1984-08-19", 11.97, 11.97);
      add("CD518", "Escape", "Journey", "1981-02-25", 11.97, 11.97);
   }


   private static void add(String id, String name, String artist,
                           String releaseDate, double listPrice, double price)
   {
      try
      {
         c_catalog.add(
            new CD(id, name, artist, c_sdf.parse(releaseDate), (float) listPrice, (float) price));
      }
      catch (ParseException e) {  }
   }

    public static void add(String id, String name, String artist,
                           Date  releaseDate, double listPrice, double price)
   {
       c_catalog.add(
            new CD(id, name, artist, releaseDate, (float) listPrice, (float) price));
   }

   public Collection getCdCatalog() {
        return c_catalog;
   }
}
