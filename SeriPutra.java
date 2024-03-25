/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nasiruddin
 */
import java.util.Scanner;

public class SeriPutra {
    static Node head = null;
    static Node tail = null;

    // create method class
    static class Node {
        int data;
        int month;
        Node next;

        public Node(int m, int d )
        {
            this.data = d;
            this.month = m;
            this.next = null;
        }
    }

//create method max()
public void max() {
    Node current = head;
    int max,m;
    if(head == null) {
        System.out.println("List is empty");
    }
    else {
        max = head.data;
        m =head.month;

        while(current != null){
            if(max < current.data) {
                max=current.data;
                m=current.month;
            }
        current= current.next;
    }
    System.out.println("Month :"+ m);
    System.out.println("Patients :"+ max);
    }
}

//create method min()
public void min() {
    Node current = head;
    int min,m;
    if(head == null) {
        System.out.println("List is empty");
    }
    else {
        min = head.data;
        m =head.month;
        while(current != null){
            if(min > current.data) {
                min=current.data;
                m=current.month;
            }
        current= current.next;
        }
        System.out.println("Month :"+ m);
        System.out.println("Patients :"+ min);
    }
}

//create method insert()
void insert(int month, int data)
{
    Node newNode = new Node(month,data);
    if (head == null) {
        head = newNode;
        tail = newNode;
    }
    else {
        tail.next = newNode;
        tail = newNode;
    }
}

//method display () to display all input data
public void display(){
    Node current = head;
    if (head == null) {
    System.out.println("List is empty");
    return;
    }
    while (current != null) {
    System.out.println("Month "+current.month + " : " +current.data + " ");
    current = current.next;
    }
    System.out.println(" ");
}


public static void main(String[] args)
{
    int year;
    SeriPutra sList = new SeriPutra();
    Scanner input=new Scanner(System.in);
    System.out.println("---------------------");
    System.out.println("HOSPITAL SERI PUTRA");
    System.out.println("---------------------");
    System.out.println("Insert the year ");
    year=input.nextInt();
    //looping process
    while (true) {
    System.out.println("");
    System.out.println("1. Insert Record");
    System.out.println("2. Show Record");
    System.out.println("3. Searching largest data");
    System.out.println("4. Searching smallest data");
    System.out.println("");
    System.out.println("Enter your choice:");
    int choice=input.nextInt();
    System.out.println("");
    // selection process
    switch (choice) {
    case 1 -> {
        System.out.println("Insert number of patients by months");
        for (int i=1; i <=12; i++) {
            System.out.print("Month : ");
            sList.insert(input.nextInt(), input.nextInt());
        }       }
    case 2 -> {
        System.out.println("Year "+year);
        System.out.println("");
        System.out.println("Display number of patients by months");
        System.out.println("");
        sList.display();
            }

    case 3 -> {
        System.out.println("The largest data");
        System.out.println("");
        sList.max();
            }
    case 4 -> {
        System.out.println("The smallest data");
        System.out.println("");
        sList.min();
            }
    default -> {
        System.exit(0);
        System.out.println("Invalid choice");
            }
    }
}
}
}