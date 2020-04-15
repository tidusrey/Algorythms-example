/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise.cloth.sorts;

import java.util.Comparator;
import strategypatternexercise.Tshirt;

/**
 *
 * @author Μαρια
 */
public class TshirtSizeComparator implements Comparator<Tshirt>{

    
     //using Compare for Size
    @Override
    public  int compare(Tshirt o1, Tshirt o2) {
         return (o1.getSize().value - o2.getSize().value);
    }
//using reverse compare for Size
 
    
}
