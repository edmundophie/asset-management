
package org.informatika.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import java.sql.SQLException;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.informatika.client package. 
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

    private final static QName _NotifyProcurement_QNAME = new QName("http://service.informatika.org/", "notifyProcurement");
    private final static QName _SetAssetConditionResponse_QNAME = new QName("http://service.informatika.org/", "setAssetConditionResponse");
    private final static QName _Close_QNAME = new QName("http://service.informatika.org/", "close");
    private final static QName _InsertMaintenanceSchedule_QNAME = new QName("http://service.informatika.org/", "insertMaintenanceSchedule");
    private final static QName _RegisterAssetResponse_QNAME = new QName("http://service.informatika.org/", "registerAssetResponse");
    private final static QName _GetAsset_QNAME = new QName("http://service.informatika.org/", "getAsset");
    private final static QName _SetAssetCondition_QNAME = new QName("http://service.informatika.org/", "setAssetCondition");
    private final static QName _SetAssetOwner_QNAME = new QName("http://service.informatika.org/", "setAssetOwner");
    private final static QName _NotifyVendor_QNAME = new QName("http://service.informatika.org/", "notifyVendor");
    private final static QName _NotifyVendorResponse_QNAME = new QName("http://service.informatika.org/", "notifyVendorResponse");
    private final static QName _RegisterVendor_QNAME = new QName("http://service.informatika.org/", "registerVendor");
    private final static QName _SetAssetJenis_QNAME = new QName("http://service.informatika.org/", "setAssetJenis");
    private final static QName _RegisterAsset_QNAME = new QName("http://service.informatika.org/", "registerAsset");
    private final static QName _SetAssetJenisResponse_QNAME = new QName("http://service.informatika.org/", "setAssetJenisResponse");
    private final static QName _CloseResponse_QNAME = new QName("http://service.informatika.org/", "closeResponse");
    private final static QName _InsertMaintenanceScheduleResponse_QNAME = new QName("http://service.informatika.org/", "insertMaintenanceScheduleResponse");
    private final static QName _GetAssetbyKategori_QNAME = new QName("http://service.informatika.org/", "getAssetbyKategori");
    private final static QName _SQLException_QNAME = new QName("http://service.informatika.org/", "SQLException");
    private final static QName _RegisterVendorResponse_QNAME = new QName("http://service.informatika.org/", "registerVendorResponse");
    private final static QName _GetAssetResponse_QNAME = new QName("http://service.informatika.org/", "getAssetResponse");
    private final static QName _SetAssetOwnerResponse_QNAME = new QName("http://service.informatika.org/", "setAssetOwnerResponse");
    private final static QName _NotifyProcurementResponse_QNAME = new QName("http://service.informatika.org/", "notifyProcurementResponse");
    private final static QName _DeleteAssetResponse_QNAME = new QName("http://service.informatika.org/", "deleteAssetResponse");
    private final static QName _DeleteAsset_QNAME = new QName("http://service.informatika.org/", "deleteAsset");
    private final static QName _GetAssetbyKategoriResponse_QNAME = new QName("http://service.informatika.org/", "getAssetbyKategoriResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.informatika.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAssetbyKategori }
     * 
     */
    public GetAssetbyKategori createGetAssetbyKategori() {
        return new GetAssetbyKategori();
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link RegisterVendorResponse }
     * 
     */
    public RegisterVendorResponse createRegisterVendorResponse() {
        return new RegisterVendorResponse();
    }

    /**
     * Create an instance of {@link SetAssetOwnerResponse }
     * 
     */
    public SetAssetOwnerResponse createSetAssetOwnerResponse() {
        return new SetAssetOwnerResponse();
    }

    /**
     * Create an instance of {@link GetAssetResponse }
     * 
     */
    public GetAssetResponse createGetAssetResponse() {
        return new GetAssetResponse();
    }

    /**
     * Create an instance of {@link SetAssetJenis }
     * 
     */
    public SetAssetJenis createSetAssetJenis() {
        return new SetAssetJenis();
    }

    /**
     * Create an instance of {@link CloseResponse }
     * 
     */
    public CloseResponse createCloseResponse() {
        return new CloseResponse();
    }

    /**
     * Create an instance of {@link InsertMaintenanceScheduleResponse }
     * 
     */
    public InsertMaintenanceScheduleResponse createInsertMaintenanceScheduleResponse() {
        return new InsertMaintenanceScheduleResponse();
    }

    /**
     * Create an instance of {@link RegisterAsset }
     * 
     */
    public RegisterAsset createRegisterAsset() {
        return new RegisterAsset();
    }

    /**
     * Create an instance of {@link SetAssetJenisResponse }
     * 
     */
    public SetAssetJenisResponse createSetAssetJenisResponse() {
        return new SetAssetJenisResponse();
    }

    /**
     * Create an instance of {@link GetAsset }
     * 
     */
    public GetAsset createGetAsset() {
        return new GetAsset();
    }

    /**
     * Create an instance of {@link SetAssetCondition }
     * 
     */
    public SetAssetCondition createSetAssetCondition() {
        return new SetAssetCondition();
    }

    /**
     * Create an instance of {@link SetAssetOwner }
     * 
     */
    public SetAssetOwner createSetAssetOwner() {
        return new SetAssetOwner();
    }

    /**
     * Create an instance of {@link NotifyVendor }
     * 
     */
    public NotifyVendor createNotifyVendor() {
        return new NotifyVendor();
    }

    /**
     * Create an instance of {@link NotifyVendorResponse }
     * 
     */
    public NotifyVendorResponse createNotifyVendorResponse() {
        return new NotifyVendorResponse();
    }

    /**
     * Create an instance of {@link RegisterVendor }
     * 
     */
    public RegisterVendor createRegisterVendor() {
        return new RegisterVendor();
    }

    /**
     * Create an instance of {@link SetAssetConditionResponse }
     * 
     */
    public SetAssetConditionResponse createSetAssetConditionResponse() {
        return new SetAssetConditionResponse();
    }

    /**
     * Create an instance of {@link NotifyProcurement }
     * 
     */
    public NotifyProcurement createNotifyProcurement() {
        return new NotifyProcurement();
    }

    /**
     * Create an instance of {@link Close }
     * 
     */
    public Close createClose() {
        return new Close();
    }

    /**
     * Create an instance of {@link InsertMaintenanceSchedule }
     * 
     */
    public InsertMaintenanceSchedule createInsertMaintenanceSchedule() {
        return new InsertMaintenanceSchedule();
    }

    /**
     * Create an instance of {@link RegisterAssetResponse }
     * 
     */
    public RegisterAssetResponse createRegisterAssetResponse() {
        return new RegisterAssetResponse();
    }

    /**
     * Create an instance of {@link GetAssetbyKategoriResponse }
     * 
     */
    public GetAssetbyKategoriResponse createGetAssetbyKategoriResponse() {
        return new GetAssetbyKategoriResponse();
    }

    /**
     * Create an instance of {@link NotifyProcurementResponse }
     * 
     */
    public NotifyProcurementResponse createNotifyProcurementResponse() {
        return new NotifyProcurementResponse();
    }

    /**
     * Create an instance of {@link DeleteAssetResponse }
     * 
     */
    public DeleteAssetResponse createDeleteAssetResponse() {
        return new DeleteAssetResponse();
    }

    /**
     * Create an instance of {@link DeleteAsset }
     * 
     */
    public DeleteAsset createDeleteAsset() {
        return new DeleteAsset();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SqlException }
     * 
     */
    public SqlException createSqlException() {
        return new SqlException();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyProcurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "notifyProcurement")
    public JAXBElement<NotifyProcurement> createNotifyProcurement(NotifyProcurement value) {
        return new JAXBElement<NotifyProcurement>(_NotifyProcurement_QNAME, NotifyProcurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAssetConditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setAssetConditionResponse")
    public JAXBElement<SetAssetConditionResponse> createSetAssetConditionResponse(SetAssetConditionResponse value) {
        return new JAXBElement<SetAssetConditionResponse>(_SetAssetConditionResponse_QNAME, SetAssetConditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Close }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "close")
    public JAXBElement<Close> createClose(Close value) {
        return new JAXBElement<Close>(_Close_QNAME, Close.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertMaintenanceSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "insertMaintenanceSchedule")
    public JAXBElement<InsertMaintenanceSchedule> createInsertMaintenanceSchedule(InsertMaintenanceSchedule value) {
        return new JAXBElement<InsertMaintenanceSchedule>(_InsertMaintenanceSchedule_QNAME, InsertMaintenanceSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAssetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "registerAssetResponse")
    public JAXBElement<RegisterAssetResponse> createRegisterAssetResponse(RegisterAssetResponse value) {
        return new JAXBElement<RegisterAssetResponse>(_RegisterAssetResponse_QNAME, RegisterAssetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAsset")
    public JAXBElement<GetAsset> createGetAsset(GetAsset value) {
        return new JAXBElement<GetAsset>(_GetAsset_QNAME, GetAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAssetCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setAssetCondition")
    public JAXBElement<SetAssetCondition> createSetAssetCondition(SetAssetCondition value) {
        return new JAXBElement<SetAssetCondition>(_SetAssetCondition_QNAME, SetAssetCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAssetOwner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setAssetOwner")
    public JAXBElement<SetAssetOwner> createSetAssetOwner(SetAssetOwner value) {
        return new JAXBElement<SetAssetOwner>(_SetAssetOwner_QNAME, SetAssetOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "notifyVendor")
    public JAXBElement<NotifyVendor> createNotifyVendor(NotifyVendor value) {
        return new JAXBElement<NotifyVendor>(_NotifyVendor_QNAME, NotifyVendor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "notifyVendorResponse")
    public JAXBElement<NotifyVendorResponse> createNotifyVendorResponse(NotifyVendorResponse value) {
        return new JAXBElement<NotifyVendorResponse>(_NotifyVendorResponse_QNAME, NotifyVendorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "registerVendor")
    public JAXBElement<RegisterVendor> createRegisterVendor(RegisterVendor value) {
        return new JAXBElement<RegisterVendor>(_RegisterVendor_QNAME, RegisterVendor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAssetJenis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setAssetJenis")
    public JAXBElement<SetAssetJenis> createSetAssetJenis(SetAssetJenis value) {
        return new JAXBElement<SetAssetJenis>(_SetAssetJenis_QNAME, SetAssetJenis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "registerAsset")
    public JAXBElement<RegisterAsset> createRegisterAsset(RegisterAsset value) {
        return new JAXBElement<RegisterAsset>(_RegisterAsset_QNAME, RegisterAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAssetJenisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setAssetJenisResponse")
    public JAXBElement<SetAssetJenisResponse> createSetAssetJenisResponse(SetAssetJenisResponse value) {
        return new JAXBElement<SetAssetJenisResponse>(_SetAssetJenisResponse_QNAME, SetAssetJenisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "closeResponse")
    public JAXBElement<CloseResponse> createCloseResponse(CloseResponse value) {
        return new JAXBElement<CloseResponse>(_CloseResponse_QNAME, CloseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertMaintenanceScheduleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "insertMaintenanceScheduleResponse")
    public JAXBElement<InsertMaintenanceScheduleResponse> createInsertMaintenanceScheduleResponse(InsertMaintenanceScheduleResponse value) {
        return new JAXBElement<InsertMaintenanceScheduleResponse>(_InsertMaintenanceScheduleResponse_QNAME, InsertMaintenanceScheduleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssetbyKategori }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAssetbyKategori")
    public JAXBElement<GetAssetbyKategori> createGetAssetbyKategori(GetAssetbyKategori value) {
        return new JAXBElement<GetAssetbyKategori>(_GetAssetbyKategori_QNAME, GetAssetbyKategori.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "SQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLException_QNAME, SQLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "registerVendorResponse")
    public JAXBElement<RegisterVendorResponse> createRegisterVendorResponse(RegisterVendorResponse value) {
        return new JAXBElement<RegisterVendorResponse>(_RegisterVendorResponse_QNAME, RegisterVendorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAssetResponse")
    public JAXBElement<GetAssetResponse> createGetAssetResponse(GetAssetResponse value) {
        return new JAXBElement<GetAssetResponse>(_GetAssetResponse_QNAME, GetAssetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetAssetOwnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setAssetOwnerResponse")
    public JAXBElement<SetAssetOwnerResponse> createSetAssetOwnerResponse(SetAssetOwnerResponse value) {
        return new JAXBElement<SetAssetOwnerResponse>(_SetAssetOwnerResponse_QNAME, SetAssetOwnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyProcurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "notifyProcurementResponse")
    public JAXBElement<NotifyProcurementResponse> createNotifyProcurementResponse(NotifyProcurementResponse value) {
        return new JAXBElement<NotifyProcurementResponse>(_NotifyProcurementResponse_QNAME, NotifyProcurementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAssetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "deleteAssetResponse")
    public JAXBElement<DeleteAssetResponse> createDeleteAssetResponse(DeleteAssetResponse value) {
        return new JAXBElement<DeleteAssetResponse>(_DeleteAssetResponse_QNAME, DeleteAssetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "deleteAsset")
    public JAXBElement<DeleteAsset> createDeleteAsset(DeleteAsset value) {
        return new JAXBElement<DeleteAsset>(_DeleteAsset_QNAME, DeleteAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssetbyKategoriResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAssetbyKategoriResponse")
    public JAXBElement<GetAssetbyKategoriResponse> createGetAssetbyKategoriResponse(GetAssetbyKategoriResponse value) {
        return new JAXBElement<GetAssetbyKategoriResponse>(_GetAssetbyKategoriResponse_QNAME, GetAssetbyKategoriResponse.class, null, value);
    }

}
