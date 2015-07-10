
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) throws Exception {
        Robot MyRobot = new Robot();
        
        MyRobot.delay(2000);
        keyPress(MyRobot, KeyEvent.VK_WINDOWS, KeyEvent.VK_R);
        MyRobot.delay(1000);
        keyPress(MyRobot, KeyEvent.VK_N);
        keyPress(MyRobot, KeyEvent.VK_O);
        keyPress(MyRobot, KeyEvent.VK_T);
        keyPress(MyRobot, KeyEvent.VK_E);
        keyPress(MyRobot, KeyEvent.VK_P);
        keyPress(MyRobot, KeyEvent.VK_A);
        keyPress(MyRobot, KeyEvent.VK_D);
        MyRobot.delay(1000);
        keyPress(MyRobot, KeyEvent.VK_ENTER);
        
        MyRobot.delay(2000);
        keyPress(MyRobot, KeyEvent.VK_H);
        keyPress(MyRobot, KeyEvent.VK_E);
        keyPress(MyRobot, KeyEvent.VK_L);
        keyPress(MyRobot, KeyEvent.VK_L);
        keyPress(MyRobot, KeyEvent.VK_O);
        keyPress(MyRobot, KeyEvent.VK_COMMA);
        keyPress(MyRobot, KeyEvent.VK_SPACE);
        MyRobot.delay(1000);
        keyPress(MyRobot, KeyEvent.VK_K);
        keyPress(MyRobot, KeyEvent.VK_M);
        keyPress(MyRobot, KeyEvent.VK_R);
        keyPress(MyRobot, KeyEvent.VK_O);
        keyPress(MyRobot, KeyEvent.VK_B);
        keyPress(MyRobot, KeyEvent.VK_O);
        keyPress(MyRobot, KeyEvent.VK_T);
        MyRobot.delay(1000);
        keyPress(MyRobot, KeyEvent.VK_SHIFT , KeyEvent.VK_1);
        
        MyRobot.delay(3000);
        keyPress(MyRobot, KeyEvent.VK_ALT, KeyEvent.VK_F4);
        MyRobot.delay(1000);
        keyPress(MyRobot, KeyEvent.VK_ALT, KeyEvent.VK_N);
    }
    
    public static void keyPress(Robot robot, int keycode) {
        robot.keyPress(keycode);
        robot.delay(10);
        robot.keyRelease(keycode);
        robot.delay(100);
    }
    
    public static void keyPress(Robot robot, int keycodeA, int keycodeB) {
        robot.keyPress(keycodeA);
        robot.keyPress(keycodeB);
        robot.delay(10);
        robot.keyRelease(keycodeB);
        robot.keyRelease(keycodeA);
        robot.delay(100);
    }
}
