package com.jdemaagd.java.test;

import com.jdemaagd.java.Echo;
import org.junit.Assert;
import org.junit.Test;

public class EchoTest {
    @Test
    public void test() {
        Assert.assertEquals(Echo.echo("hello"), "hello");
    }
}
