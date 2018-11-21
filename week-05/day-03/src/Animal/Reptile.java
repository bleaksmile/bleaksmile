package Animal;

public class Reptile extends Animal {

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public void eat() {
    }
}