package InternationalLanguage;

import org.springframework.stereotype.Component;

@Component
public class English implements Language{
    @Override
    public String Hello() {
        return "Hello";
    }

    @Override
    public String Sorry() {
        return "Sorry";
    }

    @Override
    public String Thanks() {
        return "Thanks";
    }

    @Override
    public String Bye() {
        return "Bye";
    }
}
