package LazyInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class Chicken extends Animal{
    public Chicken(){
        sound = "KkoKko";
        System.out.println("Chicken constructor.");
    }
}
