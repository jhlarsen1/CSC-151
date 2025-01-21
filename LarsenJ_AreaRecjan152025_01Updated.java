/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package larsenj_arearecjan152025_01;

import javax.swing.JOptionPane;
/**
 *
 * @author larsenj8282
 */
public class LarsenJ_AreaRecjan152025_01 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        areaRect();
    }
    public static void areaRect()
    {
        // TODO code application logic here
        // Get the width of the rectangle from the user
        String widthInput = JOptionPane.showInputDialog("Enter the width of the rectangle:");
        // Convert the input to a double
        double width = Double.parseDouble(widthInput);
        
        // Get the height of the rectangle from the user
        String heightInput = JOptionPane.showInputDialog("Enter the height of the rectangle:");
        // Convert the input to a double
        double height = Double.parseDouble(heightInput);
        
        // Calculate the area
        double area = width * height;
        
        // Display the result
        JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
    }
}
    

