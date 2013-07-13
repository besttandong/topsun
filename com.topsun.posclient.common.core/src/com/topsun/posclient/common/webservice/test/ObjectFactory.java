
package com.topsun.posclient.common.webservice.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.topsun.posclient.common.webservice.test package. 
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

    private final static QName _GetUserInfoReq_QNAME = new QName("http://www.topsunit.com/rms", "getUserInfoReq");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfgoodsSale_QNAME = new QName("http://www.topsunit.com/rms", "ArrayOfgoodsSale");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ProcessResult_QNAME = new QName("http://www.topsunit.com/rms", "processResult");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _UserCredential_QNAME = new QName("http://www.topsunit.com/rms", "userCredential");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _GetUserInfoResult_QNAME = new QName("http://www.topsunit.com/rms", "getUserInfoResult");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _GoodsSale_QNAME = new QName("http://www.topsunit.com/rms", "goodsSale");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _PartSale_QNAME = new QName("http://www.topsunit.com/rms", "partSale");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _User_QNAME = new QName("http://www.topsunit.com/rms", "user");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Auth_QNAME = new QName("http://www.topsunit.com/rms", "auth");
    private final static QName _ArrayOfpartSale_QNAME = new QName("http://www.topsunit.com/rms", "ArrayOfpartSale");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfauth_QNAME = new QName("http://www.topsunit.com/rms", "ArrayOfauth");
    private final static QName _PartSalesData_QNAME = new QName("http://www.topsunit.com/rms", "partSalesData");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfuser_QNAME = new QName("http://www.topsunit.com/rms", "ArrayOfuser");
    private final static QName _SavePartSalesResult_QNAME = new QName("http://www.topsunit.com/rms", "savePartSalesResult");
    private final static QName _UserEmployeeId_QNAME = new QName("http://www.topsunit.com/rms", "employeeId");
    private final static QName _UserDeptName_QNAME = new QName("http://www.topsunit.com/rms", "deptName");
    private final static QName _UserAuths_QNAME = new QName("http://www.topsunit.com/rms", "auths");
    private final static QName _UserUserCode_QNAME = new QName("http://www.topsunit.com/rms", "userCode");
    private final static QName _UserUserName_QNAME = new QName("http://www.topsunit.com/rms", "userName");
    private final static QName _UserDeptId_QNAME = new QName("http://www.topsunit.com/rms", "deptId");
    private final static QName _UserEmployeeName_QNAME = new QName("http://www.topsunit.com/rms", "employeeName");
    private final static QName _PartSaleCardNo_QNAME = new QName("http://www.topsunit.com/rms", "cardNo");
    private final static QName _PartSaleApplyUser_QNAME = new QName("http://www.topsunit.com/rms", "applyUser");
    private final static QName _PartSaleCheckDate_QNAME = new QName("http://www.topsunit.com/rms", "checkDate");
    private final static QName _PartSaleEnableBalance_QNAME = new QName("http://www.topsunit.com/rms", "enableBalance");
    private final static QName _PartSaleBallotNo_QNAME = new QName("http://www.topsunit.com/rms", "ballotNo");
    private final static QName _PartSaleStoreCode_QNAME = new QName("http://www.topsunit.com/rms", "storeCode");
    private final static QName _PartSaleEnablePoint_QNAME = new QName("http://www.topsunit.com/rms", "enablePoint");
    private final static QName _PartSaleMemberCode_QNAME = new QName("http://www.topsunit.com/rms", "memberCode");
    private final static QName _PartSaleGoodsSales_QNAME = new QName("http://www.topsunit.com/rms", "goodsSales");
    private final static QName _PartSaleSalesDate_QNAME = new QName("http://www.topsunit.com/rms", "salesDate");
    private final static QName _PartSaleRemark_QNAME = new QName("http://www.topsunit.com/rms", "remark");
    private final static QName _PartSaleNo_QNAME = new QName("http://www.topsunit.com/rms", "no");
    private final static QName _PartSaleBalloter_QNAME = new QName("http://www.topsunit.com/rms", "balloter");
    private final static QName _PartSaleChecker_QNAME = new QName("http://www.topsunit.com/rms", "checker");
    private final static QName _SavePartSalesResultResult_QNAME = new QName("http://www.topsunit.com/rms", "result");
    private final static QName _UserCredentialPassWord_QNAME = new QName("http://www.topsunit.com/rms", "passWord");
    private final static QName _SavePartSalesSavePartSalesReq_QNAME = new QName("http://www.topsunit.com/rms", "savePartSalesReq");
    private final static QName _PartSalesDataPartSales_QNAME = new QName("http://www.topsunit.com/rms", "partSales");
    private final static QName _AuthOperationName_QNAME = new QName("http://www.topsunit.com/rms", "operationName");
    private final static QName _AuthIsAuth_QNAME = new QName("http://www.topsunit.com/rms", "isAuth");
    private final static QName _AuthAuthGroupName_QNAME = new QName("http://www.topsunit.com/rms", "authGroupName");
    private final static QName _AuthFunctionName_QNAME = new QName("http://www.topsunit.com/rms", "functionName");
    private final static QName _ProcessResultFlag_QNAME = new QName("http://www.topsunit.com/rms", "flag");
    private final static QName _ProcessResultMsg_QNAME = new QName("http://www.topsunit.com/rms", "msg");
    private final static QName _GetUserInfoResultUsers_QNAME = new QName("http://www.topsunit.com/rms", "users");
    private final static QName _GoodsSaleAmount_QNAME = new QName("http://www.topsunit.com/rms", "amount");
    private final static QName _GoodsSaleRetailPrice_QNAME = new QName("http://www.topsunit.com/rms", "retailPrice");
    private final static QName _GoodsSaleDiscountA_QNAME = new QName("http://www.topsunit.com/rms", "discountA");
    private final static QName _GoodsSaleDiscountB_QNAME = new QName("http://www.topsunit.com/rms", "discountB");
    private final static QName _GoodsSaleSinglePoints_QNAME = new QName("http://www.topsunit.com/rms", "singlePoints");
    private final static QName _GoodsSaleListPrice_QNAME = new QName("http://www.topsunit.com/rms", "listPrice");
    private final static QName _GoodsSaleUnitPrice_QNAME = new QName("http://www.topsunit.com/rms", "unitPrice");
    private final static QName _GoodsSaleNumber_QNAME = new QName("http://www.topsunit.com/rms", "number");
    private final static QName _GoodsSaleItemCode_QNAME = new QName("http://www.topsunit.com/rms", "itemCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.topsun.posclient.common.webservice.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessResult }
     * 
     */
    public ProcessResult createProcessResult() {
        return new ProcessResult();
    }

    /**
     * Create an instance of {@link UserCredential }
     * 
     */
    public UserCredential createUserCredential() {
        return new UserCredential();
    }

    /**
     * Create an instance of {@link ArrayOfauth }
     * 
     */
    public ArrayOfauth createArrayOfauth() {
        return new ArrayOfauth();
    }

    /**
     * Create an instance of {@link PartSalesData }
     * 
     */
    public PartSalesData createPartSalesData() {
        return new PartSalesData();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link GetUserInfoResult }
     * 
     */
    public GetUserInfoResult createGetUserInfoResult() {
        return new GetUserInfoResult();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link GetUserInfoReq }
     * 
     */
    public GetUserInfoReq createGetUserInfoReq() {
        return new GetUserInfoReq();
    }

    /**
     * Create an instance of {@link SavePartSalesResult }
     * 
     */
    public SavePartSalesResult createSavePartSalesResult() {
        return new SavePartSalesResult();
    }

    /**
     * Create an instance of {@link ArrayOfuser }
     * 
     */
    public ArrayOfuser createArrayOfuser() {
        return new ArrayOfuser();
    }

    /**
     * Create an instance of {@link GoodsSale }
     * 
     */
    public GoodsSale createGoodsSale() {
        return new GoodsSale();
    }

    /**
     * Create an instance of {@link PartSale }
     * 
     */
    public PartSale createPartSale() {
        return new PartSale();
    }

    /**
     * Create an instance of {@link SavePartSales }
     * 
     */
    public SavePartSales createSavePartSales() {
        return new SavePartSales();
    }

    /**
     * Create an instance of {@link ArrayOfgoodsSale }
     * 
     */
    public ArrayOfgoodsSale createArrayOfgoodsSale() {
        return new ArrayOfgoodsSale();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link SavePartSalesResponse }
     * 
     */
    public SavePartSalesResponse createSavePartSalesResponse() {
        return new SavePartSalesResponse();
    }

    /**
     * Create an instance of {@link Auth }
     * 
     */
    public Auth createAuth() {
        return new Auth();
    }

    /**
     * Create an instance of {@link ArrayOfpartSale }
     * 
     */
    public ArrayOfpartSale createArrayOfpartSale() {
        return new ArrayOfpartSale();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfoReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "getUserInfoReq")
    public JAXBElement<GetUserInfoReq> createGetUserInfoReq(GetUserInfoReq value) {
        return new JAXBElement<GetUserInfoReq>(_GetUserInfoReq_QNAME, GetUserInfoReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfgoodsSale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "ArrayOfgoodsSale")
    public JAXBElement<ArrayOfgoodsSale> createArrayOfgoodsSale(ArrayOfgoodsSale value) {
        return new JAXBElement<ArrayOfgoodsSale>(_ArrayOfgoodsSale_QNAME, ArrayOfgoodsSale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "processResult")
    public JAXBElement<ProcessResult> createProcessResult(ProcessResult value) {
        return new JAXBElement<ProcessResult>(_ProcessResult_QNAME, ProcessResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserCredential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "userCredential")
    public JAXBElement<UserCredential> createUserCredential(UserCredential value) {
        return new JAXBElement<UserCredential>(_UserCredential_QNAME, UserCredential.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "getUserInfoResult")
    public JAXBElement<GetUserInfoResult> createGetUserInfoResult(GetUserInfoResult value) {
        return new JAXBElement<GetUserInfoResult>(_GetUserInfoResult_QNAME, GetUserInfoResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsSale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "goodsSale")
    public JAXBElement<GoodsSale> createGoodsSale(GoodsSale value) {
        return new JAXBElement<GoodsSale>(_GoodsSale_QNAME, GoodsSale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartSale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "partSale")
    public JAXBElement<PartSale> createPartSale(PartSale value) {
        return new JAXBElement<PartSale>(_PartSale_QNAME, PartSale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Auth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "auth")
    public JAXBElement<Auth> createAuth(Auth value) {
        return new JAXBElement<Auth>(_Auth_QNAME, Auth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfpartSale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "ArrayOfpartSale")
    public JAXBElement<ArrayOfpartSale> createArrayOfpartSale(ArrayOfpartSale value) {
        return new JAXBElement<ArrayOfpartSale>(_ArrayOfpartSale_QNAME, ArrayOfpartSale.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "ArrayOfauth")
    public JAXBElement<ArrayOfauth> createArrayOfauth(ArrayOfauth value) {
        return new JAXBElement<ArrayOfauth>(_ArrayOfauth_QNAME, ArrayOfauth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartSalesData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "partSalesData")
    public JAXBElement<PartSalesData> createPartSalesData(PartSalesData value) {
        return new JAXBElement<PartSalesData>(_PartSalesData_QNAME, PartSalesData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfuser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "ArrayOfuser")
    public JAXBElement<ArrayOfuser> createArrayOfuser(ArrayOfuser value) {
        return new JAXBElement<ArrayOfuser>(_ArrayOfuser_QNAME, ArrayOfuser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePartSalesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "savePartSalesResult")
    public JAXBElement<SavePartSalesResult> createSavePartSalesResult(SavePartSalesResult value) {
        return new JAXBElement<SavePartSalesResult>(_SavePartSalesResult_QNAME, SavePartSalesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "employeeId", scope = User.class)
    public JAXBElement<Integer> createUserEmployeeId(Integer value) {
        return new JAXBElement<Integer>(_UserEmployeeId_QNAME, Integer.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "deptName", scope = User.class)
    public JAXBElement<String> createUserDeptName(String value) {
        return new JAXBElement<String>(_UserDeptName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfauth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "auths", scope = User.class)
    public JAXBElement<ArrayOfauth> createUserAuths(ArrayOfauth value) {
        return new JAXBElement<ArrayOfauth>(_UserAuths_QNAME, ArrayOfauth.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "userCode", scope = User.class)
    public JAXBElement<String> createUserUserCode(String value) {
        return new JAXBElement<String>(_UserUserCode_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "userName", scope = User.class)
    public JAXBElement<String> createUserUserName(String value) {
        return new JAXBElement<String>(_UserUserName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "deptId", scope = User.class)
    public JAXBElement<Integer> createUserDeptId(Integer value) {
        return new JAXBElement<Integer>(_UserDeptId_QNAME, Integer.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "employeeName", scope = User.class)
    public JAXBElement<String> createUserEmployeeName(String value) {
        return new JAXBElement<String>(_UserEmployeeName_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "cardNo", scope = PartSale.class)
    public JAXBElement<String> createPartSaleCardNo(String value) {
        return new JAXBElement<String>(_PartSaleCardNo_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "applyUser", scope = PartSale.class)
    public JAXBElement<String> createPartSaleApplyUser(String value) {
        return new JAXBElement<String>(_PartSaleApplyUser_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "checkDate", scope = PartSale.class)
    public JAXBElement<String> createPartSaleCheckDate(String value) {
        return new JAXBElement<String>(_PartSaleCheckDate_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "enableBalance", scope = PartSale.class)
    public JAXBElement<String> createPartSaleEnableBalance(String value) {
        return new JAXBElement<String>(_PartSaleEnableBalance_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "ballotNo", scope = PartSale.class)
    public JAXBElement<String> createPartSaleBallotNo(String value) {
        return new JAXBElement<String>(_PartSaleBallotNo_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "storeCode", scope = PartSale.class)
    public JAXBElement<String> createPartSaleStoreCode(String value) {
        return new JAXBElement<String>(_PartSaleStoreCode_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "enablePoint", scope = PartSale.class)
    public JAXBElement<String> createPartSaleEnablePoint(String value) {
        return new JAXBElement<String>(_PartSaleEnablePoint_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "memberCode", scope = PartSale.class)
    public JAXBElement<String> createPartSaleMemberCode(String value) {
        return new JAXBElement<String>(_PartSaleMemberCode_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfgoodsSale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "goodsSales", scope = PartSale.class)
    public JAXBElement<ArrayOfgoodsSale> createPartSaleGoodsSales(ArrayOfgoodsSale value) {
        return new JAXBElement<ArrayOfgoodsSale>(_PartSaleGoodsSales_QNAME, ArrayOfgoodsSale.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "salesDate", scope = PartSale.class)
    public JAXBElement<String> createPartSaleSalesDate(String value) {
        return new JAXBElement<String>(_PartSaleSalesDate_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "remark", scope = PartSale.class)
    public JAXBElement<String> createPartSaleRemark(String value) {
        return new JAXBElement<String>(_PartSaleRemark_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "no", scope = PartSale.class)
    public JAXBElement<String> createPartSaleNo(String value) {
        return new JAXBElement<String>(_PartSaleNo_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "balloter", scope = PartSale.class)
    public JAXBElement<String> createPartSaleBalloter(String value) {
        return new JAXBElement<String>(_PartSaleBalloter_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "checker", scope = PartSale.class)
    public JAXBElement<String> createPartSaleChecker(String value) {
        return new JAXBElement<String>(_PartSaleChecker_QNAME, String.class, PartSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "result", scope = SavePartSalesResult.class)
    public JAXBElement<ProcessResult> createSavePartSalesResultResult(ProcessResult value) {
        return new JAXBElement<ProcessResult>(_SavePartSalesResultResult_QNAME, ProcessResult.class, SavePartSalesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "userName", scope = UserCredential.class)
    public JAXBElement<String> createUserCredentialUserName(String value) {
        return new JAXBElement<String>(_UserUserName_QNAME, String.class, UserCredential.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "passWord", scope = UserCredential.class)
    public JAXBElement<String> createUserCredentialPassWord(String value) {
        return new JAXBElement<String>(_UserCredentialPassWord_QNAME, String.class, UserCredential.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartSalesData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "savePartSalesReq", scope = SavePartSales.class)
    public JAXBElement<PartSalesData> createSavePartSalesSavePartSalesReq(PartSalesData value) {
        return new JAXBElement<PartSalesData>(_SavePartSalesSavePartSalesReq_QNAME, PartSalesData.class, SavePartSales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfoReq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "getUserInfoReq", scope = GetUserInfo.class)
    public JAXBElement<GetUserInfoReq> createGetUserInfoGetUserInfoReq(GetUserInfoReq value) {
        return new JAXBElement<GetUserInfoReq>(_GetUserInfoReq_QNAME, GetUserInfoReq.class, GetUserInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserCredential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "userCredential", scope = PartSalesData.class)
    public JAXBElement<UserCredential> createPartSalesDataUserCredential(UserCredential value) {
        return new JAXBElement<UserCredential>(_UserCredential_QNAME, UserCredential.class, PartSalesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfpartSale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "partSales", scope = PartSalesData.class)
    public JAXBElement<ArrayOfpartSale> createPartSalesDataPartSales(ArrayOfpartSale value) {
        return new JAXBElement<ArrayOfpartSale>(_PartSalesDataPartSales_QNAME, ArrayOfpartSale.class, PartSalesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "operationName", scope = Auth.class)
    public JAXBElement<String> createAuthOperationName(String value) {
        return new JAXBElement<String>(_AuthOperationName_QNAME, String.class, Auth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "isAuth", scope = Auth.class)
    public JAXBElement<String> createAuthIsAuth(String value) {
        return new JAXBElement<String>(_AuthIsAuth_QNAME, String.class, Auth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "authGroupName", scope = Auth.class)
    public JAXBElement<String> createAuthAuthGroupName(String value) {
        return new JAXBElement<String>(_AuthAuthGroupName_QNAME, String.class, Auth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "functionName", scope = Auth.class)
    public JAXBElement<String> createAuthFunctionName(String value) {
        return new JAXBElement<String>(_AuthFunctionName_QNAME, String.class, Auth.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePartSalesResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "savePartSalesResult", scope = SavePartSalesResponse.class)
    public JAXBElement<SavePartSalesResult> createSavePartSalesResponseSavePartSalesResult(SavePartSalesResult value) {
        return new JAXBElement<SavePartSalesResult>(_SavePartSalesResult_QNAME, SavePartSalesResult.class, SavePartSalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserCredential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "userCredential", scope = GetUserInfoReq.class)
    public JAXBElement<UserCredential> createGetUserInfoReqUserCredential(UserCredential value) {
        return new JAXBElement<UserCredential>(_UserCredential_QNAME, UserCredential.class, GetUserInfoReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "userCode", scope = GetUserInfoReq.class)
    public JAXBElement<String> createGetUserInfoReqUserCode(String value) {
        return new JAXBElement<String>(_UserUserCode_QNAME, String.class, GetUserInfoReq.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "flag", scope = ProcessResult.class)
    public JAXBElement<String> createProcessResultFlag(String value) {
        return new JAXBElement<String>(_ProcessResultFlag_QNAME, String.class, ProcessResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "msg", scope = ProcessResult.class)
    public JAXBElement<String> createProcessResultMsg(String value) {
        return new JAXBElement<String>(_ProcessResultMsg_QNAME, String.class, ProcessResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "getUserInfoResult", scope = GetUserInfoResponse.class)
    public JAXBElement<GetUserInfoResult> createGetUserInfoResponseGetUserInfoResult(GetUserInfoResult value) {
        return new JAXBElement<GetUserInfoResult>(_GetUserInfoResult_QNAME, GetUserInfoResult.class, GetUserInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "result", scope = GetUserInfoResult.class)
    public JAXBElement<ProcessResult> createGetUserInfoResultResult(ProcessResult value) {
        return new JAXBElement<ProcessResult>(_SavePartSalesResultResult_QNAME, ProcessResult.class, GetUserInfoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfuser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "users", scope = GetUserInfoResult.class)
    public JAXBElement<ArrayOfuser> createGetUserInfoResultUsers(ArrayOfuser value) {
        return new JAXBElement<ArrayOfuser>(_GetUserInfoResultUsers_QNAME, ArrayOfuser.class, GetUserInfoResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "amount", scope = GoodsSale.class)
    public JAXBElement<String> createGoodsSaleAmount(String value) {
        return new JAXBElement<String>(_GoodsSaleAmount_QNAME, String.class, GoodsSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "retailPrice", scope = GoodsSale.class)
    public JAXBElement<String> createGoodsSaleRetailPrice(String value) {
        return new JAXBElement<String>(_GoodsSaleRetailPrice_QNAME, String.class, GoodsSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "discountA", scope = GoodsSale.class)
    public JAXBElement<String> createGoodsSaleDiscountA(String value) {
        return new JAXBElement<String>(_GoodsSaleDiscountA_QNAME, String.class, GoodsSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "discountB", scope = GoodsSale.class)
    public JAXBElement<String> createGoodsSaleDiscountB(String value) {
        return new JAXBElement<String>(_GoodsSaleDiscountB_QNAME, String.class, GoodsSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "singlePoints", scope = GoodsSale.class)
    public JAXBElement<String> createGoodsSaleSinglePoints(String value) {
        return new JAXBElement<String>(_GoodsSaleSinglePoints_QNAME, String.class, GoodsSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "listPrice", scope = GoodsSale.class)
    public JAXBElement<String> createGoodsSaleListPrice(String value) {
        return new JAXBElement<String>(_GoodsSaleListPrice_QNAME, String.class, GoodsSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "unitPrice", scope = GoodsSale.class)
    public JAXBElement<String> createGoodsSaleUnitPrice(String value) {
        return new JAXBElement<String>(_GoodsSaleUnitPrice_QNAME, String.class, GoodsSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "number", scope = GoodsSale.class)
    public JAXBElement<String> createGoodsSaleNumber(String value) {
        return new JAXBElement<String>(_GoodsSaleNumber_QNAME, String.class, GoodsSale.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topsunit.com/rms", name = "itemCode", scope = GoodsSale.class)
    public JAXBElement<String> createGoodsSaleItemCode(String value) {
        return new JAXBElement<String>(_GoodsSaleItemCode_QNAME, String.class, GoodsSale.class, value);
    }

}
