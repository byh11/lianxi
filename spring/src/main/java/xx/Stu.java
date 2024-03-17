package xx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component(value = "stu")
public class Stu {
    private int a;
    @Autowired
    private Teacher teacher;
    public void xx(){
        System.out.println("stu...");
        teacher.dis();
    }
}
