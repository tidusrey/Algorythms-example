/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise.sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import strategypatternexercise.Tshirt;

/**
 *
 * @author Μαρια
 */
public class Sorts {
    public static  void bubbleSort(ArrayList<Tshirt> arraytosort, Comparator comparator) {
        int n = arraytosort.size();
        Tshirt temp;
        boolean is_sorted;
        for (int i = 0; i < n; i++) {
            is_sorted = true;
            for (int j = 1; j < (n - i); j++) {
                if (comparator.compare(arraytosort.get(j - 1), arraytosort.get(j)) > 0) {
                    //swap elements
                    temp = arraytosort.get(j - 1);
                    
                    arraytosort.set(j - 1, arraytosort.get(j));
                    arraytosort.set(j, temp);
                        
                    is_sorted = false;
     }
            }
            if (is_sorted) {
                break;
            }
        }
    }
public static ArrayList<Tshirt> quickSort(ArrayList<Tshirt> list, int left, int right, Comparator comparator){
        int ll=left;
        int rgt=right;
        if (rgt>ll){
            Tshirt pivot = list.get((ll + rgt) / 2);
            while (ll <=rgt){
                while(ll<right && comparator.compare(list.get(ll), pivot) < 0){
                    ll +=1;
                }
                while(rgt>left &&  comparator.compare(list.get(rgt), pivot) > 0){
                    rgt -=1;
                }
                if (ll <=rgt){
                    Collections.swap(list, ll ,rgt);
                    ll +=1;
                    rgt -=1;
                }
            }
            if (left < rgt){
                quickSort(list,left,rgt, comparator);
            }
            if (ll<right){
                quickSort(list, ll, right, comparator);
            }
        }
        return list;
    }
        
        public static ArrayList<Tshirt> bucketSort(ArrayList<Tshirt> list, Comparator comparator) {
        final int noOfBuckets = (int) Math.sqrt(list.size());
        List<Tshirt>[] buckets = new List[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new LinkedList<>();
        }
        for (Tshirt t : list) {
            buckets[hash(t)].add(t);
        }
        for (List<Tshirt> bucket : buckets) {
            Collections.sort(bucket, comparator);
        }
        int i = 0;
        for (List<Tshirt> bucket : buckets) {
            for (Tshirt num : bucket) {
                list.set(i++, num);
            }
        } return list;
    }    private static int hash(Tshirt e) {
        return e.getColor().value / 10;
    }
    }

    
