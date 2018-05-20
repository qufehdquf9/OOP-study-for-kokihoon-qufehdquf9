package membermanager;

import java.util.Scanner;

public class MemberManger {


    public void run() {
        Scanner input_num = new Scanner(System.in);
        int num =0;
        while(true) {
            if(num == 0){System.out.println("회원 관리 시스템");}
            else if(num == 1){ System.out.println("회원 등록");}
            else if(num == 2){ System.out.println("회원 검색");}
            else if(num == 3){ System.out.println("회원 삭제");}
            else if(num == 4){ System.out.println("종료");break;}
            else System.out.println("1~4 만 입력해주세요.");

            System.out.println("---------------------------------------------");
            System.out.println("1.회원 등록");
            System.out.println("2.회원 검색");
            System.out.println("3.회원 삭제");
            System.out.println("4.종료");
            System.out.println("---------------------------------------------");
            System.out.print("숫자를 입력하세요:");
            num = Integer.parseInt(input_num.next());
        }
    }
}
