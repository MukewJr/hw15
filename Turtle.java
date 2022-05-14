public class Turtle extends Animal{

    public Turtle(String name,String color, int age, int weight) {
        super(name,color, age, weight);
    }

    @Override
    void getEat() {
        System.out.println("turtle eating leaves.");
    }
    public void getSwim()
    {
        System.out.println("Turtle swim to hot places in winter.");
    }

    @Override
    public String toString() {
        return "Turtle{} " + super.toString();
    }

}
