import java.util.Scanner;

public class EventSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // akun dummy
        Account eo = new EventOrganizer("admin", "123");
        Account user = new EventUser("user", "123");

        Guest guest = new Guest();

        int pilihan;

        do {
            try {

                System.out.println("\n===== EVENT SYSTEM =====");
                System.out.println("1. Login Event Organizer");
                System.out.println("2. Login Event User");
                System.out.println("3. Masuk Sebagai Guest");
                System.out.print("Pilih menu : ");

                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {

                    // LOGIN EO
                    case 1:

                        boolean loginEO = false;

                        while (!loginEO) {

                            System.out.print("Username : ");
                            String username = input.nextLine();

                            System.out.print("Password : ");
                            String password = input.nextLine();

                            if (eo.login(username, password)) {
                                System.out.println("Login berhasil!");
                                loginEO = true;
                            } else {
                                System.out.println("Username atau password salah!");
                                System.out.println("Silakan coba lagi.\n");
                            }
                        }

                        break;

                    // LOGIN USER
                    case 2:

                        boolean loginUser = false;

                        while (!loginUser) {

                            System.out.print("Username : ");
                            String username = input.nextLine();

                            System.out.print("Password : ");
                            String password = input.nextLine();

                            if (user.login(username, password)) {
                                System.out.println("Login berhasil!");
                                loginUser = true;
                            } else {
                                System.out.println("Username atau password salah!");
                                System.out.println("Silakan coba lagi.\n");
                            }
                        }

                        break;

                    // GUEST
                    case 3:
                        System.out.println("Masuk sebagai Guest");
                        break;

                    default:
                        System.out.println("Menu tidak tersedia!");

                }

            } catch (Exception e) {

                System.out.println("Input harus angka!");

                input.nextLine();
                pilihan = 0;
            }

        } while (pilihan < 1 || pilihan > 3);

        input.close();
    }
}