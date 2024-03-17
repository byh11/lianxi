package xx;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Stuproxy {

    @Pointcut(value = "execution(* xx.Stu.xx(..))")
    public void point(){}

    @Before(value = "point()")
    public void before(){
        System.out.println("before.........");
    }


    @After(value = "point()")
    public void after(){
        System.out.println("after.........");
    }

    @AfterReturning(value = "point()")
    public void afterReturning(){
        System.out.println("afterReturning.........");
    }
}
