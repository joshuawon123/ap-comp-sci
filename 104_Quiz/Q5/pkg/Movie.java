package pkg;

public class Movie{
    String movieName;
    double rating;
    int numrating;
    int revenue;
    
    public Movie(){
        movieName = new String("Avengers");
        rating = 8.0;
        numrating = 33;
        revenue = 623357910;
    }
    public Movie(String movieName, double rating, int numrating, int revenue){
        this.movieName = movieName;
        this.rating = rating;
        this.numrating = numrating;
        this.revenue = revenue;
    }
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of ratings: " + numrating);
        System.out.println("Revenue: " + revenue);
    }
    public String getMovieName(){
        return movieName;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double rating){
        double newrating = ((rating*(numrating+1))+rating)/numrating;
        rating = newrating;
    }
    public boolean compareRatings(Movie a){
        if (a.rating > rating){
            return false;
        }
        else{
            return true;
        }
    }
    public String revenueToString(){
        String n = new String(String.valueOf(revenue));
        return n;
    }
    public void pirateMovie(){
        
    }

}