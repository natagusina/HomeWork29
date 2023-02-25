package class29HW;

import java.util.LinkedHashSet;

public class task1 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Rome");
        cities.add("Milan");
        cities.add("Amsterdam");
        cities.add("Paris");
        cities.add("Bristol");
        cities.add("London");

        cities.removeIf(city->city.startsWith("A"));
        System.out.println(cities);

    }
}
