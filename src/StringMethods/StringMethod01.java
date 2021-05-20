package StringMethods;

public class StringMethod01 {
    public static void main(String[] args) {

       /*
       1) length() ==> to get the number of characters in a String
       return int
       2)equals() ==> to check if two String are same or not
       return boolean
       3)toUpperCase() ==> to convert all characters ti upper case in a String
       return String
       4)toLowerCase ==> to convert all characters to lower case in String
       return String
       5)contains() ==> to check if a specific character exist in a String
       return boolean
       6)equalsIgnoreCase() ==> to check if twi String are same with ignoring cases
       return boolean
       7)charAt() ==> to get a character from String by u=sing index
       return char
         */
        String name = "Melih";
        System.out.println(name.length()); //5

        String name2 = "melih";
        System.out.println(name.equals(name2)); //false
        System.out.println(name2.toUpperCase()); //MELIH
        System.out.println(name.toLowerCase()); //melih
        System.out.println(name.contains("el")); //true
        System.out.println(name.contains("ayyildiz")); //false
        System.out.println(name.equalsIgnoreCase(name2)); //true
        System.out.println(name.charAt(0)); //M
  //8) replace() ==> to change the character/s in a String
        //return String (updated) degistirlen
        String str = "Trabzonspor, Sampiyon 2010";
        System.out.println(str.replace("o","q"));//Trabzqnspqr, Sampiyqn 2010
        System.out.println(str);//Trabzonspor, Sampiyon 2010
        //if you do not make assigment , orginal String does not chenage
      //  str= str.replace("o","q");
      //  System.out.println(str);//Trabzqnspqr, Sampiyqn 2010
     // in replace() we can use both char and String as parameter
        System.out.println(str.replace("o","q"));//Trabzqnspqr, Sampiyqn 2010

     //in replace() we can us e more than one character as parameter
        System.out.println(str.replace("Trabzonspor","Besiktas"));// Besiktas, Sampiyon 20

        System.out.println(str.replace("Trabzonspor","?"));
      //to delete something in a String you can use as below
        System.out.println(str.replace("o",""));

        //9)replaceAll() ==> makes the same thing with replace()
                           //there are 2 differences between them
        //1) replaceAll() does not accept char as parameter
        //2) replaceAll() accept "regex" as parameter but replace() does not
        String str1 = "Easy, Java is Easy";
       // System.out.println(str1.replaceAll('E','B'));
        //do not use replaceAll() above situation

        //regular expression ==> regex
        String m = "Easy, 123 */?#";

        // ==> \\w means  a->z and A->Z and 0->9 _
        System.out.println(m.replaceAll("\\w", "*")); //****, *** */?#

        // ==> \\W means characters except a->z A->Z 0->9 _
        System.out.println(m.replaceAll("\\W","*")); //Easy**123*****

        // ==> \\d means 0->9
        System.out.println(m.replaceAll("\\d","*")); //Easy, *** */?#
        // ==> \\D means except 0->9
        System.out.println(m.replaceAll("\\D","*")); //******123*****

        // ==> \\s is for white space

        //startWith() ==> to check initial
        // return boolean
        String str4 = "Thursday, night, plans    ";
        System.out.println(str4.startsWith("T"));//true
        System.out.println(str4.startsWith("A"));//false
        //if you want to check specific character with specific index, you can
        //use startWith() like following

        System.out.println(str4.startsWith("r",3));//true
        System.out.println(str4.startsWith("day",5));//true
//endsWith() ==> determines whether a string ends with  a specific characther/s
        //return boolean
        System.out.println(str4.endsWith("s"));//true
        System.out.println(str4.endsWith("plans"));//true
        System.out.println(str4.endsWith("r"));//false

        //substring() ==> exract a part of a string
        //retuns String
//substring(a); ==> a means starting index and this method will return whole text starting with a index
        System.out.println(str4.substring(9));//night plans
//substring(a,b) => a starting index and inclusive b ending index and exclusive
        System.out.println(str4.substring(0,8));//Thursday

        //trim() ==> is used to delete space/s character from the begining and ending of a String
        System.out.println(str4);
        System.out.println(str4.trim());//Thursdaynightplans

        //split() ==>
        String[] arr = str4.split(", ",3);
        for (int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
