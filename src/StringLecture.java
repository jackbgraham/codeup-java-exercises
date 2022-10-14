public class StringLecture {
    public static void main(String[] args) {

        //we messing with strings and the concept of immutability
        String javier = "Javier";

        System.out.println(Integer.toHexString((System.identityHashCode(javier))));
        //displays a representation of a memory address on this machine
        String alsoJavier = "Javier";

        System.out.println(Integer.toHexString((System.identityHashCode(alsoJavier))));

        javier = javier + "Ruedas";
        alsoJavier = javier;

        System.out.println(javier);
        System.out.println(Integer.toHexString((System.identityHashCode(javier))));
        System.out.println(alsoJavier);
        System.out.println(Integer.toHexString((System.identityHashCode(alsoJavier))));

        //strings with the same memory value, point to the same address in the string pool

        String letsTryThis = "Javier";
        System.out.println(Integer.toHexString((System.identityHashCode(letsTryThis))));
        //strings live in a special area called the "string pool"
        //the heap is a memory trash pile

        String theOriginalJavier = "Javier";

        System.out.println(letsTryThis == theOriginalJavier);
        //this outputs true


    }
}
