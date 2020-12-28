package com.jdemaagd.multi;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class PaidEchoAndroidTest {

    @Test
    public void testVerifyEchoResponse() {
        assertEquals("hello", Echo.echo("hello"));
    }

    @Test
    public void testVerifyLoggingEchoResponse() {
        Collection<String> strings = PaidEcho.echo("hello", 10, true);
        assertEquals(strings.size(), 10);
        for (String string : strings) {
            assertEquals(string, "hello");
        }

        assertEquals("hello", Echo.echo("hello", true));
    }
}