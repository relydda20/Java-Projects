public class Human{
    private int Height;
    private String favoriteFood;

    public Human(){
        this.Height = 167;
        this.favoriteFood = "Steak";

    }

    public void introduction(){
        System.out.println("Hi, I'm a human.");
    }

    public void eat(){
        System.out.println("Yummy");
    }
}