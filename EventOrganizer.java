import java.util.LinkedList;
import java.util.Scanner;

public class EventOrganizer extends Account {
    Scanner input = new Scanner(System.in);
    LinkedList<Event> eventList = new LinkedList<>();

    public EventOrganizer(String username, String password) {
        super(username, password, "Event Organizer");
    }
    // Create Event
    public void addEvent(LinkedList<Event> eventList) {

        try {

            System.out.print("Input ID : ");
            int id = input.nextInt();
            input.nextLine();

            for (Event e : eventList) {

                if (e.getId() == id) {

                    System.out.println("ID sudah digunakan!");
                    return;
                }
            }


            System.out.print("Input Name : ");
            String name = input.nextLine();

            System.out.print("Input Type : ");
            String type = input.nextLine();

            System.out.print("Input Location : ");
            String location = input.nextLine();

            System.out.print("Input Date : ");
            String date = input.nextLine();

            System.out.print("Input Price : ");
            double price = input.nextDouble();

            Event event = new Event(id, name, type,
                    location, date, price);

            eventList.add(event);

            System.out.println("Event berhasil ditambahkan!");

        } catch (Exception e) {

            System.out.println("Input tidak valid!");
        }
    }

    public void viewEvent(LinkedList<Event> eventList) {

        if (eventList.isEmpty()) {

            System.out.println("Belum ada event!");
            return;
        }

        for (Event e : eventList) {

            System.out.println("================");
            e.showEvent();
        }
    }

    public void deleteEvent(LinkedList<Event> eventList) {

        try {

            System.out.print("Input ID Event : ");
            int id = input.nextInt();

            for (Event e : eventList) {

                if (e.getId() == id) {

                    eventList.remove(e);

                    System.out.println("Event berhasil dihapus!");
                    return;
                }
            }

            System.out.println("Event tidak ditemukan!");

        } catch (Exception e) {

            System.out.println("Input salah!");
        }
    }

    public void updateEvent(LinkedList<Event> eventList) {

        try {

            System.out.print("Input ID Event yang ingin diupdate : ");
            int id = input.nextInt();
            input.nextLine();

            boolean found = false;

            for (Event e : eventList) {

                if (e.getId() == id) {

                    found = true;

                    int choice;

                    do {

                        System.out.println("\n=== UPDATE EVENT ===");
                        e.showEvent();

                        System.out.println("\n1. Update Name");
                        System.out.println("2. Update Type");
                        System.out.println("3. Update Location");
                        System.out.println("4. Update Date");
                        System.out.println("5. Update Price");
                        System.out.println("0. Selesai");

                        System.out.print("Pilih : ");
                        choice = input.nextInt();
                        input.nextLine();

                        switch (choice) {

                            case 1:

                                System.out.print("Input Nama Baru : ");
                                e.setName(input.nextLine());

                                System.out.println("Nama berhasil diupdate!");
                                break;

                            case 2:

                                System.out.print("Input Type Baru : ");
                                e.setType(input.nextLine());

                                System.out.println("Type berhasil diupdate!");
                                break;

                            case 3:

                                System.out.print("Input Location Baru : ");
                                e.setLocation(input.nextLine());

                                System.out.println("Location berhasil diupdate!");
                                break;

                            case 4:

                                System.out.print("Input Date Baru : ");
                                e.setDate(input.nextLine());

                                System.out.println("Date berhasil diupdate!");
                                break;

                            case 5:

                                System.out.print("Input Price Baru : ");
                                e.setPrice(input.nextDouble());

                                System.out.println("Price berhasil diupdate!");
                                break;

                            case 0:

                                System.out.println("Update selesai!");
                                break;

                            default:

                                System.out.println("Menu tidak tersedia!");
                        }

                    } while (choice != 0);

                    break;
                }
            }

            if (!found) {

                System.out.println("Event tidak ditemukan!");
            }

        } catch (Exception e) {

            System.out.println("Input tidak valid!");
        }
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
                        addEvent(eventList);
                        break;

                    case 2:
                        System.out.println("Fitur Edit Event");
                        break;

                    case 3:
                        System.out.println("Fitur Hapus Event");
                        deleteEvent(eventList);
                        break;

                    case 4:
                        System.out.println("Fitur Lihat Event");
                        viewEvent(eventList);
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
