package com.deeplearnimage;

import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.sourceforge.tess4j.*;
import java.io.IOException;


public class deeplearnimage {
	
	
 public static void main(String[] args) {
		 
	BufferedReader reader =    new BufferedReader(new InputStreamReader(System.in));
	 	
	try {
		 	
		 	String name = reader.readLine();		 			   
	        File imageFile = new File(name);        
	        
	        ITesseract instance = new Tesseract();          
	        
	        String result = instance.doOCR(imageFile);
	        System.out.println(result);
	        
        } catch (TesseractException | IOException e) 
		{
            System.err.println(e.getMessage());
        }
        
 }
}