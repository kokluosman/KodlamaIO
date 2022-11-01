package entities;

public class Category {
    private Course course;
    private String programming;

    public Category(Course course, String programming) {
        this.course = course;
        this.programming = programming;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }
}
