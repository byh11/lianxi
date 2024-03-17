package xx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    @Value("aaaa")
    public String name;

    public void dis(){
        System.out.println(name);
    }
}
