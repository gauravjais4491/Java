import java.util.*;

class library {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> issued_book = new ArrayList<String>(Arrays.asList("A", "B"));
    ArrayList<String> available_book = new ArrayList<String>(
            Arrays.asList("Mathamatics", "English", "Aptitude", "Organic_Chemistry", "History", "Gate_practice_set"));

    public void start() {

        System.out.println(
                "Why are you come to library : \n1) to_return_a_book \n2) please_show_available_book \n3) to add_book");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println();
        if (input == 1) {
            return_book();
        }
        if (input == 2) {
            show_available_book();
        } else {
            add_new_book();
        }

    }

    public String issue_a_book() {
        System.out.println("please tell me which book you want to issue: ");
        String input = sc.nextLine();
        System.out.println();
        System.out.println("Please wait for sometime while we are processing your request!");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("\n\nCongratulation! your request is completed now");
        return input;
    }

    public void return_book() {
        System.out.println("Which book you want to return: ");
        for (String element : issued_book) {
            System.out.println(element);
        }
        String input = sc.nextLine();
        System.out.println();
        System.out.println("\nPlease wait for sometime while we are processing your request!");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("\n\nCongratulation! your request is completed now");
        available_book.add(input);
        issued_book.remove(input);
        anything_else();
    }

    public void show_available_book() {
        String a;
        System.out.println("The available books are: ");
        for (String element : available_book) {
            System.out.println(element);
        }
        a = issue_a_book();
        available_book.remove(a);
        issued_book.add(a);
        anything_else();
    }

    public void add_new_book() {
        System.out.println("Which new book you want to add: ");
        String input = sc.nextLine();
        System.out.println();
        available_book.add(input);
        System.out.println("\nPlease wait for sometime while we are processing your request!");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("\n\nCongratulation! your request is completed now");
        anything_else();
    }

    public void anything_else() {
        System.out.println("\nThank you for coming! \n want more help: \n1) Yes \n2)No");
        int input = Integer.parseInt(sc.nextLine());
        if (input == 1) {
            start();
        } else {
            end();
        }
    }

    public void end() {
        System.out.println("Thank You for coming\n Have a nice day!");
    }
}

class nine {
    public static void main(String[] args) {
        library l = new library();
        l.start();
    }

}
