package com.lynas.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.nio.file.Paths;

public class WriteDataToXMLService<T> {

    public void writeDataToXMLFile(String path, String fileName, T content, Class classInstance) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(classInstance);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(content, Paths.get(path.concat(fileName)).toFile());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
