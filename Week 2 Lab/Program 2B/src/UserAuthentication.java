public class UserAuthentication {
    private static UserAuthentication instance;
    private String loggedInUser;

    private UserAuthentication() {
    }

    public static UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    public void login(String username) {
        loggedInUser = username;
        System.out.println(username + " logged in.");
    }

    public void logout() {
        System.out.println(loggedInUser + " logged out.");
        loggedInUser = null;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }
}
