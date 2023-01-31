/**
 * 
 */
package Implement_OOPS_using_JAVA_with_Data_Structures_and_Beyond;

import java.io.File;
import java.io.IOException;
/**
 * @author libelef
 *
 */
import java.util.Scanner;
import Implement_OOPS_using_JAVA_with_Data_Structures_and_Beyond.*;
public class Operation {

	/**
	 * 
	 */
	
	public static void main(String[] args) {
		Operation o = new Operation();
		System.out.println(o.linearSearch("Text.txt"));
	}
	
	

	
	
	public Operation() {
		// TODO Auto-generated constructor stub
	}
	
public void printFiles(File[] array, int count) {
		
		// base case of the recursion  
		// count == a.length means the directory has   
		// no more files. Hence, the recursion has to stop  
		if(count == array.length)  
		{  
		return;  
		}  
		// checking if the encountered object is a file or not  
		if(array[count].isFile())  
		{  
		System.out.println(array[count].getName());  
		}  
		// recursively printing files from the directory  
		// i + 1 means look for the next file  
		printFiles(array, count + 1);  
		
	}
	

	public void listFiles(String path) {
		//String pat = path;
		
	// Providing the full path for the directory  
		
		//String path = "src/Files";  
		// creating a file object  
		File fObj = new File(path);  
		// creating on object of the class DisplayFileExample  
		Operation obj = new Operation();  
		
		
		if(fObj.exists() && fObj.isDirectory())  
		{  
		// array for the files of the directory pointed by fObj  
		File arrayFiles[] = fObj.listFiles();  
		// display statements  
		System.out.println("***************************************************");  
		System.out.println("Displaying Files from the directory : " + fObj);  
		System.out.println("**************************************************");  
		// Calling the method  
		obj.printFiles(arrayFiles, 0);  
		}  
		
	}

	
	public void addFile() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("E******File Details ********");
		System.out.println("Enter filename");
		String name = scan.next();
		System.out.println("Enter file extension");
		String ext = scan.next();
		
		
		File file = new File("src/Files/"+name+"."+ext); //initialize File object and passing path as argument  
		boolean result;  
		try   
		{  
		result = file.createNewFile();  //creates a new file  
		if(result)      // test if successfully created a new file  
		{  
		System.out.println("file created "+file.getCanonicalPath()); //returns the path string  

		}  
		else  
		{  
		System.out.println("File already exist at location: "+file.getCanonicalPath());  
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();    //prints exception if any  
		}    

	}
	
	public void deleteFile() {
		try  
		{  
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n******** File details *********"
				+ "\nEnter filename");
		String name = scan.next();
		System.out.println("Enter file extension");
		String ext = scan.next();
		
		File f= new File("src/Files/"+name+"."+ext);           //file to be delete  
		if(f.delete())                      //returns Boolean value  
		{  
		System.out.println(f.getName() + " deleted successfully!");   //getting and printing the file name  
		}  
		else  
		{  
		System.out.println("Failed. File not found. Please try again");  
		}  
		}  
		catch(Exception e)  
		{  System.out.println("Cause: "+e.getCause()+"\nMessage:"+e.getMessage()+"\nStackTrace: ");
		e.printStackTrace();  
		}  
	}


	 public int linearSearch(String fileName){  
			File fObj = new File("src/Files");
			File arrayFile [] = fObj.listFiles();	
			
	        for(int i=0;i<arrayFile.length;i++){ 
	        	//System.out.println(fileName);
	            if(fileName.equals(arrayFile[i].getName())){    
	                return i;    
	            }    
	        }    
	        return -1;    
	 }

	 public void find() {
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("\n*****************************************************"
		 		+ "\nEnter Filename:");
		 String fName = scan.next();
		 
		 int find = linearSearch(fName);
		 if (find!=-1) {
			 System.out.println("\n*********** Search results *********************"
			 		+ "\nFile name: "+fName+"\nResult: Found\n");
		}else {
			System.out.println("\n*********** Search results *********************"
			 		+ "\nFile name: "+fName+"\nResult: Not found!\n");
		}
		 
	 }
	 
}
