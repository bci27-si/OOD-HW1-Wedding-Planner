public abstract class WeddingPackageBuilder{
    //locaiton
    private beachVenu;
    private mountainVenu;
    // flowers
    private elegantFlowers;
    private noFlowers;

    //photos
    private professionalPhotography;
    private locaPhotography;

    // katernig
    private classicBuffet;
    private gourmetBuffet;


    public WeddingPackage setBeachVenu(String Beach){
        this.Beach;
        return this;
    }
    public WeddingPackage setMountainVenu(String Mountain){
        this.Mountain;
        return this;
    }
    public WeddingPackage setElegantFlowers(String Flowers){
        this.Flowers;
        return this;
    }
    public WeddingPackage setnoFlowers(){
        return this;
    }
    // do i need to do one method for hotography and user types in set photography or ?

    public WeddingPackage setPhotography(String beach){
        this.beach;
        return this;
    }
    public WeddingPackage setLocalPhotography(Boolean photography){
        this.photography;
        return this;
    }

    public WeddingPackage setCatering(String FoodChoice){
        this.FoodChoice; //etc
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


