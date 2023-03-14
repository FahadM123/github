public class parrotTrouble {
    public static void main(String []args){
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
}
    public static boolean parrotTrouble(boolean talking, int hour){
        if (talking == true) {
            if (hour < 7 || hour > 20) {
                return true;
            } else {
                return false;
            }
        }
                else{
                    return false;
                }
        }
    }



