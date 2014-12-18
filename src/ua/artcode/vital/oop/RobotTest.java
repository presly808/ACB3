package ua.artcode.vital.oop;

/**
 * Created by admin on 15.12.2014.
 */
public class RobotTest {


    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.price = 10.233;
        robot.power = 100;
        robot.name = "RB-100";
        robot.go();

        Robot robot1 = new Robot();
        robot1.price = 5.00;
        robot1.power = 58;
        robot1.name = "ZN-34";
        robot1.go();


    }
}
