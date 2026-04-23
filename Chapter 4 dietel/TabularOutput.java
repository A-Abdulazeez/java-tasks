public class TabularOutput {
public static void main(String[] args) {
System.out.println("N\tN2\tN3\tN4");

for(int n = 1;n <= 5;n++) {
System.out.printf("%d\t%d\t%d\t%d%n", n, n * n, n * n * n, n * n * n * n);
}

}
}
