package entity;

public class Student {
    Integer id;
    String name;
    String sex;
    public Student(){}
    public Student(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
