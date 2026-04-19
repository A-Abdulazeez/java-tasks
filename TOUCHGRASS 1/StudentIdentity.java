import java.util.Scanner;

public class StudentIdentity{
public static void main(String[]args) {
Scanner input = new Scanner(System.in);

System.out.println("Enetr your Major (I =Information management, C =computer Science, A =Accounting)");
char studentMajor = input.next().toLowerCase().charAt(0);

System.out.println("Enter your year (1 = Freshman, 2 = sophomore, 3 = junior, 4 = senior)");
int studentYear = input.nextInt();

String majorName = "";
String yearName = "";

if (studentMajor == 'I'){ 
majorName = "Information management";
}
else if (studentMajor == 'C'){ 
majorName = "Computer Science";
}
else if (studentMajor == 'A'){ 
majorName = "Accounting";
}
else {
System.out.println("invalid");
}


if (studentYear == 1){
yearName = "Freshman";
}
else if (studentYear == 2){
yearName = "sophomore";
}
else if (studentYear == 3){
yearName = "junior";
}
else if (studentYear == 4){
yearName = "senior";
}
else {
System.out.println("invalid");
}

 
System.out.println(majorName + yearName);




}
}

