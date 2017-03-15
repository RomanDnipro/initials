import java.util.Scanner;

import static java.lang.Character.isLowerCase;

public class Main {

    public static void main(String[] args) {
        for (String i : args){
            if(isLowerCase(i.charAt(0))){
                System.out.println((char) (i.charAt(0) - 32));
            }
            else{
                System.out.println(Character.toString(i.charAt(0)));
            }
        }
    }
}



//        String s = Helper.getString();
//        System.out.println(s);


//        Scanner sc = new Scanner(System.in);
//        String n = sc.next();
//        System.out.println(n);
//    }
//}








//        String s = Helper.getString();
//
//        /**
//         * первый символ строки, по условию,
//         * является первой буквой имени
//         */
//        //Helper.check_register_and_print(s, 0);
//        for(int i = 1; i < args.length; i++){
//            Helper.check_register_and_print(args[i]);
////            if(s.charAt(i) == '\n'){ //является ли символ пробелом
////                Helper.check_register_and_print(s, i+1); //если да,
//            }//то следующий символ- первая буква имени(фамилии)
//        }
//        //System.out.println();
//
//    //}
//}
//
//
////        if('a' == 98){
////            System.out.println("it is true");
////        }else{
////            System.out.println("it is false");
////        }



//        for(int i = 0; i < args.length; i++){
//            System.out.println(args[i]);
//        }