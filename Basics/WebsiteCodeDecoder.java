import java.util.Scanner;

public class WebsiteCodeDecoder {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
        System.out.println("Error and Status code exists to make identifying the source of the problem easier.\n");
        System.out.println("Status codes that starts with 1XX shows informational statuses, 2XX shows a succesful actions,\n"+
                            "3XX shows redirection, 4XX shows client side error, and 5XX shows serverside error.\n");
        
        String input = "N";

        while (input.equalsIgnoreCase("N")){

            UserInput();

            System.out.print("Exit the program? (Y|N)");
            input = scan.next();

            if (input.equalsIgnoreCase("Y")){
                break;
            }

        }
        System.out.println("End of Program!");
    }

    public static void UserInput(){
        
        System.out.println("\n1: Informational Response (1XX)\n2: Successful Response (2XX)\n3: Redirection Messages (3XX)\n" +
                            "4: Client Error Response (4XX)\n5: Server Error Responses (5XX)");

        int choice;
        System.out.print("Enter Choice: ");
        choice = scan.nextInt();

        SwitchCases(choice);

    }

    public static void SwitchCases(int choice){
        
        switch (choice){
            case 1: 
                System.out.println("\nInformational Responses");
                System.out.println("100   Continue\n101   Switching Protocol\n");
                break;
            
            case 2:
                System.out.println("\nSuccessful Responses");
                System.out.println("200   OK\n201   Created\n202   Accepted\n203   Non-Authoritative Information\n"+
                                    "204   No Content\n205   Reset Content\n206   Partial Content\n");
                break;
            
            case 3:
                System.out.println("\nRedirection Messages");
                System.out.println("300   Multiple Choice\n301   Moved Permanently\n302   Found\n303   See Other\n"+
                                    "304   Not Modified\n305   Use Proxy\n306   No longer used\n307   Temporary Redirect\n"+
                                    "308   Permanent Redirect\n");
                break;
            
            case 4: 
                System.out.println("\nClient Error Responses");
                System.out.println("400   Bad Request\n401   Unauthorized\n402   Payment Required\n403   Forbidden\n"+
                                    "404   Not Found\n405   Method Not Allowed\n406   Not Acceptable\n"+
                                    "407   Proxy Authentication Required\n408   Request Timeout\n409   Conflict\n"+
                                    "410   Gone\n411   Length Required\n412   Precondition Failed\n413   Request Entity Too Large\n"+
                                    "414   Request-URI Too Long\n415   Unsupported Media Type\n416   Requested Range Not Satisfiable\n"+
                                    "417   Expectation Failed\n");
                break;

            case 5:
                System.out.println("\nServer Error Responses");
                System.out.println("500   Internal Server Error\n501   Not Implemented\n502   Bad Gateway\n503   Service Unavailable\n"+
                                    "504   Gateway Timeout\n505   HTTP Version Not Supported\n");
                break;
            
            default:
                System.out.println("ERROR! Chooses 1 to 5.");
                break;
        }

    }

}
