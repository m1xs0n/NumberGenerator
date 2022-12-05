package com.NumberGenerator.RegistrationAndAuthorazation;

import java.io.*;


public class History {
    public static void history(){
    try(FileReader reader = new FileReader("history.txt")) {
        int c;
        while((c=reader.read())!=-1){
            System.out.print((char)c);
            }
        }
        catch(IOException ex){
        System.out.println(ex.getMessage());
        }
    }
}

