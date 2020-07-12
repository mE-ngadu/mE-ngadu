
package com.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws package. 
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

    private final static QName _InComplaintResponse_QNAME = new QName("http://ws.com/", "inComplaintResponse");
    private final static QName _StYear_QNAME = new QName("http://ws.com/", "stYear");
    private final static QName _StudentName_QNAME = new QName("http://ws.com/", "studentName");
    private final static QName _ComStatus_QNAME = new QName("http://ws.com/", "comStatus");
    private final static QName _ComStatusResponse_QNAME = new QName("http://ws.com/", "comStatusResponse");
    private final static QName _StYearResponse_QNAME = new QName("http://ws.com/", "stYearResponse");
    private final static QName _StCourse_QNAME = new QName("http://ws.com/", "stCourse");
    private final static QName _StCourseResponse_QNAME = new QName("http://ws.com/", "stCourseResponse");
    private final static QName _InComplaint_QNAME = new QName("http://ws.com/", "inComplaint");
    private final static QName _InMatric_QNAME = new QName("http://ws.com/", "inMatric");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComStatus }
     * 
     */
    public ComStatus createComStatus() {
        return new ComStatus();
    }

    /**
     * Create an instance of {@link ComStatusResponse }
     * 
     */
    public ComStatusResponse createComStatusResponse() {
        return new ComStatusResponse();
    }

    /**
     * Create an instance of {@link StYearResponse }
     * 
     */
    public StYearResponse createStYearResponse() {
        return new StYearResponse();
    }

    /**
     * Create an instance of {@link InComplaintResponse }
     * 
     */
    public InComplaintResponse createInComplaintResponse() {
        return new InComplaintResponse();
    }

    /**
     * Create an instance of {@link StYear }
     * 
     */
    public StYear createStYear() {
        return new StYear();
    }

    /**
     * Create an instance of {@link StudentName }
     * 
     */
    public StudentName createStudentName() {
        return new StudentName();
    }

    /**
     * Create an instance of {@link StCourseResponse }
     * 
     */
    public StCourseResponse createStCourseResponse() {
        return new StCourseResponse();
    }

    /**
     * Create an instance of {@link InMatric }
     * 
     */
    public InMatric createInMatric() {
        return new InMatric();
    }

    /**
     * Create an instance of {@link InComplaint }
     * 
     */
    public InComplaint createInComplaint() {
        return new InComplaint();
    }

    /**
     * Create an instance of {@link StCourse }
     * 
     */
    public StCourse createStCourse() {
        return new StCourse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InComplaintResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "inComplaintResponse")
    public JAXBElement<InComplaintResponse> createInComplaintResponse(InComplaintResponse value) {
        return new JAXBElement<InComplaintResponse>(_InComplaintResponse_QNAME, InComplaintResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "stYear")
    public JAXBElement<StYear> createStYear(StYear value) {
        return new JAXBElement<StYear>(_StYear_QNAME, StYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StudentName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "studentName")
    public JAXBElement<StudentName> createStudentName(StudentName value) {
        return new JAXBElement<StudentName>(_StudentName_QNAME, StudentName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "comStatus")
    public JAXBElement<ComStatus> createComStatus(ComStatus value) {
        return new JAXBElement<ComStatus>(_ComStatus_QNAME, ComStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "comStatusResponse")
    public JAXBElement<ComStatusResponse> createComStatusResponse(ComStatusResponse value) {
        return new JAXBElement<ComStatusResponse>(_ComStatusResponse_QNAME, ComStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StYearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "stYearResponse")
    public JAXBElement<StYearResponse> createStYearResponse(StYearResponse value) {
        return new JAXBElement<StYearResponse>(_StYearResponse_QNAME, StYearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "stCourse")
    public JAXBElement<StCourse> createStCourse(StCourse value) {
        return new JAXBElement<StCourse>(_StCourse_QNAME, StCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "stCourseResponse")
    public JAXBElement<StCourseResponse> createStCourseResponse(StCourseResponse value) {
        return new JAXBElement<StCourseResponse>(_StCourseResponse_QNAME, StCourseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InComplaint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "inComplaint")
    public JAXBElement<InComplaint> createInComplaint(InComplaint value) {
        return new JAXBElement<InComplaint>(_InComplaint_QNAME, InComplaint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InMatric }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "inMatric")
    public JAXBElement<InMatric> createInMatric(InMatric value) {
        return new JAXBElement<InMatric>(_InMatric_QNAME, InMatric.class, null, value);
    }

}
