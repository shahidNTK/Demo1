
public class Instructions {
	
	public static void main(String[] args) {
		String originalString = "Hello World! @  123_456";
		String newString = replaceNonAlphanumeric(originalString);
		System.out.println(newString);
	}
	public static String replaceNonAlphanumeric(String input) {
	    return input.replaceAll("[^0-9_]", "");
	}
	
	
	// Replicate the same steps (3)
	// Create New Java Project
			// FIle --> New --> Java Project --> Project Name --> Finish
	// Delete the project 
	 // Make sure to click on the check box 
	
	// Creating Local Repositories 
	 // Right Click on the project name
	// Move to Team 
	// Click on Share project 
	// Click on the checkbox to Use or Create new repository 
	// Click on the the dialogbox on the path
	// Click on the Create Repository and it will show .git extension 
	// Finish 
	
	
	// To commit changes to local repository 
	
	// 1. Right click on the project
	// 2. Go to Team
	// 3. Go to commit
	// Git staging is opened 
	
	// We have unstaged , staged, commit message
	
	// Unstaged changes will contain all files which are not part of your local repository
	// Commit file to local repository 
	// we have to add that file to staged changes
	// add to index --> add command 
	// add commit message
	// click on commit 
	
	
	
	// Create new a java project
	// Create a new local git repository 
	// Create a new package
	// Create a new Java class
	// Create main method print something
	
	// Commit those changes from your local workspace / working tree into your local GIT repository 
	
	
	// Local repositories shows .git 
	
	// I made some changes 
	
	
	
	
	
	
	
	

}
