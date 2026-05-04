public class TaskFour {
public static int[] returnEvenArray(int userInput) {
int[] scores = new int[100];
        
for (int index = 0; index < scores.length; index++) {
scores[index] = userInput;
}

int count = 0;
for (int score : scores) {
if (score % 2 == 0) {
count++;
}
}

int[] result = new int[count];
int index = 0;
for (int score : scores) {
if (score % 2 == 0) {
result[index++] = score;
 }
}

return result;
}

public static void main(String[] args) {
}
}
