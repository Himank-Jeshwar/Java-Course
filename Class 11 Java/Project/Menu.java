class Menu{
    static void mainMenu(){
        System.out.println("\n\t\t\t\t*************WELCOME TO PVR CINEMAS*************\n");
        System.out.println("\t\t\t\tPRESS 1 to navigate to Admin Panel");
        System.out.println("\t\t\t\tPRESS 2 to navigate to the User(Consumer) Panel");
        System.out.println("\t\t\t\tPRESS 3 to create a new account (for Consumer)");
        System.out.println("\t\t\t\tPRESS 4 to exit app");
    }

    static void adminMenu(){
        System.out.println("\n\t\t\t\t*************ADMINISTRATOR PANEL****************\n");
        System.out.println("\t\t\t\t\tPRESS 1 to show all admins");
        System.out.println("\t\t\t\t\tPRESS 2 to add admins");
        System.out.println("\t\t\t\t\tPRESS 3 to remove admins");
        System.out.println("\t\t\t\t\tPRESS 4 to add users");
        System.out.println("\t\t\t\t\tPRESS 5 to remove users");
        System.out.println("\t\t\t\t\tPRESS 6 to show all users");
        System.out.println("\t\t\t\t\tPRESS 7 to show movies");
        System.out.println("\t\t\t\t\tPRESS 8 to book seats");
        System.out.println("\t\t\t\t\tPRESS 9 to cancel seats");
        System.out.println("\t\t\t\t\tPRESS 10 to change timings");
        System.out.println("\t\t\t\t\tPRESS 11 to add movies");
        System.out.println("\t\t\t\t\tPRESS 12 to delete movies");
        System.out.println("\t\t\t\t\tPress 13 to return to main menu");
    }    

    static void adminCancelMenu(){
        System.out.println("\t\t\t\t\tPRESS 1 to cancel individual tickets");
        System.out.println("\t\t\t\t\tPRESS 2 to cancel all tickets");
    }

    static void userMenu(){
        System.out.println("\n\t\t\t\t\t*************USER PANEL****************");

        System.out.println("\t\t\t\tPRESS 1 to show movies");
        System.out.println("\t\t\t\tPRESS 2 to book tickets");
        System.out.println("\t\t\t\tPRESS 3 to cancel tickets");
        System.out.println("\t\t\t\tPRESS 4 to return back to main menu\n");
    }

    static void adminBookMenu(){
        System.out.println("\t\t\t\tPRESS 1 to book individual seats ");
        System.out.println("\t\t\t\tPRESS 2 to book all seats \n");
    }
}