// Singleton class to manage user login state
class LoginManager {
    private static LoginManager instance;
    private String loggedInUser;

    private LoginManager() {
        this.loggedInUser = null;
    }

    public static LoginManager getInstance() {
        if (instance == null) {
            instance = new LoginManager();
        }
        return instance;
    }

    public void login(String userName) {
        this.loggedInUser = userName;
        System.out.println(userName + " logged in.");
    }

    public void logout() {
        System.out.println(loggedInUser + " logged out.");
        this.loggedInUser = null;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }

    public boolean isUserLoggedIn() {
        return loggedInUser != null;
    }
}
