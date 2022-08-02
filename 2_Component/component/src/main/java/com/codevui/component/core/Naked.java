package com.codevui.component.core;

import org.springframework.stereotype.Component;

@Component("naked")
public class Naked implements IOutfit {

    @Override
    public void wear() {
        System.out.println("Dang khong mac gi");

    }

}
