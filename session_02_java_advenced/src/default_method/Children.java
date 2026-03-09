package default_method;

import java.util.Scanner;

public class Children implements ParentA,ParentB{


    @Override
    public void skill() {
        // mục tiêu: khi người dùng nhập vào speak --> parentA
        // bảo vệ bản thân --> parentB
        Scanner sc = new Scanner(System.in);
        String need = sc.nextLine();
        if(need.equals("speak")) {
            // parentA
            ParentA.super.skill();
        }
        if(need.equals("brave")) {
            // parentB
            ParentB.super.skill();
        }
    }
}
