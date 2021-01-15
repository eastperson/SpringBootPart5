package com.ep.club.security;

import com.ep.club.util.JWTUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JWTTests {

    private JWTUtil jwtUtil;

    @BeforeEach
    public void testBefore() {


        System.out.println("testBefore................");
        jwtUtil = new JWTUtil();
    }

    @Test
    public void testEncde() throws Exception {
        String email = "user95@bbb.com";

        String str = jwtUtil.generateToken(email);

        System.out.println(str);
    }

    @Test
    public void testValidate() throws Exception {

        String email = "user95@bbb.com";

        String str = jwtUtil.generateToken(email);

        Thread.sleep(5000);

        String resultEmail = jwtUtil.validateAndExtract(str);

        System.out.println(resultEmail);

    }

}
