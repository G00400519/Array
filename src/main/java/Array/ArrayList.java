package Array;

import java.util.Scanner;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        int[] anArray = new int[10];
        ArrayList myList = new ArrayList<>();

        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);
        myList.add(800);
        myList.add(900);
        myList.add(1000);
        loop(myList);

        Scanner myScan = new Scanner(System.in);

        try{
            System.out.println("Please enter a new number: ");
            myList.add(myScan.nextInt());
            loop(myList);
        }
        catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("We went outside of our allocated memory block " + aiob);
        }

    }
    public static void loop(ArrayList<Integer> someArrayList) {
        int indexValue = 0;
        for(int value: someArrayList) {
            System.out.println("Element at index " + indexValue + " ; " + value);
            indexValue++;
        }
    }
}
