package comparatordemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobilObject {
    private String name;
    private Boolean isIphone;
    private Boolean isOnBin;
    private String version;
}
