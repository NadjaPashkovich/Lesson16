package by.itstep.pashka.model.logic;

import by.itstep.pashka.model.date.Dragon;

public class DragonLogic {
    public static final  int FIRST_PERIOD=100;
    public static final  int SECOND_PERIOD=200;

    public static int calculateHeads(Dragon dragon) {
        if (dragon.age < 1) {
            return -1;
        }
        int head = 3;

        if (dragon.age <= FIRST_PERIOD) {
            head += dragon.age * 3;
        } else if (dragon.age <= SECOND_PERIOD) {
            head +=FIRST_PERIOD * 3 + (dragon.age - FIRST_PERIOD) * 2;
        } else {
            head +=FIRST_PERIOD * 3 + (SECOND_PERIOD + dragon.age-SECOND_PERIOD);
        }
        return head;
    }

}
