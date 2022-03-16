public class Restaurant {

    private String name;
    private Flavor[] flavors;
    private int[][] cupsSold;
    private int hours;
    private boolean summerDiscount;

    public Restaurant(String name, Flavor[] flavors, int[][] cupsSold, int hours, boolean summerDiscount) {
        this.name = name;
        this.flavors = flavors;
        this.cupsSold = cupsSold;
        this.hours = hours;
        this.summerDiscount = summerDiscount;
    }

    public Restaurant() {
        this.name = null;
        this.flavors = new Flavor [2];
        this.cupsSold = new int[2][6];
        this.hours = 0;
        this.summerDiscount = false;
    }
    double total = 0;

    public double totalSales() {
        return total;

    }

    public void calculateDiscounts(double discount) {

        if (summerDiscount = true) {

        }

    }

    public double closeRestaurant() {
        this.name = null;
        this.flavors = null;
        this.cupsSold = null;
        this.hours = 0;
        this.summerDiscount = false;
        return totalSales();
    }

    public void addFlavor(Flavor[] newFlavor) {
        if (flavors == null) {
            newFlavor = new Flavor[0];
        } else {
            System.out.println("Error, no space available!");
        }

    }

    public Flavor[] getFlavors() {
        return this.flavors;
    }

    public void setFlavors(Flavor[] getFlavors) {
        this.flavors = flavors;
    }

    public int[][] getCupsSold() {
        return this.cupsSold;
    }

    public void setCupsSold(int[][] getCupsSold) {
        this.cupsSold = cupsSold;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean hasSummerDiscount() {
        return this.summerDiscount;
    }

    public void setSummerDiscount(boolean summerDiscount) {
        this.summerDiscount = summerDiscount;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
