public class Main {

    public static int randomiser(int minimumValue, int scale){
        return (int) (minimumValue + Math.random()*scale);
    }
/*
    public static double sizeComparison(double measurementOne, double measurementTwo){
        double smallestMeasurement;
        if (measurementOne > measurementTwo)
        {
            smallestMeasurement = measurementTwo;
        }else{
            smallestMeasurement = measurementOne;
        }
        return smallestMeasurement;
    }
*/
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
        int paintCode = randomiser(1,5);

        String paintColour = switch (paintCode) {
            case 1 -> "Blue";
            case 2 -> "Red";
            case 3 -> "Yellow";
            case 4 -> "Black";
            default -> "White";
        };

        int[] wallHeights = {randomiser(1,5), randomiser(1,5),
                randomiser(1,5),randomiser(1,5)};
        int[] wallLengths = {randomiser(1,10), randomiser(1,10),
                randomiser(1,10),randomiser(1,10)};

        int[] wallAreas ={0,0,0,0};
        int oneWallArea = 0;
        boolean ladderRequired = false;

        for (int i = 0; i<wallHeights.length;i++){
            if (wallHeights[i] > 2){
                ladderRequired = true;
            }
        }
        String ladderMessage = (ladderRequired == true) ? ("A ladder is needed") : ("A ladder is not needed");

        double doorHeight = 0;
        double doorLength = 0;

        do{
            doorHeight = (Math.random()*4);
        } while (doorHeight >= wallHeights[0]  || doorHeight >= wallHeights[1] ||
                doorHeight >= wallHeights[2]  || doorHeight >= wallHeights[3]);

        do{
            doorLength = (Math.random()*2);
        } while (doorLength >= wallLengths[0]  || doorLength >= wallLengths[1] ||
                doorLength >= wallLengths[2]  || doorLength >= wallLengths[3]);

        double doorArea = doorHeight * doorLength;

        double windowHeight = 0;
        double windowLength = 0;

        do{
            windowHeight = (Math.random()*4);
        } while (windowHeight >= wallHeights[0] || windowHeight >= wallHeights[1] ||
                windowHeight >= wallHeights[2] || windowHeight >= wallHeights[3]);

        do{
            windowLength = (Math.random()*4);
        }while(windowLength >= wallLengths[0] || windowLength >= wallLengths[1] ||
                windowLength >= wallLengths[2] || windowLength >= wallLengths[3]);


        double windowArea = windowHeight * windowLength;

        int totalWallsArea =0;
        System.out.println(wallHeights.length);
        for (int i =0; i < wallHeights.length; i++){
            oneWallArea = wallHeights[i] * wallLengths[i];
            totalWallsArea = totalWallsArea + oneWallArea;
            wallAreas[i] = oneWallArea;
        }
        double totalBlankSpace = doorArea + windowArea;
        double totalCoatingArea = (totalWallsArea - totalBlankSpace) * numberOfCoatings;

        double paintBucketsNeeded = totalCoatingArea / paintCoveragePerLitre;
        double wholePaintBucketsNeeded = Math.ceil(paintBucketsNeeded);
        double totalPriceOfPaint = wholePaintBucketsNeeded * priceOfPaintPerLitre;

        System.out.println("--------- Cheap Pete's Penny Pinching Painting -------------");
        System.out.println("---------Client-----------");
        System.out.println("Client Name: " + clientFirstName + " " + clientLastname);
        System.out.println();
        System.out.println("---------Paint------------");
        System.out.println("Paint Brand: " + paintBrand);
        System.out.println("Paint Colour: " + paintColour.toUpperCase());
        System.out.println();
        System.out.println("---------Walls------------");
        for (int i=0; i<wallHeights.length;i++){
            System.out.println("Area of Wall " + (i + 1) + ": " + wallAreas[i] + " metres squared");
        }
        System.out.println("Total Area: " + totalWallsArea + " metres squared" );
        System.out.println();
        System.out.println("------No Paint Area--------");
        System.out.println("Area of Window: " + windowArea + " metres squared");
        System.out.println("Area of Door: " + doorArea + " metres squared");
        System.out.println("Total Void Area: " + totalBlankSpace + " metres squared" );
        System.out.println();
        System.out.println("----------Totals-----------");
        System.out.println("Total area of coatings: " + totalCoatingArea);
        System.out.println("Number of paint buckets needed: " + wholePaintBucketsNeeded);
        System.out.println("Total cost: " + totalPriceOfPaint);
        System.out.println("Budget: " + paintBudget);

        if(totalPriceOfPaint > paintBudget){
            System.out.println("You do not have enough money");
        } else {
            System.out.println("You are within Budget");
        }
        System.out.println();
        System.out.println("-----------Misc-------------");
        System.out.println(ladderMessage);
    }
}
