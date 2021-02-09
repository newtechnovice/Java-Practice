import java.util.Scanner;

public class SimpleArray{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        String[] contactName = {"Qian Kun", "Yong Qin", "Si Cheng", "Yuk Hei", "Dejun", "Guanheng", "YangYang"};
        int[] number = {1,2,3,4,5,6,7};

        for (int i = 0; i < contactName.length; i++){
            System.out.println(contactName[i]);
        }

        System.out.print("Search: ");
        String name = scan.nextLine();

        for (int i = 0; i < contactName.length; i++){
            if (name.equalsIgnoreCase(contactName[i])){
                System.out.println(number[i]);
            }
        }  
    }
}