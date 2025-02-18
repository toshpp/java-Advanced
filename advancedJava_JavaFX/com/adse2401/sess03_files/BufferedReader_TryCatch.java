/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.adse2401.sess03_files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
/**
 * java program that demonstrates how to read file contents using methods of 
 * the bufferedReader class within a try..catch block.
 *
 * @author USER
 */
public class BufferedReader_TryCatch   
{
//URL object to hold the relative path to the file (read_file.txt)
    protected URL url2File = this.getClass().
            getResource("/com/adse2401/sess03_files/read_file.txt");  // Corrected path
 
            
            

    public static void main(String[] args) throws IOException
    {
        //declare and instatiATEB A FILE OBJECT
        File readFile=new File(new BufferedReader_TryCatch().url2File.getPath());
        
        //declare and instantiate a buffered reader object
        BufferedReader br= new BufferedReader(new FileReader(readFile));
        
        //dispaly the contents of the file
        System.out.println("the contents of the file " + readFile.getName()
        +"are");
        
        String st;
        int n =1;
        while ((st =br.readLine())!=null)
        {
            System.out.printf("Line %d \n %s \n", n,st);
            n++;//increament the line counter
        }
        br.close();
    }
    
}
