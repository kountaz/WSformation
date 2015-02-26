
package com.capgemini.wsrvc.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.capgemini.wsrvc.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TestInput_QNAME = new QName("http://services.wsrvc.capgemini.com/", "testInput");
    private final static QName _Test_QNAME = new QName("http://services.wsrvc.capgemini.com/", "test");
    private final static QName _TestOutput_QNAME = new QName("http://services.wsrvc.capgemini.com/", "testOutput");
    private final static QName _ErreurTechnique_QNAME = new QName("http://services.wsrvc.capgemini.com/", "ErreurTechnique");
    private final static QName _ErreurFonctionnelle_QNAME = new QName("http://services.wsrvc.capgemini.com/", "ErreurFonctionnelle");
    private final static QName _PingResponse_QNAME = new QName("http://services.wsrvc.capgemini.com/", "pingResponse");
    private final static QName _TestResponse_QNAME = new QName("http://services.wsrvc.capgemini.com/", "testResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.capgemini.wsrvc.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestInput }
     * 
     */
    public TestInput createTestInput() {
        return new TestInput();
    }

    /**
     * Create an instance of {@link ErreurTechnique }
     * 
     */
    public ErreurTechnique createErreurTechnique() {
        return new ErreurTechnique();
    }

    /**
     * Create an instance of {@link TestOutput }
     * 
     */
    public TestOutput createTestOutput() {
        return new TestOutput();
    }

    /**
     * Create an instance of {@link ErreurFonctionnelle }
     * 
     */
    public ErreurFonctionnelle createErreurFonctionnelle() {
        return new ErreurFonctionnelle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wsrvc.capgemini.com/", name = "testInput")
    public JAXBElement<TestInput> createTestInput(TestInput value) {
        return new JAXBElement<TestInput>(_TestInput_QNAME, TestInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wsrvc.capgemini.com/", name = "test")
    public JAXBElement<TestInput> createTest(TestInput value) {
        return new JAXBElement<TestInput>(_Test_QNAME, TestInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wsrvc.capgemini.com/", name = "testOutput")
    public JAXBElement<TestOutput> createTestOutput(TestOutput value) {
        return new JAXBElement<TestOutput>(_TestOutput_QNAME, TestOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreurTechnique }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wsrvc.capgemini.com/", name = "ErreurTechnique")
    public JAXBElement<ErreurTechnique> createErreurTechnique(ErreurTechnique value) {
        return new JAXBElement<ErreurTechnique>(_ErreurTechnique_QNAME, ErreurTechnique.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreurFonctionnelle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wsrvc.capgemini.com/", name = "ErreurFonctionnelle")
    public JAXBElement<ErreurFonctionnelle> createErreurFonctionnelle(ErreurFonctionnelle value) {
        return new JAXBElement<ErreurFonctionnelle>(_ErreurFonctionnelle_QNAME, ErreurFonctionnelle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wsrvc.capgemini.com/", name = "pingResponse")
    public JAXBElement<String> createPingResponse(String value) {
        return new JAXBElement<String>(_PingResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.wsrvc.capgemini.com/", name = "testResponse")
    public JAXBElement<TestOutput> createTestResponse(TestOutput value) {
        return new JAXBElement<TestOutput>(_TestResponse_QNAME, TestOutput.class, null, value);
    }

}
