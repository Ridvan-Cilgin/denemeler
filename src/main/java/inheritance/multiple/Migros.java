package inheritance.multiple;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Migros extends General {
    private String history;

//    public Migros(String amount, String order, String history) {
//        super(amount, order);
//        this.history = history;
//    }

    public Migros(General general, String history) {
        super(general);
        this.history = history;
    }
}
