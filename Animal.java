public class Animal {

    private String name;
    private String color;
    private  int age;
    private int weight;

    public Animal(String name, String color, int age, int weight) {
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }

    void getEat()
    {
        System.out.printf(name+ " eat food.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
