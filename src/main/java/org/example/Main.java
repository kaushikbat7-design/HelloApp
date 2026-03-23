package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        String greeting;

        String[] args = new String[0];
        if (args.length > 0) {
            StringBuilder names = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                if (i > 0) {
                    names.append(", ");
                }
                names.append(args[i]);
            }
            greeting = "Hello, " + names.toString() + "!";
        } else {
            greeting = "Hello, World!";
        }

        System.out.println(greeting);

    }
}
