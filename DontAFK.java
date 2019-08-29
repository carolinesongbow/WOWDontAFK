import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class DontAFK {
    public static void main(String[] args) throws AWTException {
        System.out.println("=======DontAFK RUN========");
        Robot robot = new Robot();
        Random random = new Random();
        robot.delay(5000);
        int key = 0;
        int time = 0;
        while (true) {
            key = random.nextInt(5);
            time = random.nextInt(60);
            int keyCode = 0;
            String keyName = null;
            switch (key) {
                case 0:
                    keyCode = KeyEvent.VK_A;
                    keyName = "A";
                    break;
                case 1:
                    keyCode = KeyEvent.VK_D;
                    keyName = "D";
                    break;
                case 2:
                    keyCode = KeyEvent.VK_W;
                    keyName = "W";
                    break;
                case 3:
                    keyCode = KeyEvent.VK_S;
                    keyName = "S";
                    break;
                case 4:
                    keyCode = KeyEvent.VK_SPACE;
                    keyName = "SPACE";
                    break;
                default:
                    break;
            }
            
            robot.keyPress(keyCode);
            robot.delay(10 + random.nextInt(5));
            robot.keyRelease(keyCode);

            System.out.println("press:[" + keyName + "], delay time: " + time + "s");
            
            robot.delay(time * 1000);
        }
    }
}
