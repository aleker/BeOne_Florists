/**
 * Created by aleker on 14.04.17.
 */

public class Flower extends Plant {
    private float price;
    private String name;
    private BeeAttractiveChecker.Colour colour;

    Flower(String name, BeeAttractiveChecker.Colour colour, float price) {
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    @Override
    public void showInformation() {
        System.out.println("Flower information for: " + this.name);
        System.out.println("Colour:\t" + this.colour);
        System.out.println("Price:\t" + this.price);
        this.colour.run();

        System.out.println();
    }

    @Override
    public float sell() {
        System.out.println("Flower sold for " + this.price);
        return this.price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public BeeAttractiveChecker.Colour getColour() {
        return colour;
    }

}
