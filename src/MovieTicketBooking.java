import java.util.*;

public class MovieTicketBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> movies = new ArrayList<>();
        HashSet<String> customers = new HashSet<>();

        int choice;

        do {
            System.out.println("\n===== Movie Ticket Booking System =====");
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Book Ticket");
            System.out.println("4. View Customers");
            System.out.println("5. Sort Movies");
            System.out.println("6. Shuffle Movies");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Movie Name: ");
                    String movie = sc.nextLine();
                    movies.add(movie);
                    System.out.println("Movie Added Successfully!");
                    break;

                case 2:
                    System.out.println("\nMovie List:");
                    for (String m : movies) {
                        System.out.println(m);
                    }
                    break;

                case 3:
                    System.out.print("Enter Customer Name: ");
                    String customer = sc.nextLine();
                    customers.add(customer);
                    System.out.println("Ticket Booked Successfully!");
                    break;

                case 4:
                    System.out.println("\nCustomer List:");
                    Iterator<String> itr = customers.iterator();

                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;

                case 5:
                    Collections.sort(movies);
                    System.out.println("Movies Sorted Successfully!");
                    break;

                case 6:
                    Collections.shuffle(movies);
                    System.out.println("Movies Shuffled Successfully!");
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);
        sc.close();
    }
}
