package words;

public class Clauses {
	//structures
public static String[] commondepstructure = {"prep","determiner","noun"};
public static String[] ind1 = {"verb","prep","the","noun"};


public static String randomclause(String type){
	String ret = "";
	if(type=="dep"){
		for(int i=0; i<commondepstructure.length; i++){
		      String now = words.Types.randomthing(commondepstructure[i])+" ";
		      ret=ret+now;     
		}
	}
	if(type=="ind1"){
		for(int i=0; i<ind1.length; i++){
		      String now = words.Types.randomthing(ind1[i])+" ";
		      ret=ret+now;     
		}
	}

	return ret;
}

}
