package Hemanth2;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Demo
{
		public static void main(String[] args) throws Exception
		{
			File fXmlfile = new File("\"C:\\Users\\Dell\\OneDrive\\Desktop\\New folder (2).txt\"");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder Dbuilder = dbFactory.newDocumentBuilder();
			Document doc = Dbuilder.parse(fXmlfile);
			//doc.getDocumentElement().normalize()
		
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("employee");
			System.out.println("-----------");
			
			for (int temp = 0; temp < nList.getLength(); temp++)
			{
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE)
				{
					Element eElement = (Element) nNode;
					System.out.println("id :" + eElement.getAttribute("id"));
					System.out.println("name :" + eElement.getElementsByTagName("name").item(0).getTextContent());
					System.out.println("position :" + eElement.getElementsByTagName("position").item(0).getTextContent());
					System.out.println("joinyear :" + eElement.getElementsByTagName("joinyear").item(0).getTextContent());
					System.out.println("salary:"+ eElement.getElementsByTagName("salary").item(0).getTextContent());
					
				}
					
			}
		}
		}

