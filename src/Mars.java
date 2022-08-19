public class Mars {
    public static void main(String[] args) throws InterruptedException{
        String ColonyName = "Rei";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;

        ShipFood -= (ShipPopulation * 0.75);
        ShipFood -= (ShipPopulation * 0.75);

        System.out.println("Amount of food left: " + ShipFood);

        ShipFood += (ShipFood * .5);

        ShipPopulation += 5;

        System.out.println("Amount of food left: " + ShipFood);
        System.out.println("Population: " + ShipPopulation);

        String LandingLocation = "The Ocean";

        if (LandingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        Landing = LandingCheck(100);

        new GuessingGame();
        new MarsExpedition();
        new FindingsLists();


    }

    private static boolean LandingCheck (int Loops) throws InterruptedException
    {
        for (int i = 0; i <= Loops; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("Keep Center");

            } else if ((i % 5) == 0) {
                System.out.println("Keep right");


            } else if ((i % 3) == 0) {
                System.out.println("Keep Left");

            } else {
                System.out.println("Calculating");

            }
            Thread.sleep(250);

        }
        System.out.println("Landed");
        return false;
    }

}







