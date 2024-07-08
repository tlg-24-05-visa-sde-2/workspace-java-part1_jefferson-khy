package net.flix;

public enum Genre {
    ANIME("Anime"),            //each of these calling the Genre() ctor below
    DRAMA("Drama"),
    HORROR("HORROR!!!"),
    ROMANTIC_COMEDY("Romantic Comedy"),
    DOCUMENTARY("Documentary"),
    MYSTERY("Mystery"),
    SCI_FI("Sci-Fi"),
    INTERNATIONAL("International");

    //everything under here is regular class definition stuff. fields, ctors, methods.
    private final String display;

    //implicitly private, no new from outside
    Genre(String display){
        System.out.println("Genre ctor called");
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}