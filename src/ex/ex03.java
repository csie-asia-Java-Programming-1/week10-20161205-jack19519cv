﻿package ex;
/*
 * Topic: 請設計 Person 類別 (姓名,性別,身高,體重)，使用者可以新增個人資料，每新增一筆就會列出目前的資料串有哪些人，而這些資料請用插入排序法依每一個人的 BMI 值由大到小排序。

 * Date: 2016/12/05
 * Author: 105021059  王俊鑌
 */
import java.util.ArrayList;

import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	ArrayList<Integer>dataList=new
			ArrayList<Integer>();
	String str = "Y";
	int i=0,val=0;
	boolean flag = false;
	while(str.equals("N")||str.equals("n")){
		System.out.print("input a value:");
		val =scn.nextInt();
		if(dataList.size()==0){
			dataList.add(val);
			
		}else if (dataList.size()==1){
			if(dataList.get(i)>val){
				dataList.add(val);
			}else{
				dataList.add( 0 ,val );//TODO do something
			}
				
			}else{flag=true; i=0;
			while(flag&&i<dataList.size()-1){
					if(i==0&&dataList.get(0)<val){
						dataList.add(0,val);
						flag=false;
					}
			
			}
		}
		 else{                                                 //TODO THIS OR NOT
				if(dataList.get(i)>val&&dataList.get(i+1)<=val){
		flag=false;
		dataList.add(i+1,val);
				}else{
					i++;
				}
				
				
	
			}
			
		}     
		
		
	}

	}

private static void showdata(ArrayList list){
	int size=list.size();
	for(int i=0;i<size;i++){
		System.out.print(list.get(i)+"\t");
	}
	System.out.println();
}


