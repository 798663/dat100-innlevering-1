package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
public class O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for (int i =1; i<=10; i++) {
int poengsum1;
do {
	poengsum1 = Integer.parseInt(showInputDialog("Poengsum: " + i +":"));
	
} while (poengsum1 <0 || poengsum1 >100);
	
		

if (poengsum1 <= 100 && poengsum1 >=90) {
	System.out.println("A");
}
else if (poengsum1 <= 89 && poengsum1 >=80) {
	System.out.println("B");
}
else if (poengsum1 <= 79 && poengsum1 >=60) {
	System.out.println("C");
}
else if (poengsum1 <= 59 && poengsum1 >=50) {
	System.out.println("D");
}
else if (poengsum1 <= 49 && poengsum1 >=40) {
	System.out.println("E");
}
else { 
	System.out.println("F");

}
}
	} 
}
