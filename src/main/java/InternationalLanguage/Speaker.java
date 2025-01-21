package InternationalLanguage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Speaker {

    private Language language;

    @Autowired
    public Speaker(@Qualifier("French") Language lan) {
        this.language = lan;
    }

    public void speak() {
        System.out.println(language.Hello());
        System.out.println(language.Thanks());
        System.out.println(language.Sorry());
        System.out.println(language.Bye());
    }
}