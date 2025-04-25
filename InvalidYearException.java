public class InvalidYearException extends Exception {
    public InvalidYearException(String message) {
        super(message);
    }
    //Simple try and catch block to test the exception
    public static void main(String[] args) {
        try {
            throw new InvalidYearException("Invalid year provided.");
        }
        catch (InvalidYearException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.printf("Check for Invalid yearFounded done!");
        }
    }
    public static void validYear(int year, String teamName) throws InvalidYearException {
        if (year <= 0) {
            throw new InvalidYearException("Invalid founding year for " + teamName + ": " + year);
        }

    
    }}
    
