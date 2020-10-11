package com;

public class Suitcase {

   public int maxItemsCount;
   public int currentItems;

    public Suitcase(int maxItemsAllowed){
        maxItemsCount = maxItemsAllowed;
        currentItems = 0;
        System.out.println(" **Suitcase System** ");
        display();
    }

   public void addItem(){
        if(currentItems + 1 <= maxItemsCount){
            currentItems++;
            System.out.println("Adding item");
            display();
        }else{
            System.out.println("No more items boi!");
        }
    }

    public void removeItem(){
        if(currentItems - 1 >= 0){
            currentItems--;
            System.out.println("Removing item");
            display();
        }else{
            System.out.println("No more items to remove boi");
        }
    }

   private void display(){
        System.out.println("Items: " + currentItems + "/" + maxItemsCount);
    }



}
