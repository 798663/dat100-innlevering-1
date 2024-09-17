package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class O3 {

public static void main(String[] args) {

	int fakultet = 1;
int n = Integer.parseInt(showInputDialog("Ett tall som er større enn 0: "));
while (n <= 0) {
	n = Integer.parseInt(showInputDialog("Ett tall som er større enn 0: "));
}
for (int i = 1; i <= n; i++) {
		fakultet *= i;
}
System.out.println("Fakultetet blir" + fakultet);

}	

}