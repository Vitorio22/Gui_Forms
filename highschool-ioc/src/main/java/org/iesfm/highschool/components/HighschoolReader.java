package org.iesfm.highschool.components;

import lombok.AllArgsConstructor;
import org.iesfm.highschool.entity.Highschool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
public class HighschoolReader {

    private static final Logger log = LoggerFactory.getLogger(HighschoolReader.class);
    private Scanner scanner;
    private GroupReader groupReader;

    public Highschool readHighschool(){

        log.info("Introduce el nombre: ");
        String name = scanner.nextLine();
        log.info("¿Cuantos grupos quieres meter?: ");
        int numberGroups = scanner.nextInt();
        List<GroupReader> groups = new ArrayList<>();
        for (int i = 0; i < numberGroups; i++) {
            groups.add(groupReader);
        }
        return new Highschool(name, groups);
    }
}
