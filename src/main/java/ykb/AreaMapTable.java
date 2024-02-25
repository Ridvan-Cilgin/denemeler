package ykb;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import settest.ykbarea.Area;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AreaMapTable {
    private Area area;
    private Screen screen;
}
