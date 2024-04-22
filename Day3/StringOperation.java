//Task 9: String Operations
//Write a method that takes two strings, concatenates them, reverses the result, 
//and then extracts the middle substring of the given length. Ensure your method handles edge cases, 
//such as an empty string or a substring length larger than the concatenated string.
package Day3;

public class StringOperation {
	
	public static String extractSubstring(String str1, String str2, int len) {
		String concate = str1 + str2;
		
		String reversed = new StringBuilder(concate).reverse().toString();
        int middleIndex = reversed.length() / 2 - len / 2;
        
        if (concate.isEmpty() || len > concate.length()) {
            return "Invalid input";
        }

        // Extract the middle substring of the given length
        String middleSubstring = reversed.substring(middleIndex, middleIndex + len);

        return middleSubstring;

		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Surya";
        String str2 = "Maurya";
        int length = 4;

        System.out.println(extractSubstring(str1, str2, length));
       

	}

}
