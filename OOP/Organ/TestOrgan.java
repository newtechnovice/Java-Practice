import java.util.Scanner;
public class TestOrgan{
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Name: Lu Dai Ming ");
        System.out.println("Age: 22");
       
        boolean quit = false;

        while(quit == false){
            System.out.println("Choose an Organ:\n" + 
                            "\t1. Left Eye\n" +
                            "\t2. Right Eye\n" +
                            "\t3. Heart\n" +
                            "\t4. Stomach\n" +
                            "\t5. Quit\n");
            int choice = scan.nextInt();

            switch(choice){
                case 1: 
                        Eyes leftEye = new Eyes("Left Eye", "None", "Brown");
                        System.out.println("Name: " + leftEye.getName() + 
                                           "\nMedical Condition: " + leftEye.getMedCon() +
                                           "\nColor: " + leftEye.getColor());
                        System.out.println("\t1. Close the Eye");
                        int a = scan.nextInt();
                        if (a == 1){
                            System.out.println(leftEye.closeEyes());
                        }
                        break;
                
                case 2: 
                        Eyes rightEye = new Eyes("Right Eye", "Normal", "Brown");
                        System.out.println("Name: " + rightEye.getName() + 
                                           "\nMedical Condition: " + rightEye.getMedCon() +
                                           "\nColor: " + rightEye.getColor());
                        System.out.println("\t1. Close the Eye");
                        a = scan.nextInt();
                        if (a == 1){
                            System.out.println(rightEye.closeEyes());
                        }
                        break;
                
                case 3:
                        Heart heart = new Heart("Heart", "Normal", 69);
                        System.out.println("Name: " + heart.getName() + 
                                           "\nMedical Condition: " + heart.getMedCon() +
                                           "\nHeart Rate: " + heart.getHeartRate());
                        System.out.println("\t1. Change the heart rate");
                        a = scan.nextInt();
                        if (a == 1){
                            System.out.print("Enter New Heart Rate: ");
                            int rate = scan.nextInt();
                            heart.setHeartRate(rate);
                            System.out.println("Heart Rate changed to: " + heart.getHeartRate());
                        }
                        break;

                case 4: 
                        Organ stomach = new Organ("Stomach", "PUD");
                        System.out.println("Name: " + stomach.getName() + 
                                           "\nMedical Condition: " + stomach.getMedCon());
                        System.out.println("\t1. Digest");
                        a = scan.nextInt();
                        if (a == 1){
                            System.out.println("Digesting begin...");
                        }
                        break;

                case 5: 
                        quit = true;
                        break;
                        
                default:
                    System.out.println("Input Error! Choose only 1-5.");
                    break;
            }
        }

        System.out.println("Out of loop");
        
    }
}