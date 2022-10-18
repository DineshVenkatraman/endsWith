public class endsWith {
    public static void main(String args[]) {
        String s1 = "java by javatpoint";
        System.out.println(s1.endsWith("t"));
        System.out.println(s1.endsWith("point"));

        String str = "Welcome to Javatpoint.com";
        System.out.println(str.endsWith("point"));
        if(str.endsWith(".com")) {
            System.out.println("String ends with .com");
        }else System.out.println("It does not end with .com");

        if("Welcome to JavaTpoint".endsWith(""))
        {
            System.out.println("Inside the if block");
        }
        else
        {
            System.out.println("Inside the else block");
        }
// invoking the method endsWith() using the string literal
        if("Welcome to JavaTpoint".endsWith("point"))
        {
            System.out.println("Inside the if block");
        }
        else
        {
            System.out.println("Inside the else block");
        }
// invoking the method endsWith() using the string literal
        if("Welcome to JavaTpoint".endsWith("xyz"))
        {
            System.out.println("Inside the if block");
        }
        else
        {
            System.out.println("Inside the else block");
        }
    }
}