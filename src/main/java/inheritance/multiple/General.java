package inheritance.multiple;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class General extends Base {
    private String amount;
    private String order;

//    public General(String amount, String order) {
//        this.amount = amount;
//        this.order = order;
//    }

//    public General(String responseHeader, String responseBody, String amount, String order) {
//        super(responseHeader, responseBody);
//        this.amount = amount;
//        this.order = order;
//    }

    public General(General general) {
        super(general.getResponseHeader(), general.getResponseBody());
        this.amount = general.getAmount();
        this.order = general.getOrder();
    }
}
