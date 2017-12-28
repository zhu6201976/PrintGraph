
import java.util.Scanner;
/**
打印如下图形：
*
**
***
****
*****
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// 控制行数
		for(int i=1;i<=5;i++){
			// 控制每行打印的内容，多少个*
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}