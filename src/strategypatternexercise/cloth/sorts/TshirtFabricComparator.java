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
public class TshirtFabricComparator implements Comparator<Tshirt> {

    //using Compare for Fabric
    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        return (o1.getFabric().value - o2.getFabric().value);
    }
//using reverse compare for Fabric

   
}
