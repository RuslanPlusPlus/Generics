package by.ruslan.generic.entity;

public class Student extends Person{
    private String university;

    public Student(String university){
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student{id=").append(this.getId())
                .append(", university=").append(university)
                .append("}");
        return builder.toString();
    }
}
