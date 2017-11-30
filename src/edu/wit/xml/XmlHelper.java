package edu.wit.xml;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlHelper {

	private static Map<String,String> hashmap=new HashMap<>();
	private static Document document;
	static{
		SAXReader reader=new SAXReader();
		try {
			document=reader.read("src/dbfactory.xml");
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void parseXml(){
		Element root= document.getRootElement();
		Iterator<Element> it= root.elementIterator();
		while(it.hasNext())
		{
			Element ele=it.next();
			String key=ele.attributeValue("name");
			String value=ele.attributeValue("class");
			hashmap.put(key, value);
		}
		
	}
	public  static String get(String name){
		return hashmap.get(name);
	}
	public static void main(String[] args) {
		parseXml();
		System.out.println(get("studentDao1"));
	}
}
