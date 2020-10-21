package org.example.singleton;

// Singleton: java.lang.Runtime
public class AuthemticationTest {

    public static void main(String[] args) {
       AuthenticationProvider provider = new AuthenticationProvider();
        System.out.println(provider.hashCode()); //1975012498
       provider = new AuthenticationProvider(); // different hascode
      System.out.println(provider.hashCode()); //1808253012
        provider = new AuthenticationProvider(); // different hascode
        System.out.println(provider.hashCode());// 589431969
        // new constructor have been created for each call

        System.out.println("-------------------------");
        System.out.println(AuthenticationProvider.getInstance());
        System.out.println(AuthenticationProvider.getInstance());
        System.out.println(AuthenticationProvider.getInstance());  }
}