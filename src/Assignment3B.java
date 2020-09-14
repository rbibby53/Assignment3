import java.util.Scanner;
import static java.lang.System.*;

public class Assignment3B {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        int result = 0,n1 = 0, n2 = 0;

        out.print("Enter the first number: ");
        n1 = input.nextInt();

        out.print("Enter the second number: :");
        n2 = input.nextInt();

        out.print("Enter the operator to apply: ");
        String preop = input.nextLine();
        char op = input.next().charAt(0);

        switch(op){
            case '+':
                result = n1 + n2;
                break;

            case '-':
                result = n1 - n2;
                break;

            case '*':
                result = n1 * n2;
                break;

            case '/':
                result = n1 / n2;
                break;
            case '%':
                result = n1 % n2;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                out.print("Error! operator is not correct");
                break;
        }
        out.print(result);
    }
}

/*
BEGIN MAIN
    INPUT number 1 and assign it n1
    INPUT number 2 and assign in n2
    INPUT operator and assign it op

    SWITCH(op)
        case +:
            result = n1 + n2
            break
        case -:
            result = n1 - n2
            break
        case *:
            result = n1 * n2
            break
        case /
            result = n1 / n2
            break
        case %:
            result = n1 % n2
            break
        default:
            print("Error")
            break
    print(result)
 */