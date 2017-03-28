/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfactory;

import funwithfactory.be.iDocumentReader;
import funwithfactory.bll.DocumentReaderFactory;
import funwithfactory.bll.iDocumentReaderFactory;

/**
 *
 * @author Rasmus
 */
public class FunWithFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        iDocumentReaderFactory factory = new DocumentReaderFactory();

        iDocumentReader pdf = factory.getDocumentReader("PDF");
        iDocumentReader html = factory.getDocumentReader("HTML");
        iDocumentReader text = factory.getDocumentReader("Text");

        System.out.println(pdf.getText());
        System.out.println(html.getText());
        System.out.println(text.getText());
    }

}
