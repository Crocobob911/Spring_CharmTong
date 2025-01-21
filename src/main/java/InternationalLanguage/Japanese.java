package InternationalLanguage;

import org.springframework.stereotype.Component;

@Component
public class Japanese implements Language {
    @Override
    public String Hello() {
        return "Gonnichiwa";
    }

    @Override
    public String Sorry() {
        return "Gommenne";
    }

    @Override
    public String Thanks() {
        return "Arigotto";
    }

    @Override
    public String Bye() {
        return "Jannen";
    }
}
