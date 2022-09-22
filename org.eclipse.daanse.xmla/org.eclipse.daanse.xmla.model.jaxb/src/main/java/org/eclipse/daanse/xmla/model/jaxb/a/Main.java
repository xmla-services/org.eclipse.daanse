package org.eclipse.daanse.xmla.model.jaxb.a;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Main {

	public static void main(String[] args) throws JAXBException {
      JAXBContext jc = JAXBContext.newInstance(Book.class);

      List<String> bar = new ArrayList<String>(3);
      bar.add("a");
      bar.add("b");
      bar.add("c");
      Book book = new Book("thename",		
      		"theauthor",
      		"thepublisher",
      		"theisbn");

      Marshaller marshaller = jc.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      marshaller.marshal(book, System.out);

	}
}
