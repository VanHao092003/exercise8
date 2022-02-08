public class Student {
    private String name;
    private int age;
    private String class_;

    public Student(String name, int age, String class_) {
        this.name = name;
        this.age = age;
        this.class_ = class_;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getClass_() {
        return class_;
    }
    public void setClass_(String class_) {
        this.class_ = class_;
    }
    
    @Override
    public String toString() {
        return "Information of student borrowed book: name" + name + ", age: " + age + ", class: " + class_ ;
    }
}
