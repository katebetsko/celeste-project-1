package week6;

public class PasswordValidation_Kate {
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

    public static void main(String[] args) {
        String password = "Java11";
        System.out.println("Password is valid: " + passwordValidation(password));
    }

    public static boolean passwordValidation(String password){
        if(password.length() < 6 || password.contains(" ")){
            return false;
        }

        boolean hasUpper = false;
        for(char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUpper = true;
                break;
            }
        }
        if(!hasUpper){
            return false;
        }

        boolean hasLower = false;
        for(char ch : password.toCharArray()){
            if(Character.isLowerCase(ch)){
                hasLower = true;
                break;
            }
        }
        if(!hasLower){
            return false;
        }

        boolean hasSpecial = false;
        for(char ch : password.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                hasSpecial = true;
                break;
            }
        }
        if(!hasSpecial){
            return false;
        }

        boolean hasDigit = false;
        for(char ch : password.toCharArray()){
            if(Character.isDigit(ch)){
                hasDigit = true;
                break;
            }
        }
        if(!hasDigit){
            return false;
        }

        return true;
    }
}
