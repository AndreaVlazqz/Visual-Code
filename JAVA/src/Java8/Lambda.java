package Java8;
//functional programming
//functions are treated as first-class citizens,
//meaning that they can be bound to names (including local identifiers),
//passed as arguments,
//and returned from other functions,
//just as any other data type can.

public class Lambda {
    public static void main(String[] args){
        //basicConcept();
        //passLambdaAsArgument();
        Greeting greeting = getLambda();
        greeting.greet("Returning a lambda from a function");
    }

    // getLambda function is to explain as a return type
    public static Greeting getLambda(){
        Greeting greeting = (String message) -> System.out.println(message);
        return greeting;
    }

    private static void passLambdaAsArgument() {
        Greeting greeting = (String message) -> System.out.println(message);
        //passing lambda as argument
        greetWithASmile(greeting);
    }
    //greetWithASmile is a function to use with pass Lambda as argument
    public static void greetWithASmile(Greeting greeting){
        greeting.greet("Greet with a big smile");
    }

    private static void basicConcept() {
        //functional interface object = lambda expression
        //type of a lambda expression is a functional interface
        Greeting greeting = (String message) -> {System.out.println(message);};
        //without curly braces
        //Greeting greeting = (String message) -> System.out.println(message);
        greeting.greet("Welcome to lambda expressions");
    }
}

// A functional interface only has one method
@FunctionalInterface
interface Greeting {
    public abstract void greet(String message);
}



