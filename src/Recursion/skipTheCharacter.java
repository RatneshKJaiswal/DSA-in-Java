package Recursion;

public class skipTheCharacter {
    public static void main(String[] args) {
        String str = "baccad";
        String strNew = remover(str,"", 0 ,'a');
        System.out.println(strNew);
    }
    public static String remover(String str, String strNew, int i , char c) {
        if(i==str.length()){
            return strNew;
        }
        if(str.charAt(i)!=c){
            return remover(str,strNew+str.charAt(i),i+1,c);
        }
        return remover(str,strNew,i+1,c);
    }
}
