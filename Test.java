
import java.util.Scanner;
/**
��ӡ����ͼ�Σ�
*
**
***
****
*****
*/

public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		// ��������
		for(int i=1;i<=5;i++){
			// ����ÿ�д�ӡ�����ݣ����ٸ�*
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}