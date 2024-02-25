package comparatordemo;

public class IfTest {
    public static void main(String[] args) {
        String xyz = "true";
//        String xyz = null;
        System.out.println(getBoolean(xyz));
    }

// çalıştı
//     public static Boolean getBoolean(String xyz) {
//         if (xyz != null) {
//             return Boolean.parseBoolean(xyz);
//         }
//         return false;
//    }


    public static Boolean getBoolean(String xyz) {
        return    xyz != null ?  Boolean.parseBoolean(xyz) : false;


//        if (xyz != null) {
//            return Boolean.parseBoolean(xyz);
//        }
//        return false;
    }
}
