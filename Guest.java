import java.util.Scanner;

public class Guest {
    
    public void dashboard() {

    Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== DASHBOARD GUEST =====");
            System.out.println("1. Lihat Public Event");
            System.out.println("2. Masuk Private Event");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            try {

                choice = input.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Fitur Lihat Public Event");
                        break;

                    case 2:
                        System.out.println("Fitur Masuk Private Event");
                        break;

                    case 0:
                        System.out.println("Keluar dari Guest");
                        break;

                    default:
                        System.out.println("Menu tidak tersedia!");
                }

            } catch (Exception e) {

                System.out.println("Input harus angka!");
                input.nextLine();
                choice = -1;
            }

        } while (choice != 0);
    }
}
