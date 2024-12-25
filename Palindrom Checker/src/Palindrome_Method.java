import java.util.ArrayList;
import java.util.List;

public class Palindrome_Method {



    public void main_method(String value){


        int nums = value.length() - 1;

        List<String> strings = new ArrayList<>();



        for (int i = 0; i < value.length();i++){

            strings.add(i, String.valueOf(value.charAt(nums)));
            nums--;

        }

        String answer = String.join("",strings);

        if (value.equals(answer)){
            System.out.println("Yes, " + value + " is Palindrome.");
        }else{
            System.out.println("No, " + value + " is not Palindrome." );
        }



    }



}



