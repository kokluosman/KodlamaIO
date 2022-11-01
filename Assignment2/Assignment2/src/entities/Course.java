package entities;

public class Course {
    private CourseTYPE courseTYPE;
    private double unitPrice;

    public Course(CourseTYPE courseTYPE, double unitPrice) {
        this.courseTYPE = courseTYPE;
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public CourseTYPE getCourseTYPE() {
        return courseTYPE;
    }

    public void setCourseTYPE(CourseTYPE courseTYPE) {
        this.courseTYPE = courseTYPE;
    }

}
