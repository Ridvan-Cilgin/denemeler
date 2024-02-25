package stringtest;

public class InsertString {
    // Java program to insert a string into another string
// without using any pre-defined method



        // Function to insert string
        public static String insertString(
                String originalString,
                String stringToBeInserted,
                int index)
        {

            // Create a new string
            String newString = originalString.substring(0, index + 1)
                    + stringToBeInserted
                    + originalString.substring(index + 1);

            // return the modified String
            return newString;
        }

        // Driver code
        public static void main(String[] args)
        {

            // Get the Strings
            String originalString = "GeeksGeeks";
            String stringToBeInserted = "For";
            int index = 4;

            System.out.println("Original String: "
                    + originalString);
            System.out.println("String to be inserted: "
                    + stringToBeInserted);
            System.out.println("String to be inserted at index: "
                    + index);

            // Insert the String
            System.out.println("Modified String: "
                    + insertString(originalString,
                    stringToBeInserted,
                    index));
        }
    }

