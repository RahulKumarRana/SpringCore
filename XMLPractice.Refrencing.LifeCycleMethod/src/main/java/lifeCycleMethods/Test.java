package lifeCycleMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String [] args) {
        ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("lifeCycle/life.xml");
       Object r= con.getBean("s1");
       System.out.println(r);
       con.close();
	}
}
