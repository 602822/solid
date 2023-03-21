package nerdschool;

public class SmokeSensor implements Sensor {

  private String location;
  private double batteryPrecentage;

  private String sensorType;

  private int numberOfPolls;

  public SmokeSensor(String location, String sensorType
      ) {
    this.location = location;
    this.batteryPrecentage = 100;
    this.sensorType = sensorType;
    this.numberOfPolls = 0;
  }

  public void setNumberOfPolls(int numberOfPolls) {
    this.numberOfPolls = numberOfPolls;
  }



  public void setBatteryPrecentage(double batteryPrecentage) {
    this.batteryPrecentage = batteryPrecentage;
  }

  public void setSensorType(String sensorType) {
    this.sensorType = sensorType;
  }

  public boolean isTriggered() {
    setNumberOfPolls(numberOfPolls++);


    if(batteryPrecentage > 0) {
     setBatteryPrecentage(batteryPrecentage - 20);

    }

    if(numberOfPolls % 2 == 0 && batteryPrecentage != 0) {
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
    return batteryPrecentage;
  }
}
