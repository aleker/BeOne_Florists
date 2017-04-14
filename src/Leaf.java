/**
 * Created by aleker on 14.04.17.
 */

public class Leaf extends Plant {
    private float price;
    private String name;

    public Leaf(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showInformation() {
        System.out.println("Flower information for: " + this.name);
        System.out.println("Price:\t" + this.price);

        System.out.println();

    }

    @Override
    public float sell() {
        System.out.println("Leaf sold for " + this.price);
        return this.price;
    }

    public String getName() {
        return name;
    }

}
