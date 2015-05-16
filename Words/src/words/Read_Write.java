package words;

import java.io.IOException;

public class Read_Write {
public static String reword(String text){
	return null;
}
public static String RemoveEndPunctuation(String word){
	return word.replace(".", "").replace("?", "").replace(";", "").replace("!", "");
	
}
public static String structure(String words){
	String ret = "";
	//String[] word = RemoveEndPunctuation(words).split(" ");
	String[] word = (words).split(" ");
	for(int i=0;i<word.length;i++){
		ret=ret+" "+Types.gettype(word[i].replace(" ", ""));
	}	
	return ret;	
}
}
