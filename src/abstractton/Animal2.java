package abstractton;

public abstract class Animal2 {
    public String name;

    public abstract void sound();
    public abstract void walk();

    Animal2 () {
        System.out.println("Animal 2 Constructor");
    }
    public void playing() {
        System.out.println("Animal 2 Playing");
    }
}
