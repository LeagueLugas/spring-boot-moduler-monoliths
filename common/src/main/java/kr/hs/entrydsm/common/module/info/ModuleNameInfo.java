package kr.hs.entrydsm.common.module.info;

import lombok.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModuleNameInfo {

    private String name;

    public String toString() {
        return name;
    }

}
