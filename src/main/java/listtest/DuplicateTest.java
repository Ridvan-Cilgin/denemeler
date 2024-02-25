//package listtest;
//
//import java.util.ArrayList;
//
//public class DuplicateTest {
//    public static void main(String[] args) {
//
//        ArrayList<String> list = new ArrayList();
//        list.add("Sagio Mane");
//        list.add("Karius");
//        list.add("Mo Salah");
//        list.add("Firmino");
//        list.add("Lovren");
//        list.add("Steven Gerrard");
//        list.add("Karius");
//        list.add("Mo Salah");
//        list.add("Karius");
//        list.add("Lovren");
//        list.add("Lovren");
//        list.add("Lovren");
//
//        ArrayList<String> perList = new ArrayList();
//
//
//        for (int i = 0; i < list.size(); i++) {
//
//
//            if (list.contains(list.get(i))) {
//
//            }
//
//
//
//
//
//
////            for (int j = 0; j < list.size(); j++) {
////
////                if (i != j && list.get(i).equals(list.get(j))) {
////                    System.out.println(list.get(i) + " eşittir ----> " + list.get(j));
////
////                    list.remove(j);
////                    perList.add(list.get(j));
////
////                }
////                perList.add(list.get(i));
////            }
////
////        }
//
//        System.out.println(perList);
//
//
////        Map<String, Long> frequencies = list.stream()
////                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
////
//////then filter only the inputs which have frequency great than 1
////        frequencies.entrySet().stream()
////                .filter(entry -> entry.getValue() > 1)
////                .forEach(entry -> System.out.println(entry.getKey()));
//
//
//    }
//}
