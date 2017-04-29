
package gui;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gui package. 
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

    private final static QName _AddEmployee_QNAME = new QName("http://bank_ws/", "AddEmployee");
    private final static QName _FormValidate_QNAME = new QName("http://bank_ws/", "formValidate");
    private final static QName _FormValidateResponse_QNAME = new QName("http://bank_ws/", "formValidateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gui
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link FormValidate }
     * 
     */
    public FormValidate createFormValidate() {
        return new FormValidate();
    }

    /**
     * Create an instance of {@link FormValidateResponse }
     * 
     */
    public FormValidateResponse createFormValidateResponse() {
        return new FormValidateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "AddEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormValidate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "formValidate")
    public JAXBElement<FormValidate> createFormValidate(FormValidate value) {
        return new JAXBElement<FormValidate>(_FormValidate_QNAME, FormValidate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormValidateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "formValidateResponse")
    public JAXBElement<FormValidateResponse> createFormValidateResponse(FormValidateResponse value) {
        return new JAXBElement<FormValidateResponse>(_FormValidateResponse_QNAME, FormValidateResponse.class, null, value);
    }

}
