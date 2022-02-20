import java.util.Arrays;
import java.util.ArrayList;

public class StackVector implements IPosfixCalc{
    /**
     * Stack: variable con la que se hace el uso de generics
     */
    StackArrayList<String> stack = new StackArrayList<String>();

    /**
     * @param evaluate evalua la calculadora
     * 
     */

    public int Evaluate(String evaluate){
         int op1 = 0;
         int op2 = 0;
         int result = 0;


         
         String [] strArr = evaluate.split("\\s+");
         ArrayList<String> list_Evaluate = new ArrayList<String>(Arrays.asList(strArr));
         try{
            for (int a = 0; a < list_Evaluate.size(); a++) {
                if ("/*-+".contains(String.valueOf(list_Evaluate.get(a))) == false) {
                  stack.push(String.valueOf(list_Evaluate.get(a)));
                } else {
                  switch (String.valueOf(list_Evaluate.get(a))) {
                        case "+":
                        op1 = Integer.parseInt(stack.pull());
                        op2 = Integer.parseInt(stack.pull());
                        result = op2 + op1;
                        stack.push(String.valueOf(result));  
                        break;

                        case "-":
                        op1 = Integer.parseInt(stack.pull());
                        op2 = Integer.parseInt(stack.pull());
                        result = op2 - op1;
                        stack.push(String.valueOf(result));
                        break;
                    
                        case "*":
                        op1 = Integer.parseInt(stack.pull());
                        op2 = Integer.parseInt(stack.pull());
                        result = op2 * op1;
                        stack.push(String.valueOf(result));
                        break;
                
                        case "/":
                        op1 = Integer.parseInt(stack.pull());
                        op2 = Integer.parseInt(stack.pull());
                        result = op2 / op1;
                        stack.push(String.valueOf(result));
                
                        break;
                        default:
                        break;
                    
                    }
                }
            }    
    }catch (Exception e){
        System.out.println("Error por falta de operadores o #Math error!");
    }
    return result;
    }
}

