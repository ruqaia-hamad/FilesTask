import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Stack;

public class Files {
	
    public static void main(String[] args) throws IOException, InterruptedException {
    	Scanner sc=new Scanner(System.in);
    	

		System.out.println("\t\t+++++++++++++++++++++++++++++");
		System.out.println("\t\t+ WELCOME TO THE SYSTEM     +");
		System.out.println("\t\t+++++++++++++++++++++++++++++\n");
		System.out.println("Please Choose Number From Menu: \n");
		System.out.println("================================");
		System.out.println("|  [1] Read from file           |");
		System.out.println("|  [2] Search file for word     |");
		System.out.println("|  [3]Search file for word      |");
		System.out.println("|  [4] Exit from program        |");
		System.out.println("================================");
		
		
		System.out.println("Please Enter your Choice: \n");
		Integer option = sc.nextInt();
		switch (option) {
		case 1 :
			   try {
		            FileReader reader = new FileReader("C:\\Users\\user015\\eclipse-workspace\\RHNewCode\\School\\RHSchoolProject\\jsonfile2.txt");
		            BufferedReader bufferedReader = new BufferedReader(reader);
		 
		            String line;
		 
		            while ((line = bufferedReader.readLine()) != null) {
		                System.out.println(line);
		            }
		            reader.close();
		 
		        } catch (IOException e) {
		            e.printStackTrace();
		        
		    }
			   break;
			  
		case 2 :
			break;
			
			
			
		case 3 :
			break;	
			
			
		case 4 :
			
			break;
		
		}
    	
    	
     
 


    	
    	
    	
    	
    	
    	
    }
    
    }
    	
    	
    	
    	
    	
    	
    	
 