public abstract class WeddingPackage{



    public abstract Wedding constructWedding(){

        return builder
                .setVenue()
                .setDecor()
                .setPhotography()
                .setCatering()

                .buildWedding();
    }



}

