/* a slightly complicated countdown using for loop*/

public class TMinus {
    public static void main(String[] args) {
        System.out.println("We are go for launch in T-Minus ");

        for (int i = 10; i >= 0; System.out.println((i == 8) ? "Ignition sequence start!" : i + "..."), i--);

        System.out.println("Liftoff!");
    }
    
}
