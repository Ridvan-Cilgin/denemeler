package splitTest;

import java.util.HashMap;
import java.util.Map;

public class CityDistrictSplitter {
    public static void main(String[] args) {
        String name = null;
        String city = "İzmir";

        String district = "Gaziemir";

        String cityDistrict = "İzmir/Gaziemir";

        String il = null;
        String ilce = null;


//        String[] cities = cityDistrict.split("/");
//
//        System.out.println(cities[0]);
//        System.out.println(cities[1]);
//
//        String[] cities1 = city.split("/");
//        System.out.println(cities1[0]);

//        cities.forEach(System.out::println);
//
//        for (String a : cities)
//            System.out.println(a);

//        bookList.forEach(System.out::println);

//        String[] cities1 =  locationSplitter(cityDistrict);

        String[] cities1 = locationSplitter(name);
//        System.out.println(cities1[1]);

        il = mapper(cities1).get("il");
        ilce = mapper(cities1).get("ilce");

        System.out.println(il);
        System.out.println(ilce);
    }

    private static Map<String, String> mapper(String[] cities1) {

        Map<String, String> map = new HashMap<>();


        if (cities1.length == 1) {
            map.put("il", cities1[0]);
//            il= cities1[0];
        }else if (cities1.length == 2){
//            il = cities1[0];
//            ilce = cities1[1];
            map.put("il", cities1[0]);
            map.put("ilce", cities1[1]);
        }else {

        }
        return map;
    }

    private static String[] locationSplitter(String cityDistrict) {
        return cityDistrict.split("/");
    }


}
