import java.util.LinkedList;
import java.util.Scanner;

public class EventSystem {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        EventOrganizer eo = new EventOrganizer("admin", "123");
        EventUser user = new EventUser("user", "123");
        Guest guest = new Guest();

        int menu;

        do {

            System.out.println("\n===== EVENT ORGANIZER SYSTEM =====");
            System.out.println("1. Login Event Organizer");
            System.out.println("2. Login Event User");
            System.out.println("3. Masuk Sebagai Guest");
            System.out.println("0. Exit");
            System.out.print("Pilih menu : ");

            try {

                menu = input.nextInt();
                input.nextLine();

                switch (menu) {

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

                                eo.dashboard();

                            } else {

                                System.out.println("Username atau password salah!");
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

                                user.dashboard();

                            } else {

                                System.out.println("Username atau password salah!");
                            }
                        }

                        break;

                    // GUEST
                    case 3:

                        guest.dashboard();
                        break;

                    // EXIT
                    case 0:

                        System.out.println("Program selesai...");
                        break;

                    default:
                        System.out.println("Menu tidak tersedia!");
                }

            } catch (Exception e) {

                System.out.println("Input harus angka!");
                input.nextLine();
                menu = -1;
            }

        } while (menu != 0);

        input.close();
    }
}