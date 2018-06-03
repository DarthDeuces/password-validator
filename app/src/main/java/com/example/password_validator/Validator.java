package com.example.password_validator;

/**
 * Created my Chris Jurcina on 6/3/2018
 */
public class Validator {

    private String password;

    public void setPass(String p){

        password = p;
    }

    public int validate(){
        int strength = 0; //strength is the count of passed rules

        if (!password.equalsIgnoreCase("password")){
            strength++;
        }
        if (password.length()>=8){
            strength++;
        }

        return strength;
    }

}
