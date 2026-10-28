public class  LuxuryWedding extends WeddingPackage{



    public Wedding constructWedding(){

        return builder
                .setVenue()
                .setDecor()
                .setPhotography()
                .setCatering()

                .buildWedding();
    }



}