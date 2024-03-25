
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author nunu
 */
public class BubbleSortLabTest {
    // Method untuk menyusun data menggunakan Bubble Sort
    static void bubbleSort(int[] dataArray) {
        int n = dataArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dataArray[j] > dataArray[j + 1]) {
                    // Tukar nilai jika terdapat pertukaran yang diperlukan
                    int temp = dataArray[j];
                    dataArray[j] = dataArray[j + 1];
                    dataArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Data telah disusun menggunakan Bubble Sort.");
    }

    // Method untuk paparan keseluruhan data
    static void paparanData(int[] dataArray) {
        System.out.println("Data yang dimasukkan:");
        for (int data : dataArray) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Nilai awal array
        int[] dataArray = {52, 41, 21, 99, 7, 8, 65};

        Scanner scanner = new Scanner(System.in);
        int pilihanMenu;

        // Struktur kawalan ulangan while
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Papar Data");
            System.out.println("2. Susun Data (Bubble Sort)");
            System.out.println("3. Keluar");

            System.out.print("Sila pilih menu (1, 2 atau 3): ");
            pilihanMenu = scanner.nextInt();

            // Struktur kawalan pilihan switch-case
            switch (pilihanMenu) {
                case 1:
                    // Panggil method paparanData()
                    paparanData(dataArray);
                    break;
                case 2:
                    // Panggil method bubbleSort()
                    bubbleSort(dataArray);
                    break;
                case 3:
                    System.out.println("Program berakhir. Selamat tinggal!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak sah. Sila pilih 1, 2 atau 3.");
            }
        }
    }
}



