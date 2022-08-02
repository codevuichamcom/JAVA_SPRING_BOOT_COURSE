package com.codevui.component.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    public IOutfit outfit;

    String name;

    public Girl(@Qualifier("naked") IOutfit outfit) {
        System.out.println("constructor");
        this.outfit = outfit;
    }

    // @Autowired
    // public void setOutfit(IOutfit outfit) {
    // System.out.println("setter");
    // this.outfit = outfit;
    // }

    @PostConstruct
    public void postContructFunction() {
        System.out.println("Bean vua duoc tao xong");
    }

    @PreDestroy
    public void preDestroyFunction() {
        System.out.println("Truoc khi bi xoa khoi Application Context");
    }
}
