package BitManipulation;


public class Binary {

    //Built in Funciton 

    public static void binaryBUilt(int num){
        String binary = Integer.toBinaryString(num);

        System.out.println(binary);
    }

    public static void convert(int num){
        String binary = " ";

        while(num>0){
            binary = (num%2)+binary;
            num = num/2;
        
        }

        System.out.println(binary);
    } 

    public static void decimalbuiltin(String binary){
        int num = Integer.parseInt(binary,2);
        System.out.println(num);

    }

    public static void Decimalconvert(String s){
        int decimal =0;
        int power = 0;

        for(int i = s.length()-1; i>=0; i--){
            int digit = s.charAt(i)-'0';
            decimal +=digit*Math.pow(2,power);
            power++;

        }

        System.out.println("Decimal" +decimal);
    }

    public static void main(String[] args){
        binaryBUilt(23);
        decimalbuiltin("100111");
        convert(345);
        Decimalconvert("100011");
    }
}
