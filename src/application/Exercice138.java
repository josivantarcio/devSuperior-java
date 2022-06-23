package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Calendar;

import entities.Comment;
import entities.Post;

public class Exercice138 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome");
		Comment c3 = new Comment("Good Night");
		Comment c4 = new Comment("May the force be with you");
		
		Post post1 = new Post("Traveling to Canada", 
				"I'm going to visit this wonderfull country", 
				12, 
				sdf.parse("21/06/2012 13:05:04"));
		
		post1.addComment(c1);
		post1.addComment(c2);
		
		
		Post post2 = new Post("Good night guys","See you tomorrow",5,sdf.parse("27/07/2022 12:14:15"));
		post2.addComment(c3);
		post2.addComment(c4);
		
		System.out.println(post1);
		System.out.println(post2);
		
	}
}
