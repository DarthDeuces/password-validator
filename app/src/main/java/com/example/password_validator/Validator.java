package com.example.password_validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created my Chris Jurcina on 6/3/2018
 *
 * References:
 *
 * https://stackoverflow.com/questions/18590901/check-if-a-string-contains-numbers-java?
 * utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
 *
 * https://stackoverflow.com/questions/16127923/checking-letter-case-upper-lower-within-a-string-in-java?
 * utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
 */
public class Validator {

    private String password;

    public void setPass(String p){

        password = p;
    }

    public int validate(){

        int strength = 0; //strength is the count of passed rules
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(password);//used to find special chars in a string
        boolean b = m.find();

        if (!password.equalsIgnoreCase("password")){
            strength++;
        }
        if (password.length()>=8){
            strength++;
        }
        if (b == true){
            strength++;
        }
        if (password.matches(".*\\d+.*")) { //rule to see if password contains digits
            strength++;
        }
        boolean hasUppercase = !password.equals(password.toLowerCase());//checks to see if password contains uppercase chars
        boolean hasLowercase = !password.equals(password.toUpperCase());//checks to see if password contains lowercase chars

        if (hasLowercase == true && hasUppercase == true){
            strength++;
        }

        return strength;
    }

}
