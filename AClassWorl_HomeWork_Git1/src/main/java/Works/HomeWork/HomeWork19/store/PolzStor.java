package Works.HomeWork.HomeWork19.store;

import java.util.HashMap;
import java.util.Map;

public class PolzStor {

    private static Map<String, User> users = new HashMap<>();// хаш мапы топ они реально удобные

    public static void addUser(String login, String password) {
        users.put(login, new User(login, password));
    }

    public static User getUser(String login) {
        return users.get(login);
    }

    public static class User {
        private String login;
        private String password;

        public User(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public String getLogin() {
            return login;
        }

        public String getPassword() {
            return password;
        }
    }
}
