package zuoye;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    interface IPerson{
        void jump();
        void shoot();
    }

    static class xxx implements IPerson{

        @Override
        public void jump() {
            System.out.println("jump");
        }

        @Override
        public void shoot() {
            System.out.println("shoot");
        }
    }

    static class ppp implements InvocationHandler{
        private Object o=null;
        public ppp(Object o){
            this.o=o;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
            System.out.print("super");
            method.invoke(o);
            return null;
        }
    }

    public static void main(String[] args) {
        IPerson person=new xxx();
        IPerson newp=(IPerson) Proxy.newProxyInstance(IPerson.class.getClassLoader(), new Class[]{IPerson.class},new ppp(person));
        newp.jump();
        newp.shoot();
    }
}
