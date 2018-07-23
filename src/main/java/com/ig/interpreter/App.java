package com.ig.interpreter;

import com.ig.interpreter.api.Intrepreter;
import com.ig.interpreter.api.IntrepreterFactory;
import java.util.Scanner;

/**
 * Ilkin Abdullayev!
 *
 */
public class App {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(">> Intrepreter >> Hello from Intrepreter");

        App main = new App();
        main.run();
    }

    public void run() {
        while (true) {
            showFirstlyInfos();
            chooseCommand();
        }
    }

    public void showFirstlyInfos() {
        System.out.println(">> Intrepreter >> Please choose command:");
        System.out.println("- gcf [number1] [number2]\n- uwc [fileName]\n- lc [fileName]\n- exit");
    }

    public void chooseCommand() {
        String commands = scanner.nextLine();
        IntrepreterFactory inf = new IntrepreterFactory();
        Intrepreter intrepreter = inf.getIntrepreter(commands);
        int result = intrepreter.run();
        System.out.println(">> Intrepreter >> Response:" + result);
    }
}
