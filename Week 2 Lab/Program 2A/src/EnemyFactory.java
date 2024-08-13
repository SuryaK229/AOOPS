// Abstract Product
interface Enemy {
    void attack();
}

class Dragon implements Enemy {
    @Override
    public void attack() {
        System.out.println("Dragon breathes fire!");
    }
}

// Abstract Factory
abstract class EnemyFactory {
    public abstract Enemy createEnemy();
}

class DragonFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Dragon();
    }
}
