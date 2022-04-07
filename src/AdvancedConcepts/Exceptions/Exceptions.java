package AdvancedConcepts.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
    public static void main(String[] args){
        try{
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        }catch (FileNotFoundException ex){
            System.out.println("This file does not exist");
            System.out.println(ex.getMessage());
        }
        // this will always run
        finally {
            //reader.close();
        }
    }
}
