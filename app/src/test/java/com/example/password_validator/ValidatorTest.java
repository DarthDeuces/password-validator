package com.example.password_validator;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {

    static String pw = "darthvader";

    static Validator validator;

    @BeforeClass
    public static void init()
    {
        validator = new Validator();
    }
    @Test
    public void count_isCorrect(){

        assertEquals(2, validate(pw));
    }
}
