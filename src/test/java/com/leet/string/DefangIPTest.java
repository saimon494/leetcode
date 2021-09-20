package com.leet.string;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DefangIPTest {

    @Test
    public void whenDefang1() {
        var di = new DefangIP();
        String address1 = "1.1.1.1";
        String output = "1[.]1[.]1[.]1";
        assertThat(di.defangIPaddr(address1), is(output));
    }

    @Test
    public void whenDefang2() {
        var di = new DefangIP();
        String address1 = "255.100.50.0";
        String output = "255[.]100[.]50[.]0";
        assertThat(di.defangIPaddr(address1), is(output));
    }
}