package ru.netology.servis;

public class MovieManager {

    private String[] movies = new String[0];
    private final int limit;

    public MovieManager() {
        this(5);
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] newMovies = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            newMovies[i] = movies[i];
        }
        newMovies[movies.length] = movie;
        movies = newMovies;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength = Math.min(movies.length, limit);
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
