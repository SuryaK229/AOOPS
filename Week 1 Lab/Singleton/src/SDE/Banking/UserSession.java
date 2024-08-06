package SDE.Banking;
    // Singleton class to manage user login state
public class UserSession {
    // Private static instance of UserSession
    private static UserSession instance;
    private boolean loggedIn;

    // Private constructor to prevent instantiation
    private UserSession() {
        loggedIn = false;
    }

    // Public static method to provide access to the single instance
    public static UserSession getInstance() {
        if (instance == null) {
            synchronized (UserSession.class) {
                if (instance == null) {
                    instance = new UserSession();
                }
            }
        }
        return instance;
    }

    // Method to log in the user
    public void login() {
        loggedIn = true;
        System.out.println("User logged in.");
    }

    // Method to log out the user
    public void logout() {
        loggedIn = false;
        System.out.println("User logged out.");
    }

    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }
}
