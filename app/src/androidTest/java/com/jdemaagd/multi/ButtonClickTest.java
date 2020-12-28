package com.jdemaagd.multi;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ButtonClickTest {

    // @Rule
    // public ActivityTestRule<ClickActivity> mActivityRule = new ActivityTestRule<>(ClickActivity.class);

    @Test
    public void testClick() {
        onView(withId(R.id.click_count_text_view)).check(matches(withText("0")));
        onView(withId(R.id.click_button)).perform(click());
        onView(withId(R.id.click_count_text_view)).check(matches(withText("1")));
    }
}
