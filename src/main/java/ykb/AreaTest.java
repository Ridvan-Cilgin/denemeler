package ykb;

import settest.ykbarea.Area;

import java.util.ArrayList;
import java.util.List;

public class AreaTest {
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


        Screen screen1 = Screen.builder()
                .name("Kampanyalar")
                .build();

        Screen screen2 = Screen.builder()
                .name("aracım+")
                .build();


        List<Area> areaList = List.of(area1, area2, area3, area4, area5, area6, area7, area8);
        List<Screen> screenList = List.of(screen1, screen2);


        List<AreaMapTable> areaMapTableList = new ArrayList<>();


        for (Area area : areaList) {

            for (Screen screen : screenList) {

                area.setScreen(425);
                AreaMapTable areaMapTable = new AreaMapTable();

                areaMapTable.setArea(area);
                areaMapTable.setScreen(screen);

                areaMapTableList.add(areaMapTable);
            }
        }

        System.out.println(areaMapTableList);

    }

    public static void adderToList(Area area){
        AreaMapTable areaMapTable = new AreaMapTable();
        areaMapTable.setArea(area);

    }
}
