public class Eagle extends Animal{
    private String breed;

    public Eagle(String name,String color, int age, int weight, String breed) {
        super(name,color, age, weight);
        this.breed=breed;
    }

    @Override
    void getEat() {
        System.out.println("Eagle eating meat. ");
    }
   public void getFly()
    {
        System.out.println("Eagle flying to hunting.");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
