package javaAssignments.Assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentDetails {
    void getAllDepartments(ArrayList<Student> studentList){
        ArrayList<String> engDepartments = new ArrayList<>();
        studentList.forEach(student -> engDepartments.add(student.engDepartment));
        engDepartments.stream().distinct().forEach(System.out::println);
    }
    void getNamesEnrolledAfter2018(ArrayList<Student> studentList){
        studentList.stream().filter(student -> student.year_of_enrollment>2018)
                .forEach(student -> System.out.println(student.name));
    }

    void getNamesOfAllMenInCseDept(ArrayList<Student> studentList){
        studentList.stream().filter(student -> student.engDepartment.equals("Computer Science"))
                .filter(student -> student.gender.equals("Male")).forEach(student -> System.out.println(student.toString()));

    }
    void getGenderCount(ArrayList<Student> studentList){
                Map<String, Long> genderCount = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
        System.out.println(genderCount);

    }
    void getAvgAgeOfMenAndWomen(ArrayList<Student> studentList){
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getAge))));
    }

    void studentWithHighestPercentage(ArrayList<Student> studentList){
        String studentWithHighPer = studentList.stream().max(Comparator.comparingDouble(student -> student.perTillDate)).map(student -> student.name).orElse("");
        System.out.println(studentWithHighPer);
    }

    void countNoStudents(ArrayList<Student> studentList){
        Map<String, Long> depCount = studentList.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));
        System.out.println(depCount);
    }

    void averagePercentageInDepartments(ArrayList<Student> studentList){
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate))));
    }

    void youngestMale(ArrayList<Student> studentList){
        System.out.println(studentList.stream().filter(student -> student.engDepartment.equals("Electronic")).min(Comparator.comparing(Student::getAge)).map(student -> student.name).orElse(""));
    }

    void menAndWomenInCse(ArrayList<Student> studentList){
        System.out.println(studentList.stream()
                .filter(student -> student.engDepartment.equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting())));
    }

}
