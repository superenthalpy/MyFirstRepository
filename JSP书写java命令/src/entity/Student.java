package entity;

public class Student {
    Integer id;
    String name;
    String sex;

    public Student(Integer id) {
        this.id = id;
    }
    public Student(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
