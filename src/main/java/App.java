import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld been2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat beenCat1 = (Cat) applicationContext.getBean("cat");
        Cat beenCat2 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean1.equals(been2));
        System.out.println(beenCat1.equals(beenCat2));
    }
}