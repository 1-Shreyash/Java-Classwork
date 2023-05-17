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
        // String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$&*])[A-Za-z\\d@$&*]{8,}$";
        // return password.matches(regex);
        char[] arr = password.toCharArray();
        if(password.length()<8){
            int flag1;
           for (char arr2 : arr) {
            if((arr2>='A' && arr2<='Z' )|| (arr2>='a' && arr2<='z')){
                flag1 = 1;
            }
            else if(arr2>='0' && arr2<='9'){

            }
           }
        }
        else{
            return false;
        }
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }
}
