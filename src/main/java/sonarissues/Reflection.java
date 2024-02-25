package sonarissues;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reflection {
    private int id;
    private String name;
    private int pageSize;
    private String author;
    private Boolean isFavorite;

//
//    protected Object extractNonBaseClassFieldValue1(String fieldName) {
//        try {
//            Field field = this.getClass().getField(fieldName);
//            field.setAccessible(true);
//            return field.get(this);
//        } catch (Exception nsfException) {
//            throw new RuntimeException(nsfException);
//        }
//    }


    protected Object extractNonBaseClassFieldValue(String fieldName) {
        try {
            Field field = this.getClass().getDeclaredField(fieldName);
//            field.setAccessible(true);
            return field.get(this);
        } catch (Exception nsfException) {
            throw new RuntimeException(nsfException);
        }
    }
}
