package Doc;
import java.util.*;
public class Syncdoc {
    public static void main(String args[]){
    FasBook b=new FasBook();
    Scanner sc=new Scanner(System.in);
    int option;
    System.out.println("options:" +
            " 1.Addiction psychiatrist.\n" +
            " 2.Adolescent medicine specialist.\n" +
            " 3.Allergist (immunologist)\n" +
            " 4.Anesthesiologist.\n" +
            " 5.Cardiac electrophysiologist.\n" +
            " 6.Cardiologist.\n" +
            " 7.Cardiovascular surgeon.\n" +
            " 8.Colon and rectal surgeon.\n"+
            " 9.dentist\n"+"10.pulmonologist");
    System.out.println("Enter the option type of doctor you want to consult");
    option=sc.nextInt();
    if(option<1||option>10)
        System.out.println("Invalid option please enter valid option");
    else
    {
        b.bookdoc(option);
    }

    }
}
