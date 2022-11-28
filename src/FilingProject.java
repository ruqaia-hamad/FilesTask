package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.Stack;

public class FilingProject {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		boolean exitMenu = true;
		do {
			System.out.println("\t\t+++++++++++++++++++++++++++++");
			System.out.println("\t\t+ WELCOME TO THE SYSTEM     +");
			System.out.println("\t\t+++++++++++++++++++++++++++++\n");
			System.out.println("Please Choose Number From Menu: \n");
			System.out.println("================================");
			System.out.println("|  [1] Read from file           |");
			System.out.println("|  [2] Search file for word     |");
			System.out.println("|  [3] create Dirctory          |");
			System.out.println("|  [4] Exit from program        |");
			System.out.println("================================");

			System.out.println("Please Enter your Choice: \n");
			Integer option = sc.nextInt();
			switch (option) {
			case 1:
				try {
					FileReader reader = new FileReader(
							"C:\\Users\\user015\\eclipse-workspace\\RHNewCode\\School\\RHSchoolProject\\jsonfile2.txt");
					BufferedReader bufferedReader = new BufferedReader(reader);

					String lineread;

					while ((lineread = bufferedReader.readLine()) != null) {
						System.out.println(lineread);
					}
					reader.close();

				} catch (IOException e) {
					e.printStackTrace();

				}
				break;

			case 2:
				File dir = new File("C:\\Users\\user015\\eclipse-workspace\\RHNewCode\\School");
				FilenameFilter textFilefilter = new FilenameFilter() {
					public boolean accept(File dir, String name) {
						String lowercaseName = name.toLowerCase();
						if (lowercaseName.endsWith(".txt")) {
							return true;
						} else {
							return false;
						}
					}
				};
				File[] children = dir.listFiles(textFilefilter);

				for (File fileName : children) {
					System.out.println(fileName);
				}
				File file = new File("C:\\Users\\user015\\eclipse-workspace\\RHNewCode\\School\\res.txt");
				String[] words = null;
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				String x;
				System.out.println("Please Enter Word");
				String userinput = sc.next();
				int count = 0;
				while ((x = br.readLine()) != null) {
					words = x.split(" ");
					for (File y : children) {
						for (String word : words) {
							if (word.equals(userinput)) {

								System.out.println("the word is " + userinput + "file name" + y);
								count++;

						
							}
						}
					}
				}
				if (count != 0) {
					System.out.println("The given word is present for " + count + " Times in the file");
				} else {
					System.out.println("The given word is not present in the file");
				}

				fr.close();

				break;

			case 3:

				String path = "C:\\Users\\user015\\eclipse-workspace\\FilesProject\\NewDirectory";

				File file2 = new File(path);

				boolean bool = file2.mkdir();
				if (bool) {
					System.out.println("Directory created successfully");
				} else {
					System.out.println("Sorry couldn’t create specified directory");
				}
				break;

			case 4:
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println("+        THANK YOU          +");
				System.out.println("+++++++++++++++++++++++++++++");
				exitMenu = false;
				break;
			}
		} while (exitMenu);
	}
}