public class BooleanExampleClass {
    public static void main (String [] args){
canfly(true);
canfly(false);
    }
    public static void canfly (boolean isBird) {
        if (isBird == true) {
            System.out.println("Can Fly");
        } else {
            System.out.println("Cannot Fly");
        }

        }

    }