public class syntaxLecture {
    public static void main(String[] args) {
        //declare variable without initializing

        boolean potato = true;
        byte smallNumber;
        short something;
        int number;
        long bigNumber;



        smallNumber = 12;
        System.out.println(smallNumber);

        bigNumber = 9000000000000L; //you have to put an L at the end of longs

        float imafloat = 2.3434F; //you have to write an F at the end of Floats
        //games like using floats, cause it's easier on the graphics card
        double imadouble = 9.01233456546543;
        System.out.println(imadouble);
        imafloat = (float) imadouble;
        //casting = converting a value into another data type
        System.out.println(imafloat);


    }
}
