public class Main {
    public static void main (String[] args){
        String paintBrand = "Dulux";
        paintBrand = paintBrand.toUpperCase();
        String clientFirstName = "Paddington";
        clientFirstName = clientFirstName.toUpperCase();
        String clientLastname = "Brown";
        clientLastname = clientLastname.toUpperCase();
        int paintBudget = 50;
        int priceOfPaintPerLitre = 5;
        int paintCoveragePerLitre = 10;
        int numberOfCoatings = 3;
        int paintCode = 1;
        String paintColour = switch (paintCode) {
            case 1 -> "Blue";
            case 2 -> "Red";
            case 3 -> "Yellow";
            default -> "White";
        };

        int wall1Height = (int) (1 + Math.random()*5);
        int wall1Length = (int) (1 + Math.random()*10);
        int wall1Area = wall1Height * wall1Length;

        int wall2Height = (int) (1 + Math.random()*5);
        int wall2Length = (int) (1 + Math.random()*8);
        int wall2Area = wall2Height * wall2Length;

        String ladderRequired = (wall1Height > 2||wall2Height > 2) ? ("A ladder is needed") : ("A ladder is not needed");
        /*
        double doorHeight = 2;
        double doorLength = 0.5;
        double doorArea = doorHeight * doorLength;

        double windowHeight = 1 + Math.random()*3;
        double windowLength = 1 + Math.random()*8;
        double windowArea = windowHeight * windowLength;
        */
        int totalWallsArea = wall1Area + wall2Area;
        //double totalBlankSpace = doorArea + windowArea;
        //double totalCoatingArea = (totalWallsArea - totalBlankSpace) * numberOfCoatings;
        double totalCoatingArea = totalWallsArea * numberOfCoatings;

        double paintBucketsNeeded = totalCoatingArea / paintCoveragePerLitre;
        double wholePaintBucketsNeeded = Math.ceil(paintBucketsNeeded);
        double totalPriceOfPaint = wholePaintBucketsNeeded * priceOfPaintPerLitre;

        System.out.println("Paint Brand: " + paintBrand);
        System.out.println("Client Name: " + clientFirstName + " " + clientLastname);
        System.out.println(ladderRequired);
        System.out.println("Paint Colour: " + paintColour.toUpperCase());
        System.out.println("Area of Wall 1: " + wall1Area + " metres squared");
        System.out.println("Area of Wall 2: " + wall2Area + " metres squared");
        System.out.println("Total Area: " + totalWallsArea + " metres squared" );
        //System.out.println("Total area of coatings: " + totalCoatingArea);
        System.out.println("Number of paint buckets needed: " + wholePaintBucketsNeeded);
        System.out.println("Total cost: " + totalPriceOfPaint);
        System.out.println("Budget: " + paintBudget);

        if(totalPriceOfPaint > paintBudget){
            System.out.println("You do not have enough money");
        } else {
            System.out.println("You are within Budget");
        }
    }
}
