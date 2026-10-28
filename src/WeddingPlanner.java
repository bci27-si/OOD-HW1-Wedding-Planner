public class Main {

    public static void main(String[] args) {
        // mian function
        System.out.println("|=================================|");
        System.out.println("| Welcome to the wedding Planner! |");
        System.out.println("|=================================|");



        // create a Destinationsl Wedding in the mountains

        // create a Destinational Wedding on the beach

        // create a Traditional Wedding in the mountains

        // create a Traditional Wedding on the beach

        // create a Luxury Wedding in the mountains

        //create a Luxury Wedding on the beach


// I could create a full version,
// i would use scanner for the user to build the wedding,
// and the program would find the closest version, or create a custom one


    }

}

/*

Factory - Wedding Package is an abstract class.
    It is used with three different implementations of the wedding package;
        Luxury, Traditional and Destination Wedding

Builder wedding package builder, allows customization

Singleton - Wedding Planner is a Class that is supposed to ensure there is only one instance.

WRONG - Abstract Factory
_________________

 */

/*

** All problems use more than one design pattern
Problem 1
Wedding Planning System Design Assignment
Scenario: You are tasked with designing a system for a Wedding Planning Company that offers various types of
wedding packages, such as
    - Luxury Wedding,
    - Traditional Wedding, and
    - Destination Wedding.

Each customized with options such as
    - venue,
    - catering,
    - decorations, and
    - photography.

** ensure that only one instance of the wedding planner exists throughout the company's operations.

Classes to Implement:
WeddingPackage:
    - An abstract class that defines the structure of a wedding package.

LuxuryWedding, TraditionalWedding, DestinationWedding:
    - Concrete implementations of the WeddingPackage class.

WeddingFactory:
    - A class responsible for creating different types of wedding packages.

WeddingPlanner: (main)
    - A class that ensures only one instance of the wedding planner is created for the company.

WeddingPackageBuilder:
    - A class that allows customization of wedding packages (e.g., venue, catering, decorations, photography).

CUSTOMIZABLE OPTIONS:
    - Venue: The venue selected for the wedding, such as Beach or Mountain.
    - Catering: Catering options, such as Classic Buffet or Gourmet Buffet.
    - Decorations: Decoration preferences, such as Elegant Flowers or No Flowers.
    - Photography: Photography options, such as Professional or Local.


Task:
Identify and Justify Design Choices:
Based on the system requirements, identify the best design patterns to use for each part of the system.
Justify your design choices, explaining why these patterns are most suitable. 3 patterns are to be used
UML Diagrams:
Create UML diagrams that represent your system's design.
These diagrams should illustrate the relationships between classes and how the design patterns are applied in your implementation.
Java Code Implementation:
Implement the system in Java, ensuring that your design reflects the chosen patterns.
Write well-documented code with clear explanations of the key design choices.
Include test cases to demonstrate the creation and customization of various wedding packages.
Sample output

 */



