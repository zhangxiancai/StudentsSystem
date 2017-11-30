package edu.wit.ui;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import edu.wit.entity.Student;
import edu.wit.services.StudentService;

public class StuMIS {

	public static StudentService stuser = new StudentService();
	public static  Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws Exception {



		Menu.showLoginMenu();
		switch (input.nextInt()) {
		case 2:
			System.out.println("请输入用户名:");
			int stuNo = input.nextInt();
			System.out.println("请输入密码:");
			String stuPwd = input.next();
			Student stu = new Student();
			stu.setStuNo(stuNo);
			stu.setStuPwd(stuPwd);
			Student loginStu = stuser.login(stu);
			if (loginStu != null) {
				System.out.println(loginStu.getStuName() + "，欢迎你进入系统！");
				Menu.showMainMenu();
				studentMis(stu);
				
			} else {
				System.out.println("登录失败！");
			}
			break;

		}

	}
	private static void studentMis(Student stu)throws Exception
	{
		switch (input.nextInt()) {
		case 1:
			System.out.println("输入修改的密码：");
			stu.setStuPwd(input.next());
			System.out.println("输入修改的电话：");
			stu.setPhone(input.next());
			int a=stuser.updateStudentInfo(stu);
			if(a==1)
			{
				System.out.println("修改成功！");	
			}
			else{
				System.out.println("修改失败！");
				}
			break;
		case 3:
			List<Map<String,Object>> lis=stuser.selectScore(stu);
			System.out.println("成绩信息为：");
			Menu.showListHashMap(lis);
		}
		
	}
}
