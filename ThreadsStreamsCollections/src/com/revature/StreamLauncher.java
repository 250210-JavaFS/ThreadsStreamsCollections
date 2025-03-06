package com.revature;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamLauncher {

    public static void main(String[] args) {

        //Streams are NOT for data storage - that's more what Collections are for
        //Streams helps us PROCESS data in a functional way.

        //Let's create a List of Strings that we'll manipulate with a stream
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Ben");
        names.add("Ben");
        names.add("Scooby Doo");
        names.add("Scoobert Doobert");

        //We can use a stream to make a new List of process data
        List<String> newNames = names.stream()
                .distinct() //removes duplicates
                .map(name -> name.toUpperCase()) //map applies some function to each element
                .filter(name -> name.length() > 3) //remove elements that are NOT greater than 3 chars
                .sorted() //this will sort the elements according to natural order (alphabetical in this case)
                .toList(); //ends the stream, and collects the elements into a List

        System.out.println(newNames);

        //Let's do some operations on a List of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1); numbers.add(2); numbers.add(3); numbers.add(4); numbers.add(5);
        numbers.add(6); numbers.add(7); numbers.add(8); numbers.add(9); numbers.add(10);


        OptionalDouble avgOfNums = numbers.stream()
                .map(num -> num^2) //square each element
                .filter(num -> num % 2 == 0) //remove odd numbers
                .sorted() //sort the elements
                .mapToInt(Integer::intValue) //convert the stream to an IntStream
                .average(); //returns an optional double

        System.out.println("Average of numbers: " + avgOfNums.getAsDouble());






    }

}
