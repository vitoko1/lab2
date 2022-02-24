public class Province {

    private String name;
    private String capital;
    private long population;
    private static final String POPULATION_LOWER = "30000";
    private static final String POPULATION_HIGHER = "15000000";
    private static final String DEFAULT_POPULATION = "4648055";
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";

    /**
     * Constructor with all its parameters
     * @param name
     * @param capital
     * @param population
     */
    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && (isValidProvince(name))
                && (isValidCapitalCity(capital))) {

            this.name = name;
            this.capital = capital;
            this.population = population;

        } else {
            this.population = Long.parseLong(DEFAULT_POPULATION);
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;

        }

    }

    /**
     * Default Constructor with a default data
     */
    public Province() {
        setCapital(DEFAULT_CAPITAL);
        setName(DEFAULT_PROVINCE);
        setPopulation(Long.parseLong(DEFAULT_POPULATION));

    }

    /**
     *
     * @return a String wich contains the capital of the province and its population
     */
    public String getDetails() {


        String capital = getCapital();
        String province = getName();
        long population = getPopulation();
        return "The capital of " + province + "(population. " + population + ")" + " is " + capital+".";
    }

    /**
     * Province Validator
     * @param province
     * @return
     */
    private boolean isValidProvince(String province) {
        String[] province_array = {"Alberta", "British Columbia", "Manitoba", "New Brunswick",
                "Newfoundland and Labrador", "Nova Scotia", "Ontario",
                "Prince Edward Island", "Quebec", "Saskatchewan"};

        for (String prov : province_array) {
            if (prov.equalsIgnoreCase(province)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Capital city Validator
     * @param capital
     * @return
     */
    private boolean isValidCapitalCity(String capital) {

        String[] capital_array = {"Toronto", "Quebec City", "Charlottetown",
                "Winnipeg", "St. John's", "Regina", "Edmonton", "Fredericton", "Victoria", "Halifax"};

        for (String cap : capital_array) {
            if (cap.equalsIgnoreCase(capital)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Population Validator
     * @param population
     * @return
     */
    private boolean isValidPopulation(long population) {

        if (population >= Integer.parseInt(POPULATION_LOWER) && population <= Integer.parseInt(POPULATION_HIGHER)) {
            return true;
        } else {
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
