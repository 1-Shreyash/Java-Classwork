public class InvalidPasswordException extends Exception {
    String detail;
    public InvalidPasswordException(String message) {
        //super(message);
        detail=message;
    }

     @Override
     public String toString() {
         return super.toString() + "InvalidPasswordException : " + detail;
     }

}