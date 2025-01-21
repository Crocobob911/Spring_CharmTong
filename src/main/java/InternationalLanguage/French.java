package InternationalLanguage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("French")
public class French implements Language{
    @Override
    public String Hello() {
        return "Bonjour";
    }

    @Override
    public String Sorry() {
        return "Pardon";
    }

    @Override
    public String Thanks() {
        return "Merci";
    }

    @Override
    public String Bye() {
        return "Ciao";
    }
}
