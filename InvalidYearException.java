public class InvalidYearException extends Exception {
    public InvalidYearException(String message) {
        super(message);
    }
    //Simple try and catch block to test the exception
    public static void main(String[] args) {
        try {
            throw new InvalidYearException("Invalid year provided.");
        
    }


    
}
