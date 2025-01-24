package DatabaseSystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDatabase implements DatabaseDatabase {
    @Override
    public String getData() {
        return "MongoDB";
    }
}
