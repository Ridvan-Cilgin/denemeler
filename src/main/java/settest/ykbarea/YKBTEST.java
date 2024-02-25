package settest.ykbarea;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class YKBTEST {
    public static void main(String[] args) {

        Area area1 = Area.builder()
                .name("Secure")
                .screen(425)
                .build();
        Area area2 = Area.builder()
                .name("semisecure")
                .screen(425)
                .build();
        Area area3 = Area.builder()
                .name("nonsecure")
                .screen(425)
                .build();
        Area area4 = Area.builder()
                .name("prepaid")
                .screen(425)
                .build();

        Area area5 = Area.builder()
                .name("Secure")
                .screen(10474)
                .build();
        Area area6 = Area.builder()
                .name("semisecure")
                .screen(10474)
                .build();
        Area area7 = Area.builder()
                .name("nonsecure")
                .screen(10474)
                .build();
        Area area8 = Area.builder()
                .name("prepaid")
                .screen(10474)
                .build();

        List<Area> areaList = List.of(area1, area2, area3, area4, area5, area6, area7, area8);
        List<String> areaNameList = new ArrayList<>();
        Set<String> areaNameSet = new HashSet<>();
//        List<String> areaNameList2 = new ArrayList<>();
        for (Area area : areaList){

            areaNameList.add(area.getName());
            areaNameSet.add(area.getName());
        }

        System.out.println(areaNameList);
        System.out.println("----------------------");
        System.out.println(areaNameSet);

        List<String> areaNameList2  = new ArrayList<>(areaNameSet);
        System.out.println("----------------------");
        System.out.println(new ArrayList<>(areaNameSet));



    }
}
