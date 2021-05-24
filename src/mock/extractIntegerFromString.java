package mock;

public class extractIntegerFromString {

	public static void main(String[] args) {
	
   String str= "ind20ia21";
  for(char ch:str.toCharArray()) {
	  
 if(Character.isDigit(ch)){
	System.out.println(ch +""); 
		  
		  
	  }
	  
	  
  }
  
   
	}

}
