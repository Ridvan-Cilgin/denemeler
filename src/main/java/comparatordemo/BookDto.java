package comparatordemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDto
        implements Cloneable {
    private int id;
    private String name;
    private int page;
    //    private Set<SubSubject> subSubjectSet;
    private Date startDate;
    private Boolean isActive;
    private LocalDateTime localDate;
    private AuthorDto authorDto;

    @Override
    public Object clone() throws CloneNotSupportedException {
        BookDto clone = null;
        try {
            clone = (BookDto) super.clone();

            //Copy new date object to cloned method
//            clone.setDob((Date) this.getDob().clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }

}
