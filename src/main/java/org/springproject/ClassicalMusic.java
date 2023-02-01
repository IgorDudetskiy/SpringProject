package org.springproject;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    public String getSong(){
        return "Classical Music";
    }
}
