package t28027_Sidhant_A04;


import java.util.Scanner;

class MovieTicket_5 {
    String customerName;
    String movieName;
    int numberOfTickets;
    double ticketPrice;

    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Movie Name: ");
        movieName = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        numberOfTickets = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        ticketPrice = sc.nextDouble();
    }

    double calculateAmount() {
        return numberOfTickets * ticketPrice;
    }

    void display() {
        System.out.println("\n--- Movie Ticket Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Total Amount: " + calculateAmount());
    }

    public static void main(String[] args) {
        MovieTicket_5 ticket = new MovieTicket_5();

        ticket.read();
        ticket.display();
    }
}
