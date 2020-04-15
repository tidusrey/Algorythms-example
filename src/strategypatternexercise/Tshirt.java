/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypatternexercise;

import java.util.ArrayList;




public class Tshirt implements Comparable<Tshirt> {
    private Size size;
    private Fabric fabric;
    private Colors color;
  
   

    public Tshirt(Size size, Fabric fabric, Colors color) {
        this.size = size;
        this.fabric = fabric;
        this.color = color;
      
    }

    

    public Tshirt() {
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

   

    @Override
    public String toString() {
       
        return "Size  is " + size + " , quality is " + fabric + ", color is " + color;
    }
  

    
  
private ArrayList<Tshirt> tshirts = new ArrayList<>();
    
    public  ArrayList<Tshirt> makeManyTShirts (int i){
        for (int j = 0; j < i; j++) {
           tshirts.add(new Tshirt(Size.getRandomSize(),Fabric.getRandomFabric(),Colors.getRandomColor()));
           
        }
        return tshirts;
        }

    @Override
    public int compareTo(Tshirt o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
