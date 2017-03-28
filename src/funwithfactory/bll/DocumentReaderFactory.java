/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfactory.bll;

import funwithfactory.be.HTMLReader;
import funwithfactory.be.PDFReader;
import funwithfactory.be.TextFileReader;
import funwithfactory.be.IDocumentReader;

/**
 *
 * @author Rasmus
 */
public class DocumentReaderFactory implements IDocumentReaderFactory {

    @Override
    public IDocumentReader getDocumentReader(String protocol) {
        switch (protocol) {
            case "PDF":
                return new PDFReader();
            case "HTML":
                return new HTMLReader();
            case "Text":
                return new TextFileReader();
            default:
                throw new IllegalArgumentException("Reader not found!");
        }
    }

}
