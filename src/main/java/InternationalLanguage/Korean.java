package InternationalLanguage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Korean implements Language{
    public String Hello() {
        return "AnNyeong";
    }

    public String Sorry() {
        return "MiAn";
    }

    public String Thanks() {
        return "GamSa";
    }

    public String Bye() {
        return "JalGa";
    }
}
