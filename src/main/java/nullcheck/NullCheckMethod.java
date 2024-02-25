package nullcheck;

import comparatordemo.AuthorDto;
import comparatordemo.Book;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;

public class NullCheckMethod {
    public static void main(String[] args) throws Exception {
        Date input = new Date();

        Date date1 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date6 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(6).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date8 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(8).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date12 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(12).atStartOfDay(ZoneId.systemDefault()).toInstant());

        LocalDateTime lt
                = java.time.LocalDateTime.now();


        AuthorDto authorDto = AuthorDto.builder()
                .id(12L)
                .lastName("Tostoyewski")
                .name("Oğuzhan")
                .build();

        Book entity = Book.builder()
                .id(1)
                .name("Suç ve ceza")
                .page(687)
                .startDate(date12)
//                .isActive(true)
                .localDate(lt)
                .authorDto(authorDto)
                .build();

        Book request = Book.builder()
//                .id(3)
//                .name("kapitan")
                .page(87)
                .startDate(date8)
//                .isActive(false)
                .build();

        Book response = new Book();


//        response.setId(entity.getId());
//        response.setName(request.getName() == null ? entity.getName() : request.getName());
//        response.setIsActive(request.getIsActive() == null ? entity.getIsActive() : request.getIsActive());
//
//        // buna eski değeri null sa patlar
        response.setName(Objects.requireNonNullElse(request.getName(), entity.getName()));
//        response.setId(Objects.requireNonNullElse(request.getId(), entity.getId()));
//        response.setIsActive(Objects.requireNonNullElse(request.getIsActive(), entity.getIsActive()));
//        System.out.println(response);

//null da olsa default sıkıntı yok
        response.setName(Optional.ofNullable(request.getName()).orElse(entity.getName()));
        response.setIsActive(Optional.ofNullable(request.getIsActive()).orElse(entity.getIsActive()));
//        System.out.println(response);


//request.setName("Baha");
//        if (request.getName() != null){
//            if(checkName(request.getName())){
//                System.out.println("ex");
//                throw new Exception("This handle is already in use");
//            }
//            System.out.println("changed name");
//        }
//        System.out.println(" name is null");



        request.setName("Baha");
        if ((request.getName() != null) && checkName(request.getName())){

                System.out.println("ex");
                throw new Exception("This handle is already in use");
            }
            System.out.println("changed name");



//        response.setId(entity.getId());
//        response.setName(getName(entity, request));
//        extracted(request, response);

//        System.out.println(response);

//        response.setId(entity.getId());
//        response.setName(request.getName() == null ? entity.getName() : request.getName());
//        response.setIsActive(request.getIsActive() == null ? entity.getIsActive() : request.getIsActive());

//        System.out.println(response);


//        System.out.println(extractClassFieldValue(request, "name"));

//        String propertyName = "name";
//        String methodName = "set" + StringUtils.capitalize(propertyName);
//        a.getClass().getMethod(methodName, newObject.getClass()).invoke(a, newObject);

//
//        Object object1 = extractClassFieldValue(request, "name");
//        Object object2 = extractClassFieldValue(entity, "name");

//        System.out.println(getValueOrDefault(object1, object2));

//        response.setName(getValueOrDefault(extractClassFieldValue(request, "name"),
//                extractClassFieldValue(entity, "name")).toString());

//        response.setName(getValueOrDefault(entity, request).toString());


//        response.setName(getValueOrDefault1(request, entity, "name").toString());


    }

    private static boolean checkName(String name) {
        return false;
    }
//
//    private static <T> T getValueOrDefault1(T valueClass, T defaultValueClass, String fieldName) {
//        Object object1 = extractClassFieldValue(valueClass, fieldName);
//        Object object2 = extractClassFieldValue(defaultValueClass, fieldName);
//        return (T) getValueOrDefault(object1, object2);
//    }
//
//
//    public static <T> Object extractClassFieldValue1(T className, String fieldName) {
//        try {
//
//
//            String methodName = "set" + StringUtils.capitalize(fieldName);
////            className.getClass().getMethod(methodName, newObject.getClass()).invoke(className, newObject);
//
//
//            Field field = className.getClass().getDeclaredField(fieldName);
//            field.setAccessible(true);
//            return field.get(className);
//        } catch (Exception nsfException) {
//            throw new RuntimeException(nsfException);
//        }
//    }
//
//    private static String getName(Book entity, Book request) {
//        return request.getName() == null ? entity.getName() : request.getName();
//    }
//
//    private static void extracted(Book request, Book response) {
//        response.setIsActive(request.getIsActive() == null ? null : request.getIsActive());
//    }
//
//    // how to nullcheck if null set null
//
//
//    @SuppressWarnings("rawtypes")
//    private static Map<Class, List> map;
//
//    public static <T extends Serializable> void put(Class<T> key, List<Consumer<? extends T>> value) {
//        map.put(key, value);
//    }
//
//    @SuppressWarnings("unchecked")
//    public static <T extends Serializable> List<Consumer<? extends T>> get(Class<T> key) {
//        return map.get(key);
//    }
//
//
//    public static <T> Object extractClassFieldValue(T className, String fieldName) {
//        try {
//            Field field = className.getClass().getDeclaredField(fieldName);
//            field.setAccessible(true);
//            return field.get(className);
//        } catch (Exception nsfException) {
//            throw new RuntimeException(nsfException);
//        }
//    }
//
//    public static <T> T getValueOrDefault(T value, T defaultValue) {
//        return value == null ? defaultValue : value;
//    }
//

}
