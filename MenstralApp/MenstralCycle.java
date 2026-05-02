import java.util.Scanner;

public class MenstralCycle {
public static void main(String... args) {

Scanner input = new Scanner(System.in);

int lastPeriodDate;

while (true) {
System.out.print("Enter first day of your last period (1-31): ");
lastPeriodDate = input.nextInt();

if (lastPeriodDate >= 1 && lastPeriodDate <= 31) {
break;
}

System.out.println("Invalid date. Try again.\n");
}

System.out.print("Enter your average cycle duration: ");
int averageCycleDuration = input.nextInt();

System.out.print("Enter your average period duration: ");
int averagePeriodDuration = input.nextInt();

int flowStartDate = lastPeriodDate;
int flowEndDate = (flowStartDate + averagePeriodDuration - 2) % 31 + 1;

int nextPeriodDate = (flowStartDate + averageCycleDuration - 1) % 31 + 1;

int ovulationDate = (nextPeriodDate - 14 - 1 + 31) % 31 + 1;

int fertileWindowStart = (ovulationDate - 5 - 1 + 31) % 31 + 1;
int fertileWindowEnd = (ovulationDate + 1 - 1) % 31 + 1;

int safePeriodStart1 = (flowEndDate + 1 - 1) % 31 + 1;
int safePeriodEnd1 = (fertileWindowStart - 1 - 1 + 31) % 31 + 1;

int safePeriodStart2 = (fertileWindowEnd + 1 - 1) % 31 + 1;
int safePeriodEnd2 = (nextPeriodDate - 1 - 1 + 31) % 31 + 1;

System.out.println("\n========== MENSTRUAL CYCLE REPORT ==========");

System.out.println("\nNext Period       : Day " + nextPeriodDate);
System.out.println("Ovulation Date    : Day " + ovulationDate);

System.out.println("\nFertile Window    : Day " + fertileWindowStart + " to Day " + fertileWindowEnd);

System.out.println("\nSafe Periods:");
System.out.println("  Before Ovulation : Day " + safePeriodStart1 + " to Day " + safePeriodEnd1);
System.out.println("  After Ovulation  : Day " + safePeriodStart2 + " to Day " + safePeriodEnd2);

System.out.println("============================================");

}
}
