public class GameState {
    private static GameState instance;
    private int currentLevel;

    private GameState() {
        currentLevel = 1;
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int level) {
        this.currentLevel = level;
    }
}
