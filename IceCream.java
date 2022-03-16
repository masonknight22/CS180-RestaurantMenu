public class IceCream {

    private Restaurant[] restaurants;
    private boolean summer;
    private int newBusinesses;
    private int newBusinessThreshold;

    public IceCream(Restaurant[] restaurants, boolean summer, int newBusinesses, int newBusinessThreshold) {
        this.restaurants = restaurants;
        this.summer = summer;
        this.newBusinesses = newBusinesses;
        this.newBusinessThreshold = newBusinessThreshold;
    }

    public int openBusinesses() {
        return newBusinesses;
    }

    public void applySummerDiscounts() {

    }

    public Restaurant[] getRestaurants() {
        return this.restaurants;
    }

    public void setRestaurants(Restaurant[] restaurants) {
        this.restaurants = restaurants;
    }
    public boolean isSummer() {
        return this.summer;
    }

    public void setSummer(boolean Summer) {
        this.summer = summer;
    }

    public int getNewBusinesses() {
        return this.newBusinesses;
    }

    public void setNewBusinesses(int newBusinesses) {
        this.newBusinesses = newBusinesses;
    }

    public int getNewBusinessThreshold() {
        return this.newBusinessThreshold;
    }

    public void setNewBusinessThreshold(int newBusinessThreshold) {
        this.newBusinessThreshold = newBusinessThreshold;
    }
}
