package by.itstep.pashka.controller;

import by.itstep.pashka.model.date.Dragon;
import by.itstep.pashka.model.logic.DragonLogic;
import by.itstep.pashka.util.UserInput;
import by.itstep.pashka.view.Printer;

public class Task02 {
    public static void main(String[] args) {
        Dragon dragon=new Dragon();
        dragon.name= UserInput.inputString("Input dragon name: ");
        dragon.age=UserInput.inputNumber("Input dragon age ");

        int head = DragonLogic.calculateHeads(dragon);
        String msg = String.format("%s has %d heads\n",dragon.name, head);
        Printer.print(msg);
    }
}
