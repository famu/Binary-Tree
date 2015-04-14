/**
 * @author Muhammad Faisal
 * 
 * Project2 reads the sequences of integers stored in a provided data file and plot the values of each sequence into a
 * binary tree using insert() of BinaryTree class. Each tree is traversed by a recusive method to store its values/keys into
 * a two dimensional character array such that the array represents the drawing area.
 *   
 * @class: 'Project2' extends the BinaryTree class and contains the main method of the project.
 * 
 * @function:  'main()' reads the provided file as a command line argument.
 * 
 * */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;



public class Project2 extends BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringTokenizer tokens;   //To split numbers read from given string
		char[][] arr = new char[10][70]; /*To avoid any null reference or overflow the size should be little bigger than it is needed
		 									enough to accommodate the span and levels of tree*/
		
		BinaryTree T = new BinaryTree();  //Declaration of an empty tree.
		
		if(args.length == 0) System.out.println("No file specified.");  //At least one argument should be passed via command line.
		else{ //File found and ready to be read.
			FileReader theFile;
			BufferedReader inFile;
			String oneLine;  //To store single line read from file
			
			try{
				theFile = new FileReader(args[0]);   // Reading provided data file as an only argument
				inFile = new BufferedReader(theFile);  //creating buffer of provided data file.
				
				oneLine = inFile.readLine();  //reads first line from the file.
				while(oneLine !=null){  
					tokens = new StringTokenizer (oneLine, " "); //Because oneLine is of type String.
					while(tokens.hasMoreTokens()){ //Traversing each token to get integer value.
						T = insert(T, Integer.parseInt(tokens.nextToken())); //Since tree stores integer values as a node or root of a subtree.
						}//end inner while
					
					/* A recursive program which plots the values of tree into the two dimensional array.
					 * Doesn't return any result because it's updating provided array.
					 * 1st parameter is the tree, 2nd is 0th level since root should be at top level,
					 * 3rd parameter is initial offset of the root as 34 almost (70/2).
					 * 4th parameter is 17 = (34/2) which is used to track how farther the '/' and '\' should be printed. Since 
					 * there's a pattern in printing slashes which offset/2, therefore 
					 * 5th parameter is the reference of the array which would be populated by the tree value.
					 * */
					plotTree(T, 0, 34, 17, arr );  							
					/*Printing array using nested loop because the array is representing drawing area.*/
					for(int i=0;i<10; i++){ // for loop should compliance with the size of the array. 
						for(int j=0;j<arr[0].length;j++){ // The inner loop for traversing each entry of the level. 
							 System.out.print(arr[i][j]);  //Simply prints the entry defined by the indices.							
							}//end loop inner
							System.out.println(); // Because there should be a space after printing all entries of a level.
						}//end loop outer		
					
					oneLine = inFile.readLine(); //Next line is blank/empty line.
					oneLine = inFile.readLine(); //New line is ready to be processed for plotting its values in the array.
					/*Re-initialization for next tree.*/
					System.out.println(); // Because there should be a space between two different trees.
					T = new BinaryTree(); //New tree value has to be stored in an empty tree.
					arr = new char[10][70];  // Array has to be reinitialized to store new values 
				}//end outer while
			}catch (Exception e) {System.out.println(e);} //In case of any exception.
		
		}//end else	
		
		
		
		
	}// end main

}
