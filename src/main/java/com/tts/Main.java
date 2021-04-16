package com.tts;
import java.sql.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.*;

//import java.util.ArrayList;
//import java.util.List;

public class Main {
    public static void main(String[] args) {

    String[] fruitArray = {"orange", "apple", "berries"};
    int[] intArray;
    boolean [] boolArray;

    System.out.println("===Arrays===");
    System.out.println(fruitArray[1]);
    System.out.println(fruitArray.length);

        System.out.println("===Collections===");
        List <String> stringList= new ArrayList <>();
        List <String> stringLinkedList= new LinkedList<>();
        List <String> stringVector = new Vector<>();
        List <String> stringStack= new Stack<>();

        stringList.add("dog");
        stringList.add("house");
        stringList.add("keys");

        //{dog, house, keys}

        stringList.add(1, "cat");

        //{dog, cat, house, keys}

        System.out.println(("The element at index 0:" + stringList.get(1)));

//        stringList.remove(0);
        System.out.println("This is the size of my list:" + stringList.size());

        //this completely remove all elements from your lsit
//        stringList.clear();

       Collections.reverse(stringList);
       System.out.println("Here is my list reversed: " + stringList);

        System.out.println("===String Conversion===");
        //first I set up a String
        String myString = "I really like ice cream" ;
        //then i take my string and split it at every white space
        //and turn it into a regular array
        String [] strArr = myString.split(" ");

        //setting up arrayList and making the value
        //that of the strArr
        List<String> splitList = new ArrayList<>();

        splitList = Arrays.asList(strArr);
        System.out.println(splitList);

        List<String> carList = Arrays.asList("BMW", "Honda", "Audi");
        Object[] carArr = carList.toArray();

        String carString = Arrays.toString(carArr);
        System.out.println(carString.replace("[", "")
        .replace("]", "")
        .replace(",", " "));

        System.out.println("===HashMaps===");
//Creates a HashMap with a String as key and Integer as the value it points to
        HashMap<String, Integer> personMap = new HashMap<>();

        personMap.put("Mary", 37);
        personMap.put("Bob", 21);
        personMap.put("Susie", 63);
        System.out.println(personMap);
        //output looks like {Bob=21, Susie=63, Mary=37}

        System.out.println("This is the value associated with Mary:" + personMap.get("Mary"));

        for (String i : personMap.keySet()) {
            System.out.println("key: " + i + "\tvalue: " + personMap.get(i));
            //\t creates output in table form
            //.keyset is a method the output key value pairs

            personMap.remove("bob");
            System.out.println("Is Bob in my map?"+ personMap.containsKey("Bob"));

            System.out.println("===Iterating Loops===");

            List<String> fruitList = Arrays.asList("plum", "grape", "fiji apple");

            //this is referred to as an enhanced for loop
            // enhanced for loops are strictly used for collections
            //String fruit represents any given element in our fruitList collection
            for (String fruit: fruitList) {
                System.out.println("Here is one of my fruits:" + fruit);
            }
            //below code is the same as above
            fruitList.forEach((fruit)-> System.out.println(fruit));
            //another eay to write above...again
            fruitList.forEach(System.out::println);

            System.out.println("===Linked List===");

            LinkedList<String> animalList = new LinkedList<>();
            animalList.add("frog");
            animalList.add("giraffe");
            animalList.add("buffalo");
            animalList.add("mongoose");
            System.out.println(animalList);

            //methods associated with LinkedList
            animalList.addFirst("shark");
            System.out.println(animalList);

            //set index 1 to a new value
            animalList.set(1, "emu");
            System.out.println(animalList);

            System.out.println("===Queues List===");

            Queue <Integer> myQueue = new LinkedList<>();

            //add elements {5, 6, 7, 8, 9} to queue
            for(int y=5; y<10; y++){
                myQueue.add(y);
            }

            // Display contents of the queue.
            System.out.println("Elements of queue:" + myQueue);

            // To remove the head of queue.
            int removedHead = myQueue.remove();
            System.out.println("removed element-" + removedHead);
            System.out.println((myQueue));

            // To view the head of queue
            int head = myQueue.peek();
            System.out.println("head of queue-" + head);

            //checks size of myQueue
            int size = myQueue.size();
            System.out.println("Size of queue-" + size);

        }

        System.out.println("===Stacks===");
    //Stack <Integer> myStack = new Stack<>();
        Stack <Integer> myStack = new Stack <Integer>();
      //gets push to the top
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack);

        //remove from a stack
        //output is [1,2]
        myStack.pop();
        System.out.println(myStack);

        //output [2] difference from Queue is it return last number and
        // not head. So it returns front he right while queue returns from the left (front)

       int peek= myStack.peek();
        System.out.println(peek);

        myStack.empty();
        System.out.println(myStack);


        boolean empty = myStack.empty();
        System.out.println(empty);

    }
}
