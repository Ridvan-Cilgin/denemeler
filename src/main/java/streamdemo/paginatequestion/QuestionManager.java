package streamdemo.paginatequestion;

import java.util.ArrayList;
import java.util.List;

public class QuestionManager {
    public static void main(String[] args) {
//        System.out.println(Question.productQuestionList());
//
//        System.out.println(PageResource.getResources());

        paginator(Question.productQuestionList(), PageResource.getResources()).forEach(System.out::println);
        System.out.println(PageResource.getResources());
    }

    static List<PageItem> paginator(List<Question> questionList, List<PageResource> pageResourceList) {

        List<PageItem> pageItemList = new ArrayList<>();

//        questionList.stream()
//                .filter(question -> pageResourceList.stream()
//                        .anyMatch(page -> page.getPageNumberList().stream()
//                                .anyMatch(pageNumber -> pageNumber.equals(question.getQuestionNo()))))
//                .collect(Collectors.groupingBy(question -> question));

//        pageResourceList.stream().filter(pageResource -> questionList.stream()
//                .anyMatch(question -> pageResource.getPageNumberList().stream()
//                        .anyMatch(pageNumber -> pageNumber.equals(question.getQuestionNo()))))
//                .forEach(pageResource -> {
//                    PageItem pageItem = new PageItem();
//                    pageItem.setPageNumber(pageResource.getPageName());
//                    pageItem.setSectionName(questionList.get(0).getSectionName());
//                    pageItem.setQuestionList(questionList.stream()
//                            .filter(question -> pageResource.getPageNumberList().stream()
//                                    .anyMatch(pageNumber -> pageNumber.equals(question.getQuestionNo())))
//                            .toList());
//                    pageItemList.add(pageItem);
//                });



//        pageResourceList.stream().filter(pageResource -> questionList.stream()
//                        .anyMatch(question -> pageResource.getPageNumberList().stream()
//                                .anyMatch(pageNumber -> pageNumber.equals(question.getQuestionNo()))))
//                .forEach(pageResource -> {
//                    PageItem pageItem = new PageItem();
//                    pageItem.setPageNumber(pageResource.getPageName());
//                    pageItem.setSectionName(question.getSectionName());
//                    pageItem.setQuestionList(questionList.stream()
//                            .filter(question -> pageResource.getPageNumberList().stream()
//                                    .anyMatch(pageNumber -> pageNumber.equals(question.getQuestionNo())))
//                            .toList());
//                    pageItemList.add(pageItem);
//                });


        return pageItemList;
    }
}





    























