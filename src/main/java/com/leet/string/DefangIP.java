package com.leet.string;

// Given a valid (IPv4) IP address, return a defanged version of that IP address.
// A defanged IP address replaces every period "." with "[.]".

public class DefangIP {

    public String defangIPaddr(String address) {
        StringBuilder rsl = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                rsl.append("[.]");
            } else {
                rsl.append(c);
            }
        }
        return rsl.toString();
    }
}
