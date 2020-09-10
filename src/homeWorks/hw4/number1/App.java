package homeWorks.hw4.number1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.work();

        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.work();

        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();

        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();

        System.out.println();

        List<Robot> robotList = new ArrayList<>();
        robotList.add(coffeRobot);
        robotList.add(robotCoocker);
        robotList.add(robotDancer);
        robotList.add(robot);

        for (Robot robots: robotList) {
            robots.work();
        }



    }

}
