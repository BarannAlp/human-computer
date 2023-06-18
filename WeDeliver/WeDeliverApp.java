import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class WeDeliverApp {
    private LinkedList<User> users;
    private List<String> books;
    private List<String> onlineBooks;
    List<BookNote> bookNotes;
    private List<String> friends;
    private List<String> bookClubs;

    public WeDeliverApp() {
        bookNotes = new ArrayList<>();
        users = new LinkedList<>();
        books = new ArrayList<>();
        friends = new ArrayList<>();
        bookClubs = new ArrayList<>();
    }

      
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    register();
                    break;
                case "2":
                    login();
                    break;
                case "3":
                    browseBooks();
                    break;
                case "4":
                    orderBook();
                    break;
                case "5":
                    viewOnlineBooks();
                    break;
                case "6":
                    addFriend();
                    break;
                case "7":
                    exploreBooksWithFriends();
                    break;
                case "8":
                    leaveBookNote();
                    break;
                case "9":
                    viewBookNotes();
                    break;
                case "10":
                    joinBookClub();
                    break;
                case "11":
                    viewBookClubDiscussions();
                    break;
                case "12":
                    participateInCompetition();
                    break;
                case "13":
                    viewRewards();
                    break;
                case "14":
                    logout();
                    break;
                case "15":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public void displayMenu() {
        System.out.println("========== WeDeliver ==========");
        if (users.size() != 0) {
            System.out.println("Welcome, " + users);
            System.out.println("3. Browse Books");
            System.out.println("4. Order Book");
            System.out.println("5. View Online Books");
            System.out.println("6. Add Friend");
            System.out.println("7. Explore Books with Friends");
            System.out.println("8. Leave Book Note");
            System.out.println("9. View Book Notes");
            System.out.println("10. Join Book Club");
            System.out.println("11. View Book Club Discussions");
            System.out.println("12. Participate in Competition");
            System.out.println("13. View Rewards");
            System.out.println("14. Logout");
            System.out.println("15. Exit");
        } else {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("15. Exit");
        }
    }
     private boolean isUsernameUnique(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false; // Username already exists
            }
        }
        return true; // Username is unique
    }

    public void register() {
       System.out.println("Register");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Create a new User object with the entered username and password
        User newUser = new User(username, password);

        // Check if the username is unique (you can implement your own logic here)
        if (isUsernameUnique(username)) {
            // Add the new user to the list of users
            users.add(newUser);
            System.out.println("Registration successful! You can now login.");
        } else {
            System.out.println("Username already exists. Please choose a different username.");
        }
    }

    public void login() {
        System.out.println("Login");
        // Implement login logic here
    }

    public void browseBooks() {
        System.out.println("Browse Books");
        books.add("The Magic Tree");
        books.add("Winter Fairy");
        books.add("Wizards of Ice");
        books.add("Call of the Forest");
        books.add("The Enchanted Ones");
        books.add("A Spell Too Far");
        for (String element : books) {
            System.out.println(element);
        }

    }

    public void orderBook() {
        System.out.println("Order Book");
        // Implement order book logic here
    }

    public void viewOnlineBooks() {
        System.out.println("View Online Books");
        onlineBooks.add("The Magic Tree");
        onlineBooks.add("Winter Fairy");
        onlineBooks.add("Wizards of Ice");
        onlineBooks.add("Call of the Forest");
        onlineBooks.add("The Enchanted Ones");
        onlineBooks.add("A Spell Too Far");
        for (String element : onlineBooks) {
            System.out.println(element);}
    }

    public void addFriend() {
        System.out.println("Add Friend");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Friends Username: ");
        String username = scanner.nextLine();
        users.get(0).addFriend(username);
    }

    public void exploreBooksWithFriends() {
        System.out.println("Explore Books with Friends");
        // Implement explore books with friends logic here
    }

    public void leaveBookNote() {
        System.out.println("Leave Book Note");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which book you wanna add note: ");
        String book = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Wrte your note: ");
        String note = scanner.nextLine();
        BookNote booknote = new BookNote(book,note);
        bookNotes.add(booknote);

    }

    public void viewBookNotes() {
        System.out.println("View Book Notes");
        if (bookNotes.isEmpty()) {
            System.out.println("No book notes found.");
        } else {
            for (BookNote bookNote : bookNotes) {
                System.out.println("Book: " + bookNote.getBook());
                System.out.println("Note: " + bookNote.getNote());
                System.out.println();
            }
        }
    }

    public void joinBookClub() {
        System.out.println("Join Book Club");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Club Name: ");
        String username = scanner.nextLine();
        users.get(0).addBookClub(username);
    }

    public void viewBookClubDiscussions() {
        System.out.println("View Book Club Discussions");
        // Implement view book club discussions logic here
    }

    public void participateInCompetition() {
        System.out.println("Participate in Competition");
        // Implement participate in competition logic here
    }

    public void viewRewards() {
        System.out.println("View Rewards");
       if(users.get(0).getRewards()==null){
        System.out.println("You dont have any rewards");
       }
    }

    public void logout() {
        System.out.println("Logout");
        // Implement logout logic here
    }


}

