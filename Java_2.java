public class Java_2 {
    public static void main(String[] args) {
        
        System.out.println("JAVA - data types in Java.\n");
        
            // 1 byte / -128 to 127
        Byte myByte = 12;
        System.out.println("myByte = " + myByte);
        System.out.println(Byte.TYPE);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("\n");

            // 2 bytes / -32.768 to 32.767
        Short myShort = 12;
        System.out.println("myShort = " + myShort);
        System.out.println(Short.TYPE);
        System.out.println(Short.BYTES);
        System.out.println(Short.SIZE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println("\n");

            // 4 bytes / -2.147.183.648 to 2.147.483.647
        Integer myInt = 12;
        System.out.println("myInt = " + myInt);
        System.out.println(Integer.TYPE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("\n");
        
            // 8 bytes / -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807
        Long myLong = 12l;
        System.out.println("myLong = " + myLong);
        System.out.println(Long.TYPE);
        System.out.println(Long.BYTES);
        System.out.println(Long.SIZE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println("\n");

            // 4 bytes / 6 decimal digits
        Float myFloat = 12f;
        System.out.println("myFloat = " + myFloat);
        System.out.println(Float.TYPE);
        System.out.println(Float.BYTES);
        System.out.println(Float.SIZE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println("\n");

            // 8 bytes / 15 decimal digits 
        Double myDouble = 12d;
        System.out.println("myDouble = " + myDouble);
        System.out.println(Double.TYPE);
        System.out.println(Double.BYTES);
        System.out.println(Double.SIZE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println("\n");
        
            // 1 bit / true or false
        Boolean myBoolean = true;
        System.out.println("myBoolean = " + myBoolean);
        System.out.println(Boolean.TYPE);
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TRUE);
        System.out.println("\n");
        
            // 2 bytes / single character
        String myString = "f";
        System.out.println("myString = " + myString);
        System.out.println("\n");
        
    }
}
