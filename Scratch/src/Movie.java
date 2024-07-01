class Movie {
    //fields or instance variables
    private String title;
    private int releaseYear;
    private double revenue;

    //constructors
    public Movie(){
    }

    public Movie(String title){
        setTitle(title);
    }

    public Movie(String title, int releaseYear, double revenue) {
        //delegate to setters for any data validation/conversion they might be doing
        this(title);                    //delegate to ctor above me for title
        setReleaseYear(releaseYear);        //delegate to setters for the rest of them
        setRevenue(revenue);
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String toString(){
        return "Movie: " + getTitle() + ", releaseYear: " + getReleaseYear() + ", Revenue: " + getRevenue();
    }
}