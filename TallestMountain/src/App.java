import java.util.ArrayList;
import java.util.List;

import co.grandcircus.Mesa;
import co.grandcircus.Mountain;
import co.grandcircus.iFormation;


    
public class App {
    public static void main(String[] args) {
        List<iFormation> formations = new ArrayList<>();
        formations.add(new Mountain(3000, "Mount Glasses"));
        formations.add(new Mesa(800, "Mesa Light", 500));
        formations.add(new Mountain(5000, "Mount Calander"));
        formations.add(new Mesa(1200, "Mesa Mirror", 300));

        showInfo(formations);

        iFormation tallest = findTallest(formations);
        System.out.println("Here is the tallest formation:");
        System.out.println(tallest.getInfo());
    }

    public static void showInfo(List<iFormation> formations) {
        for (iFormation formation : formations) {
            System.out.println(formation.getInfo());
        }
    }

    public static iFormation findTallest(List<iFormation> formations) {
        if (formations.isEmpty()) {
            return null;
        }

        iFormation tallest = formations.get(0);
        for (iFormation formation : formations) {
            if (formation.getHeight() > tallest.getHeight()) {
                tallest = formation;
            }
        }
        return tallest;
    }
    }

