package zoo;

public abstract class Animal {

    private String name;
    private int age;
    private String gender;


    public abstract String breed();

    public void secrete() {

    }

    public void mate() {

    }

    public void drink() {

    }

    public void eat() {

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
}
