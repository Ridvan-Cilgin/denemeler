package serializationdemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookSerialization implements Serializable {

    private int id;
    private String name;
    private int pageSize;
    private String author;
    private Boolean isFavorite;
}
