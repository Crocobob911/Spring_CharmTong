package DatabaseSystem;

import org.springframework.stereotype.Component;

@Component
public class DatabaseController {
    private DatabaseService service;

    public DatabaseController(DatabaseService databaseService) {
        service = databaseService;
    }

    public void printPage() {
        System.out.println(service.getData());
    }
}
