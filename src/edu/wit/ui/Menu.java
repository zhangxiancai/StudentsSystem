package edu.wit.ui;

import java.util.List;
import java.util.Map;

public class Menu {

	public static void showLoginMenu( ) { 
		System.out.println("=============================");
		System.out.println("1.学生用户注册");
		System.out.println("2.学生用户登录");
		System.out.println("3.退出系统");
		System.out.println("=============================");
		System.out.println("请选择：");
	}
	
	public static void showMainMenu( ) {
		System.out.println("=============================");
		System.out.println("1.修改个人信息");
		System.out.println("2.查询专业课程");
		System.out.println("3.查询个人成绩");
		System.out.println("=============================");
		System.out.println("请选择：");
	}
	
	public static void showListHashMap(List<Map<String,Object>> lis ) {
		
		System.out.println("姓名\t考试成绩\t课程名称\t考试时间");
		for (int i = 0; i < lis.size(); i++) {
			
				System.out.print(lis.get(i).get("姓名")+"\t");
				System.out.print(lis.get(i).get("考试成绩")+"\t");
				System.out.print(lis.get(i).get("课程名称")+"\t");
				System.out.println(lis.get(i).get("考试时间"));
			}
		}
		
		
	
	}

