package com.ep.club.security;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordTests {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testEncode(){

        String password = "1111";

        String enPw = passwordEncoder.encode(password);

        System.out.println("enPw : " + enPw);

        boolean matchResult = passwordEncoder.matches(password,enPw);

        System.out.println("mathchResult : " + matchResult);

        // 1 테스트 결과
        //enPw : $2a$10$PWhxZwV56sVMXF865gwZWeU7ipw0nVduvWL1s2KTVXoA1IB31cymu
        //mathchResult : true

        // 2 테스트 결과
        //enPw : $2a$10$QqoHXRybuHWesml2x4EHI.NXS7U0wM4RSPVhKItaULfRyO4LgM1IC
        //mathchResult : true


    }

}
