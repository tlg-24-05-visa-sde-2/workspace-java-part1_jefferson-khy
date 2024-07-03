class Movie {
    //fields or instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    //constructors
    public Movie(String title){
        setTitle(title);
    }

    public Movie(String title, Genre genre){
        this(title);
        setGenre(genre);
    }

    public Movie(String title, int releaseYear, Double revenue, Rating rating, Genre genre) {
        //delegate to setters for any data validation/conversion they might be doing
        this(title, genre);                    //delegate to 2-arg ctor above me
        setReleaseYear(releaseYear);        //delegate to setters for the rest of them
        setRevenue(revenue);
        setRating(rating);
    }

    //business or action methods
    //play, pause, rewind, fastForward stop goto

    //accessor methods - provide controlled access to obj private fields
    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        return this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString(){
        //TODO make it so null revenue shows up as null, and non-null revenue shows up as 123,000,345.94
        //Hint: if revenue is null, use %s, otherwise use %,.2f
        return String.format("Movie: title = %s, releaseYear = %s, revenue = %,.2f, rating = %s, genre = %s", getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
//        return "Movie: " + getTitle() + ", releaseYear: " + getReleaseYear() + ", revenue: " + getRevenue() + ", rating: " + getRating() + ", genre: " + getGenre();
    }
}