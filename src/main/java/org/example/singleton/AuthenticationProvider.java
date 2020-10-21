package org.example.singleton;

public class AuthenticationProvider {

    // this gets initialized on class loading (only once)
    private static AuthenticationProvider INSTANCE = new AuthenticationProvider();

    public static AuthenticationProvider getInstance()
    {
        return INSTANCE;
    }
    AuthenticationProvider()
    {
        // no-code
    }

}
