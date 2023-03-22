package nerdschool;

import nerdschool.Sensor.Chategory;
import java.util.ArrayList;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {


    ArrayList<Sensor> sensors = new ArrayList<>();
    SensorViewer sensorViewer = new ConsoleSensorViewer();
    SensorPoller sensorPoller = new FakeSensorPoller();
    FireSensor fireSensor = new FireSensor("FireSensor","Room-202");
    SmokeSensor smokeSensor = new SmokeSensor("SmokeSensor","Room-203");
    HeatSensor heatSensor = new HeatSensor("HeatSensor","Room-505");
    MotionSensor motionSensor = new MotionSensor("MotionSensor","Room-606");

    sensors.add(fireSensor);
    sensors.add(smokeSensor);
    sensors.add(heatSensor);
    sensors.add(motionSensor);

    ControlUnit controlUnit = new ControlUnit(sensors,sensorViewer,sensorPoller);
    SecurityControllUnit securityControllUnit = new SecurityControllUnit(sensors,sensorViewer,sensorPoller);

    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals("exit")) {
      System.out.println("Type \"pollHazard\" to poll all hazard sensors, Type \"pollSecurity\" to poll all security sensors or \"exit\" to exit");
      input = scanner.nextLine();
      if (input.equals("pollHazard")) {
        controlUnit.pollSensors(Chategory.HAZARD);
      } else if(input.equals("pollSecurity")) {
        securityControllUnit.pollSensors(Chategory.SECURITY);
      }
    }
  }
}
