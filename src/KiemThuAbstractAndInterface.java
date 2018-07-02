import animal.Animal;
import animal.Tiger;
import animal.Chicken;
import edible.Edible;
import fruit.Fruit;
import fruit.Orange;
import fruit.Apple;
public class KiemThuAbstractAndInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible ediler=(Chicken) animal;
                System.out.println(ediler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
