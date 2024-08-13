// Abstract Products
interface Weapon {
    void use();
}

interface PowerUp {
    void activate();
}

// Concrete Products for Medieval
class Sword implements Weapon {
    @Override
    public void use() {
        System.out.println("Swinging the sword!");
    }
}

class HealingPotion implements PowerUp {
    @Override
    public void activate() {
        System.out.println("Healing with potion!");
    }
}

// Abstract Factory
abstract class GameFactory {
    public abstract Weapon createWeapon();
    public abstract PowerUp createPowerUp();
}

// Concrete Factories
class MedievalGameFactory extends GameFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealingPotion();
    }
}
