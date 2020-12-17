/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;






public class Excepciones {

    public void leerArchivo() throws FileNotFoundException,IOException{
    //lectura de una archivo de texto
    
    File archivo =new File("c:\\prueba\\texto.txt");
    FileReader fr=new FileReader(archivo);
    BufferedReader bf=new  BufferedReader(fr);
    String linea;
    
        while ((linea=bf.readLine())!=null ){
           
            System.out.println(linea);
        }
    
    }
    
    
    public void leerArchivo2(){
        
        try {
            leerArchivo();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"no se ha encontrado el archivo deseado, porfavor verifique la ruta");
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ha ocurrido una excepcion verificada");
        }finally{
            
        }
        System.out.println("programa terminado");
    }
    
    
    
    public static void main(String[] args) {
        
        Excepciones prueba =new Excepciones();
        prueba.leerArchivo2();
        
    }
    
}

