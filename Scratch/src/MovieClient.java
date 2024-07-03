class MovieClient {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Dune");
        movie1.setReleaseYear(2021);
        movie1.setRevenue(407_000_000.0);
        System.out.println(movie1); //toString() auto called
        System.out.println();

        Movie movie2 = new Movie("Finding Nemo", 2003, 940_000_000.0, Rating.G, Genre.ANIME);
        System.out.println(movie2); //toString() auto called
        System.out.println();

        Movie movie3 = new Movie("Adventures of Jay and DeShon", Genre.MYSTERY);
        System.out.println(movie3);
    }
}