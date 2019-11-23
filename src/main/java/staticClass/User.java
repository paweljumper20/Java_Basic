package staticClass;

public class User {
   // składowa statyczna - pole lub metoda związana z klasą a nie z obiektem
    public static int globalId = 1;
    private String login;
    private String password;
    private int userId;

    public static void incrementGlobalId(){
        globalId++;

    }

    public User(String login, String password,int globalId) {
        this.userId = globalId;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userId=" + userId +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

