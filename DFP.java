package euler30java;

import java.util.ArrayList;
import java.util.List;

/**
 * Digit Fifth Powers
 * @author gabriel
 */
public class DFP {

    int lim = 5 * (int)Math.pow(5,9);
    List<Integer> list = new ArrayList<Integer>();
    
    DFP(){
        calculate();
        System.out.println(sumList());
    }
    
    public void calculate(){
        for(int i = 2; i < lim; ++i){
            int a = eulerNumbers(i);
            if(a > 0){
                list.add(a);
            }
        }
    }

    public int eulerNumbers(int a){
        int original = a;
        int sum = 0;
        do {
            sum += (int)Math.pow(a % 10,5);
            a /= 10;
        }while(a > 0);
        if(sum == original)
            return sum;
        
        return 0;
    }
    
    public void displayList(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
    public int sumList(){
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
           sum+=list.get(i);
        }
        return sum;
    }
    
}
