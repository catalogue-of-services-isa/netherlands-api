
package gov.loc.zing.srw;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.oasis_open.docs.ns.search_ws.facetedresults.FacetedResultsDefinition;
import org.oasis_open.docs.ns.search_ws.scan.ScanResponseDefinition;
import org.oasis_open.docs.ns.search_ws.searchresultanalysis.SearchResultAnalysisDefinition;
import org.oasis_open.docs.ns.search_ws.xcql.XcqlDefinition;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.loc.zing.srw package. 
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

    private final static QName _SearchRetrieveResponse_QNAME = new QName("http://www.loc.gov/zing/srw/", "searchRetrieveResponse");
    private final static QName _ExplainResponse_QNAME = new QName("http://www.loc.gov/zing/srw/", "explainResponse");
    private final static QName _ScanResponse_QNAME = new QName("http://www.loc.gov/zing/srw/", "scanResponse");
    private final static QName _Ascending_QNAME = new QName("http://www.loc.gov/zing/srw/", "ascending");
    private final static QName _CaseSensitive_QNAME = new QName("http://www.loc.gov/zing/srw/", "caseSensitive");
    private final static QName _Diagnostics_QNAME = new QName("http://www.loc.gov/zing/srw/", "diagnostics");
    private final static QName _DisplayTerm_QNAME = new QName("http://www.loc.gov/zing/srw/", "displayTerm");
    private final static QName _EchoedExplainRequest_QNAME = new QName("http://www.loc.gov/zing/srw/", "echoedExplainRequest");
    private final static QName _EchoedSearchRetrieveRequest_QNAME = new QName("http://www.loc.gov/zing/srw/", "echoedSearchRetrieveRequest");
    private final static QName _ExtraRecordData_QNAME = new QName("http://www.loc.gov/zing/srw/", "extraRecordData");
    private final static QName _ExtraRequestData_QNAME = new QName("http://www.loc.gov/zing/srw/", "extraRequestData");
    private final static QName _ExtraRequestParameter_QNAME = new QName("http://www.loc.gov/zing/srw/", "extraRequestParameter");
    private final static QName _ExtraResponseData_QNAME = new QName("http://www.loc.gov/zing/srw/", "extraResponseData");
    private final static QName _FacetedResults_QNAME = new QName("http://www.loc.gov/zing/srw/", "facetedResults");
    private final static QName _FacetParameters_QNAME = new QName("http://www.loc.gov/zing/srw/", "facetParameters");
    private final static QName _HttpAccept_QNAME = new QName("http://www.loc.gov/zing/srw/", "httpAccept");
    private final static QName _MaximumRecords_QNAME = new QName("http://www.loc.gov/zing/srw/", "maximumRecords");
    private final static QName _MissingValue_QNAME = new QName("http://www.loc.gov/zing/srw/", "missingValue");
    private final static QName _NextRecordPosition_QNAME = new QName("http://www.loc.gov/zing/srw/", "nextRecordPosition");
    private final static QName _NumberOfRecords_QNAME = new QName("http://www.loc.gov/zing/srw/", "numberOfRecords");
    private final static QName _Path_QNAME = new QName("http://www.loc.gov/zing/srw/", "path");
    private final static QName _QueryType_QNAME = new QName("http://www.loc.gov/zing/srw/", "queryType");
    private final static QName _Query_QNAME = new QName("http://www.loc.gov/zing/srw/", "query");
    private final static QName _Record_QNAME = new QName("http://www.loc.gov/zing/srw/", "record");
    private final static QName _RecordData_QNAME = new QName("http://www.loc.gov/zing/srw/", "recordData");
    private final static QName _RecordXMLEscaping_QNAME = new QName("http://www.loc.gov/zing/srw/", "recordXMLEscaping");
    private final static QName _RecordPacking_QNAME = new QName("http://www.loc.gov/zing/srw/", "recordPacking");
    private final static QName _RecordPosition_QNAME = new QName("http://www.loc.gov/zing/srw/", "recordPosition");
    private final static QName _Records_QNAME = new QName("http://www.loc.gov/zing/srw/", "records");
    private final static QName _RecordSchema_QNAME = new QName("http://www.loc.gov/zing/srw/", "recordSchema");
    private final static QName _RenderedBy_QNAME = new QName("http://www.loc.gov/zing/srw/", "renderedBy");
    private final static QName _ResponsePosition_QNAME = new QName("http://www.loc.gov/zing/srw/", "responsePosition");
    private final static QName _ResponseType_QNAME = new QName("http://www.loc.gov/zing/srw/", "responseType");
    private final static QName _ResultCountPrecision_QNAME = new QName("http://www.loc.gov/zing/srw/", "resultCountPrecision");
    private final static QName _ResultSetId_QNAME = new QName("http://www.loc.gov/zing/srw/", "resultSetId");
    private final static QName _ResultSetIdleTime_QNAME = new QName("http://www.loc.gov/zing/srw/", "resultSetIdleTime");
    private final static QName _ResultSetTTL_QNAME = new QName("http://www.loc.gov/zing/srw/", "resultSetTTL");
    private final static QName _Schema_QNAME = new QName("http://www.loc.gov/zing/srw/", "schema");
    private final static QName _SearchResultAnalysis_QNAME = new QName("http://www.loc.gov/zing/srw/", "searchResultAnalysis");
    private final static QName _SortKey_QNAME = new QName("http://www.loc.gov/zing/srw/", "sortKey");
    private final static QName _SortKeys_QNAME = new QName("http://www.loc.gov/zing/srw/", "sortKeys");
    private final static QName _StartRecord_QNAME = new QName("http://www.loc.gov/zing/srw/", "startRecord");
    private final static QName _Stylesheet_QNAME = new QName("http://www.loc.gov/zing/srw/", "stylesheet");
    private final static QName _Value_QNAME = new QName("http://www.loc.gov/zing/srw/", "value");
    private final static QName _Version_QNAME = new QName("http://www.loc.gov/zing/srw/", "version");
    private final static QName _XQuery_QNAME = new QName("http://www.loc.gov/zing/srw/", "xQuery");
    private final static QName _XSortKeys_QNAME = new QName("http://www.loc.gov/zing/srw/", "xSortKeys");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.loc.zing.srw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchRetrieveResponseDefinition }
     * 
     */
    public SearchRetrieveResponseDefinition createSearchRetrieveResponseDefinition() {
        return new SearchRetrieveResponseDefinition();
    }

    /**
     * Create an instance of {@link ExplainResponseDefinition }
     * 
     */
    public ExplainResponseDefinition createExplainResponseDefinition() {
        return new ExplainResponseDefinition();
    }

    /**
     * Create an instance of {@link DiagnosticsDefinition }
     * 
     */
    public DiagnosticsDefinition createDiagnosticsDefinition() {
        return new DiagnosticsDefinition();
    }

    /**
     * Create an instance of {@link EchoedExplainRequestDefinition }
     * 
     */
    public EchoedExplainRequestDefinition createEchoedExplainRequestDefinition() {
        return new EchoedExplainRequestDefinition();
    }

    /**
     * Create an instance of {@link EchoedSearchRetrieveRequestDefinition }
     * 
     */
    public EchoedSearchRetrieveRequestDefinition createEchoedSearchRetrieveRequestDefinition() {
        return new EchoedSearchRetrieveRequestDefinition();
    }

    /**
     * Create an instance of {@link ExtensionDefinition }
     * 
     */
    public ExtensionDefinition createExtensionDefinition() {
        return new ExtensionDefinition();
    }

    /**
     * Create an instance of {@link RecordDefinition }
     * 
     */
    public RecordDefinition createRecordDefinition() {
        return new RecordDefinition();
    }

    /**
     * Create an instance of {@link StringOrXmlFragmentDefinition }
     * 
     */
    public StringOrXmlFragmentDefinition createStringOrXmlFragmentDefinition() {
        return new StringOrXmlFragmentDefinition();
    }

    /**
     * Create an instance of {@link RecordsDefinition }
     * 
     */
    public RecordsDefinition createRecordsDefinition() {
        return new RecordsDefinition();
    }

    /**
     * Create an instance of {@link SortKeyDefinition }
     * 
     */
    public SortKeyDefinition createSortKeyDefinition() {
        return new SortKeyDefinition();
    }

    /**
     * Create an instance of {@link XSortKeysDefinition }
     * 
     */
    public XSortKeysDefinition createXSortKeysDefinition() {
        return new XSortKeysDefinition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRetrieveResponseDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "searchRetrieveResponse")
    public JAXBElement<SearchRetrieveResponseDefinition> createSearchRetrieveResponse(SearchRetrieveResponseDefinition value) {
        return new JAXBElement<SearchRetrieveResponseDefinition>(_SearchRetrieveResponse_QNAME, SearchRetrieveResponseDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplainResponseDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "explainResponse")
    public JAXBElement<ExplainResponseDefinition> createExplainResponse(ExplainResponseDefinition value) {
        return new JAXBElement<ExplainResponseDefinition>(_ExplainResponse_QNAME, ExplainResponseDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScanResponseDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "scanResponse")
    public JAXBElement<ScanResponseDefinition> createScanResponse(ScanResponseDefinition value) {
        return new JAXBElement<ScanResponseDefinition>(_ScanResponse_QNAME, ScanResponseDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "ascending")
    public JAXBElement<Boolean> createAscending(Boolean value) {
        return new JAXBElement<Boolean>(_Ascending_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "caseSensitive")
    public JAXBElement<Boolean> createCaseSensitive(Boolean value) {
        return new JAXBElement<Boolean>(_CaseSensitive_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticsDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "diagnostics")
    public JAXBElement<DiagnosticsDefinition> createDiagnostics(DiagnosticsDefinition value) {
        return new JAXBElement<DiagnosticsDefinition>(_Diagnostics_QNAME, DiagnosticsDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "displayTerm")
    public JAXBElement<String> createDisplayTerm(String value) {
        return new JAXBElement<String>(_DisplayTerm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoedExplainRequestDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "echoedExplainRequest")
    public JAXBElement<EchoedExplainRequestDefinition> createEchoedExplainRequest(EchoedExplainRequestDefinition value) {
        return new JAXBElement<EchoedExplainRequestDefinition>(_EchoedExplainRequest_QNAME, EchoedExplainRequestDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoedSearchRetrieveRequestDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "echoedSearchRetrieveRequest")
    public JAXBElement<EchoedSearchRetrieveRequestDefinition> createEchoedSearchRetrieveRequest(EchoedSearchRetrieveRequestDefinition value) {
        return new JAXBElement<EchoedSearchRetrieveRequestDefinition>(_EchoedSearchRetrieveRequest_QNAME, EchoedSearchRetrieveRequestDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "extraRecordData")
    public JAXBElement<ExtensionDefinition> createExtraRecordData(ExtensionDefinition value) {
        return new JAXBElement<ExtensionDefinition>(_ExtraRecordData_QNAME, ExtensionDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "extraRequestData")
    public JAXBElement<ExtensionDefinition> createExtraRequestData(ExtensionDefinition value) {
        return new JAXBElement<ExtensionDefinition>(_ExtraRequestData_QNAME, ExtensionDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "extraRequestParameter")
    public JAXBElement<String> createExtraRequestParameter(String value) {
        return new JAXBElement<String>(_ExtraRequestParameter_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "extraResponseData")
    public JAXBElement<ExtensionDefinition> createExtraResponseData(ExtensionDefinition value) {
        return new JAXBElement<ExtensionDefinition>(_ExtraResponseData_QNAME, ExtensionDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacetedResultsDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "facetedResults")
    public JAXBElement<FacetedResultsDefinition> createFacetedResults(FacetedResultsDefinition value) {
        return new JAXBElement<FacetedResultsDefinition>(_FacetedResults_QNAME, FacetedResultsDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "facetParameters")
    public JAXBElement<String> createFacetParameters(String value) {
        return new JAXBElement<String>(_FacetParameters_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "httpAccept")
    public JAXBElement<String> createHttpAccept(String value) {
        return new JAXBElement<String>(_HttpAccept_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "maximumRecords")
    public JAXBElement<BigInteger> createMaximumRecords(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaximumRecords_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "missingValue")
    public JAXBElement<String> createMissingValue(String value) {
        return new JAXBElement<String>(_MissingValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "nextRecordPosition")
    public JAXBElement<BigInteger> createNextRecordPosition(BigInteger value) {
        return new JAXBElement<BigInteger>(_NextRecordPosition_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "numberOfRecords")
    public JAXBElement<BigInteger> createNumberOfRecords(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfRecords_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "path")
    public JAXBElement<String> createPath(String value) {
        return new JAXBElement<String>(_Path_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "queryType")
    public JAXBElement<String> createQueryType(String value) {
        return new JAXBElement<String>(_QueryType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "query")
    public JAXBElement<String> createQuery(String value) {
        return new JAXBElement<String>(_Query_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "record")
    public JAXBElement<RecordDefinition> createRecord(RecordDefinition value) {
        return new JAXBElement<RecordDefinition>(_Record_QNAME, RecordDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOrXmlFragmentDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "recordData")
    public JAXBElement<StringOrXmlFragmentDefinition> createRecordData(StringOrXmlFragmentDefinition value) {
        return new JAXBElement<StringOrXmlFragmentDefinition>(_RecordData_QNAME, StringOrXmlFragmentDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordXMLEscapingDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "recordXMLEscaping")
    public JAXBElement<RecordXMLEscapingDefinition> createRecordXMLEscaping(RecordXMLEscapingDefinition value) {
        return new JAXBElement<RecordXMLEscapingDefinition>(_RecordXMLEscaping_QNAME, RecordXMLEscapingDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "recordPacking")
    public JAXBElement<String> createRecordPacking(String value) {
        return new JAXBElement<String>(_RecordPacking_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "recordPosition")
    public JAXBElement<BigInteger> createRecordPosition(BigInteger value) {
        return new JAXBElement<BigInteger>(_RecordPosition_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordsDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "records")
    public JAXBElement<RecordsDefinition> createRecords(RecordsDefinition value) {
        return new JAXBElement<RecordsDefinition>(_Records_QNAME, RecordsDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "recordSchema")
    public JAXBElement<String> createRecordSchema(String value) {
        return new JAXBElement<String>(_RecordSchema_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenderedByDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "renderedBy")
    public JAXBElement<RenderedByDefinition> createRenderedBy(RenderedByDefinition value) {
        return new JAXBElement<RenderedByDefinition>(_RenderedBy_QNAME, RenderedByDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "responsePosition")
    public JAXBElement<BigInteger> createResponsePosition(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResponsePosition_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "responseType")
    public JAXBElement<String> createResponseType(String value) {
        return new JAXBElement<String>(_ResponseType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "resultCountPrecision")
    public JAXBElement<String> createResultCountPrecision(String value) {
        return new JAXBElement<String>(_ResultCountPrecision_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "resultSetId")
    public JAXBElement<String> createResultSetId(String value) {
        return new JAXBElement<String>(_ResultSetId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "resultSetIdleTime")
    public JAXBElement<BigInteger> createResultSetIdleTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResultSetIdleTime_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "resultSetTTL")
    public JAXBElement<BigInteger> createResultSetTTL(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResultSetTTL_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "schema")
    public JAXBElement<String> createSchema(String value) {
        return new JAXBElement<String>(_Schema_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResultAnalysisDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "searchResultAnalysis")
    public JAXBElement<SearchResultAnalysisDefinition> createSearchResultAnalysis(SearchResultAnalysisDefinition value) {
        return new JAXBElement<SearchResultAnalysisDefinition>(_SearchResultAnalysis_QNAME, SearchResultAnalysisDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortKeyDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "sortKey")
    public JAXBElement<SortKeyDefinition> createSortKey(SortKeyDefinition value) {
        return new JAXBElement<SortKeyDefinition>(_SortKey_QNAME, SortKeyDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "sortKeys")
    public JAXBElement<String> createSortKeys(String value) {
        return new JAXBElement<String>(_SortKeys_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "startRecord", defaultValue = "1")
    public JAXBElement<BigInteger> createStartRecord(BigInteger value) {
        return new JAXBElement<BigInteger>(_StartRecord_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "stylesheet")
    public JAXBElement<String> createStylesheet(String value) {
        return new JAXBElement<String>(_Stylesheet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XcqlDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "xQuery")
    public JAXBElement<XcqlDefinition> createXQuery(XcqlDefinition value) {
        return new JAXBElement<XcqlDefinition>(_XQuery_QNAME, XcqlDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XSortKeysDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "xSortKeys")
    public JAXBElement<XSortKeysDefinition> createXSortKeys(XSortKeysDefinition value) {
        return new JAXBElement<XSortKeysDefinition>(_XSortKeys_QNAME, XSortKeysDefinition.class, null, value);
    }

}
