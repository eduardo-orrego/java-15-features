package org.duna.jep384;

public class NewRecordsDemo01 {
  public static void main(String[] args) {
    PersonRecord personRecord = new PersonRecord("Eduardo",38);
    System.out.println("name="+personRecord.name());
    System.out.println("year="+personRecord.year());
  }
}
