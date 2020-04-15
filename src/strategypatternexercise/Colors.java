/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public enum Colors {
    RED(3), 
    YELLOW(5) ,
    BLACK (1),
    WHITE (4),
    PINK(2);

    public int value;

    private Colors(int value) {
        this.value = value;
    }

public static Colors getRandomColor() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
}
