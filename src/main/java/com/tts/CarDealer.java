package com.tts;
import java.util.*;

public class CarDealer {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            HashMap<String, String> carMap = new HashMap<>();
            carMap.put("accord", "Honda");
            carMap.put("civic", "Honda");
            carMap.put("odyssey", "Honda");
            carMap.put("camry", "Toyota");
            carMap.put("corolla", "Toyota");
            carMap.put("rav4", "Toyota");
            carMap.put("highlander", "Toyota");
            carMap.put("prius", "Toyota");
            carMap.put("avalon", "Toyota");
            carMap.put("sienna", "Toyota");
            carMap.put("gtr", "Nissan");
            carMap.put("370z", "Nissan");
            carMap.put("frontier", "Nissan");
            carMap.put("titan", "Nissan");
            System.out.println ("We carry a selection of Hondas, Toyotas, and Nissans");
            System.out.println ("What car model are you looking for? " );
            String carModel = scanner.next();
            String carModelLower = carModel.toLowerCase();
            String model = carMap.get(carModelLower);
            if(model == null){
                System.out.println("Sorry we don't have that");
            } else {
                System.out.println("We have " + model );
            }
    }
}
