package pac;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        int year;//接收输入的年份
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();
        if (year > -3200 && year < 3200) {
			if (year < 0) {
	            if (year%4==1||year%400==1){
	                System.out.println("公元前" + year + "是闰年");
	            }else {
	                System.out.println("公元前" + year + "不是闰年");
	            }
			}else {
	            if(year%4==0&&year%100!=0||year%400==0){
	                System.out.println("公元" + year + "是闰年");
	            }else {
	                System.out.println("公元" + year + "不是闰年");
	            }

			}
		}else {
			System.out.println("只能输入-3200到3200之内的数字");
		}
    }
}
