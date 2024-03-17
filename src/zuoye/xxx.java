package zuoye;


import zuoye.zuoye1.Square;
import zuoye.zuoye1.Student;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class xxx {

    public static void main(String[] args) {
//        Square s=new Square();
//        Square s1=new Square(20);
//        System.out.println(s.getWidth());
//        System.out.println(s.getArea());
//        System.out.println(s1.getWidth());
//        System.out.println(s1.getArea());

        try {
            Robot robot = new Robot();
            BufferedImage image = robot.createScreenCapture(new Rectangle(0, 100, 500, 500));
            File file = new File("/opt/img/save.jpg");
            OutputStream outputStream = new FileOutputStream(file);
            ImageIO.write(image, "jpg", outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}


