package com.meli.java.clase2.tt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password{

    Pattern regex;

    public Password(String regex){
        this.regex = Pattern.compile(regex);
    }

    public void setValue(String pwd) {
        Matcher m = regex.matcher(pwd);
        if(!m.matches()) {
            throw new RuntimeException("Not valid password");
        }
    }

}
