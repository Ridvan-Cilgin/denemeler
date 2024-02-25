package streamdemo.paginatequestionrecord.paginatequestion;

import lombok.Data;

import java.util.List;
@Data
public class PageItem {
    private Integer pageNumber;
    private String sectionName;
    private List<Question> questionList;
}
