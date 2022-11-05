package Test1.Encapsulation.Task2;

import java.util.ArrayList;

public class Cinema {
    private ArrayList<Movie> listOfMovies;

    private ArrayList<Movie> addMovie(Movie movie){
        this.listOfMovies.add(movie);
        return listOfMovies;
    }

    private ArrayList<Movie> removeMovie(Movie movie){
        this.listOfMovies.remove(movie);
        return listOfMovies;
    }

    private ArrayList<Movie> getListOfMovies() {
        return listOfMovies;
    }

}
