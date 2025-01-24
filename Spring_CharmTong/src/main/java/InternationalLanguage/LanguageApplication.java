package InternationalLanguage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LanguageApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LanguageApplication.class);) {
            context.getBean(Speaker.class).speak();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Bean
    public Speaker speaker(@Qualifier("French") Language language) {
        return new Speaker(language);
    }

    @Bean
    @Qualifier("English")
    public Language English() {
        return new English();
    }

    @Bean
    @Qualifier("Korean")
    public Language Korean() {
        return new Japanese();
    }

    @Bean
    @Qualifier("French")
    public Language French() {
        return new French();
    }

    @Bean
    @Qualifier("Japanese")
    public Language Japanese() {
        return new Japanese();
    }
}