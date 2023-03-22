package nerdschool;

import java.util.List;

public class ConsoleSensorViewer implements  SensorViewer {

  @Override
  public void displayTriggeredSensors(List<Sensor> triggeredSensors) {
    if (triggeredSensors.isEmpty()) {
      System.out.println("No sensors were triggered");
    } else {
      for (Sensor sensor : triggeredSensors) {
        System.out.printf("A %s sensor was triggered at %s%n", sensor.getSensorType(),
            sensor.getLocation());
      }
    }
  }

}