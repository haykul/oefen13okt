package be.intecbrussel;

import java.util.Arrays;
import java.util.Scanner;

public class oefen13okt {

    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        int b[] = new int[4];
        int n;
        n = s.nextInt();
        int[] myArr = {100, 30, 70, 45};
        for (int i = 0; i < n; i++) {
            for (int j = 1 + i; j < n; j++) {
                if (b[i] < b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        System.out.print("\narray after sort\n");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + b[i]);

         */
            //oefening 1
            Scanner s = new Scanner(System.in);
            int a[] = new int[5];
            int n;

            System.out.print("enter array size :");
            n = s.nextInt();
            System.out.print("\nenter array element :");

            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 1 + i; j < n; j++) {
                    if (a[i] < a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }

            System.out.print("\narray after sort\n");
            for (int i = 0; i < n; i++) {
                System.out.print(" " + a[i]);

            }
            System.out.println("   ");


            //****
            int[] myArr = {-6, 7, 96, 54, 145, 864};
            Arrays.sort(myArr);
            for (int index = myArr.length - 1; index >= 0; index--) {
                System.out.println(myArr[(int) index]);
            }


            String[] myArr1 = {"Brussel", "Antwerpen", "Gent", "Hasselt", "Leuven"};
            Arrays.sort(myArr1);
            for (int index = myArr1.length - 1; index >= 0; index--) {
                System.out.println(myArr1[index]);
            }

//oefening2
            int[] myIntArray = {1, 2, 3, 4, 5};
            for (int element : myIntArray) {
                System.out.println(element);
            }

            int[] newArray = Arrays.copyOf(myIntArray, 10);
            for (int element1 : newArray) {
                System.out.println(element1);
            }
            //Oefen 3
            String[] myArray = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"};
            for (int i = 0; i < myArray.length; i++) {
                for (int j = i + 1; j < myArray.length; j++) {
                    if (myArray[i] == myArray[j])
                        System.out.println("Duplicate cities :" + myArray[i]);
                }
            }
        }
    }



