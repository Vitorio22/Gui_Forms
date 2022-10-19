package org.iesfm.highschool.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesfm.highschool.components.GroupReader;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Highschool {
    private String name;
    private List<GroupReader> groups;
}
