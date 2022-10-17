package org.iesfm.highschool.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesfm.highschool.components.StudentReader;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    private String letter;
    private String course;
    private List<StudentReader> students;
}
