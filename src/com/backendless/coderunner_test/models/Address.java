package com.backendless.coderunner_test.models;

/**
 * Created by backendlessdev on 9/2/15.
 */
public class Address
{
  private String street;
  private String city;
  private String state;

  public String getStreet()
  {
    return street;
  }

  public void setStreet( String street )
  {
    this.street = street;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity( String city )
  {
    this.city = city;
  }

  public String getState()
  {
    return state;
  }

  public void setState( String state )
  {
    this.state = state;
  }
}