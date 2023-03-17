import java.util.Scanner;

public class tugasArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah kata: ");
        int size = scanner.nextInt();

        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("kata ke " + (i+1) + ": ");
            arr[i] = scanner.next();
        }

        System.out.print("Kata-kata yang dimasukan: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
