package enumtest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetAllEnumValues {
    public static void main(String[] args) {
//        getAllEnumValues();
//        getAllEnumValues3();
//        System.out.println(getAllEnumValues4());

        System.out.println(getAllEnumValues6());
    }

   static void getAllEnumValues(){
       for (DaysOfWeekEnum day : DaysOfWeekEnum.values()) {
           System.out.println(day);
       }
    }

    static void getAllEnumValues1(){
        Stream.of(DaysOfWeekEnum.values());
    }

    static void getAllEnumValues2(){
        Arrays.stream(DaysOfWeekEnum.values());
    }

    static void getAllEnumValues3(){
        DaysOfWeekEnum1.stream()
                .filter(d -> d.getTypeOfDay().equals("off"))
                .forEach(System.out::println);
    }

    static List<DaysOfWeekEnum1> getAllEnumValues4(){
       List<DaysOfWeekEnum1> list = Stream.of(DaysOfWeekEnum1.values()).toList();
       return list;
    }

    static List<DaysOfWeekEnum1> getAllEnumValues5(){
//        List<DaysOfWeekEnum1> list = new java.util.ArrayList<>(Stream.of(DaysOfWeekEnum1.values()).toList());
//        List<DaysOfWeekEnum1> list1 = (List<DaysOfWeekEnum1>)(Stream.of(DaysOfWeekEnum1.values());

        List<DaysOfWeekEnum1> list = Stream.of(DaysOfWeekEnum1.values()).collect(Collectors.toList());
        list.remove(DaysOfWeekEnum1.MONDAY);
        return list;
    }


    static List<DaysOfWeekEnum1> getAllEnumValues6(){

//        List<DaysOfWeekEnum1> list = Stream.of(DaysOfWeekEnum1.values()).collect(Collectors.toList());
//        list.remove(DaysOfWeekEnum1.MONDAY);
        List<DaysOfWeekEnum1> list = Collections.singletonList(DaysOfWeekEnum1.MONDAY);

        return list;
    }
}
