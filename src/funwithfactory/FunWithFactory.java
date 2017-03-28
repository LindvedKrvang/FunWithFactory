/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfactory;

import funwithfactory.bll.DocumentReaderFactory;
import funwithfactory.be.IDocumentReader;
import funwithfactory.bll.IDocumentReaderFactory;

/**
 *
 * @author Rasmus
 */
public class FunWithFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IDocumentReaderFactory factory = new DocumentReaderFactory();

        IDocumentReader pdf = factory.getDocumentReader("PDF");
        IDocumentReader html = factory.getDocumentReader("HTML");
        IDocumentReader text = factory.getDocumentReader("Text");

        System.out.println(pdf.getText());
        System.out.println(html.getText());
        System.out.println(text.getText());
    }

}
