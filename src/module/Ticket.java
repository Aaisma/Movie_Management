package module;
import java.util.ArrayList;

public class Ticket {
    public Ticket(int ticket_id, int ticket_no, ArrayList<module.Seat> seat, ArrayList<module.User> user) {
        Ticket_id = ticket_id;
        Ticket_no = ticket_no;
        Seat = seat;
        User = user;
    }

    int Ticket_id;
    int Ticket_no;
    ArrayList<Seat> Seat;
    ArrayList<User> User;

    public void Get_tickets(ArrayList<module.Seat> Seat){
        this.Seat=Seat;
        System.out.println("The Seat List Are " +this.Seat);

    }
}