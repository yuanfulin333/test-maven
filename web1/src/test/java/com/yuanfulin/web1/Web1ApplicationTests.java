package com.yuanfulin.web1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
 class Web1ApplicationTests {

    @Test
    void contextLoads() {
        String s = "a";
        String v = s;
        s= "sda";
        System.out.println(s == v);
        System.out.println(s.hashCode());
        System.out.println(v.hashCode());

    }

}
