package edu.wit.ui;

import java.util.List;
import java.util.Map;

public class Menu {

	public static void showLoginMenu( ) { 
		System.out.println("=============================");
		System.out.println("1.ѧ���û�ע��");
		System.out.println("2.ѧ���û���¼");
		System.out.println("3.�˳�ϵͳ");
		System.out.println("=============================");
		System.out.println("��ѡ��");
	}
	
	public static void showMainMenu( ) {
		System.out.println("=============================");
		System.out.println("1.�޸ĸ�����Ϣ");
		System.out.println("2.��ѯרҵ�γ�");
		System.out.println("3.��ѯ���˳ɼ�");
		System.out.println("=============================");
		System.out.println("��ѡ��");
	}
	
	public static void showListHashMap(List<Map<String,Object>> lis ) {
		
		System.out.println("����\t���Գɼ�\t�γ�����\t����ʱ��");
		for (int i = 0; i < lis.size(); i++) {
			
				System.out.print(lis.get(i).get("����")+"\t");
				System.out.print(lis.get(i).get("���Գɼ�")+"\t");
				System.out.print(lis.get(i).get("�γ�����")+"\t");
				System.out.println(lis.get(i).get("����ʱ��"));
			}
		}
		
		
	
	}

