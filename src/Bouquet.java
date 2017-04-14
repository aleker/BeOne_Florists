/**
 * Created by aleker on 14.04.17.
 */

import java.util.ArrayList;
import java.util.List;

public class Bouquet extends Plant {
    private List<Plant> bouquetElements = new ArrayList<>();

    @Override
    public void showInformation() {
        System.out.println("BOUQUET INFORMATION");
        for (int i = 0; i < bouquetElements.size(); i++) {
            System.out.println(i + ":");
            bouquetElements.get(i).showInformation();
        }
    }

    @Override
    public float sell() {
        System.out.println("Bouquet's elements prices: ");
        float sumPrice = 0.0f;
        for (Plant plant : bouquetElements) {
            sumPrice += plant.sell();
        }
        System.out.println("Bouquet's sold for " + sumPrice);
        return sumPrice;
    }

    public void addPlant(Plant plantToAdd) {
        bouquetElements.add(plantToAdd);
        System.out.println("New plant added to bouquet.");
    }

    public void removePlant(Plant plantToRemove) {
        if (!bouquetElements.remove(plantToRemove)) {
            System.out.println("Bouquet does not contain plant of this type.");
        }
        System.out.println("Plant removed from bouquet.");
    }

    public int getSizeOfBouquet() {
        return bouquetElements.size();
    }

    public Plant getElementById(int id) {
        if (id > 0 && id < bouquetElements.size())
            return bouquetElements.get(id);
        else return null;
    }
}
