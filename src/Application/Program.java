package Application;

import Entities.Departament;
import Entities.HourContract;
import Entities.Worker;
import Entities.WorkerLevel;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        // Place of Entering Data
        System.out.print("Enter departament's name: ");
        String departamentName = sc.nextLine();
        System.out.println();

        System.out.println("Enter worker  data:  ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        // object instance of worker
        Worker worker = new Worker(workerName ,baseSalary, WorkerLevel.valueOf(workerLevel) , new Departament(departamentName));


        // Information of contracts
        System.out.print("How many contracts  to this worker? ");
        int n = sc.nextInt();

        for ( int i = 1; i<=n;i++){
            System.out.println("Enter contracts #" + i + " data ");
            System.out.print("Date (DD/MM/YY): ");
            Date contractDate =sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuehours= sc.nextDouble();
            System.out.print("Duration  (hours): ");
            int hours = sc.nextInt();

         // object instance of contracts
            HourContract contract = new HourContract(contractDate, valuehours, hours);
            worker.addContracts(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        double income = worker.income(year, month);
        System.out.printf("Income for %s/%d: %.2f%n", month, year, income);
        sc.close();
    }
}
