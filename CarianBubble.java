/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author nunu
 */
public class CarianBubble {
   
    public static void main(String[] args) {
        int[] array = {520, 417, 213, 997, 72, 84, 658}; /// nilai array
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            ///pilihan menu
            System.out.println("\n================");
            System.out.println("MENU");
            System.out.println("================");
            System.out.println("1. Sort array");
            System.out.println("2. Keluar");
            System.out.print("Pilih 1 atau 2 : ");
            choice = scanner.nextInt();

            switch (choice) {
              case 1:
                    int[] originalArray = array.clone(); // Make a copy of the original array
                    paparanData(array);
                    System.out.println("\nOriginal array:");
                    printArray(originalArray);
                    System.out.println("Sorted array:");
                    printArray(array);
                    break;
                case 2:
                    System.out.println("\n Keluar Program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak betul. Sila masukkan pilihan yang betul.");
            }
        }
    }
    
    ///BubbleSort 
    public static void paparanData(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
