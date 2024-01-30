
/**
 * calculator to calculate BMI
 *
 */

import java.util.Scanner; 
public class BMI
{
    public static void main(String[] args) 
    
    { 
        String status = "";  
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Please enter your first and last name"); 
        String name = in.nextLine(); 
        
        System.out.println("Please enter your height in feet and inches(5 09)"); 
        String height = in.nextLine(); 
        String fHeight = height.substring(0,1);
        String lHeight = height.substring(2,4); 
        int inch = Integer.parseInt(fHeight); 
        int lHeightF = Integer.parseInt(lHeight); 
        double inches = inch * 12; 
        double mHeight = inches + lHeightF;
        double meterH = mHeight/39.3;
      
            
        System.out.println("Please enter your weight in pounds"); 
        double weight = in.nextDouble(); 
        double kgWeight = weight/2.2; 
        
        double bmi = kgWeight/(meterH * meterH); 
        
        if(bmi < 18.5) 
            status = "Underweight"; 
        else if(bmi < 25.0)
            status = "Normal"; 
        else if(bmi < 29.9) 
            status = "Overweight";
        else 
            status = "Obese"; 
            
        
            
        System.out.println("*********************************************************************************************************************"); 
        System.out.println(); 
        System.out.println("Body Mass Index Calculator"); 
        System.out.println(); 
        System.out.println(); 
        System.out.println("Name: " + name); 
        System.out.println("Height(m): " + (int)(100 * meterH)/100.0 );
        System.out.println("Weight(Kg): " + (int)(100 * kgWeight)/100.0 ); 
        System.out.println("BMI: " + (int)(100 * bmi)/100.0 );
        System.out.println("Category: " + status); 
        System.out.println("*********************************************************************************************************************");
        
    }
        
    
 
}
