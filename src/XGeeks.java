//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable
	String ask = JOptionPane.showInputDialog(" Type a name ");
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String ans= "June";
	String denzel ="Anything";
	String karman ="Boring";
	String Daniel = "I dont know";
	if(ask.equals("June")){
		JOptionPane.showMessageDialog(null," writing recipes");
	
	}
	else if(ask.equals("denzel")){ 
			JOptionPane.showMessageDialog(null,denzel);	
		
	}
	else if(ask.equals("karman")){ 
		JOptionPane.showMessageDialog(null,karman);	
	
}
	else if(ask.equals("Daniel")){ 
		JOptionPane.showMessageDialog(null,Daniel);	
	
}
	else{JOptionPane.showMessageDialog(null, " I dont know who is that person "+ ans);
		
	}
	
	
	
	
	
		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}

