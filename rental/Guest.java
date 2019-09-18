package rental;

public class Guest {
    private String name;
    private String idNumber;
    private int age;

    public Guest() {
    }

    public Guest(String name, String idNumber, int age) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
