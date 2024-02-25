package inheritance.multiple;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Base {
    private String responseHeader;
    private String responseBody;

    public Base(String responseHeader, String responseBody) {
        this.responseHeader = responseHeader;
        this.responseBody = responseBody;
    }


}
