public class Shark extends Animal{
    private String breed;
    private String gender;
    public Shark(String name,String color, int age, int weight, String breed, String gender) {
        super(name,color, age, weight);
        this.breed=breed;
        this.gender=gender;
    }

    @Override
    void getEat() {
        System.out.println("eating fish");
    }
    public  void getAttack()
    {
        System.out.println("Shark attacking to the whale.");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                "} " + super.toString();
    }
}
