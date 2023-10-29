import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    // instance variables = fields = properties
    // methods


    // VARIABLES AND DATA TYPES
    // data_type variable_name;
    // data_type variable_name = variable_value;

    // String, double quotes, ""
    // char, single quotes, ''

    String firstName = "Michael   ";
    static String last_name = "Jackson";

    char digit = '3';
    char letter = 'A';
    char specialChar = '#';

    static byte numOfChildren = 5;
    short numOfChildren1 = 400;  // short
    byte numOfFlights = 50;

    static float salary = 40.5f;
    double loan = 47.9865d;


    boolean isOk = true;
    boolean hasError = false;

    // variable to store a telephone number : string,
    // variable to store an email address : string
    // variable to store an age : byte, short
    // variable to store date of birth :

    Date dob;


    // void: state of non-existence
    // main method is the entry point of a Java app

    // access modifiers: public, protected, default, private
    public static void main(String[] args) {


//        System.out.println("Hello World!");
//        System.out.println("I am learning Java programming language!");
//
//        System.out.print("I study in Solent Uni!");
//        System.out.print("I study in Roehampton Uni!");
        // System.out.println(salary);

        int age = 35;
//
//        if (age <= 50) {
//            System.out.println("You are younger than 50");
//        } else {
//            System.out.println("You are older than 50");
//
//        }

        // System.out.println(18 < age < 50);  // true<50

        System.out.println(18 < age || age > 50);


        // logical Operators: and, or, not
        // and: &&, conjunction
        // or: ||, disjunction
        // not:  !, logical inverse

        // 13%4 = 4*3 +1
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);


    }
}