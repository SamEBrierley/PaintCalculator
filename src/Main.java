public class Main {
    public static void main (String[] args){
        //-------------Version 1 --------------------
        String paintBrand = "Dulux";
        paintBrand = paintBrand.toUpperCase();
        String clientFirstName = "Paddington";
        clientFirstName = clientFirstName.toUpperCase();
        String clientLastname = "Brown";
        clientLastname = clientLastname.toUpperCase();

        int priceOfPaintPerLitre = 5;
        int paintCoveragePerLitre = 10;

        int wall1Height = (int) (1 + Math.random()*5);
        int wall1Length = (int) (1 + Math.random()*10);
        int wall1Area = wall1Height * wall1Length;

        int wall2Height = (int) (1 + Math.random()*5);
        int wall2Length = (int) (1 + Math.random()*8);
        int wall2Area = wall2Height * wall2Length;

        int totalWallsArea = wall1Area + wall2Area;

        double paintBucketsNeeded = (double) totalWallsArea / paintCoveragePerLitre;
        double wholePaintBucketsNeeded = Math.ceil(paintBucketsNeeded);
        double totalPriceOfPaint = wholePaintBucketsNeeded * priceOfPaintPerLitre;

        System.out.println("--------Version 1----------");
        System.out.println("Paint Brand: " + paintBrand);
        System.out.println(clientFirstName + " " + clientLastname);
        System.out.println("Area of Wall 1: " + wall1Area + "metres squared");
        System.out.println("Area of Wall 2: " + wall2Area + "metres squared");
        System.out.println("Total Area: " + totalWallsArea + "metres squared" );
        System.out.println("Number of paint buckets needed: " + wholePaintBucketsNeeded);
        System.out.println("Total cost: " + totalPriceOfPaint);



    }
}
