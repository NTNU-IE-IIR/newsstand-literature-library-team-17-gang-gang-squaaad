import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Iterator;

/**
 * Makes up the user interface (text based) of the application
 * Resoponsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 * </ul>
 *
 * @author (Stig Helge Bruset, Ola Sæterøy, Magnus Sandøy)
 * @version (v1)
 */

public class UserInterface {
    private BookRegistry bookRegister;
    /**
     * The menu that will be displayed upon launch
     */

    private String[] menuItems =
            {
                    "--------------------------",
                    "1 .Search for book by title",
                    "2. Search for book by author",
                    "3. Add new book",
                    "4. Remove book",
                    "5. Get number of books",
                    "6. List all books",
                    "-------------------------",
                    "7. (Dev.)Fill With dummies"
            };

    public UserInterface() {
        bookRegister = new BookRegistry();
    }

    /**
     * Starts the application by showing the menu and retrieving input from the
     * user.
     */

    public void start() {
        boolean quit = false;

        while (!quit) {
            try {
                int menuSelection = this.showMenu();
                switch (menuSelection) {
                    case 1:
                        this.findBookByTitle();
                        break;

                    case 2:
                        this.findBookByAuthor();
                        break;

                    case 3:
                        this.addNewBook();
                        break;

                    case 4:
                        this.removeBook();
                        break;

                    case 5:
                        this.getNumberOfBooks();
                        break;

                    case 6:
                        this.listAllBooks();
                        break;

                    case 7:
                        this.bookRegister.fillBookRegistryWithDummies();
                        break;


                    case 8:
                        System.out.println("\nThank you for using BookRegistry v1. Bye!\n");
                        quit = true;
                        break;
                    default:
                }
            } catch (InputMismatchException ime) {
                System.out.println("\nERROR: Please provide a number between 1 and " + this.menuItems.length + "..\n");
            }
        }

    }

    /**
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items.
     * If the user inputs anything else, an InputMismatchException is thrown.
     * The method returns the valid input from the user.
     *
     * @return the menu number (between 1 and max menu item number) provided by the user.
     * @throws InputMismatchException if user enters an invalid number/menu choice
     */
    private int showMenu() throws InputMismatchException {
        System.out.println("\n**** BookRegistry v0.1 ****\n");
        // Display the menu
        for (String menuItem : menuItems) {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = menuItems.length + 1;
        // Add the "Exit"-choice to the menu
        System.out.println(maxMenuItemNumber + ". Exit\n");
        System.out.println("Please choose menu item (1-" + maxMenuItemNumber + "): ");
        // Read input from user
        Scanner reader = new Scanner(System.in);
        int menuSelection = reader.nextInt();
        if ((menuSelection < 1) || (menuSelection > maxMenuItemNumber)) {
            throw new InputMismatchException();
        }
        return menuSelection;
    }

    /**
     * Initializes the application.
     * Typically you would create the Literature Register-instance here
     */
    private void init() {
        System.out.println("init() was called");
    }

    /**
     * List all the book objects in the ArrayList
     */
    private void listAllBooks() {
        Iterator<Book> bookListIt = this.bookRegister.getIterator();
        while (bookListIt.hasNext()) {
            Book book = bookListIt.next();
            printInformation(book);
        }
    }

    /**
     * Add a new book to the register through the UI
     */
    private void addNewBook() {
        //The user has choosen to add a new book
        System.out.println("please enter the title of the book:");
        Scanner reader = new Scanner(System.in);
        String title = reader.nextLine();

        System.out.println("please enter the name of the author:");
        String author = reader.nextLine();

        System.out.println("please enter the number of pages:");
        reader = new Scanner(System.in);
        int numberOfPages = reader.nextInt();

        System.out.println("please enter the name of the publisher:");
        reader = new Scanner(System.in);
        String publisher = reader.nextLine();

        System.out.println("please enter the release date:");
        String releaseDate = reader.nextLine();

        System.out.println("please enter the issue");
        String issue = reader.nextLine();

        //add the book to the register
        Book book = new Book(author, title, numberOfPages, publisher, releaseDate, issue);
        this.bookRegister.addBook(book);

    }

    /**
     * Remove a book by entering it's name
     */
    private void removeBook() {
        System.out.println("please enter Book to remove");
        Scanner reader = new Scanner(System.in);
        String searchWord = reader.next();

        if (bookRegister.removeBook(searchWord)) {
            System.out.println("successfully removed");
        } else {
            System.out.println("search gave no results, no action was taken");
        }

    }


    /**
     *
     */
    private void getNumberOfBooks() {
        int numberOfBooks = bookRegister.getNumberOfBooks();
        System.out.println(" ");
        System.out.println("library size: " + " " + numberOfBooks);
    }


    /**
     * Find a book by searching with entered keyword
     */

    private void findBookByAuthor() {
        System.out.println("please enter keyword");
        Scanner reader = new Scanner(System.in);
        String searchWord = reader.next();

        Book result = this.bookRegister.findBookByAuthor(searchWord);
        if (result != null) {
            printInformation(result);
        } else {
            System.out.println(" ");
            System.out.println("Search gave no results");
        }
    }

    /**
     * Find a book by searching with entered keyword
     */

    private void findBookByTitle() {
        System.out.println("please enter keyword");
        Scanner reader = new Scanner(System.in);
        String searchWord = reader.next();

        Book result = this.bookRegister.findBookByTitle(searchWord);
        if (result != null) {
            printInformation(result);
        } else {
            System.out.println(" ");
            System.out.println("Search gave no results");
        }
    }

    private void printInformation(Book book) {
        System.out.println(" ");
        System.out.println("________________________________");
        System.out.println("title " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Release date: " + book.getReleaseDate());
        System.out.println("Issue: " + book.getIssue());
        System.out.println("________________________________");

    }
}


