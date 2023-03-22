package nerdschool;

import java.time.LocalTime;

public class HeatSensor implements Sensor {






  private Chategory chategory;
  private String location;
  private String type;



  public HeatSensor(String type, String location) {
    this.chategory = Chategory.SECURITY;
    this.type = type;
    this.location = location;
  }



  @Override
  public boolean isTriggered() {
    return true;
  }

  @Override
  public String getLocation() {
    return location;
  }

  @Override
  public String getSensorType() {
    return type;
  }

  @Override
  public Chategory getChategory() {
    return chategory;
  }
}
