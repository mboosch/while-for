package de.neuefische;

public class Main {
    public static void main(String[] args) {

        int i = 0;

        while (i < 61) {
            System.out.println("bootcamp-Tag " + i);
            i++;
        }

        int[] numbers = new int[100];

        System.out.println(numbers);

        int j = 0;


        while (j < numbers.length) {
            numbers[j] = j+1;
            System.out.println(numbers[j]);
            j++;
        }

        int[] numbers2 = new int[100];

        for (int a = 0; a < numbers2.length; a++) {
            numbers2[a] = a + 1;
            System.out.println(numbers2[a]);
        }


    }
}

