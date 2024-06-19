public class Prisoner_Student_7_4  {
    // Fields
    public String name;
    public double height;
    public int sentence;

    // Constructor
    public Prisoner_Student_7_4(String name, double height, int sentence){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }

    // Method to print all fields
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Sentence: " + sentence);
    }

    // Overriding the method to accept a boolean argument
    public void printInfo(boolean callThink) {
        printInfo(); // Call the method to print all fields

        if (callThink) {
            think(); // Call the think method if the boolean is true
        }
    }

    // Method to express thoughts
    public void think(){
        System.out.println("I'll have my revenge.");
    }

    public static void main(String[] args) {
        Prisoner_Student_7_4 prisoner = new Prisoner_Student_7_4("John Doe", 1.75, 10);

        // Calling the method without boolean argument
        System.out.println("Printing all info without calling think():");
        prisoner.printInfo();
        System.out.println();

        // Calling the method with boolean argument as true
        System.out.println("Printing all info and calling think():");
        prisoner.printInfo(true);
    }
}