package words;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class book {
	//public static String[] Vernacular_Verbs;
	static String[] Vernacular_Verbs;
	static String[] Vernacular_Nouns;
	static String[] Vernacular_adjectives;
	static String[] Vernacular_Adverbs;
	static String[] Vernacular_Determiners;
public static void getvernacular(String[] body){
	Vernacular_Verbs[0]="hey";
	for(int i=0; i<body.length; i++){
		if(words.Types.gettype((body[i]))=="noun"){Vernacular_Nouns[Vernacular_Verbs.length+1]=body[i];}
		if(words.Types.gettype((body[i]))=="verb"){Vernacular_Verbs[Vernacular_Verbs.length+1]=body[i];}
		if(words.Types.gettype((body[i]))=="adjective"){Vernacular_Verbs[Vernacular_adjectives.length+1]=body[i];}
		if(words.Types.gettype((body[i]))=="determiner"){Vernacular_Determiners[Vernacular_Determiners.length+1]=body[i];}
		if(words.Types.gettype((body[i]))=="adverb"){Vernacular_Adverbs[Vernacular_Adverbs.length+1]=body[i];}
		System.out.println(Vernacular_Verbs[1]);
	}
	
	
}
public static int pos(String pos){
	int ret=0;

	//if(pos==""){ret=0;}
	return 0;
}
public static void getverbs(String body) throws FileNotFoundException, UnsupportedEncodingException{
	PrintWriter verbs = new PrintWriter("verbs.txt", "UTF-8");
	PrintWriter nouns = new PrintWriter("nouns.txt", "UTF-8");
	PrintWriter adjectives = new PrintWriter("adjectives.txt", "UTF-8");
	PrintWriter adverbs = new PrintWriter("adverbs.txt", "UTF-8");
	PrintWriter determiners = new PrintWriter("determiners.txt", "UTF-8");
	PrintWriter prepositions = new PrintWriter("preps.txt", "UTF-8");
	String[] allwords = body.split(" ");
	for(int i=0; i<allwords.length;i++){
	String currentwordpos = words.Types.gettype(allwords[i]);
	System.out.println(currentwordpos+" "+"\""+allwords[i]+"\",");
	

	}
	
	prepositions.close();
	nouns.close();
	verbs.close();
	adjectives.close();
	adverbs.close();
	determiners.close();
}
public static void solve(String nplus, int randsamples) throws IOException{
	String everything = "";
	BufferedReader br = new BufferedReader(new FileReader("/Users/null/Documents/workspace/Words/src/words/Words.txt"));
	String line;
	while ((line = br.readLine()) != null) {
	everything = everything+""+line;
	}
	br.close();
	//System.out.println(everything);
	String[] sentances= everything.replaceAll("[^\\x20-\\x7e]", "").trim().split("[\\.\\!\\?]");
	for(int fg =0; fg>sentances.length;fg++){
		sentances[fg]=sentances[fg].replaceAll("[^\\x20-\\x7e]", "");;
	}
	System.out.println(sentances[30]);
	String[] wrds = sentances[30].split(" ");
	getvernacular(sentances);
	//for(int f=0;f<wrds.length;f++){
		//System.out.println(words.Types.gettype(wrds[f].trim().replace(" ", "")));
	//}
	
}
}


