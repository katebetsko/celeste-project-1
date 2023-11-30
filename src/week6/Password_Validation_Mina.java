package week6;

public class Password_Validation_Mina {
    public static void main(String[] args) {

        PassValid("mi1Kop0@");

        /*
        String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
         */

    }
    public static boolean PassValid(String password) {

        boolean specialChar = false;
        boolean digit = false;
        boolean upperCase = false;
        boolean lowerCase = false;

        if(password.contains(" ")){
            System.out.println("Invalid! it contains space");
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char p = password.charAt(i);

            if (!Character.isLetterOrDigit(p)) {
                specialChar = true;

            } else if (p >= 48 && p <= 57) {
                digit = true;
            } else if (Character.isUpperCase(p)) {
                upperCase = true;
            } else if (Character.isLowerCase(p)) {
                lowerCase = true;
            }
        }

        int length = password.length();
        if(length < 6){
            System.out.println("Invalid Length");
            return false;
        }

        boolean isValid = specialChar && digit && upperCase && lowerCase;
        if (isValid) {
            System.out.println("Valid Password");
            return true;
        } else {
            System.out.println("Invalid password");
            return false;
        }
    }



}
