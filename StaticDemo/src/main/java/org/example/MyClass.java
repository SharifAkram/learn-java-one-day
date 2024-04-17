package org.example;

class MyClass
{

    // non-static field method
    public String message = "Hello, Miami";
    public void displayMessage()
    {
        System.out.println("Message = " + message);
    }

    // static field and method
    public static String greetings = "Good evening";
    public static void displayGreetings()
    {
        System.out.println("Greeting = " + greetings);
    }
}
