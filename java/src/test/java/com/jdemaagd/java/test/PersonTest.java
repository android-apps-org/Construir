package com.jdemaagd.java.test;

import com.jdemaagd.java.Person;
import org.junit.Test;

public class PersonTest {
    @Test
    public void test() {
        Person person = new Person("Jon DeMaagd");
        assert person.getName().equals("DeMaagd");
    }
}
