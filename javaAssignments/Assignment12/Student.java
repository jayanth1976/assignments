package javaAssignments.Assignment12;

public class Student {
        int id;
        String name;
        int age;
        String gender;
        String engDepartment;
        int year_of_enrollment;
        double perTillDate;

        Student(int id, String name, int age, String gender, String engDepartment, int year_of_enrollment, double perTillDate) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.engDepartment = engDepartment;
            this.year_of_enrollment = year_of_enrollment;
            this.perTillDate = perTillDate;
        }

    @Override
    public String toString() {
        return "{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", age: " + age +
                ", gender: '" + gender + '\'' +
                ", year_of_enrollment: " + year_of_enrollment +
                ", Department: " + engDepartment +
                ", perTillDate: " + perTillDate +
                '}';
    }
    String getGender(){
            return gender;
    }

    String getEngDepartment(){
            return engDepartment;
    }

    double getPerTillDate(){
            return perTillDate;
    }
    int getAge(){
            return age;
    }
}
