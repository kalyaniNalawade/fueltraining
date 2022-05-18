class InvalidCountryException extends Exception {
    public InvalidCountryException(String str){
        super(str);
    }
}

public class UserRegistration{

        public void registerUser(String userName, String userCountry) throws InvalidCountryException {

            if (!userCountry.equals("India")) {
                throw new InvalidCountryException("User outside India cannot be registered");
            }
            else {
                System.out.println("User Registration done successfully");
            }
    }

    public static void main(String[] args) {
            UserRegistration registration = new UserRegistration();
        try{
           // registration.registerUser("Mickey","US");
            registration.registerUser("Mini","India");

        } catch(InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

    }
}