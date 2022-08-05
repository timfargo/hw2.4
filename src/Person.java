public class Person {

    private static final String PERSON_CHARACTERS = "abcdefghijklmnopqrstuvwyzABCDEFGHIJKLMNOPQRSTUVWYZ0123456789_";

    private  Person() {
    }

    public static boolean persons(String login,String password,String confirmPassword) {

        try {
            checkUsingLoop(login, password, confirmPassword);
            return true;
        } catch (WrogLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void checkUsingLoop(String login,String password,String confirmPassword)throws WrogLoginException,WrongPasswordException{

    }
}


