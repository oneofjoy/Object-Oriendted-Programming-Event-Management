import java.util.Scanner;

public class EventOrganizer extends Account {
    Scanner input = new Scanner(System.in);

    public EventOrganizer(String username, String password) {
        super(username, password, "Event Organizer");
    }


    @Override
    public void dashboard() {

        int choice;

        do {

            System.out.println("\n===== DASHBOARD EVENT ORGANIZER =====");
            System.out.println("1. Tambah Event");
            System.out.println("2. Edit Event");
            System.out.println("3. Hapus Event");
            System.out.println("4. Lihat Semua Event");
            System.out.println("5. Verifikasi Private Event");
            System.out.println("0. Logout");
            System.out.print("Pilih menu : ");

            try {

                choice = input.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Fitur Tambah Event");
                        break;

                    case 2:
                        System.out.println("Fitur Edit Event");
                        break;

                    case 3:
                        System.out.println("Fitur Hapus Event");
                        break;

                    case 4:
                        System.out.println("Fitur Lihat Event");
                        break;

                    case 5:
                        System.out.println("Fitur Verifikasi Event");
                        break;

                    case 0:
                        System.out.println("Logout berhasil!");
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
