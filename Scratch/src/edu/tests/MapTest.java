package edu.tests;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {
    public static void main(String[] args) {
        Map<String, Double> gpaMap = new HashMap<>();

        gpaMap.put("kea", 4.0);
        gpaMap.put("jasmin", 3.6);
        gpaMap.put("kelvin", 1.7);
        gpaMap.put("deshon", 2.5);
        gpaMap.put("sherie", 3.84);
        gpaMap.put("tyler", 1.0);

        Double jasminGpa = gpaMap.get("jasmin");
        System.out.println("Jasmin's GPA was: " + jasminGpa);
        System.out.println();

        dump(gpaMap);
        System.out.println();

        Collection<Double> gpas = gpaMap.values();
        for (Double gpa : gpas) {
            if(gpa >= 3.5){
                System.out.println(gpa);
            }
        }
    }

    private static void dump(Map<String, Double> gpaMap) {
        for (Map.Entry<String, Double> entry : gpaMap.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}