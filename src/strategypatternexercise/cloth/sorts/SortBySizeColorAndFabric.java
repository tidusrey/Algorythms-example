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
public class SortBySizeColorAndFabric implements Comparator<Tshirt> {


        @Override
    public int compare(Tshirt o1, Tshirt o2) {
        int compareSize = o1.getSize().value - o2.getSize().value;
        if (compareSize == 0) {
            int compareColor = o1.getColor().value - o2.getColor().value;
            if (compareColor == 0) {
                 int compareFabric = o1.getFabric().value - o2.getFabric().value;
                if (compareFabric == 0) {
                    return 0;
                } else {
                    return compareFabric;
                }
            } else {
                return compareColor;
            }
        }else{
            return compareSize;
        }
    }

 
    
}
