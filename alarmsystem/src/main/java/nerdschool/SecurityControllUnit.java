package nerdschool;

import nerdschool.Sensor.Chategory;
import java.time.LocalTime;
import java.util.ArrayList;

public class SecurityControllUnit extends ControlUnit{

  public SecurityControllUnit(ArrayList<Sensor> sensors, SensorViewer sensorViewer,
      SensorPoller sensorPoller) {
    super(sensors, sensorViewer, sensorPoller);
  }

  @Override
  public void pollSensors(Chategory chategory) {
    LocalTime start = LocalTime.of(22,0);
    LocalTime end = LocalTime.of(6,0);
    LocalTime now = LocalTime.now();
    if(now.isAfter(start) || now.isBefore(end)) {
    super.pollSensors(chategory);
    }
  }
}
