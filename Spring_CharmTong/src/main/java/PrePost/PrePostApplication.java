package PrePost;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("Dependency Ready.");
    }

    @PostConstruct
    public void Init() {
        someDependency.getReady();
    }

    @PreDestroy
    public void CleanUp() {
        System.out.println("Dependency Clean Up.");
    }
}

@Component
class SomeDependency{
    public void getReady() {
        System.out.println("SomeDependency Ready.");
    }
}

@Configuration
@ComponentScan
public class PrePostApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(PrePostApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
