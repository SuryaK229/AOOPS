public class GameApplication {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();
        gameState.setCurrentLevel(2);
        System.out.println("Current Level: " + gameState.getCurrentLevel());

        EnemyFactory enemyFactory = new DragonFactory();
        Enemy enemy = enemyFactory.createEnemy();
        enemy.attack();

        GameFactory gameFactory=new MedievalGameFactory();
        Weapon weapon = gameFactory.createWeapon();
        PowerUp powerUp = gameFactory.createPowerUp();
        weapon.use();
        powerUp.activate();
    }
}
