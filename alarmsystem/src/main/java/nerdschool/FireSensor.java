package nerdschool;

public class FireSensor implements Sensor, BatteryDrivenSensor {

  private Chategory chategory;
  private String sensorType;
  private double batteryPrecent;

  private String location;

  private int numberOfPolls;

  public Chategory getChategory() {
    return chategory;
  }



  public FireSensor(String sensorType, String location) {
    this.sensorType = sensorType;
    this.batteryPrecent = 100;
    this.location = location;
    this.numberOfPolls = 0;
    this.chategory = Chategory.HAZARD;
  }

  public void setBatteryPrecent(double batteryPrecent) {
    this.batteryPrecent = batteryPrecent;
  }



  public void setNumberOfPolls(int numberOfPolls) {
    this.numberOfPolls = numberOfPolls;
  }

  public boolean isTriggered() {
      setNumberOfPolls(numberOfPolls++);

    if(batteryPrecent > 0) {
     setBatteryPrecent(batteryPrecent - 10);
    }

    if(numberOfPolls % 3 == 0 && batteryPrecent != 0) {
    return true;
    }


    return false;
  }

  public String getLocation() {
    return location;
  }

  public String getSensorType() {
    return sensorType;
  }

  public double getBatteryPercentage() {
    return batteryPrecent;
  }
}
