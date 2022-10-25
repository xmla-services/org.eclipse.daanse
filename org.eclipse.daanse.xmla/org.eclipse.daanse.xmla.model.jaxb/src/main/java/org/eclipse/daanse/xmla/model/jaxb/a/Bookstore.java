package org.eclipse.daanse.xmla.model.jaxb.a;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "example.books")
public record Bookstore(String name, String location,
    @XmlElementWrapper(name = "bookList") @XmlElement(name = "book") List<Book> bookList) {
}