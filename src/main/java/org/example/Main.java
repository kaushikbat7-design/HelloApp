public class HelloApp {
    public static void main(String[] args) {
        // 1. Set a default name
        String name = "World";

        // 2. Check if the user provided a name via command-line arguments
        if (args.length > 0) {
            name = args[0]; // Use the first argument provided
        }

        // 3. Print the greeting to the console
        System.out.println("Hello, " + name + "!");
    }
}
