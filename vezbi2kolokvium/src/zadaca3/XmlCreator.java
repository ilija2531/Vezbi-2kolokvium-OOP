package zadaca3;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlCreator {
	
	
	public void XML (String filename, List<Student> student) {
	
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			
			Element root = document.createElement("Student");
			document.appendChild(root);
			
			Element ime = document.createElement("Ime");
			root.appendChild(ime);
			
			Element prezime = document.createElement("Prezime");
			root.appendChild(prezime);
			
			Element index = document.createElement("Index");
			root.appendChild(index);
			
			Student student1 = new Student("Stefan", "Stefanovski", "453");
			student.add(student1);
			
			Student student2 = new Student("Aleksandar", "Ristevski", "756");
			student.add(student2);
			
			
			
			
			ime.appendChild(document.createTextNode("Stefan"));
			prezime.appendChild(document.createTextNode("Stefanovski"));
			index.appendChild(document.createTextNode("453"));
			
			ime.appendChild(document.createTextNode("Aleksandar"));
			prezime.appendChild(document.createTextNode("Ristevski"));
			index.appendChild(document.createTextNode("756"));
			
			TransformerFactory transformerfactory = TransformerFactory.newInstance();
			Transformer transformer = transformerfactory.newTransformer();
			
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(new File(filename));
			
			StreamResult result1 = new StreamResult(System.out);
			
			transformer.transform(source, result);
			System.out.println("Fajlot e kreiran, imeto e: " + filename);
			System.out.println("Fajlot e zachuvan.");
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
		}
	}


