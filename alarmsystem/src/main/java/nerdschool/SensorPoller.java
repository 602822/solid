package nerdschool;

import nerdschool.Sensor.Chategory;
import java.util.List;

public interface SensorPoller {
  List<Sensor> pollSensors(List<Sensor> sensors, Chategory chategory);


}
