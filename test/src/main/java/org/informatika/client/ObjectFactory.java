
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

    private final static QName _InsertFasilitasAsetResponse_QNAME = new QName("http://service.informatika.org/", "insertFasilitasAsetResponse");
    private final static QName _SayHelloWorld_QNAME = new QName("http://service.informatika.org/", "sayHelloWorld");
    private final static QName _SetPemilikAsetResponse_QNAME = new QName("http://service.informatika.org/", "setPemilikAsetResponse");
    private final static QName _GetAsetByKategoriResponse_QNAME = new QName("http://service.informatika.org/", "getAsetByKategoriResponse");
    private final static QName _Close_QNAME = new QName("http://service.informatika.org/", "close");
    private final static QName _GetAsetByNama_QNAME = new QName("http://service.informatika.org/", "getAsetByNama");
    private final static QName _RegisterAsetResponse_QNAME = new QName("http://service.informatika.org/", "registerAsetResponse");
    private final static QName _NotifyMaintenanceToVendorResponse_QNAME = new QName("http://service.informatika.org/", "notifyMaintenanceToVendorResponse");
    private final static QName _InsertJadwalMaintenance_QNAME = new QName("http://service.informatika.org/", "insertJadwalMaintenance");
    private final static QName _GetAsetByJenis_QNAME = new QName("http://service.informatika.org/", "getAsetByJenis");
    private final static QName _InsertJadwalMaintenanceResponse_QNAME = new QName("http://service.informatika.org/", "insertJadwalMaintenanceResponse");
    private final static QName _RegisterVendor_QNAME = new QName("http://service.informatika.org/", "registerVendor");
    private final static QName _DeleteAset_QNAME = new QName("http://service.informatika.org/", "deleteAset");
    private final static QName _RegisterAset_QNAME = new QName("http://service.informatika.org/", "registerAset");
    private final static QName _InsertKebutuhanMaintenanceResponse_QNAME = new QName("http://service.informatika.org/", "insertKebutuhanMaintenanceResponse");
    private final static QName _CloseResponse_QNAME = new QName("http://service.informatika.org/", "closeResponse");
    private final static QName _SetNamaAset_QNAME = new QName("http://service.informatika.org/", "setNamaAset");
    private final static QName _SetPemilikAset_QNAME = new QName("http://service.informatika.org/", "setPemilikAset");
    private final static QName _SetJenisAset_QNAME = new QName("http://service.informatika.org/", "setJenisAset");
    private final static QName _GetAsetByJenisResponse_QNAME = new QName("http://service.informatika.org/", "getAsetByJenisResponse");
    private final static QName _SayHelloWorldResponse_QNAME = new QName("http://service.informatika.org/", "sayHelloWorldResponse");
    private final static QName _SQLException_QNAME = new QName("http://service.informatika.org/", "SQLException");
    private final static QName _GetAsetByNamaResponse_QNAME = new QName("http://service.informatika.org/", "getAsetByNamaResponse");
    private final static QName _RegisterVendorResponse_QNAME = new QName("http://service.informatika.org/", "registerVendorResponse");
    private final static QName _GetFasilitasAsetResponse_QNAME = new QName("http://service.informatika.org/", "getFasilitasAsetResponse");
    private final static QName _InsertFasilitasAset_QNAME = new QName("http://service.informatika.org/", "insertFasilitasAset");
    private final static QName _DeleteAsetResponse_QNAME = new QName("http://service.informatika.org/", "deleteAsetResponse");
    private final static QName _SetKondisiAset_QNAME = new QName("http://service.informatika.org/", "setKondisiAset");
    private final static QName _SetJenisAsetResponse_QNAME = new QName("http://service.informatika.org/", "setJenisAsetResponse");
    private final static QName _GetAsetResponse_QNAME = new QName("http://service.informatika.org/", "getAsetResponse");
    private final static QName _NotifyMaintenanceToVendor_QNAME = new QName("http://service.informatika.org/", "notifyMaintenanceToVendor");
    private final static QName _SetNamaAsetResponse_QNAME = new QName("http://service.informatika.org/", "setNamaAsetResponse");
    private final static QName _GetAsetByKategori_QNAME = new QName("http://service.informatika.org/", "getAsetByKategori");
    private final static QName _GetAset_QNAME = new QName("http://service.informatika.org/", "getAset");
    private final static QName _InsertKebutuhanMaintenance_QNAME = new QName("http://service.informatika.org/", "insertKebutuhanMaintenance");
    private final static QName _SetKondisiAsetResponse_QNAME = new QName("http://service.informatika.org/", "setKondisiAsetResponse");
    private final static QName _GetFasilitasAset_QNAME = new QName("http://service.informatika.org/", "getFasilitasAset");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.informatika.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetJenisAset }
     * 
     */
    public SetJenisAset createSetJenisAset() {
        return new SetJenisAset();
    }

    /**
     * Create an instance of {@link GetAsetByJenisResponse }
     * 
     */
    public GetAsetByJenisResponse createGetAsetByJenisResponse() {
        return new GetAsetByJenisResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldResponse }
     * 
     */
    public SayHelloWorldResponse createSayHelloWorldResponse() {
        return new SayHelloWorldResponse();
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link GetAsetByNamaResponse }
     * 
     */
    public GetAsetByNamaResponse createGetAsetByNamaResponse() {
        return new GetAsetByNamaResponse();
    }

    /**
     * Create an instance of {@link RegisterVendorResponse }
     * 
     */
    public RegisterVendorResponse createRegisterVendorResponse() {
        return new RegisterVendorResponse();
    }

    /**
     * Create an instance of {@link GetFasilitasAsetResponse }
     * 
     */
    public GetFasilitasAsetResponse createGetFasilitasAsetResponse() {
        return new GetFasilitasAsetResponse();
    }

    /**
     * Create an instance of {@link InsertFasilitasAset }
     * 
     */
    public InsertFasilitasAset createInsertFasilitasAset() {
        return new InsertFasilitasAset();
    }

    /**
     * Create an instance of {@link DeleteAset }
     * 
     */
    public DeleteAset createDeleteAset() {
        return new DeleteAset();
    }

    /**
     * Create an instance of {@link RegisterAset }
     * 
     */
    public RegisterAset createRegisterAset() {
        return new RegisterAset();
    }

    /**
     * Create an instance of {@link CloseResponse }
     * 
     */
    public CloseResponse createCloseResponse() {
        return new CloseResponse();
    }

    /**
     * Create an instance of {@link SetNamaAset }
     * 
     */
    public SetNamaAset createSetNamaAset() {
        return new SetNamaAset();
    }

    /**
     * Create an instance of {@link InsertKebutuhanMaintenanceResponse }
     * 
     */
    public InsertKebutuhanMaintenanceResponse createInsertKebutuhanMaintenanceResponse() {
        return new InsertKebutuhanMaintenanceResponse();
    }

    /**
     * Create an instance of {@link SetPemilikAset }
     * 
     */
    public SetPemilikAset createSetPemilikAset() {
        return new SetPemilikAset();
    }

    /**
     * Create an instance of {@link InsertJadwalMaintenance }
     * 
     */
    public InsertJadwalMaintenance createInsertJadwalMaintenance() {
        return new InsertJadwalMaintenance();
    }

    /**
     * Create an instance of {@link GetAsetByJenis }
     * 
     */
    public GetAsetByJenis createGetAsetByJenis() {
        return new GetAsetByJenis();
    }

    /**
     * Create an instance of {@link InsertJadwalMaintenanceResponse }
     * 
     */
    public InsertJadwalMaintenanceResponse createInsertJadwalMaintenanceResponse() {
        return new InsertJadwalMaintenanceResponse();
    }

    /**
     * Create an instance of {@link RegisterVendor }
     * 
     */
    public RegisterVendor createRegisterVendor() {
        return new RegisterVendor();
    }

    /**
     * Create an instance of {@link InsertFasilitasAsetResponse }
     * 
     */
    public InsertFasilitasAsetResponse createInsertFasilitasAsetResponse() {
        return new InsertFasilitasAsetResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorld }
     * 
     */
    public SayHelloWorld createSayHelloWorld() {
        return new SayHelloWorld();
    }

    /**
     * Create an instance of {@link GetAsetByKategoriResponse }
     * 
     */
    public GetAsetByKategoriResponse createGetAsetByKategoriResponse() {
        return new GetAsetByKategoriResponse();
    }

    /**
     * Create an instance of {@link SetPemilikAsetResponse }
     * 
     */
    public SetPemilikAsetResponse createSetPemilikAsetResponse() {
        return new SetPemilikAsetResponse();
    }

    /**
     * Create an instance of {@link GetAsetByNama }
     * 
     */
    public GetAsetByNama createGetAsetByNama() {
        return new GetAsetByNama();
    }

    /**
     * Create an instance of {@link RegisterAsetResponse }
     * 
     */
    public RegisterAsetResponse createRegisterAsetResponse() {
        return new RegisterAsetResponse();
    }

    /**
     * Create an instance of {@link Close }
     * 
     */
    public Close createClose() {
        return new Close();
    }

    /**
     * Create an instance of {@link NotifyMaintenanceToVendorResponse }
     * 
     */
    public NotifyMaintenanceToVendorResponse createNotifyMaintenanceToVendorResponse() {
        return new NotifyMaintenanceToVendorResponse();
    }

    /**
     * Create an instance of {@link SetKondisiAsetResponse }
     * 
     */
    public SetKondisiAsetResponse createSetKondisiAsetResponse() {
        return new SetKondisiAsetResponse();
    }

    /**
     * Create an instance of {@link GetFasilitasAset }
     * 
     */
    public GetFasilitasAset createGetFasilitasAset() {
        return new GetFasilitasAset();
    }

    /**
     * Create an instance of {@link GetAset }
     * 
     */
    public GetAset createGetAset() {
        return new GetAset();
    }

    /**
     * Create an instance of {@link InsertKebutuhanMaintenance }
     * 
     */
    public InsertKebutuhanMaintenance createInsertKebutuhanMaintenance() {
        return new InsertKebutuhanMaintenance();
    }

    /**
     * Create an instance of {@link SetJenisAsetResponse }
     * 
     */
    public SetJenisAsetResponse createSetJenisAsetResponse() {
        return new SetJenisAsetResponse();
    }

    /**
     * Create an instance of {@link NotifyMaintenanceToVendor }
     * 
     */
    public NotifyMaintenanceToVendor createNotifyMaintenanceToVendor() {
        return new NotifyMaintenanceToVendor();
    }

    /**
     * Create an instance of {@link GetAsetResponse }
     * 
     */
    public GetAsetResponse createGetAsetResponse() {
        return new GetAsetResponse();
    }

    /**
     * Create an instance of {@link SetNamaAsetResponse }
     * 
     */
    public SetNamaAsetResponse createSetNamaAsetResponse() {
        return new SetNamaAsetResponse();
    }

    /**
     * Create an instance of {@link GetAsetByKategori }
     * 
     */
    public GetAsetByKategori createGetAsetByKategori() {
        return new GetAsetByKategori();
    }

    /**
     * Create an instance of {@link DeleteAsetResponse }
     * 
     */
    public DeleteAsetResponse createDeleteAsetResponse() {
        return new DeleteAsetResponse();
    }

    /**
     * Create an instance of {@link SetKondisiAset }
     * 
     */
    public SetKondisiAset createSetKondisiAset() {
        return new SetKondisiAset();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
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
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFasilitasAsetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "insertFasilitasAsetResponse")
    public JAXBElement<InsertFasilitasAsetResponse> createInsertFasilitasAsetResponse(InsertFasilitasAsetResponse value) {
        return new JAXBElement<InsertFasilitasAsetResponse>(_InsertFasilitasAsetResponse_QNAME, InsertFasilitasAsetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "sayHelloWorld")
    public JAXBElement<SayHelloWorld> createSayHelloWorld(SayHelloWorld value) {
        return new JAXBElement<SayHelloWorld>(_SayHelloWorld_QNAME, SayHelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPemilikAsetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setPemilikAsetResponse")
    public JAXBElement<SetPemilikAsetResponse> createSetPemilikAsetResponse(SetPemilikAsetResponse value) {
        return new JAXBElement<SetPemilikAsetResponse>(_SetPemilikAsetResponse_QNAME, SetPemilikAsetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsetByKategoriResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAsetByKategoriResponse")
    public JAXBElement<GetAsetByKategoriResponse> createGetAsetByKategoriResponse(GetAsetByKategoriResponse value) {
        return new JAXBElement<GetAsetByKategoriResponse>(_GetAsetByKategoriResponse_QNAME, GetAsetByKategoriResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsetByNama }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAsetByNama")
    public JAXBElement<GetAsetByNama> createGetAsetByNama(GetAsetByNama value) {
        return new JAXBElement<GetAsetByNama>(_GetAsetByNama_QNAME, GetAsetByNama.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAsetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "registerAsetResponse")
    public JAXBElement<RegisterAsetResponse> createRegisterAsetResponse(RegisterAsetResponse value) {
        return new JAXBElement<RegisterAsetResponse>(_RegisterAsetResponse_QNAME, RegisterAsetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyMaintenanceToVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "notifyMaintenanceToVendorResponse")
    public JAXBElement<NotifyMaintenanceToVendorResponse> createNotifyMaintenanceToVendorResponse(NotifyMaintenanceToVendorResponse value) {
        return new JAXBElement<NotifyMaintenanceToVendorResponse>(_NotifyMaintenanceToVendorResponse_QNAME, NotifyMaintenanceToVendorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertJadwalMaintenance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "insertJadwalMaintenance")
    public JAXBElement<InsertJadwalMaintenance> createInsertJadwalMaintenance(InsertJadwalMaintenance value) {
        return new JAXBElement<InsertJadwalMaintenance>(_InsertJadwalMaintenance_QNAME, InsertJadwalMaintenance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsetByJenis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAsetByJenis")
    public JAXBElement<GetAsetByJenis> createGetAsetByJenis(GetAsetByJenis value) {
        return new JAXBElement<GetAsetByJenis>(_GetAsetByJenis_QNAME, GetAsetByJenis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertJadwalMaintenanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "insertJadwalMaintenanceResponse")
    public JAXBElement<InsertJadwalMaintenanceResponse> createInsertJadwalMaintenanceResponse(InsertJadwalMaintenanceResponse value) {
        return new JAXBElement<InsertJadwalMaintenanceResponse>(_InsertJadwalMaintenanceResponse_QNAME, InsertJadwalMaintenanceResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "deleteAset")
    public JAXBElement<DeleteAset> createDeleteAset(DeleteAset value) {
        return new JAXBElement<DeleteAset>(_DeleteAset_QNAME, DeleteAset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "registerAset")
    public JAXBElement<RegisterAset> createRegisterAset(RegisterAset value) {
        return new JAXBElement<RegisterAset>(_RegisterAset_QNAME, RegisterAset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertKebutuhanMaintenanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "insertKebutuhanMaintenanceResponse")
    public JAXBElement<InsertKebutuhanMaintenanceResponse> createInsertKebutuhanMaintenanceResponse(InsertKebutuhanMaintenanceResponse value) {
        return new JAXBElement<InsertKebutuhanMaintenanceResponse>(_InsertKebutuhanMaintenanceResponse_QNAME, InsertKebutuhanMaintenanceResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNamaAset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setNamaAset")
    public JAXBElement<SetNamaAset> createSetNamaAset(SetNamaAset value) {
        return new JAXBElement<SetNamaAset>(_SetNamaAset_QNAME, SetNamaAset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPemilikAset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setPemilikAset")
    public JAXBElement<SetPemilikAset> createSetPemilikAset(SetPemilikAset value) {
        return new JAXBElement<SetPemilikAset>(_SetPemilikAset_QNAME, SetPemilikAset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetJenisAset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setJenisAset")
    public JAXBElement<SetJenisAset> createSetJenisAset(SetJenisAset value) {
        return new JAXBElement<SetJenisAset>(_SetJenisAset_QNAME, SetJenisAset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsetByJenisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAsetByJenisResponse")
    public JAXBElement<GetAsetByJenisResponse> createGetAsetByJenisResponse(GetAsetByJenisResponse value) {
        return new JAXBElement<GetAsetByJenisResponse>(_GetAsetByJenisResponse_QNAME, GetAsetByJenisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "sayHelloWorldResponse")
    public JAXBElement<SayHelloWorldResponse> createSayHelloWorldResponse(SayHelloWorldResponse value) {
        return new JAXBElement<SayHelloWorldResponse>(_SayHelloWorldResponse_QNAME, SayHelloWorldResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsetByNamaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAsetByNamaResponse")
    public JAXBElement<GetAsetByNamaResponse> createGetAsetByNamaResponse(GetAsetByNamaResponse value) {
        return new JAXBElement<GetAsetByNamaResponse>(_GetAsetByNamaResponse_QNAME, GetAsetByNamaResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFasilitasAsetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getFasilitasAsetResponse")
    public JAXBElement<GetFasilitasAsetResponse> createGetFasilitasAsetResponse(GetFasilitasAsetResponse value) {
        return new JAXBElement<GetFasilitasAsetResponse>(_GetFasilitasAsetResponse_QNAME, GetFasilitasAsetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertFasilitasAset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "insertFasilitasAset")
    public JAXBElement<InsertFasilitasAset> createInsertFasilitasAset(InsertFasilitasAset value) {
        return new JAXBElement<InsertFasilitasAset>(_InsertFasilitasAset_QNAME, InsertFasilitasAset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAsetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "deleteAsetResponse")
    public JAXBElement<DeleteAsetResponse> createDeleteAsetResponse(DeleteAsetResponse value) {
        return new JAXBElement<DeleteAsetResponse>(_DeleteAsetResponse_QNAME, DeleteAsetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetKondisiAset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setKondisiAset")
    public JAXBElement<SetKondisiAset> createSetKondisiAset(SetKondisiAset value) {
        return new JAXBElement<SetKondisiAset>(_SetKondisiAset_QNAME, SetKondisiAset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetJenisAsetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setJenisAsetResponse")
    public JAXBElement<SetJenisAsetResponse> createSetJenisAsetResponse(SetJenisAsetResponse value) {
        return new JAXBElement<SetJenisAsetResponse>(_SetJenisAsetResponse_QNAME, SetJenisAsetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAsetResponse")
    public JAXBElement<GetAsetResponse> createGetAsetResponse(GetAsetResponse value) {
        return new JAXBElement<GetAsetResponse>(_GetAsetResponse_QNAME, GetAsetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifyMaintenanceToVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "notifyMaintenanceToVendor")
    public JAXBElement<NotifyMaintenanceToVendor> createNotifyMaintenanceToVendor(NotifyMaintenanceToVendor value) {
        return new JAXBElement<NotifyMaintenanceToVendor>(_NotifyMaintenanceToVendor_QNAME, NotifyMaintenanceToVendor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNamaAsetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setNamaAsetResponse")
    public JAXBElement<SetNamaAsetResponse> createSetNamaAsetResponse(SetNamaAsetResponse value) {
        return new JAXBElement<SetNamaAsetResponse>(_SetNamaAsetResponse_QNAME, SetNamaAsetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAsetByKategori }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAsetByKategori")
    public JAXBElement<GetAsetByKategori> createGetAsetByKategori(GetAsetByKategori value) {
        return new JAXBElement<GetAsetByKategori>(_GetAsetByKategori_QNAME, GetAsetByKategori.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getAset")
    public JAXBElement<GetAset> createGetAset(GetAset value) {
        return new JAXBElement<GetAset>(_GetAset_QNAME, GetAset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertKebutuhanMaintenance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "insertKebutuhanMaintenance")
    public JAXBElement<InsertKebutuhanMaintenance> createInsertKebutuhanMaintenance(InsertKebutuhanMaintenance value) {
        return new JAXBElement<InsertKebutuhanMaintenance>(_InsertKebutuhanMaintenance_QNAME, InsertKebutuhanMaintenance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetKondisiAsetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "setKondisiAsetResponse")
    public JAXBElement<SetKondisiAsetResponse> createSetKondisiAsetResponse(SetKondisiAsetResponse value) {
        return new JAXBElement<SetKondisiAsetResponse>(_SetKondisiAsetResponse_QNAME, SetKondisiAsetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFasilitasAset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.informatika.org/", name = "getFasilitasAset")
    public JAXBElement<GetFasilitasAset> createGetFasilitasAset(GetFasilitasAset value) {
        return new JAXBElement<GetFasilitasAset>(_GetFasilitasAset_QNAME, GetFasilitasAset.class, null, value);
    }

}
