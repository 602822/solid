package nerdschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {


    ArrayList<Sensor> sensors = new ArrayList<>();
    FireSensor fireSensor = new FireSensor("FireSensor","Room-202");
    SmokeSensor smokeSensor = new SmokeSensor("SmokeSensor","Room-203");
    sensors.add(fireSensor);
    sensors.add(smokeSensor);

    ControlUnit controlUnit = new ControlUnit(sensors);

    Scanner scanner = new Scanner(System.in);
    String input = "";
    while (!input.equals("exit")) {
      System.out.println("Type \"poll\" to poll all sensors once or \"exit\" to exit");
      input = scanner.nextLine();
      if (input.equals("poll")) {
        controlUnit.pollSensors();
      }
    }
  }
}
