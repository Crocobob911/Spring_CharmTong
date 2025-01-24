package DatabaseSystem;

import org.springframework.stereotype.Component;

@Component
public class DatabaseService {

    private DatabaseDatabase database;

    public DatabaseService(DatabaseDatabase database) {
        this.database = database;
    }

    public String getData() {
        return database.getData();
    }
}
