/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfactory.be;

/**
 *
 * @author Rasmus
 */
public class PDFReader implements IDocumentReader {

    @Override
    public String getText() {
        return "I am a PDFReader!";
    }

}
