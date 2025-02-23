package week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Practice {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        Integer x1 = 40;
        Integer x2 = 40;
        if (x1 == x2) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        int x = 100;
        long y = x;
        float z = y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter an double: ");
        double f = 5.75;


        System.out.println("You entered: " + f);
        StringBuffer binaryFormat = new StringBuffer();
        int wholeNumber = (int) f;
        double decimal = f - wholeNumber;

        while (wholeNumber != 0) {
            int quotient = wholeNumber / 2;
            int remainder = wholeNumber % 2;
            binaryFormat.append(remainder);
            wholeNumber = quotient;
        }
        binaryFormat.reverse();
        binaryFormat.append(".");
        while (decimal != 0) {
            double value = decimal * 2;
            int intValue = (int)value;
            binaryFormat.append(intValue);
            decimal = value - intValue;
        }

        System.out.format("Whole Number binary format is %f\n " , Double.parseDouble(binaryFormat.toString()));



        System.out.println("C:\\xyz\\abc.txt");

        int a = 3, b = 6;
        int c = 1;
        int d = 5;
        System.out.println(a & b);  //Bitwise AND
        System.out.println(a | b);  //Bitwise OR
        System.out.println(a ^ b);  //Bitwise XOR
        System.out.println(~c);     //Bitwise NOT
        System.out.println(~d);
        System.out.println(c << 1);  //Left Shift => multiplication of 2
        System.out.println(a << 30);
        System.out.println(-1 << 1);
        System.out.println(33 >> 1); //Right Shift => division by 2
        System.out.println(-33 >> 1);

    }
}