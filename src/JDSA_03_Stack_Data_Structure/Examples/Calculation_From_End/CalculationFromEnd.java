package JDSA_03_Stack_Data_Structure.Examples.Calculation_From_End;

public class CalculationFromEnd {
    public static void main(String[] args) {
        System.out.println("(4*2)/(5-3)=" + evaluate("42*53-/")); // 4*2/(5-3)=4
    }

    static int evaluate(String expr) {
        Stack s = new Stack(); // boş bir yığıt yarat - create an empty stack
        char c;
        int i, o1, o2, r = 0;

        for (i = 0; i < expr.length(); i++) { // ifadeyi tara - scan the expression
            c = expr.charAt(i); // karakteri al - take the character
            if (Character.isDigit(c)) // eğer rakamsa - if it is a number
                s.push(Character.getNumericValue(c)); // eğer rakamsa, sayıyı yığıta at - if it is a number, put the number on the stack
            else { // operatör ise - if it is an operator
                o2 = s.pop(); // yığıttan bir sayı al - take a number from the stack
                o1 = s.pop(); // yığıttan bir sayı daha al - take another number from the stack
                switch (c) { // operatöre göre işlem yap - do the operation according to the operator
                    case '+':
                        r = o1 + o2;
                        break;
                    case '-':
                        r = o1 - o2;
                        break;
                    case '*':
                        r = o1 * o2;
                        break;
                    case '/':
                        r = o1 / o2;
                        break;
                }
                s.push(r); // sonucu yığıta at - put the result on the stack
            }  // else
        }   // for
        r = s.pop(); // yığıttan sonucu al - take the result from the stack
        return r; // sonucu döndür - return the result
    }
}