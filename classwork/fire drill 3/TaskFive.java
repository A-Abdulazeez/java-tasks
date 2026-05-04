public class TaskFive{
public static int[] returnOddArray(int userInput) {
int[] scores = new int [100];
for (int index = 0; index < scores.length; index++) {
scores[index] = userInput;
}

int count = 0;
for (int score : scores) {
if (score % 2 == 1) {
 count++;
 }
 }

int[] result = new int[count];
int index = 0;
for (int score : scores) {
if (score % 2 == 1) {
result[index++] = score;
}
}

return result;
}
public static void main(String... args) {
}
}
