/**
 * Created by aleker on 14.04.17.
 */

public class BeeAttractiveChecker {
    public enum Colour implements Runnable {

        RED(false),
        YELLOW(true),
        WHITE(false),
        ORANGE(true);

        boolean beeAttractive;

        Colour(boolean isBeeAttractive) {
            this.beeAttractive = isBeeAttractive;
        }

        @Override
        public String toString() {
            String enumName = super.toString();
            return enumName.toLowerCase();
        }

        @Override
        public void run() {
            System.out.println(isBeeAttractive(this));
        }
    }

    static String isBeeAttractive(Colour colour) {
        String beeAttractive = (colour.beeAttractive) ? "attractive for bees." : "NOT attractive for bees.";
        return "Colour "+ colour.toString()+ " is "+ beeAttractive;
    }
}
