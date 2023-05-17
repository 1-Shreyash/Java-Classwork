// User
// Create a class Employee which stores UserID and Password. The password is valid if it contains a UpperCase letter, a LowerCase letter, a number and a special character (@, $, &, *) and length should be a minimum of 8 characters. If the password is not valid then throw user defined exception InvalidPasswordException.
public class Main2 {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("user123", "d3Y3vds@");
            System.out.println("Employee created successfully");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
