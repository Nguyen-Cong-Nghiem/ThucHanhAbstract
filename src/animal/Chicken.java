package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Ga keu: cluck-cluck";
    }

    public String howToEat() {
        return "Loai ga la loai an thoc";
    }
}
