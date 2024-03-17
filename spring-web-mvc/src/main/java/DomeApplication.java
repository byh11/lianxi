import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan("Controller")
public class DomeApplication {
    public static void main(String[] args) {
        SpringApplication.run(DomeApplication.class,args);
    }
}
