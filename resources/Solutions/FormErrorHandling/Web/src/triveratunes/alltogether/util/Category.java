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


public class Category implements java.io.Serializable{
  private static final long serialVersionUID = 1L;
  public static final int NEW=9;
  public static final int UNKNOWN=0;

  private int id;
  private String name;

  public Category() {
  }

  public Category(int id, String name){
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
}