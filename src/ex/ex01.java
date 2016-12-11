﻿package ex;
/*
 * Topic: ISBN(International Standard Book Number) 是一種世界共通的書籍編碼方法

 * ，世界上任 何一本書籍之出版，皆有著唯一的一組 ISBN 碼。
 * 此碼由十個位數組成，每一位數可 以為 0~9 的任何一個數字，
 * 或者為 X ，代表此位數為 10 。其判斷方法如下，首先， 
 * 將此 ISBN 碼的十個位數分開，自左而右依次為第一位數，
 * 第二位數至第十位數，接 著進行第一次的累加，
 * 使得第二位數成為第一位數到第二位數的和，
 * 第三位數為第一 位數到第三位數的累加和，
 * 第十位數為第一位數到第十位數的累加和;進行完第一次 的累加和後，
 * 接著再依照相同之方法進行第二次的累加動作，
 * 我們稱此時最後所求得 之累加和為此 ISBN 碼之識別碼，
 * 倘若此識別碼為 11 的倍數，則此 ISBN 碼為合法 的。
 * 例如，若輸入之 ISBN 碼為 0 1 3 1 6 2 9 5 9 X ，
 * 則經由計算可得其識別碼為 165 ，乃是 11 之倍數，
 * 故此為一合法之 ISBN 碼。輸入一串 ISBN 碼
 * ，以空格隔開。
 * Date: 2016/12/05
 * Author: 105021059  王俊鑌
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	int []data =new int [10] ;
	int []bata =new int [10] ;
	int []a =new int [10] ;
	int i;
	int M;
	int sum=0;
	
	
	String str = scn.next();
	str.replaceAll(" ", "");
	if(str.length() == 10){
		for( i = 0 ; i < 10 ; i++){
			char c = str.charAt(i);
			data[i] =fun(c) ;
		}
	}
		
	/*for( i=0;i<data.length;i++){
		
		
		
             data[i]=
             if(data[i]==X){
            	 
            	 
             }
	}*/
	
	/*for( i=0;i<data.length;i++){
	System.out.print(data[i]+" ");
	}
	System.out.println();*/
	bata[0]=data[0];
	a[0]=data[0];
	for(i=1;i<10;i++){
		
		bata[i]=bata[i-1]+data[i];
	}
/*	for(i=0;i<10;i++){
	System.out.print(bata[i]+" ");
	}
	System.out.println();*/
 for(i=1;i<10;i++){
		
		a[i]=a[i-1]+bata[i];
	}
 /*for(i=0;i<10;i++){
		System.out.print(a[i]+" ");
		}*/
 
 System.out.println();
	if((a[9]%11)==0){
		System.out.println("合法ISBN碼");
		
	}else{
		System.out.println("非法ISBN碼");
	}
 
	}
	public static int fun(char a){
		int x = 0;
		switch(a){
		case'1':
			x = 1;
			break;
		case'2':
			x = 2;
			break;
		case'3':
			x = 3;
			break;
		case'4':
			x = 4;
			break;
		case'5':
			x = 5;
			break;
		case'6':
			x = 6;
			break;
		case'7':
			x = 7;
			break;
		case'8':
			x = 8;
			break;
		case'9':
			x = 9;
			break;
		case'x':
			x = 10;
			break;
		case'X':
			x = 10;
			break;
		}
		return x;
		}
	}
	
