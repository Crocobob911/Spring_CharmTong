package LazyInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Pigeon extends Animal{
    public Pigeon(){
        sound = "GueGue";
        System.out.println("Pigeon constructor.");
    }
}
