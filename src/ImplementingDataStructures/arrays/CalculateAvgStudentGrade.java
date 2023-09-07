package ImplementingDataStructures.arrays;

import java.util.*;

public class CalculateAvgStudentGrade {


    public static void main(String[] args) {
        int[] studentGrades = {7, 8, 9, 10, 11, 12, 13, 14, 15};
        int sum = 0;
        for (int i = 0; i < studentGrades.length; i++) {
            sum += studentGrades[i];
        }
        double average = sum / studentGrades.length;
        System.out.println("The average is: " + average);


        //ispalindrom
        String word = "Delevelwd";
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("The word is palindrome");
        } else {
            System.out.println("The word is not palindrome");
        }

        //List
        List<String> list = new java.util.ArrayList<>(List.of("Apple", "Banana", "Orange"));
        list.set(0, "Pear");
        list.add("Cherry");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.contains("Apple"));
        System.out.println(list.indexOf("Banana"));
        System.out.println(list.isEmpty());
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list);


        Queue<String> shoppingQueue = new LinkedList<>();

        // Kupci dolaze na red
        shoppingQueue.offer("Kupac 1");
        shoppingQueue.offer("Kupac 2");
        shoppingQueue.offer("Kupac 3");

        // Usluživanje kupaca prema redoslijedu dolaska
        while (!shoppingQueue.isEmpty()) {
            String kupac = shoppingQueue.poll();
            System.out.println("Uslužen kupac: " + kupac);
        }
        Map<String, Integer> inventory = new HashMap<>();

        // Dodajte proizvode u inventar
        inventory.put("Čokolada", 50);
        inventory.put("Kava", 100);
        inventory.put("Mlijeko", 200);

        // Pregledajte količinu proizvoda u inventaru
        String proizvod = "Kava";
        int kolicina = inventory.getOrDefault(proizvod, 0);
        System.out.println("Količina " + proizvod + " u inventaru: " + kolicina);

        int[] numbers = {1, 2, 3, 2, 4, 5, 1};

        Set<Integer> uniqueNumbers = new HashSet<>();

        // Dodajte brojeve u skup
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        // Broj jedinstvenih brojeva
        int brojJedinstvenih = uniqueNumbers.size();
        System.out.println("Broj jedinstvenih brojeva: " + brojJedinstvenih);
    }

}
