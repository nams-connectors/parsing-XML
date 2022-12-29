package com.softwareag.jsonParse;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlRead {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\nams\\Music\\New folder\\TestDownload\\webMethods-Connectors-connector-postman-80bf65a043e9a9651c6f882a87ccfa6357d32edb\\packages\\WmPostmanProvider\\connectors\\com.softwareag.cloudstreams.postman_v1\\com.softwareag.cloudstreams.postman_v1.xml");  
			  
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
			  
			DocumentBuilder db = dbf.newDocumentBuilder();  
			Document doc = db.parse(file);  
			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("resource"); 
			Node node;
			Element eElement;
			for (int itr = 0; itr < nodeList.getLength(); itr++)   
			{  
			 node = nodeList.item(itr);  
			System.out.println("\nNode Name :" + node.getNodeName());
			if (node.getNodeType() == Node.ELEMENT_NODE)   
			{  
			eElement = (Element) node;  
			System.out.println(eElement.getElementsByTagName("description").item(0).getTextContent()); 
			for(int i =0 ; i<eElement.getElementsByTagName("request").getLength();i++)
			System.out.println(eElement.getElementsByTagName("request").item(i).getAttributes().getNamedItem("name")); 
			
			}}  
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
