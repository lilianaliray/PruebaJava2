
package pruebajava2;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/********************************************************************
 *autor:liliana hevia 
 *fecha:06-11-2017
 *clase:prueba java 2
 *responsabilidad:esta clase nos enseña a crear contraseñas
 *
 * @author LAB04
 */
public class Contraseña 
{
    public static void main(String[] args)
    
     {
         int numero;
       
     
    numero =Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
      if(numero==119)
              {
               JOptionPane.showMessageDialog(null, "clave correcta");   
              } 
      else
      {
        JOptionPane.showMessageDialog(null, "clave incorrecta");  
        numero =Integer.parseInt(JOptionPane.showInputDialog("ingrese un segundo  numero")); 
        JOptionPane.showMessageDialog(null, "clave incorrecta");
        numero =Integer.parseInt(JOptionPane.showInputDialog("ingrese tercer numero"));
          
      }
      
      while(numero!=119)
      {
       JOptionPane.showMessageDialog(null, "cuenta bloqueada, comuniquese con soporte tecnico");           
      }
      
                
     
      
    }  
}
