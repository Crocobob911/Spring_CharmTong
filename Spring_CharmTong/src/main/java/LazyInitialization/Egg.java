package LazyInitialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Egg{
    private Animal animal;

    public Egg(Animal animal){
        System.out.println("Egg constructor.");
        this.animal = animal;
    }

    public void Born(){
        System.out.println(animal.makeSound());
    }
}
