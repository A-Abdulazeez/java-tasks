import java.util.Scanner;

public class MenstralCycle {
public static void main(String... args) {
Scanner input = new Scanner(System.in);

int lastPeriodDate;
while (true) {
System.out.print("Enter first day of your last period (1–31): ");
lastPeriodDate = input.nextInt();
if (lastPeriodDate >= 1 && lastPeriodDate <= 31) break;

System.out.println("Invalid date. Try again.\n");
 }
 System.out.print("Enter your average cycle duration: ");
 int averageCycleDuration = input.nextInt();

System.out.print("Enter your average period duration: ");
int averagePeriodDuration = input.nextInt();

int flowStartDate = lastPeriodDate;
int flowEndDate = flowStartDate + averagePeriodDuration - 1;

int nextPeriodDate = flowStartDate + averageCycleDuration;

int ovulationDate = nextPeriodDate - 14;

int fertileWindowStart = ovulationDate - 5;
int fertileWindowEnd = ovulationDate + 1;

int safePeriodStart1 = flowEndDate + 1;
int safePeriodEnd1 = fertileWindowStart - 1;

int safePeriodStart2 = fertileWindowEnd + 1;
int safePeriodEnd2 = nextPeriodDate - 1;

System.out.println("\n========== MENSTRUAL CYCLE REPORT ==========");
System.out.println("Last Period Start : Day " + flowStartDate);
System.out.println("Last Period End   : Day " + flowEndDate);

System.out.println("\nNext Period       : Day " + nextPeriodDate);
System.out.println("Ovulation Date    : Day " + ovulationDate);

System.out.println("\nFertile Window    : Day " + fertileWindowStart + " → Day " + fertileWindowEnd);

System.out.println("\nSafe Periods:");
System.out.println("  • Before Ovulation : Day " + safePeriodStart1 + " → Day " + safePeriodEnd1);
System.out.println("  • After Ovulation  : Day " + safePeriodStart2 + " → Day " + safePeriodEnd2);

System.out.println("============================================");

}
}
