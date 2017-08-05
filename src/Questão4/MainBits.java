package Questão4;
import javax.swing.JOptionPane;

public class MainBits {
	public static void main (String [] args){
		Bits b = new Bits (4);
		boolean [] array1 = {true, false, true, true};
		boolean [] array2 = {false, true, true,false};
		boolean [] array3 = {true, true, true, false};
		b.setConjuntoBits(array1);
		JOptionPane.showInputDialog("Lista:" + b.toString());
		JOptionPane.showInputDialog("AND");
		try{
			b.and(array2);
		}catch (ParametrosDeTamanhosDiferentesException e){
			JOptionPane.showInternalMessageDialog(null, e.getMessage());
		}
		JOptionPane.showInternalMessageDialog(null, "Lista Nova:" + b.toString());
		JOptionPane.showInternalMessageDialog(null, "OR");
		try{
			b.or(array3);
		}catch (ParametrosDeTamanhosDiferentesException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		JOptionPane.showMessageDialog(null, "Lista Nova:" + b.toString());
		JOptionPane.showMessageDialog(null, "NOT");
		b.not();
		JOptionPane.showMessageDialog(null, "Lista Nova:" + b.toString());
		JOptionPane.showMessageDialog(null, "Terceiro Bit:" + b.retornaBits(2));
		JOptionPane.showMessageDialog(null, "Altera o terceiro bit para bit 1");
		b.mudaBits(true, 2);
		JOptionPane.showMessageDialog(null, "Terceiro bit:" + b.retornaBits(2));
	}

}
