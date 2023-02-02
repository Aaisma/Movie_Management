import module.*;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Main_Category> Small=new ArrayList<>();
        ArrayList<Main_Category> Medium=new ArrayList<>();
        ArrayList<Main_Category> Large=new ArrayList<>();

        Main_Category a1=new Main_Category("Small","264");
        Main_Category b1=new Main_Category("Medium","174");
        Main_Category c1=new Main_Category("Large","119");
        Main_Category d1=new Main_Category("Medium","123");
        Main_Category e1=new Main_Category("Small","224");
        Main_Category f1=new Main_Category("Large","199");

        Small.add(a1);
        Small.add(e1);

        Medium.add(b1);
        Medium.add(d1);

        Large.add(c1);
        Large.add(f1);

        ArrayList<Category> Action=new ArrayList<>();
        ArrayList<Category> Comedy=new ArrayList<>();
        ArrayList<Category> Horror=new ArrayList<>();

        Category aa1=new Category("Small","198","Comedy");
        Category bb1=new Category("Medium","136","Horror");
        Category cc1=new Category("Medium","176","Comedy");
        Category dd1=new Category("Large","146","Action");
        Category ee1=new Category("Medium","242","Horror");
        Category ff1=new Category("Large","271","Action");

        Action.add(dd1);
        Action.add(ff1);

        Comedy.add(aa1);
        Comedy.add(cc1);

        Horror.add(bb1);
        Horror.add(ee1);


        Movie m1=new Movie("Large","173","Comedy","The Bad Guys","Pierre Perifel",2022,750);
        Movie m2=new Movie("Medium","228","Action","The Gray Man"," Joe Russo, Anthony Russo",2022,900);
        m1.Get_Information();
        m2.Get_Information();

        m1.getMovies();

        ArrayList<Seat> true_status=new ArrayList<>();
        ArrayList<Seat> false_status=new ArrayList<>();
        Seat s1=new Seat(146,true);
        Seat s2=new Seat(246,false);
        Seat s3=new Seat(183,true);
        Seat s4=new Seat(217,false);

        true_status.add(s1);
        true_status.add(s3);

        false_status.add(s2);
        false_status.add(s4);


        ArrayList<User> male=new ArrayList<>();
        ArrayList<User> female=new ArrayList<>();
        User u1=new User("Ayden R.","9803719342");
        User u2=new User("Claire S.","9876543210");
        User u3=new User("Rose T.","9813729348");
        User u4=new User("Claire P.","9876443219");

        male.add(u1);
        male.add(u4);

        female.add(u2);
        female.add(u3);

        Seat ss1= new Seat(222,true);
        Ticket t1= new Ticket(976,245,true_status,u1);
        t1.Get_tickets(true_status);

    }

}

