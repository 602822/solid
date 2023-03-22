package nerdschool;

import nerdschool.Sensor.Chategory;
import java.util.ArrayList;
import java.util.List;

public class ControlUnit {

  private final ArrayList<Sensor> sensors;
  private SensorViewer sensorViewer;

  private SensorPoller sensorPoller;

  public ControlUnit(ArrayList<Sensor> sensors, SensorViewer sensorViewer, SensorPoller sensorPoller) {
    this.sensors = sensors;
    this.sensorViewer = sensorViewer;
    this.sensorPoller = sensorPoller;

  }

  public void pollSensors(Chategory chategory) {
    if(chategory == Chategory.HAZARD) {
    List<Sensor> triggeredHazardSensors = sensorPoller.pollSensors(sensors, Chategory.HAZARD);
    sensorViewer.displayTriggeredSensors(triggeredHazardSensors);
    } else {
      List<Sensor> triggeredSecuritySensors = sensorPoller.pollSensors(sensors,Chategory.SECURITY);
      sensorViewer.displayTriggeredSensors(triggeredSecuritySensors);
    }


  }

}
