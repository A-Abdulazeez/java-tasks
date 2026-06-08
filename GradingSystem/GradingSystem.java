public class GradingSystem {

public static void main(String... args) {
java.util.Scanner input = new java.util.Scanner(System.in);

System.out.println("Enter number of student: ");
int numberOfStudent = input.nextInt();
while (numberOfStudent <= 0 || numberOfStudent > 100) {
System.out.println("Enter a positive number of student (1-100): ");
numberOfStudent = input.nextInt();
}

System.out.println("Enter number of subjects: ");
int numberOfSubject = input.nextInt();
while (numberOfSubject <= 0 || numberOfSubject > 100) {
System.out.println("Enter a positive number of subject: ");
numberOfSubject = input.nextInt();
}

System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>");
System.out.println("Saved Successfully");
System.out.println();

int[][] scores = new int[numberOfStudent][numberOfSubject];
        

int[] totalScores = new int[numberOfStudent]; 

 for (int row = 0; row < numberOfStudent; row++) {
 System.out.println("Entering score for student " + (row + 1));
 int currentStudentTotal = 0;

 for (int column = 0; column < numberOfSubject; column++) {
 System.out.print("Enter score for subject " + (column + 1) + ": ");
 scores[row][column] = input.nextInt();

while (scores[row][column] < 0 || scores[row][column] > 100) {
System.out.print("Enter a valid score (0-100): ");
scores[row][column] = input.nextInt();
}
                
currentStudentTotal += scores[row][column];
}
            
totalScores[row] = currentStudentTotal; 

System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>");
System.out.println("Saved Successfully");
System.out.println();
}

System.out.println("\nSTUDENT SUMMARY");
System.out.println("===============================================================================");

System.out.printf("%-15s", "STUDENT");

for (int subject = 0; subject < numberOfSubject; subject++) {
System.out.printf("%-15s", "SUB" + (subject + 1));
}

System.out.printf("%-15s%-15s%-15s%n", "TOT", "AVE", "POS");
System.out.println("===============================================================================");

for (int rowIndex = 0; rowIndex < numberOfStudent; rowIndex++) {
System.out.printf("%-15s", "Student " + (rowIndex + 1));

for (int columnIndex = 0; columnIndex < numberOfSubject; columnIndex++) {
System.out.printf("%-15d", scores[rowIndex][columnIndex]);
 }

double studentAverage = (double) totalScores[rowIndex] / numberOfSubject;


int rankPosition = 1; 
for (int rankIndex = 0; rankIndex < numberOfStudent; rankIndex++) {
if (totalScores[rankIndex] > totalScores[rowIndex]) {
rankPosition++; 
}
}

System.out.printf("%-15d%-15.2f%-15d%n", totalScores[rowIndex], studentAverage, rankPosition);
}
        
System.out.println("===============================================================================");
System.out.println("===============================================================================");

System.out.println();
System.out.println(); 
System.out.println("\nSUBJECT SUMMARY");
System.out.println();

for (int column = 0; column < numberOfSubject; column++) {
System.out.println("Subject " + (column + 1));

int highestScore = scores[0][column];
int lowestScore = scores[0][column];
int highestStudent = 1;
int lowestStudent = 1;
int subjectTotal = 0;
int passes = 0;
int fails = 0;

for (int row = 0; row < numberOfStudent; row++) {
int score = scores[row][column];
subjectTotal += score;

if (score > highestScore) {
highestScore = score;
highestStudent = row + 1;
}
if (score < lowestScore) {
lowestScore = score;
lowestStudent = row + 1;
}
if (score >= 50) passes++;
else {
fails++;
}
}

double subjectAverage = (double) subjectTotal / numberOfStudent;

System.out.printf("Highest scoring student is:  Student %d scoring %d%n", highestStudent, highestScore);
System.out.printf("Lowest Scoring student is: student %d scoring %d%n", lowestStudent, lowestScore);
System.out.printf("Total Score is:  %d%n", subjectTotal);
System.out.printf("Average score is: %.2f%n", subjectAverage);
System.out.printf("Number of passes: %d%n", passes);
System.out.printf("Number of Fails: %d%n", fails);
System.out.println();
System.out.println();
}


int hardestSubject = 0;
int easiestSubject = 0;
int mostFails = -1;
int mostPasses = -1;


int overallHighScore = scores[0][0], overallLowScore = scores[0][0];
int overallHighStudent = 1, overallHighSubject = 1;
int overallLowStudent = 1, overallLowSubject = 1;


int bestTotal = totalScores[0], worstTotal = totalScores[0];
int bestStudent = 1;
int worstStudent = 1;

int classTotal = 0;

for (int colum = 0; colum < numberOfSubject; colum++) {
int passes = 0, fails = 0;
for (int row = 0; row < numberOfStudent; row++) {
int score = scores[row][colum];
if (score >= 50) passes++; else fails++;


if (score > overallHighScore) {
overallHighScore = score;
overallHighStudent = row + 1;
overallHighSubject = colum + 1;
}
if (score < overallLowScore) {
overallLowScore = score;
overallLowStudent = row + 1;
overallLowSubject = colum + 1;
}
}
if (fails > mostFails) { 
mostFails = fails; hardestSubject = colum + 1; 
}
if (passes > mostPasses) { 
mostPasses = passes; easiestSubject = colum + 1; 
}
}

for (int indices = 0; indices < numberOfStudent; indices++) {
classTotal += totalScores[indices];
if (totalScores[indices] > bestTotal) { 
bestTotal = totalScores[indices]; bestStudent = indices + 1; 
}
if (totalScores[indices] < worstTotal) { 
worstTotal = totalScores[indices]; worstStudent = indices + 1; 
}
}

double classAverage = (double) classTotal / numberOfStudent;

System.out.printf("The hardest subject is Subject %d with %d failures%n", hardestSubject, mostFails);
System.out.printf("The easiest subject is Subject %d with %d passes%n", easiestSubject, mostPasses);
System.out.printf("The overall Highest score is scored by Student %d in subject %d scoring %d%n", overallHighStudent, overallHighSubject, overallHighScore);
System.out.printf("The overall Lowest score is scored by Student %d in subject %d scoring %d%n", overallLowStudent, overallLowSubject, overallLowScore);
System.out.println("==================================================");
System.out.println();
System.out.println("CLASS SUMMARY");
System.out.println("==================================================");
System.out.printf("Best Graduating Student is: Student %d scoring %d%n", bestStudent, bestTotal);
System.out.println("==================================================");
System.out.println();
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", worstStudent, worstTotal);
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
System.out.println();
System.out.println("==================================================");
System.out.printf("Class total score is: %d%n", classTotal);
System.out.printf("Class Average score is: %.1f%n", classAverage);
System.out.println("==================================================");

}
}
