package streamdemo.paginatequestion;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Question {
    private Integer questionNo;
    private String sectionName;

    static List<Question> productQuestionList() {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(1, "Kişisel Bilgiler"));
        questions.add(new Question(2, "Kişisel Bilgiler"));
        questions.add(new Question(3, "Kişisel Bilgiler"));
        questions.add(new Question(4, "Risk Profili"));
        questions.add(new Question(5, "Risk Profili"));
        questions.add(new Question(6, "Yatırım Tercihleri"));
        questions.add(new Question(7, "Yatırım Tercihleri"));
        questions.add(new Question(8, "Yatırım Tercihleri"));
        questions.add(new Question(9, "Yatırım Durumu"));
        questions.add(new Question(10, "Yatırım Durumu"));
        questions.add(new Question(11, "Yatırım Durumu"));

        return questions;
    }
}
