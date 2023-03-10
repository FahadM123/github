public class MonkeyTroubleClass {
    public static void main(String[] args){
     System.out.println(monkeyTrouble (true,true));
     System.out.println(monkeyTrouble(false,false));
     System.out.println(monkeyTrouble(true,false));
     System.out.println(monkeyTrouble(false,true));
    }
    public static boolean monkeyTrouble(boolean asmile, boolean bsmile) {
        if (asmile == true && bsmile == true) {
            return true;
        } else if (asmile == false && bsmile == false) {
            return false;
        }






