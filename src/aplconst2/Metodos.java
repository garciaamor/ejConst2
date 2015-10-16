package aplconst2;

import javax.swing.JOptionPane;

public class Metodos {
    
    public float pedirFloat(){
        //metodo de un solo paso
        return Float.parseFloat(JOptionPane.showInputDialog("teclea dato "));
        //metodo de dos pasos
        /*String dato = JOptionPane.showInputDialog("teclea dato);
        return (Float.parseFloat(dato));*/
        
        
        
    }
   
           
}
