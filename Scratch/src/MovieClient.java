class MovieClient {
    public static void main(String[] args) {

        Movie movie1 = new Movie();
        System.out.println(movie1);
        System.out.println();

        Movie movie2 = new Movie();
        movie2.setTitle("Dune");
        movie2.setReleaseYear(2021);
        movie2.setRevenue(407_000_000.0);
        System.out.println(movie2); //toString() auto called
        System.out.println();

        Movie movie3 = new Movie("Finding Nemo", 2003, 940_000_000.0);
        System.out.println(movie3); //toString() auto called
        System.out.println();

        Movie movie4 = new Movie("Adventures of Jay and DeShon");
        System.out.println(movie4);
    }
}