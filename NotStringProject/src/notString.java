public class notString {
    public static void main(String[] args){
        System.out.println("notString(candy)");
        System.out.println("notString(X)");
        System.out.println("notString(not bad)");
    }
    public  String notString(String str) {
        if (str.startsith("not")) {
            return str;
        }
        else
        {
            return "not"+str;
        }
    }
}