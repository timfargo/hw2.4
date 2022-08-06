public class Person {

    private static final String PERSON_CHARACTERS = "abcdefghijklmnopqrstuvwyzABCDEFGHIJKLMNOPQRSTUVWYZ0123456789_";

    private Person() {
    }

    public static boolean persons(String login, String password, String confirmPassword) {

        try {
            checkUsingLoop(login, password, confirmPassword);
            return true;
        } catch (WrogLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void checkUsingLoop(String login, String password, String confirmPassword) throws WrogLoginException, WrongPasswordException {
        if (login == null || login.length() > 20) {
            throw new WrogLoginException("Длина логина должна быть меньше или равна 20");
        }
        if (password == null || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException("Длина пароля должна быть меньше 20");
        }
        checkCharacters(login, "Логин");
        checkCharacters(password, "Пароль");
    }



    private static void checkCharacters(String s, String where) throws WrogLoginException {
        for (int i = 0; i < s.length(); i++) {
            if (!PERSON_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                throw new WrogLoginException(String.format("%s содеожит неверный символ %c! ", where, s.charAt(i)));
            }
        }
    }

}









