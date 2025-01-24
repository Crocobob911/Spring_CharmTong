package DatabaseSystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MySQLDatabase implements DatabaseDatabase{
    @Override
    public String getData() {
        return "MySQL";
    }
}
