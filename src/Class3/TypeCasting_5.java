package Class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte)number;
        float f=10.5f;
        int num=(int)f;
        System.out.println(shorterNumber);
        System.out.println(num);
        /*
        byte
        short
        int
        long
        float
        double  from smallest to largets
        if we try to store the contents from the smaller box to a larger box java does not complain because
        the content can easily fit inside the larger box but if we try the other way around we get an error and we need
        to type cast it to store the contents
     */
        byte b=10;
        int number2=b;
        short c=(short)number2;
        System.out.println(b);

        float eggs=12.5f;
        int wholePart=(int)eggs; // type casting we are converting from float to an int (it is simply converting from
        // one data type tp another )
        System.out.println(wholePart);
        System.out.println((char)128516);
        System.out.println((char)98);


    }
}
