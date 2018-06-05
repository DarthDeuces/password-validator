package com.example.password_validator;

import org.junit.Rule;
import org.junit.Test;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class EspressoTest {

        @Rule
        public ActivityTestRule mActivityRule =
                new ActivityTestRule(MainActivity.class);

        @Test
        public void checkPassword(){
            onView(withId(R.id.inputPass)).perform(typeText("He!!0mate"));
            onView(withId(R.id.button)).perform(click());
            onView(withId(R.id.textField)).check(matches(withText("Strong")));
        }
}


