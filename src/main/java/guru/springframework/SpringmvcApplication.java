package guru.springframework;

import java.util.Arrays;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringmvcApplication.class, args);
        org.springframework.context.ApplicationContext ctx=SpringApplication.run(SpringmvcApplication.class, args);
        MyClass clx=(MyClass) ctx.getBean("myClass");
        clx.sayHello();
        
        MyInterfaceimpl cm=(MyInterfaceimpl) ctx.getBean("myInterfaceimpl");
        cm.sayHello();
        
        System.out.println(Arrays.asList(ctx.getBeanDefinitionNames()));

       
       
    }
}
