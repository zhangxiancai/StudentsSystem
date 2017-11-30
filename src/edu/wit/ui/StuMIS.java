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
			System.out.println("�������û���:");
			int stuNo = input.nextInt();
			System.out.println("����������:");
			String stuPwd = input.next();
			Student stu = new Student();
			stu.setStuNo(stuNo);
			stu.setStuPwd(stuPwd);
			Student loginStu = stuser.login(stu);
			if (loginStu != null) {
				System.out.println(loginStu.getStuName() + "����ӭ�����ϵͳ��");
				Menu.showMainMenu();
				studentMis(stu);
				
			} else {
				System.out.println("��¼ʧ�ܣ�");
			}
			break;

		}

	}
	private static void studentMis(Student stu)throws Exception
	{
		switch (input.nextInt()) {
		case 1:
			System.out.println("�����޸ĵ����룺");
			stu.setStuPwd(input.next());
			System.out.println("�����޸ĵĵ绰��");
			stu.setPhone(input.next());
			int a=stuser.updateStudentInfo(stu);
			if(a==1)
			{
				System.out.println("�޸ĳɹ���");	
			}
			else{
				System.out.println("�޸�ʧ�ܣ�");
				}
			break;
		case 3:
			List<Map<String,Object>> lis=stuser.selectScore(stu);
			System.out.println("�ɼ���ϢΪ��");
			Menu.showListHashMap(lis);
		}
		
	}
}
