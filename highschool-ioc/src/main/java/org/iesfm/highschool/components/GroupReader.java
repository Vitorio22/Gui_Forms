package org.iesfm.highschool.components;

import org.iesfm.highschool.entity.Group;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupReader {

    private static final Logger log = LoggerFactory.getLogger(GroupReader.class);

    private Scanner scanner;
    private StudentReader studentReader;

    public GroupReader(Scanner scanner, StudentReader studentReader) {
        this.scanner = scanner;
        this.studentReader = studentReader;
    }

    public Group readGroup() {
        log.info("Introduce la letra: ");
        String letter = scanner.nextLine();
        log.info("Introduce el curso: ");
        String course = scanner.nextLine();
        log.info("Cuantos estudiantes quieres meter: ");
        int numberStudents = 0;
        List<StudentReader> students = new ArrayList<>();
        for (int i = 0; i < numberStudents; i++) {
            students.add(studentReader);
        }
        return new Group(letter, course, students);
    }

}
