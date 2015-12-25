public class reverse
{



public static String reverseString(String original){
	if((null == original) || (original.length() <= 1)){
 		return original;
	}else{
 		return reverseString(original.substring(1)) + original.charAt(0) ;
	}
}


public static void main(String[] args)
{

reverseString("hello");
}

}