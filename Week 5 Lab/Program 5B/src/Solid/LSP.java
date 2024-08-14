package Solid;

class Bird {
    public void fly() {
        System.out.println("Flying high!");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}

public class LSP {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Bird ostrich = new Ostrich();
        // This would cause a runtime exception
        ostrich.fly();
    }
}
