package nerdschool;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {

  private final ArrayList<Sensor> sensors;


  public ControlUnit(ArrayList<Sensor> sensors) {
    this.sensors = sensors;

  }

  public void pollSensors() {
    List<Sensor> triggeredSensors = new ArrayList<>();

    for (Sensor sensor : sensors) {
      if (sensor.isTriggered()) {
        triggeredSensors.add(sensor);
      }
    }

    if (triggeredSensors.isEmpty()) {
      System.out.println("No sensors were triggered");
    } else {
      for (Sensor sensor: triggeredSensors) {
        System.out.printf("A %s sensor was triggered at %s%n", sensor.getSensorType(), sensor.getLocation());
      }
    }
  }
}
