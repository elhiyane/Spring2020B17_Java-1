
package day00_ReplIt;
import java.util.Scanner;

public class restorantReceipt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split:");
        String share = input.next();
        System.out.println("Number of people:");
        int numOfPerson = input.nextInt();
        System.out.println("Check amount:");
        double checkAmount = input.nextDouble();
        System.out.println("Service Quality:");
        String quality = input.next();

        double percentage = 0;

        if (share.equalsIgnoreCase("Yes")){
                if (quality.equalsIgnoreCase("Excellent")) {
                percentage = 0.25;
            }  if (quality.equalsIgnoreCase( "Great")) {
                  percentage = 0.2;
            } if (quality.equalsIgnoreCase("Good")) {
                 percentage = 0.15;
            } if (quality.equalsIgnoreCase("Fair")) {
                 percentage = 0.01;
            } if (quality.equalsIgnoreCase("Poor")) {
                 percentage = 0.05;}
        }else { percentage = 0;
        }

        double totalTip = checkAmount * percentage;//119
       double totalToPay = checkAmount + totalTip;//476+119=595
       double totalPerPerson = totalToPay / numOfPerson;//595/4=148.75
      double totalTipToPerson = totalTip/numOfPerson;//

        String person = "";
        if (numOfPerson==1){
            person="&";
        }else if (numOfPerson==2){
            person="&&";
        }else if (numOfPerson==3){
            person="&&&";
        }else if (numOfPerson==4){
            person="&&&&";
        }else if (numOfPerson==5){
            person="&&&&&";
        }else if (numOfPerson==6){
            person="&&&&&&";
        }else {
                    }

            System.out.println("Number of people entered: " + person);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + totalTipToPerson);
        }
    }

























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































