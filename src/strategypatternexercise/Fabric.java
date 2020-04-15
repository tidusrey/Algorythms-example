package strategypatternexercise;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Fabric {
    
    WOOL(7), 
    COTTON(2),  
    POLYESTER(4),  
    RAYON(5),  
    LINEN(3),  
    CASHMERE(1),  
    SILK(6);

public int value;

    private Fabric(int value) {
        this.value = value;
    }
public static Fabric getRandomFabric() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
}

