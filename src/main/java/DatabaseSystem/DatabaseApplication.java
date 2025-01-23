package DatabaseSystem;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DatabaseApplication {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(DatabaseApplication.class)){
            context.getBean(DatabaseController.class).printPage();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
