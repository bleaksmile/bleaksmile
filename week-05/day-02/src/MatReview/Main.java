package MatReview;

public class Main {
    public static void main(String[] args) {
        Cat tom = new Cat();
        dailyRoutine(tom);
        ((Cat)(tom)).purr();


        Dog snoppy = new Dog();
        dailyRoutine(snoppy);
        snoppy.bark();
    }

    public static void dailyRoutine(Animal animal){
        System.out.println(animal.isHungry());
        animal.eat(10);
        System.out.println(animal.isHungry());
        animal.walk();
        System.out.println(animal.isHungry());
        System.out.println(animal.poop());
    }
}
