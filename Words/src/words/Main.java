package words;

import java.io.IOException;
//	String[] set = {"fuck your","noun","fuck your","noun","fuck your","noun","and fuck your","adj","ass","noun","bitch, this is America"};
//String[] set = {"prep","the","adj","noun","of the","adj","noun", ""};
	//String[] set = {"prep","the","adj","noun","of the","adj","noun","that","verb","the","adj","noun"};
	//String[] set = {"prep","the","noun"};
public class Main {
	//public static String[] read=null;
	//TODO: make plural and singular nouns seperat.
	public static String buf = "";
	static String fulltext =   "x states that the noun is adverb absolute";
	public static String[] wrds = fulltext.split(" ");
	public static String[] read = fulltext.split(" ");//that is fucked up if you fuck up the lenght
	public static void main(String[] args) throws InterruptedException, IOException {
		for(int i=0;i<wrds.length;i++){
			buf = wrds[i];
			//System.out.print("\""+words.Types.gettype(buf)+"\",");
			read[i]=words.Types.gettype(buf);
		}
	String[] set = {"x states that","the","noun","is","adverb", "low"};
	//String[] set = {"noun","verb",";","because","noun","are","adj"};
	while(true){
	
	for(int i=0; i<set.length; i++){
	      String ret ="";
	      String now = words.Types.randomthing(set[i])+" ";
	      System.out.print(now);
	}
	System.out.println();
	Thread.sleep(500);
}
}
}
			
			 
			 
			 
			 
			 
			 
			 
			


