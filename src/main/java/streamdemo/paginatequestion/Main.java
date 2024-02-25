package streamdemo.paginatequestion;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
//    public static void main(String[] args) {
//        List<PageResource> pageResources = PageResource.getResources();
//        List<Question> questions = Question.productQuestionList();
//
//        List<PageItem> pageItems = pageResources.stream()
//                .flatMap(pageResource -> {
//                    String pageName = pageResource.getPageName();
//                    return pageResource.getPageNumberList().stream()
//                            .map(questionNumber -> {
//                                List<Question> questionList = questions.stream()
//                                        .filter(question -> question.getQuestionNo().equals(questionNumber))
//                                        .collect(Collectors.toList());
//                                return new PageItem(pageName, questionList.get(0).getSectionName(), questionList);
//                            });
//                })
//                .collect(Collectors.toList());
//
//        // Oluşturulan pageItems listesini kullanabilirsiniz.
//        // Örneğin:
//        pageItems.forEach(pageItem -> {
//            System.out.println("Page Name: " + pageItem.getPageName());
//            System.out.println("Section Name: " + pageItem.getSectionName());
//            System.out.println("Questions: " + pageItem.getQuestionList());
//            System.out.println();
//        });
//    }

//
//    public static void main(String[] args) {
//        List<PageResource> pageResources = PageResource.getResources();
//        List<Question> questions = Question.productQuestionList();
//
//        Map<String, List<Question>> pageQuestionMap = pageResources.stream()
//                .collect(Collectors.toMap(
//                        PageResource::getPageName,
//                        pageResource -> pageResource.getPageNumberList().stream()
//                                .map(pageNumber -> questions.stream()
//                                        .filter(question -> question.getQuestionNo().equals(pageNumber))
//                                        .findFirst()
//                                        .orElse(null))
//                                .toList()
//                ));
//
//        List<PageItem> pageItems = pageQuestionMap.entrySet().stream()
//                .map(entry -> new PageItem(entry.getKey(), entry.getValue().get(0).getSectionName(), entry.getValue()))
//                .toList();
//
//
//
//        // Oluşturulan pageItems listesini kullanabilirsiniz.
//        // Örneğin:
//        pageItems.forEach(pageItem -> {
//            System.out.println("Page Name: " + pageItem.getPageName());
//            System.out.println("Section Name: " + pageItem.getSectionName());
//            System.out.println("Questions: " + pageItem.getQuestionList());
//            System.out.println();
//        });
//
//
//    }
//}

    public static void main(String[] args) {
        List<PageResource> pageResources = PageResource.getResources();
        List<Question> questions = Question.productQuestionList();

        Map<String, List<Question>> pageQuestionMap = pageResources.stream()
                .collect(Collectors.toMap(
                        PageResource::getPageName,
                        pageResource -> pageResource.getPageNumberList().stream()
                                .map(pageNumber -> questions.stream()
                                        .filter(question -> question.getQuestionNo().equals(pageNumber))
                                        .findFirst()
                                        .orElse(null))
                                .collect(Collectors.toList())
                ));

        List<PageItem> pageItems = pageQuestionMap.entrySet().stream()
                .sorted(Comparator.comparingInt(entry -> extractPageNumber(entry.getKey())))
                .map(entry -> new PageItem(entry.getKey(), entry.getValue().get(0).getSectionName(), entry.getValue()))
                .collect(Collectors.toList());

        // Oluşturulan pageItems listesini kullanabilirsiniz.
        // Örneğin:
        pageItems.forEach(pageItem -> {
            System.out.println("Page Name: " + pageItem.getPageName());
            System.out.println("Section Name: " + pageItem.getSectionName());
            System.out.println("Questions: " + pageItem.getQuestionList());
            System.out.println();
        });
    }

    private static int extractPageNumber(String pageName) {
        return Integer.parseInt(pageName.replaceAll("page", ""));
    }
}
