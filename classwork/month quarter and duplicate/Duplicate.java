public class Duplicate{
	public static int theDuplicateOf(String userInputt){
	
	String userInput = userInputt.toLowerCase();
	int duplicate = 0;
	
	for(int index = 0; index < userInput.length(); index++){
		char current = userInput.charAt(index);
		
		boolean ifFound = false;
		
		for(int indexx = 0; indexx < index; indexx++){
			if(userInput.charAt(indexx)== current){
			ifFound = true;
			break;
			}
		}
		
		 if (ifFound == true) {
                continue;
            }
		
		int count = 0;
		for(int conuterIndex = 0;conuterIndex < userInput.length(); conuterIndex++){
			if(userInput.charAt(conuterIndex)== current){
				count++;
			}
		}
		
		if (count > 1){
			duplicate++;
		}
	}
	
	return duplicate;
	}



}