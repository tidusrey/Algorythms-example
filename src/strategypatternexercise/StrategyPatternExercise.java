/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise;

import java.util.ArrayList;
import strategypatternexercise.cloth.sorts.SortBySizeColorAndFabric;
import strategypatternexercise.cloth.sorts.TshirtColorComparator;
import strategypatternexercise.cloth.sorts.TshirtFabricComparator;
import strategypatternexercise.cloth.sorts.TshirtSizeComparator;
import strategypatternexercise.sorts.Sorts;


public class StrategyPatternExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create 40 random tshirts
Tshirt a=new Tshirt();

ArrayList <Tshirt> aram=a.makeManyTShirts(40);
for(Object o:aram){
        System.out.println(o);
    }System.out.println("--------");
    System.out.println("");
    
//       
//        System.out.println("");
//   //Sorting the Color using bubbleSort with ascent
//TshirtSizeComparator tshirtAscComparator=new TshirtSizeComparator();
//Sorts.bubbleSort(aram, tshirtAscComparator);
//        for(Object o:aram){
//        System.out.println(o);
//       } 
//           System.out.println("");
// System.out.println("--------");
//        System.out.println("");
//        
//        System.out.println("Sorting the Size using bubbleSort with decent");
//        System.out.println("");
//        // Sorting the Size using bubbleSort with decent
// TshirtSizeComparator tshirtDescComparator=new TshirtSizeComparator();
//Sorts.bubbleSort(aram, tshirtDescComparator.reversed());
//        for(Object o:aram){
//        System.out.println(o);
//        }       
//            System.out.println("");
// System.out.println("--------");
//        System.out.println("");
//        
//        System.out.println("Sorting the Color using bubbleSort with ascent");
//        System.out.println("");
//        //Sorting the Color using bubbleSort with ascent
//     TshirtColorComparator   tshirtAscColorComparator=new TshirtColorComparator();
//     Sorts.bubbleSort(aram,tshirtAscColorComparator);
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//     System.out.println("");
// System.out.println("--------");
//        System.out.println("");
//  
//        System.out.println("Sorting the Color using bubbleSort with decent");
//        System.out.println("");
// //Sorting the Color using bubbleSort with decent
//  TshirtColorComparator   tshirtDescColorComparator=new TshirtColorComparator();
//     Sorts.bucketsort(aram,tshirtDescColorComparator.reversed());
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//     System.out.println("");
// System.out.println("--------");
//        System.out.println("");
// 
//        System.out.println("Sorting the Fabric using bubbleSort with ascent");
//        System.out.println("");
//  //Sorting the Fabric using bubbleSort with ascent
// TshirtFabricComparator   tshirtAscFabricComparator=new TshirtFabricComparator();
//     Sorts.bubbleSort(aram,tshirtAscFabricComparator);
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//        System.out.println("");
// System.out.println("--------");
//        System.out.println("");
//        System.out.println("Sorting the Color using bubbleSort with decent");
//        System.out.println("");
  //Sorting the Color using bubbleSort with decent
//  TshirtFabricComparator   tshirtDescFabricComparator=new TshirtFabricComparator();
//     Sorts.bubbleSort(aram,tshirtDescFabricComparator.reversed());
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//     System.out.println("");
// System.out.println("--------");
//        System.out.println("");

// System.out.println("Sorting the Fabric using quicksort with decent");
//        
//        TshirtFabricComparator   tshirtDescFabricComparators=new TshirtFabricComparator();
//     Sorts.quickSort(aram,0,39,tshirtDescFabricComparators);
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//     System.out.println("");
// System.out.println("--------");
//        System.out.println("");
//     System.out.println("");
// System.out.println("--------");
//        System.out.println("");


        //System.out.println("Sorting the Fabric using quicksort with acsent");
//        TshirtFabricComparator   tshirtAscFabricComparators=new TshirtFabricComparator();
//     Sorts.quickSort(aram,0,39,tshirtAscFabricComparators);
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//     System.out.println("");
// System.out.println("--------");
//        System.out.println("");

        //System.out.println("Sorting the Color using quicksort with decsent");
//        TshirtColorComparator   tshirtAscColorComparators=new TshirtColorComparator();
//     Sorts.quickSort(aram,0,39,tshirtDescColorComparators.reversed());
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//     System.out.println("");
// System.out.println("--------");
//        System.out.println("");
   //System.out.println("Sorting the Color using quicksort with ascent");
//        TshirtColorComparator   tshirtAscColorComparators=new TshirtColorComparator();
//     Sorts.quickSort(aram,0,39,tshirtDescColorComparators());
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//     System.out.println("");
// System.out.println("--------");
//        System.out.println("");
//  System.out.println("Sorting the Size using quicksort with ascent");
//        TshirtSizeComparator   tshirtAscSizeComparators=new TshirtSizeComparator();
//     Sorts.quickSort(aram,0,39,tshirtAscSizeComparators.reversed());
//        for(Object o:aram){
//        System.out.println(o);
//        }      
   //  System.out.println("");
// System.out.println("--------");
        System.out.println("");
        

   //Sorting the Size using bucketsort with ascent
//TshirtSizeComparator tshirtAscComparator=new TshirtSizeComparator();
//Sorts.bucketSort(aram, tshirtAscComparator);
//        for(Object o:aram){
//        System.out.println(o);
//       } 
//           System.out.println("");
// System.out.println("--------");
//        System.out.println("");
//        
//       
//        // Sorting the Size using bucketSort with decent
// TshirtSizeComparator tshirtDescComparator=new TshirtSizeComparator();
//Sorts.bucketSort(aram, tshirtDescComparator.reversed());
//        for(Object o:aram){
//        System.out.println(o);
//        }       
//            System.out.println("");
// System.out.println("--------");
//        System.out.println("");
//        
//      
//        //Sorting the Color using bucketSort with ascent
//     TshirtColorComparator   tshirtAscColorComparator=new TshirtColorComparator();
//     Sorts.bucketSort(aram,tshirtAscColorComparator);
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//     System.out.println("");
// System.out.println("--------");
//        System.out.println("");
//  

// //Sorting the Color using bucketSort with decent
//  TshirtColorComparator   tshirtDescColorComparator=new TshirtColorComparator();
//     Sorts.bucketsort(aram,tshirtDescColorComparator.reversed());
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//     System.out.println("");
// System.out.println("--------");
//        System.out.println("");
// 

//  //Sorting the Fabric using bucketsort with ascent
// TshirtFabricComparator   tshirtAscFabricComparator=new TshirtFabricComparator();
//     Sorts.bucketSort(aram,tshirtAscFabricComparator);
//        for(Object o:aram){
//        System.out.println(o);
//        }      
//        System.out.println("");
// System.out.println("--------");
//        System.out.println("");
//        System.out.println("Sorting the Color using bucketSort with decent");
//        System.out.println("");
  //Sorting the Color using bubbleSort with decent
  
  
  //     System.out.println("");
// System.out.println("--------");
//        System.out.println("");
  
  
  
  //Sorting by Size Color and Fabric with bucketSort descend
//  SortBySizeColorAndFabric   sortBySizeColorAndFabricBucket=new SortBySizeColorAndFabric();
//     Sorts.bucketSort(aram,sortBySizeColorAndFabricBucket.reversed());
//        for(Object o:aram){
//        System.out.println(o);
//        }  
        //     System.out.println("");
// System.out.println("--------");
//        System.out.println("");
        
         //Sorting by Size Color and Fabric with bucketSort ascend
//  SortBySizeColorAndFabric   sortBySizeColorAndFabricBucket2=new SortBySizeColorAndFabric();
//     Sorts.bucketSort(aram,sortBySizeColorAndFabricBucket2);
//        for(Object o:aram){
//        System.out.println(o);
//        } 
        //     System.out.println("");
// System.out.println("--------");
//        System.out.println("");

        //Sorting by Size Color and Fabric with Bubblesort ascend
//         SortBySizeColorAndFabric   sortBySizeColorAndFabricBubble=new SortBySizeColorAndFabric();
//         Sorts.bubbleSort(aram,sortBySizeColorAndFabricBubble);
//          for(Object o:aram){
//        System.out.println(o);
//        } 
          //     System.out.println("");
// System.out.println("--------");
//        System.out.println("");

           //Sorting by Size Color and Fabric with Bubblesort descend
//         SortBySizeColorAndFabric   sortBySizeColorAndFabricBubble2=new SortBySizeColorAndFabric();
//         Sorts.bubbleSort(aram,sortBySizeColorAndFabricBubble2.reversed());
//          for(Object o:aram){
//        System.out.println(o);
//        } 
          
          //Sorting by Size Color and Fabric with QuickSort ascend
          
//      SortBySizeColorAndFabric   sortBySizeColorAndFabricQuick=new SortBySizeColorAndFabric();
//     Sorts.quickSort(aram,0,39,sortBySizeColorAndFabricQuick);
//        for(Object o:aram){
//        System.out.println(o);
//        }      
                    //     System.out.println("");
// System.out.println("--------");
//        System.out.println("");

 //Sorting by Size Color and Fabric with QuickSort descend
          
      SortBySizeColorAndFabric   sortBySizeColorAndFabricQuick2=new SortBySizeColorAndFabric();
     Sorts.quickSort(aram,0,39,sortBySizeColorAndFabricQuick2.reversed());
        for(Object o:aram){
        System.out.println(o);
        }      
          //     System.out.println("");
// System.out.println("--------");
//        System.out.println("");
    }
    }
   
    

