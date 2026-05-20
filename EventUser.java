import java.util.Scanner;
public class EventUser extends Account {

    public EventUser(String username, String password) {
        super(username, password, "Event User");
    }

    @Override
    public void dashboard() {
        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== DASHBOARD EVENT USER =====");
            System.out.println("1. Lihat Event");
            System.out.println("2. Beli Ticket");
            System.out.println("3. Buat Private Event");
            System.out.println("4. Lihat Request Saya");
            System.out.println("0. Logout");
            System.out.print("Pilih menu : ");

            try {

                choice = input.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Fitur Lihat Event");
                        break;

                    case 2:
                        System.out.println("Fitur Beli Ticket");
                        break;

                    case 3:
                        System.out.println("Fitur Buat Private Event");
                        break;

                    case 4:
                        System.out.println("Fitur Lihat Request");
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