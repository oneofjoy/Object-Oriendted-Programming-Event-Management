public abstract class Account {
    protected String username;
    protected String password;
    protected String role;

    public Account(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername)
                && password.equals(inputPassword);
    }
}
