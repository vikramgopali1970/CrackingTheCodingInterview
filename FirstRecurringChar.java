package CrackingTheCodingInterview;

import java.util.HashSet;

public class FirstRecurringChar {
    public Character getFirstRecurringCharacter(String str){
        if(str.length() == 0){
            return null;
        }
        char[] charArr = str.toCharArray();
        HashSet<Character> set= new HashSet<Character>();

        for(int i=0;i<charArr.length;i++){
            if(set.contains(charArr[i])){
                return charArr[i];
            }else{
                set.add(charArr[i]);
            }
        }
        return null;
    }
}
