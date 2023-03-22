package nerdschool;


import nerdschool.Sensor.Chategory;
import java.util.ArrayList;
import java.util.List;

public class FakeSensorPoller implements SensorPoller {

  @Override
  public List<Sensor> pollSensors(List<Sensor> sensors, Chategory chategory) {

    List<Sensor> triggeredHazardSensors = new ArrayList<>();
    List<Sensor> triggeredSecuritySensors = new ArrayList<>();

    for (Sensor sensor : sensors) {
      if (sensor.isTriggered() && chategory.equals(Chategory.HAZARD) && sensor.getChategory().equals(Chategory.HAZARD)) {
        triggeredHazardSensors.add(sensor);
      } else if(sensor.isTriggered() && chategory.equals(Chategory.SECURITY) && sensor.getChategory().equals(Chategory.SECURITY)) {
        triggeredSecuritySensors.add(sensor);
      }
    }

    if (chategory.equals(Chategory.HAZARD)) {
      return triggeredHazardSensors;
    } else  {
      return triggeredSecuritySensors;
    }
  }
}

