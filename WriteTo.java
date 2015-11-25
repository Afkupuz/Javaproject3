/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it252.dataEnter;
import java.io.BufferedWriter;
import java.io.FileWriter;
/**
 *
 * @author nicolas
 */
public class WriteTo {
    
    public void store(String fileName, String input, boolean replace){


String [] data = {input};

try {
  BufferedWriter log = new BufferedWriter( new FileWriter(fileName, replace ));

  for( int i = 0; i < data.length; i++){
    log.write( data[i] );
    log.newLine();
  }
  log.close();
  
  }
catch (Exception e) {
  System.out.println("Oh no, something bad happened!");      
}


}
    
    
    
}
