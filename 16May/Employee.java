public class Employee {
    private String userID;
    private String password;

    public Employee(String userID, String password) throws InvalidPasswordException {
        this.userID = userID;
        setPassword(password);
    }

    public void setPassword(String password) throws InvalidPasswordException {
        if (!isValidPassword(password)) {
            throw new InvalidPasswordException("Invalid password format");
        }
        this.password = password;
    }

    public boolean isValidPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$&*])[A-Za-z\\d@$&*]{8,}$";
        return password.matches(regex);
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }
}
