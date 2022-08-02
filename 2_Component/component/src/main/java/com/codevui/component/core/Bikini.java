package com.codevui.component.core;

import org.springframework.stereotype.Component;

@Component("bikini")
public class Bikini implements IOutfit {
    public void wear() {
        System.out.println("Dang mac bikini");
    }
}
