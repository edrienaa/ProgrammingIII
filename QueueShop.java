import java.util.*;
public class QueueShop {
    private static int front, rear, capacity;
    private static String[] queue;

    QueueShop(int size) {
        front = rear = 0;
        capacity = size;
        queue = new String[capacity];
    }

    // masukkan element ke dalam queue
    static void queueEnqueue(String item)  {
        // semak jika queue penuh
        if (capacity == rear) {
            System.out.printf("\nQueue is full\n");
            return;
        }

        // masukkan element di rear
        else {
            queue[rear] = item;
            rear++;
        }
        return;
    }

    //buang element dari dalam queue
    static void queueDenqueue()  {
        // semak jika queue kosong
        if (front == rear) {
            System.out.printf("\nQueue is empty\n");
            return;
        }

        // shift elements to the right by one place uptil rear
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }


            // set queue[rear] kepada 0
            if (rear < capacity)
                queue[rear] = null;

            // decrement rear
            rear--;
        }
        return;
    }

    // print queue elements
    static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.printf("Queue is Empty\n");
            return;
        }

        // traverse front ke rear dan print elements
        for (i = front; i < rear; i++) {
            System.out.printf("%s\n", queue[i]);
        }
        return;
    }

    // print front queue
    static void queueFront()
    {
        if (front == rear) {
            System.out.printf("Queue is Empty\n");
            return;
        }
        System.out.printf("\nCurrent customer: %s", queue[front]);
        return;
    }

    public static void main(String[] args) {
        QueueShop q = new QueueShop(5);
        int option = 0;
        while (option != 5) {
            Scanner choice = new Scanner(System.in);
            System.out.print("\n==================================\n" +
                    "What would you like to do?\n" +
                    "1. Add a customer to the queue\n" + //queueEnqueue
                    "2. Serve the next customer\n" + //queueDequeue
                    "3. Display all customer\n" + //queueDisplay
                    "4. Display current customer\n" +//queueFront
                    "5. Exit\n" +
                    "Your Choice: ");
            option = choice.nextInt();

            switch (option) {
                case 1: //tambah pelanggan baru
                    String name;
                    System.out.println("\nWhat is the name of the customer?");
                    choice.nextLine();
                    name = choice.nextLine();
                    q.queueEnqueue(name);
                    break;

                case 2: //serve pelanggan
                    q.queueDenqueue();
                    break;

                case 3: //papar semua pelanggan
                    q.queueDisplay();
                    break;

                case 4: //papar pelanggan di hadapan
                    q.queueFront();
                    break;

                case 5: //keluar dari sistem
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid input. Try again\n");
            }

        }
    }
}
