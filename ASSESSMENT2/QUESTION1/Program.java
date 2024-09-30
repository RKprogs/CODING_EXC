package ASSESSMENT2.QUESTION1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Insurance Number:");
        String insuranceNo = scanner.nextLine();
        System.out.println("Enter Insurance Name:");
        String insuranceName = scanner.nextLine();
        System.out.println("Enter Amount Covered:");
        double amountCovered = scanner.nextDouble();

        System.out.println("Select Option:");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int opt = scanner.nextInt();


        if (opt == 1) {
            System.out.println("Enter Policy Term:");
            int policyTerm = scanner.nextInt();
            System.out.println("Enter Benefit Percent:");
            float benefitPercent = scanner.nextFloat();
            LifeInsurance ins = new LifeInsurance(insuranceNo, insuranceName, amountCovered, policyTerm, benefitPercent);
            double premium = ins.calculatePremium();
            System.out.println("Calculated Premium: " + premium);
        } else if (opt == 2) {
            System.out.println("Enter Depreciation Percent:");
            float depPercent = scanner.nextFloat();
            MotorInsurance ins = new MotorInsurance(insuranceNo, insuranceName, amountCovered, depPercent);
            double premium = ins.calculatePremium();
            System.out.println("Calculated Premium: " + premium);
        }
    }
}