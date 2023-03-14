public class frontback {
    public static void main(String[] args){
        System.out.println(frontBack("code"));
    }
    public static String frontBack(String str){
        int k=str.length();
        if(k<=1){
            return str;
        }
        else{
            char str1=str.charAt(0);
            String str2=str.substring(1,k-1);
            char str3=str.charAt(k-1);
            return (str3+str2+str1);
        }
    }
}


