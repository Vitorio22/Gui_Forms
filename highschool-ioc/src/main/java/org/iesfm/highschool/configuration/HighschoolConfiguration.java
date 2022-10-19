package org.iesfm.highschool.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.highschool.components.GroupReader;
import org.iesfm.highschool.components.HighschoolReader;
import org.iesfm.highschool.components.HighschoolWriter;
import org.iesfm.highschool.components.StudentReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class HighschoolConfiguration {

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

    @Bean
    public StudentReader studentReader(Scanner scanner) {
        return new StudentReader(scanner);
    }
    @Bean
    public GroupReader groupReader(Scanner scanner, StudentReader studentReader) {
        return new GroupReader(scanner, studentReader);
    }
    @Bean
    public HighschoolReader highschoolReader(Scanner scanner, GroupReader groupReader){
        return new HighschoolReader(scanner, groupReader);
    }
    @Bean
    public HighschoolWriter highschoolWriter(ObjectMapper objectMapper, String outputPath){
        return new HighschoolWriter(objectMapper, outputPath);
    }
}
