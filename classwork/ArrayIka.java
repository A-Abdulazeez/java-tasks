public class ArrayIka{
public static void main (String... args){

char [][] scores = new char [3][3];


scores[0][0] = 'X';
scores[0][1] = 'O';
scores[0][2] = 'X';

scores[1][0] = 'O';
scores[1][1] = 'O';
scores[1][2] = '0';

scores[2][0] = 'X';
scores[2][1] = 'X';
scores[2][2] = 'O';

for (int arrayRow = 0; arrayRow < scores.length; arrayRow++){
for (int arrayColumn = 0; arrayColumn < scores.length; arrayColumn++){
System.out.print(scores[arrayRow][arrayColumn]);
}


System.out.println();
}
}
}
