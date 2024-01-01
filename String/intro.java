package String;

import java.util.Map;
import java.util.Scanner;
import java.util.SimpleTimeZone;
//        charAt()	Returns the character at the specified index (position)	char
//        codePointAt()	Returns the Unicode of the character at the specified index	int
//        codePointBefore()	Returns the Unicode of the character before the specified index	int
//        codePointCount()	Returns the number of Unicode values found in a string.	int
//        compareTo()	Compares two strings lexicographically	int
//        compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	int
//        concat()	Appends a string to the end of another string	String
//        contains()	Checks whether a string contains a sequence of characters	boolean
//        contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
//        copyValueOf()	Returns a String that represents the characters of the character array	String
//        endsWith()	Checks whether a string ends with the specified character(s)	boolean
//        equals()	Compares two strings. Returns true if the strings are equal, and false if not	boolean
//        equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
//        format()	Returns a formatted string using the specified locale, format string, and arguments	String
//        getBytes()	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array	byte[]
//        getChars()	Copies characters from a string to an array of chars	void
//        hashCode()	Returns the hash code of a string	int
//        indexOf()	Returns the position of the first found occurrence of specified characters in a string	int
//        intern()	Returns the canonical representation for the string object	String
//        isEmpty()	Checks whether a string is empty or not	boolean
//        lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	int
//        length()	Returns the length of a specified string	int
//        matches()	Searches a string for a match against a regular expression, and returns the matches	boolean
//        offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
//        regionMatches()	Tests if two string regions are equal	boolean
//        replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	String
//        replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
//        replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
//        split()	Splits a string into an array of substrings	String[]
//        startsWith()	Checks whether a string starts with specified characters	boolean
//        subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
//        substring()	Returns a new string which is the substring of a specified string	String
//        toCharArray()	Converts this string to a new character array	char[]
//        toLowerCase()	Converts a string to lower case letters	String
//        toString()	Returns the value of a String object	String
//        toUpperCase()	Converts a string to upper case letters	String
//        trim()	Removes whitespace from both ends of a string	String
//        valueOf()	Returns the string representation of the specified value	String
public class intro {
    public static void main(String[] args) {
        int []num={97 ,-27, 2 ,-34 ,61 ,-39};
        System.out.println(findTriplets(num,6));
    }
    public static boolean findTriplets(int arr[] , int n)
    {
        int k=0;
        int slide=3;
        int sum=0;
        int counter=0;
        for  (int i=0;i<n;i++){
            if(k>=slide){
                if(sum==0){
                    return true;
                }
                sum=sum-arr[counter]+arr[i];
                counter++;
            }
            else{
                sum=sum+arr[i];
                k++;
            }

        }
        if(sum==0){
            return  true;
        }
        return false;

//        Scanner sc=new Scanner(System.in)
//        String str = "Hello World";
//        String substring = str.substring(2); // substring is "World"
//        System.out.println(substring);

//        toUpperCase()
//        toLowerCase()
//        replace(CharSequence target, CharSequence replacement)
//        split(String regex)
//
//        String str="Hello world";
//        newstr=str.replace("Hello","Hyy");
//        String []newstr  =str.split(" ");
//        System.out.println(newstr);
//        for ( int i=0;i<newstr.length;i++){
//            System.out.println(newstr[i]);
//        }
//        System.out.println(str);
//        System.out.println(newstr);
//        str.toUpperCase();
//        String newstr;
//        System.out.println(str);
//       newstr= str.toUpperCase()
//
//        newstr=str.toLowerCase();
//        System.out.println(newstr);
//        System.out.println(newstr);
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        int last=str.length()-1;
//        int count=0;
//        for (int i=0;i<str.length()/2;i++){
//            if(str.charAt(i)!=str.charAt(last)){
//                System.out.println("String is not a Palindrome String");
//                count++;
//                break;
//            }
//            last--;
//        }
//        if(count==0){
//            System.out.println("Palindrome");
//        }

    }
}
