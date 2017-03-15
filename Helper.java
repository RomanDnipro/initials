/**
 * Created by Роман on 14.03.2017.
 */

import java.util.Scanner;

import static java.lang.Character.isLowerCase;

public class Helper {

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    /**
     * функция проверки буквы на регистр(верхний/нижний)
     * и печать варианта в верхнем регистре
     * принимает строку, и порядковый номер буквы в ней
     **/
    public static void check_register_and_print(String s){
        if(isLowerCase(s.charAt(0))){
            System.out.println((char) (s.charAt(0) - 32));
        }
        else{
            System.out.println(Character.toString(s.charAt(0)));
        }
    }
}
