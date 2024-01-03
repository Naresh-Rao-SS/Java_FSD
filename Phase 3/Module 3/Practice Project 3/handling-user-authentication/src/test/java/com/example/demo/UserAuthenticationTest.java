package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.example.demo.*;


class UserAuthenticationTest {
    static UserAuthentication ua;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        ua = new UserAuthentication();
        ua.register(new User("demo@example.com", "demo@123"));
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        ua = null;
    }

    @Test
    void testLogin() {
        User user = new User("demo@example.com", "demo@123");
        assertTrue(ua.login(user));
    }

    @Test
    void testListOfUsers() {
        assertEquals(1, ua.listOfUsers().size());
    }

    @Test
    void testRegistration() {
        User user = new User("test@example.com", "test@123");
        String result = ua.register(user);
        assertEquals("Registered", result);
    }
}
