package streamdemo.paginatequestion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageItem {
    private String pageName;
    private String sectionName;
    private List<Question> questionList;


}
