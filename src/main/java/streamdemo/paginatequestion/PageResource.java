package streamdemo.paginatequestion;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class PageResource {

    private String pageName;
    private List<Integer> pageNumberList;

    public static List<PageResource> getResources() {
        List<PageResource> pageResources = new ArrayList<>();
        List<Integer> pageNumberList1 = List.of(1, 2, 3);
        List<Integer> pageNumberList2 = List.of(4, 5);
        List<Integer> pageNumberList3 = List.of(6);
        List<Integer> pageNumberList4 = List.of(7);
        List<Integer> pageNumberList5 = List.of(8);
        List<Integer> pageNumberList6 = List.of(9, 10, 11);

        pageResources.add(new PageResource("page1", pageNumberList1));
        pageResources.add(new PageResource("page2", pageNumberList2));
        pageResources.add(new PageResource("page3", pageNumberList3));
        pageResources.add(new PageResource("page4", pageNumberList4));
        pageResources.add(new PageResource("page5", pageNumberList5));
        pageResources.add(new PageResource("page6", pageNumberList6));

        return pageResources;
    }
}
