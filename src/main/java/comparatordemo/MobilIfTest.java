package comparatordemo;

public class MobilIfTest {
    public static void main(String[] args) {
        MobilObject mobilObject1 = MobilObject.builder()
                .name("iphone 10474 belalı")
                .isIphone(true)
                .isOnBin(true)
                .version("3.9.16")
                .build();

        MobilObject mobilObject2 = MobilObject.builder()
                .name("iphone 425 ")
                .isIphone(true)
                .isOnBin(false)
                .version("3.9.16")
                .build();

        MobilObject mobilObject11 = MobilObject.builder()
                .name("iphone 10474 ")
                .isIphone(true)
                .isOnBin(true)
                .version("3.9.15")
                .build();

        MobilObject mobilObject22 = MobilObject.builder()
                .name("iphone 425")
                .isIphone(true)
                .isOnBin(false)
                .version("3.9.17")
                .build();

        MobilObject mobilObject3 = MobilObject.builder()
                .name("android 10474")
                .isIphone(false)
                .isOnBin(true)
                .version("3.9.16")
                .build();

        MobilObject mobilObject4 = MobilObject.builder()
                .name("android 425")
                .isIphone(false)
                .isOnBin(false)
                .version("3.9.16")
                .build();

        MobilObject mobilObject5 = MobilObject.builder()
                .name("android 425")
                .isIphone(false)
                .isOnBin(false)
                .version("3.9.16")
                .build();


//        if (mobilObject4.getName().equalsIgnoreCase(mobilObject5.getName())){
//            System.out.println("adlar eşit");
//        }
//
//
//
//        if (!mobilObject1.getIsOnBin() && !mobilObject1.getIsIphone()){
//            System.out.println("mobil 1 e girdi");
//        }
//
//        if (!mobilObject2.getIsOnBin() && !mobilObject2.getIsIphone()){
//            System.out.println("mobil 2 e girdi");
//        }
//
//        if (!mobilObject3.getIsOnBin() && !mobilObject3.getIsIphone()){
//            System.out.println("mobil 3 e girdi");
//        }
//
//        if (!mobilObject4.getIsOnBin() && !mobilObject4.getIsIphone()){
//            System.out.println("mobil 4 e girdi");
//        }
//
        System.out.println("----------------- veya-------------");
        if (!mobilObject1.getIsOnBin() || !mobilObject1.getIsIphone() || (mobilObject1.getIsIphone() && !mobilObject1.getVersion().equalsIgnoreCase("3.9.16"))){
            System.out.println("mobil 1 e girdi");
        }

        if (!mobilObject2.getIsOnBin() || !mobilObject2.getIsIphone()|| (mobilObject1.getIsIphone() && !mobilObject1.getVersion().equalsIgnoreCase("3.9.16"))){
            System.out.println("mobil 2 e girdi");
        }


        if (!mobilObject11.getIsOnBin() || !mobilObject11.getIsIphone() || (mobilObject11.getIsIphone() && !mobilObject11.getVersion().equalsIgnoreCase("3.9.16"))){
            System.out.println("mobil 11 e girdi");
        }

        if (!mobilObject22.getIsOnBin() || !mobilObject22.getIsIphone()|| (mobilObject22.getIsIphone() && !mobilObject22.getVersion().equalsIgnoreCase("3.9.16"))){
            System.out.println("mobil 22 e girdi");
        }

        if (!mobilObject3.getIsOnBin() || !mobilObject3.getIsIphone()|| (mobilObject1.getIsIphone() && !mobilObject1.getVersion().equalsIgnoreCase("3.9.16"))){
            System.out.println("mobil 3 e girdi");
        }

        if (!mobilObject4.getIsOnBin() || !mobilObject4.getIsIphone()|| (mobilObject1.getIsIphone() && !mobilObject1.getVersion().equalsIgnoreCase("3.9.16"))){
            System.out.println("mobil 4 e girdi");
        }


//
//        System.out.println("----------------- değil veya-------------");
//        if (!mobilObject1.getIsOnBin() || !mobilObject1.getIsIphone() || (mobilObject1.getIsIphone() && mobilObject1.getVersion().equalsIgnoreCase("3.9.16"))){
//            System.out.println("mobil 1 e girdi");
//        }


    }
}
