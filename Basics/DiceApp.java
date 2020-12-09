public class DiceApp{ 
    public static void main(String[] args) {
        System.out.println("Random Rolls of Dice");

        int roll;
        for (int i=0; i<100; i++){
            roll = randomInt(1,6);
            System.out.print(roll + " ");
        }
        System.out.println();
    }

    public static int randomInt(int low, int high){
        int result = (int)(Math.random()*(high-low+1)) +1;
        return result;
    }
}
