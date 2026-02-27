public class Aluno {
    private String name;
    private int age;
    private String registration;

    public Aluno() {
    }

    public Aluno(String name, int age, String registration) {
        this.name = name;
        this.age = age;
        this.registration = registration;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegistration() {
        return this.registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }
}
