import java.util.Scanner;

class SupportTicket {
    // Declare id, priority and waitingMinutes
    int id;
    int priority;
    int waitingMinutes;
}

class Support_ticket_reference_selector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and fill the first ticket
        SupportTicket firstTicket = new SupportTicket();
        firstTicket.id = scanner.nextInt();
        firstTicket.priority = scanner.nextInt();
        firstTicket.waitingMinutes = scanner.nextInt();

        // Create and fill the second ticket
        SupportTicket secondTicket = new SupportTicket();
        secondTicket.id = scanner.nextInt();
        secondTicket.priority = scanner.nextInt();
        secondTicket.waitingMinutes = scanner.nextInt();

        // Create and fill the third ticket
        SupportTicket thirdTicket = new SupportTicket();
        thirdTicket.id = scanner.nextInt();
        thirdTicket.priority = scanner.nextInt();
        thirdTicket.waitingMinutes = scanner.nextInt();

        // Initially select the first ticket
        SupportTicket selectedTicket = firstTicket;

        // Compare the second ticket using the ordered rules
        if (secondTicket.priority > selectedTicket.priority || (secondTicket.priority == selectedTicket.priority &&
                secondTicket.waitingMinutes > selectedTicket.waitingMinutes)
                || (secondTicket.priority == selectedTicket.priority &&
                        secondTicket.waitingMinutes == selectedTicket.waitingMinutes
                        && secondTicket.id < selectedTicket.id)) {
            selectedTicket = secondTicket;

            // Compare the third ticket with the current selection
            if (thirdTicket.priority > selectedTicket.priority
                    || (thirdTicket.priority == selectedTicket.priority &&
                            thirdTicket.waitingMinutes > selectedTicket.waitingMinutes)
                    || (thirdTicket.priority == selectedTicket.priority &&
                            thirdTicket.waitingMinutes == selectedTicket.waitingMinutes
                            && thirdTicket.id < selectedTicket.id)) {
                selectedTicket = thirdTicket;
            }
            // Print the selected object's fields
            System.out.println("Selected Ticket: " + selectedTicket.id);
            System.out.println("Priority: " + selectedTicket.priority);
            System.out.println("Waiting Minutes: " + selectedTicket.waitingMinutes);
        }
    }
}