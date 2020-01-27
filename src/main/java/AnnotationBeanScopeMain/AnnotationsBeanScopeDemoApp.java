package AnnotationBeanScopeMain;

import com.annotationsPractice.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Coach coach= context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach= context.getBean("tennisCoach", Coach.class);
        boolean result= coach==alphaCoach;
        System.out.println("pointing to the same application context"+ result);
        System.out.println("memory location of the coach"+ coach);
        System.out.println("memory location of the coach"+ alphaCoach);
    }
}
