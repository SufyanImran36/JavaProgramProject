package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;



public class Main {

    public static void main (String[] args) throws IOException { //Class needs to be same name as the file name.
	// write your code here
        System.out.println("Hello world!"); //println; after printing it takes cursor to the next line.


            File filename = new File("E:\\news.txt");
           Scanner sc = new Scanner(filename);
            sc.useDelimiter("\\s+"); //groups all white spaces as a delimiter
           List<String> ReversedLines = new LinkedList<>();
           
           while(sc.hasNext()) //this method returns true if scanner has another token in its input.
           {
               ReversedLines.add(sc.next()); //next() method finds the next token that is available.
           }

        Collections.reverse(ReversedLines);
           System.out.println(ReversedLines);


    }
    
}
