package nerdschool;

public interface Sensor {

enum Chategory {
  HAZARD,
 SECURITY
}



  boolean isTriggered();

  String getLocation();

  String getSensorType();

  Chategory getChategory();


}
