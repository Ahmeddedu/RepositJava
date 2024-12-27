package ClassWork.ClassWork5.Osnova;

public class Main {
    public static void main(String... args) {
        // 1+2+3+4+5....+n
        System.out.println(sum(5));
    }

    public static  int sum(int i){
        // sum(5)
        // return 5 + sum(4)
        //               4 + sum(3)
        //                     3 + sum(2)
        //                           2 + sum(1)
        //                                 1 + sum(0)
        //                                       0
        //                                    1
        //                              3
        //                        6
        //                  10
        //           15
        if (i == 0){
            return 0;
        }
        return i + sum(i-1);
    }
}
