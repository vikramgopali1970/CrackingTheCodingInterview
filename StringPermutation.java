package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public List<String> getPermutation(String str){
        List<String> perms = new ArrayList<>();
        getPerms("",str,perms);
        return perms;
    }

    private void getPerms(String prefix, String suffix, List<String> perms){
        if(suffix.length() == 1){
            System.out.println(prefix+suffix);
        }else{
            for(int i=0;i<suffix.length();i++){
                getPerms(prefix+suffix.charAt(i),suffix.substring(0,i)+suffix.substring(i+1),perms);
            }
        }
    }
}
