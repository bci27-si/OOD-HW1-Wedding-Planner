public abstract class WeddingPackageBuilder{
    //locaiton
    private Venue place;
    //private mountainVenu;
    // flowers
    private Decor style;
    //private noFlowers;

    //photos
    private Photography photography;
    //private locaPhotography;

    // katernig
    private Catering food;
    //private gourmetBuffet;


    public WeddingPackage setBeachVenu(Venue place){
        this.place = place;
        return this;
    }

    public WeddingPackage setNoFlowers(Decor style){
        this.style = style;
        return this;
    }
    // do i need to do one method for hotography and user types in set photography or ?

    public WeddingPackage setPhotography(Photography photography){
        this.photography = photography;
        return this;
    }

    public WeddingPackage setCatering(Catering food){
        this.food; //etc
        return this;
    }

}

/*

WeddingPackageBuilder: A class that allows customization of wedding packages (e.g., venue, catering, decorations, photography).
Venue: The venue selected for the wedding, such as Beach or Mountain.
Catering: Catering options, such as Classic Buffet or Gourmet Buffet.
Decorations: Decoration preferences, such as Elegant Flowers or No Flowers.
Photography: Photography options, such as Professional or Local.

 */

/*

    public WeddingPackage setMountainVenu(String Mountain){
        this.venue;
        return this;
    }

    public WeddingPackage setElegantFlowers(String Flowers){
        this.Flowers;
        return this;
    }

    public WeddingPackage setLocalPhotography(Boolean photography){
        this.photography;
        return this;
    }

 */

