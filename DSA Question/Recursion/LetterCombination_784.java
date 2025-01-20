import java.util.*;
class LetterCombination_784{
    public static void main(String[] args) {
        String s = "a1buijWHEE56TErt562" ;
        question(s);
    }

    static List<String> out = new ArrayList<>();


    public static void question(String s){
        permu(new StringBuilder(s), 0);
        System.out.println(out);
    }


    public static void permu(StringBuilder sb ,int ind){
        if(ind>=sb.length()){
            out.add(sb.toString());
            return;
        }

        if(!Character.isDigit(sb.charAt(ind))){
            sb.replace(ind,ind+1,String.valueOf(sb.charAt(ind)).toUpperCase());
            permu(sb, ind+1);
            sb.replace(ind,ind+1,String.valueOf(sb.charAt(ind)).toLowerCase());
            permu(sb, ind+1);
        }
        else{
            permu(sb, ind+1);
        }
        return;
    }
}