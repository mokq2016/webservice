
package com.java1234.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.java1234.webservice package. 
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

    private final static QName _GetRoleByUid_QNAME = new QName("http://webservice.java1234.com/", "getRoleByUid");
    private final static QName _GetRoleByUidResponse_QNAME = new QName("http://webservice.java1234.com/", "getRoleByUidResponse");
    private final static QName _GetRoles_QNAME = new QName("http://webservice.java1234.com/", "getRoles");
    private final static QName _GetRolesResponse_QNAME = new QName("http://webservice.java1234.com/", "getRolesResponse");
    private final static QName _Say_QNAME = new QName("http://webservice.java1234.com/", "say");
    private final static QName _SayResponse_QNAME = new QName("http://webservice.java1234.com/", "sayResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.java1234.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRoleByUid }
     * 
     */
    public GetRoleByUid createGetRoleByUid() {
        return new GetRoleByUid();
    }

    /**
     * Create an instance of {@link GetRoleByUidResponse }
     * 
     */
    public GetRoleByUidResponse createGetRoleByUidResponse() {
        return new GetRoleByUidResponse();
    }

    /**
     * Create an instance of {@link GetRoles }
     * 
     */
    public GetRoles createGetRoles() {
        return new GetRoles();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link Say }
     * 
     */
    public Say createSay() {
        return new Say();
    }

    /**
     * Create an instance of {@link SayResponse }
     * 
     */
    public SayResponse createSayResponse() {
        return new SayResponse();
    }

    /**
     * Create an instance of {@link MyRole }
     * 
     */
    public MyRole createMyRole() {
        return new MyRole();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link MyRoleArray }
     * 
     */
    public MyRoleArray createMyRoleArray() {
        return new MyRoleArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleByUid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "getRoleByUid")
    public JAXBElement<GetRoleByUid> createGetRoleByUid(GetRoleByUid value) {
        return new JAXBElement<GetRoleByUid>(_GetRoleByUid_QNAME, GetRoleByUid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleByUidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "getRoleByUidResponse")
    public JAXBElement<GetRoleByUidResponse> createGetRoleByUidResponse(GetRoleByUidResponse value) {
        return new JAXBElement<GetRoleByUidResponse>(_GetRoleByUidResponse_QNAME, GetRoleByUidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "getRoles")
    public JAXBElement<GetRoles> createGetRoles(GetRoles value) {
        return new JAXBElement<GetRoles>(_GetRoles_QNAME, GetRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "getRolesResponse")
    public JAXBElement<GetRolesResponse> createGetRolesResponse(GetRolesResponse value) {
        return new JAXBElement<GetRolesResponse>(_GetRolesResponse_QNAME, GetRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Say }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "say")
    public JAXBElement<Say> createSay(Say value) {
        return new JAXBElement<Say>(_Say_QNAME, Say.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.java1234.com/", name = "sayResponse")
    public JAXBElement<SayResponse> createSayResponse(SayResponse value) {
        return new JAXBElement<SayResponse>(_SayResponse_QNAME, SayResponse.class, null, value);
    }

}
