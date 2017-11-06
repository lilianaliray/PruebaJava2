/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;

/******************************************************************
 *autor:liliana hevia 
 *fecha:06-11-2017
 *clase:prueba java 2
 *responsabilidad:este proyecto nos muestra los meses del año segun el numero que ingresemos.
 * @author LAB04
 */
public class PruebaJava2
{
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int meses =Integer.parseInt(JOptionPane.showInputDialog("ingrese numero"));
     switch(Math.round(meses))
     {
        case 12:
              JOptionPane.showMessageDialog(null, "Diciembre");
         break;
         case 11:
              JOptionPane.showMessageDialog(null, "Noviembre");
         break;
         case 10:
              JOptionPane.showMessageDialog(null, "Octubre");
         break;
         case 9:
              JOptionPane.showMessageDialog(null, "Septiembre");
         break;
         case 8:
              JOptionPane.showMessageDialog(null, "Agosto");
         break;
          case 7:
              JOptionPane.showMessageDialog(null, "Julio");
         break;
          case 6:
              JOptionPane.showMessageDialog(null, "Junio");
         break; 
         case 5:
              JOptionPane.showMessageDialog(null, "Mayo");
         break; 
         case 4:
              JOptionPane.showMessageDialog(null, "Abril");
         break;
            
            case 3:
              JOptionPane.showMessageDialog(null, "Marzo");
         break;
         case 2:
              JOptionPane.showMessageDialog(null, "Febrero");
         break;
         case 1:
          default:
              JOptionPane.showMessageDialog(null, "Enero");
         break;
            
     } 
// TODO code application logic here
    }
    
}
