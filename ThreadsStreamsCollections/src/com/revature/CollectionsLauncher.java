package com.revature;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsLauncher {

    public static void main(String[] args) {

        //CTRL + click each class name to see the source code!
        //Go up through the inheritance hierarchy to see where everything comes from

        System.out.println("(LISTS)=======================");

        //Lists are ordered collections of elements that allow duplicates
        //ArrayLists are a type of List that use an array to store elements
            //One of the most commonly used collections in Java.
            //Pretty general-purpose... like an array with more functionality

        ArrayList<String> names = new ArrayList<>();

        //We can add elements to any Collection with the add() method
        names.add("Alice");
        names.add("Bob");
        names.add("Bob");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        //We can iterate over Lists, and access elements by index with the get() method
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //We can remove elements by index or by object
        names.remove(6); //removes "Charlie"

        System.out.println(names);


        System.out.println("(SETS)=======================");

        //Sets are collections that do NOT allow duplicates and are NOT ordered
        //HashSet is a type of Set that uses a hash table to store elements
            //This means that it's very fast to add, remove, and check for elements
        //If you want an ordered Set, you can look into TreeSet (follows natural order)


        HashSet<String> foods = new HashSet<>();

        foods.add("Pizza");
        foods.add("Pizza"); //This will not be added
        foods.add("Tacos");
        foods.add("Sushi");
        foods.add("Burgers");
        foods.add("Salad");

        //We can't access elements by index in a Set, because they're not ordered (no get() method!)
        //We can iterate over them with a loop
            //Notice the lack of order and no duplicates
        for (String food : foods){
            System.out.println(food);
        }

        //What if I need to access elements by index?
        //You can convert a Set to a List, but sounds like you should've just used a List in the first place!!
        ArrayList<String> foodList = new ArrayList<>(foods); //easy as putting the Set in the constructor

        //Conversely, if you have a List and need to remove duplicates, you can convert it to a Set
        HashSet<String> foodSet = new HashSet<>(foodList);

        System.out.println("(QUEUES)============================");

        //Queues are collections that follow the FIFO (First In, First Out) principle
        //LinkedList is a type of Queue that uses a doubly-linked list to store elements
            //This means that it's very fast to add and remove elements from the beginning and end
            //It also implements the List interface, ctrl + click to check the implementation!
        LinkedList<String> orders = new LinkedList<>();

        orders.add("Some Roast Beef");
        orders.add("Some Chicken");
        orders.add("A Pizza");

        //ifEmpty() returns true if the queue is empty
        while (!orders.isEmpty()){
            System.out.println("Now preparing: " + orders.peek()); //peek() returns the first element without removing it
            System.out.println("Now serving: " + orders.poll()); //poll() returns the first element AND removes it
        }

        System.out.println("All orders have been served!");

    }
}
