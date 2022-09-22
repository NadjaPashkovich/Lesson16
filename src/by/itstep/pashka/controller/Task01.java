package by.itstep.pashka.controller;


import by.itstep.pashka.model.date.Dragon;
import by.itstep.pashka.model.logic.DragonLogic;
import by.itstep.pashka.view.Printer;

public class Task01 {
    public static void main(String[] args) {
        Dragon garinich = new Dragon();
        garinich.age = 120;
        garinich.name = "Garinich";

        Dragon pushok = new Dragon();
        pushok.age = 350;
        pushok.name = "Pushok";

        int head = DragonLogic.calculateHeads(garinich);
        String msg = String.format("Garinich has %d heads\n", head);
        Printer.print(msg);

        head = DragonLogic.calculateHeads(pushok);
        msg = String.format("Pushok has %d heads\n", head);
        Printer.print(msg);
    }
}
