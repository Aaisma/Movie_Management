package module;

public class Movie extends Category{
    String Name;
    String Director;
    int Showtime;
    int Price;

    public Movie(String sofa, String seat, String Genre, String name, String director, int showtime, int price) {
        super(sofa, seat, Genre);
        Name = name;
        Director = director;
        Showtime = showtime;
        Price = price;
    }

    public void Get_Information(){
        System.out.println("The Name Of The Movie Is " +this.Name);
        System.out.println("The Genre Of The Movie Is " +this.Genre);
        System.out.println("The Director Of The Movie Is " +this.Director);
        System.out.println("The ShowTime Is " +this.Showtime);
        System.out.println("Yor Seat No. Is "+this.Seat);
        System.out.println("The Level Of Sofa Is " +this.Sofa);

    }

    public void getMovies(){
        System.out.println("Movie Name :"+" "+this.Name);
        System.out.println("ShowTime :"+" "+this.Showtime);
    }


}