/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithfactory.bll;

import funwithfactory.be.IDocumentReader;

/**
 *
 * @author Rasmus
 */
public interface IDocumentReaderFactory {

    public IDocumentReader getDocumentReader(String protocol);
}
