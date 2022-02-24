public class Canada {

    private Province[] provinces = new Province[10];
    private static final long aux = 1000000;

    /**
     * Constructor wich generate an array filled with its provices, capital city and its population
     */
    public Canada() {

        Province prov = new Province("British Columbia", "Victoria", 4648055);
        Province prov1 = new Province("Alberta", "Edmonton", 4262635);
        Province prov2 = new Province("Manitoba", "Winnipeg", 1342153);
        Province prov3 = new Province("New Brunswick", "Fredericton", 775610);
        Province prov4 = new Province("Newfoundland and Labrador", "St. John's", 510550);
        Province prov5 = new Province("Nova Scotia", "Halifax", 969383);
        Province prov6 = new Province("Ontario", "Toronto", 14223942);
        Province prov7 = new Province("Prince Edward Island", "Charlottetown", 154331);
        Province prov8 = new Province("Quebec", "Quebec City", 8501833);
        Province prov9 = new Province("Saskatchewan", "Regina", 1132505);

        this.provinces[0] = prov;
        this.provinces[1] = prov1;
        this.provinces[2] = prov2;
        this.provinces[3] = prov3;
        this.provinces[4] = prov4;
        this.provinces[5] = prov5;
        this.provinces[6] = prov6;
        this.provinces[7] = prov7;
        this.provinces[8] = prov8;
        this.provinces[9] = prov9;

    }

    /**
     * Method to display all the provinces in the array
     */
    public void displayAllProvinces() {

        for (Province prov : provinces) {
            System.out.println(prov.getDetails());
            System.out.println("");
        }
    }

    /**
     *
     * @param min
     * @param max
     * @return an int with the number of provinces wich its population is between 2 values.
     */
    public int getNumOfProvincesBetween(int min, int max) {
        int counter = 0;

        for (Province prov : provinces) {

            long firstDigit = prov.getPopulation() / aux;
            if (firstDigit >= min && firstDigit <= max) {
                counter++;
            }
        }
        return counter;
    }


}
