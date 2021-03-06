package org.oasis_open.docs.ns.search_ws.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-05-27T16:57:51.028+02:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "SearchRetrieveService",
                  wsdlLocation = "file:/C:/Users/servaism/git/netherlands-api/src/main/resources/wsdl/sru-wsdl11.wsdl",
                  targetNamespace = "http://docs.oasis-open.org/ns/search-ws/soap")
public class SearchRetrieveService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://docs.oasis-open.org/ns/search-ws/soap", "SearchRetrieveService");
    public final static QName SearchRetrievePort = new QName("http://docs.oasis-open.org/ns/search-ws/soap", "SearchRetrievePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/servaism/git/netherlands-api/src/main/resources/wsdl/sru-wsdl11.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SearchRetrieveService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/servaism/git/netherlands-api/src/main/resources/wsdl/sru-wsdl11.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SearchRetrieveService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SearchRetrieveService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SearchRetrieveService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SearchRetrieveService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SearchRetrieveService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SearchRetrieveService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SearchRetrievePortType
     */
    @WebEndpoint(name = "SearchRetrievePort")
    public SearchRetrievePortType getSearchRetrievePort() {
        return super.getPort(SearchRetrievePort, SearchRetrievePortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SearchRetrievePortType
     */
    @WebEndpoint(name = "SearchRetrievePort")
    public SearchRetrievePortType getSearchRetrievePort(WebServiceFeature... features) {
        return super.getPort(SearchRetrievePort, SearchRetrievePortType.class, features);
    }

}
