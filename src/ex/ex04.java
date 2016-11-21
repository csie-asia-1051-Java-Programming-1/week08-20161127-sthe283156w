package ex;
import java.util.Scanner;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int v2 = scn.nextInt();
	}
		public float compute(float v1,float v2,char op){
		float result = 0.0f;
		switch(op){
	    case'+':
			result = v1 + v2;
			break;
		case'-':
			result = v1 - v2;
			break;
		case'*':
			result = v1 * v2;
			break;
		case'/':
			result = v1 / v2;
			break;
		case'^':
			result = v1 ^2;
			break;
		case'√':
			result = v1 √;
			break;
			
		}

	}

}

	}

}
