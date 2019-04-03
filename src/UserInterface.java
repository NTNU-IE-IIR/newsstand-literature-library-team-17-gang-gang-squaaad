import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Iterator;

/**
 * Makes up the user interface (text based) of the application
 * Responsible for all user interaction, like displaying the menu
 * and receiving input from the user.
 * </ul>
 *
 * @author (Stig Helge Bruset, Ola Sæterøy, Magnus Sandøy)
 * @version (v1)
 */

public class UserInterface {
    private Inventory inventory;
    /**
     * The menu that will be displayed upon launch
     */

    private String[] mainMenuItems =
            {
                    "--------------------------",
                    "1. Search for literature by title",
                    "2. go to book menu",
                    "3. Add new book",
                    "4. Remove book",
                    "5. Get number of books",
                    "6. List all books",
                    "-------------------------",
                    "7. (Dev.)Fill With dummies"
            };

    private String[] bookMenuItems =
            {
                    "--------------------------",
                    "1. Search for book by author",
                    "2. add new book ",
                    "-------------------------",

            };

    public UserInterface() {
        inventory = new Inventory();
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
                        this.findLiteratureByTitle();
                        break;

                    case 2:
                        this.startBookMenu();
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
                        this.inventory.fillBookRegistryWithDummies();
                        break;


                    case 8:
                        System.out.println("\nThank you for using BookRegistry v1. Bye!\n");
                        quit = true;
                        break;
                    default:
                }
            } catch (InputMismatchException ime) {
                System.out.println("\nERROR: Please provide a number between 1 and " + this.mainMenuItems.length + "..\n");
            }
        }

    }

    /**
     * Shows the Menu for books
     */
    private void startBookMenu() {
        boolean quit = false;

        while (!quit) {
            try {
                int menuSelection = this.showBookMenu();
                switch (menuSelection) {
                    case 1:
                        this.findBookByAuthor();
                        break;

                    case 2:
                        this.addNewBook();
                        break;

                    case 3:
                        System.out.println("\nThank you for using BookRegistry v1. Bye!\n");
                        quit = true;
                        break;
                    default:
                }
            } catch (InputMismatchException ime) {
                System.out.println("\nERROR: Please provide a number between 1 and " + this.mainMenuItems.length + "..\n");
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
        for (String mainMenuItems : mainMenuItems) {
            System.out.println(mainMenuItems);
        }
        int maxMenuItemNumber = mainMenuItems.length - 1;
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
     * Displays the menu to the user, and waits for the users input. The user is
     * expected to input an integer between 1 and the max number of menu items.
     * If the user inputs anything else, an InputMismatchException is thrown.
     * The method returns the valid input from the user.
     *
     * @return the menu number (between 1 and max menu item number) provided by the user.
     * @throws InputMismatchException if user enters an invalid number/menu choice
     */

    private int showBookMenu() throws InputMismatchException {
        System.out.println("\n**** BookMenu ****\n");
        // Display the menu
        for (String menuItem : bookMenuItems) {
            System.out.println(menuItem);
        }
        int maxMenuItemNumber = bookMenuItems.length - 1;
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
        Iterator<Literature> inventoryIt = this.inventory.getIterator();
        while (inventoryIt.hasNext()) {
            Literature literature = inventoryIt.next();
            printInformation(literature);
        }
    }


    /**
     * @return Userinput on  the form of a string
     */
    private String userInputString() {
        Scanner reader = new Scanner(System.in);
        String userInput = reader.nextLine();

        return userInput;
    }

    /**
     * @return userinput on the form of int
     */
    private int userInputInt() {
        Scanner reader = new Scanner(System.in);
        int userInput = reader.nextInt();

        return userInput;
    }

    /**
     * Add a new book to the register through the UI
     */
    private void addNewBook() {
        System.out.println("please enter the title of the book:");
        String title = userInputString();

        System.out.println("please enter the name of the author:");
        String author = userInputString();

        System.out.println("please enter the number of pages:");
        int numberOfPages = userInputInt();

        System.out.println("please enter the name of the publisher:");
        String publisher = userInputString();

        System.out.println("please enter the release date:");
        String releaseDate = userInputString();

        System.out.println("please enter the issue");
        String issue = userInputString();

       // add the book to the register
           Book book = new Book(author, title, numberOfPages, publisher, releaseDate, issue);
            this.inventory.addBook(book);

    }

    /**
     * Remove a book by entering it's name
     */
    private void removeBook() {
        System.out.println("please enter Book to remove");
        Scanner reader = new Scanner(System.in);
        String searchWord = reader.next();

        if (inventory.removeLiterature(searchWord)) {
            System.out.println("successfully removed");
        } else {
            System.out.println("search gave no results, no action was taken");
        }

    }


    /**
     *
     */
    private void getNumberOfBooks() {
        int numberOfBooks = inventory.getInventorySize();
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

        Literature result = this.inventory.findBookByAuthor(searchWord);
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

    private void findLiteratureByTitle() {
        System.out.println("please enter keyword");
        Scanner reader = new Scanner(System.in);
        String searchWord = reader.next();

        Literature result = this.inventory.findLiteratureByTitle(searchWord);
        if (result != null) {
            printInformation(result);
        } else {
            System.out.println(" ");
            System.out.println("Search gave no results");
        }
    }

    private void printInformation(Literature literature) {
        System.out.println(" ");
        System.out.println("________________________________");
        System.out.println("title " + literature.getTitle());
        //  System.out.println("Author: " + literature.getAuthor());
        //  System.out.println("Pages: " + literature.getPages());
        System.out.println("Publisher: " + literature.getPublisher());
        //  System.out.println("Release date: " + literature.getReleaseDate());
        // System.out.println("Issue: " + literature.getIssue());

        if (literature instanceof Book) {
            Book book = (Book) literature;

            System.out.println("Author: " + book.getAuthor());
            System.out.println("Pages: " + book.getPages());
            System.out.println("Release date: " + book.getReleaseDate());
            System.out.println("Issue: " + book.getIssue());
        }

        if (literature instanceof Newspaper) {
            Newspaper newspaper = (Newspaper) literature;
            System.out.println("Issue" + newspaper.getIssue());

        }
        if (literature instanceof Periodical) {
            Periodical periodical = (Periodical) literature;
            System.out.println("Issue" + periodical.getIssue());
            System.out.println("Subject area" + periodical.getSubjectArea());
            System.out.println("Number of releases" + periodical.getNumberOfReleases());
        }
        System.out.println("________________________________");

    }
}