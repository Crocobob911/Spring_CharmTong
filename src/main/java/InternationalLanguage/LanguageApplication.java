package InternationalLanguage;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LanguageApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LanguageApplication.class);) {
            context.getBean(Speaker.class).speak();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}