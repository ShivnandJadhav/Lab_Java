
public class IntegerType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int intValue = 10;
       
        
        float floatValue = (float) intValue;
        System.out.println("Integer to Float: " + floatValue);
        
        double doubleValue = (double) intValue;
        System.out.println("Integer to Double: " + doubleValue);
        
        short shortValue = (short) intValue;
        System.out.println("Integer to Short: " + shortValue);
        
        byte byteValue = (byte) intValue;
        System.out.println("Integer to Byte: " + byteValue);
        
        long longValue = (long) intValue;
        System.out.println("Integer to Long: " + longValue);
        
       
        float floatValue2 = 3.23456f;
        double doubleValue2 = 3.45678114;
        
        
        
        int intValue2 = (int) floatValue2;
        System.out.println("Float to Integer: " + intValue2);
        
        long longValue2 = (long) floatValue2;
        System.out.println("Float to Long: " + longValue2);
        
        int intValue3 = (int) doubleValue2;
        System.out.println("Double to Integer: " + intValue3);
        
        long longValue3 = (long) doubleValue2;
        System.out.println("Double to Long: " + longValue3);
    }
}

	


