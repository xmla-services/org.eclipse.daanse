package org.eclipse.daanse.xmla.ws.jakarta.basic.itest;

import java.util.Date;

public class Mensch {

  private String name;
  private Date birthDate;

  public Mensch(String name, Date birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public long getAge() {
    return System.currentTimeMillis() - birthDate.getTime();
  }

  @Override
  public String toString() {
    return getName() + " " + getBirthDate();
  }

}
