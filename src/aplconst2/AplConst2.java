package aplconst2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AplConst2 {

    public static void main(String[] args) {
        float base, altura;
        /*Scanner obx=new Scanner(System.in);
        System.out.println("indica base : ");
        base=obx.nextFloat();
        System.out.println("indica altura : ");
        altura=obx.nextFloat();
        Rectangulo rec1= new Rectangulo(base,altura);
        System.out.println("base : "+rec1.getBase());
        System.out.println("altura : "+rec1.getAltura());
        System.out.println("area distinta = "+ rec1.calcularArea(base,altura));
        System.out.println("perimetro = "+rec1.calcularPerimetro());*/
             
                
        
        String resposta=JOptionPane.showInputDialog("base :");
        base= Float.parseFloat(resposta);
        String resposta2=JOptionPane.showInputDialog("altura :");
        altura=Float.parseFloat(resposta2);
        JOptionPane.showMessageDialog (null,"base ="+ base); 
        JOptionPane.showMessageDialog (null, "altura= "+ altura);
        Rectangulo rec1= new Rectangulo(base,altura);
        
        JOptionPane.showMessageDialog (null, "area = "+ rec1.calcularArea(base,altura));
        JOptionPane.showMessageDialog (null, "perimetro = "+ rec1.calcularPerimetro());    
        
        
       
   
        
    }
    
}
