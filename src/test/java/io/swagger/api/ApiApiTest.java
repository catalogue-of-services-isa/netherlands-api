/**
 * Dashboard API
 * Dashboard API.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: emidio.stani@pwc.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import io.swagger.model.ListOfPublicServices;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;

import com.fasterxml.jackson.jaxrs.base.ProviderBase;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonJaxbXMLProvider;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Dashboard API
 *
 * <p>Dashboard API.
 *
 * API tests for ApiApi 
 */
public class ApiApiTest {


    private ApiApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider jsonProvider = new JacksonJsonProvider();
        JacksonJaxbXMLProvider xmlProvider =new JacksonJaxbXMLProvider();
        JsonldProvider jsonldProvider = new JsonldProvider();
        AvroProvider avroProvider = new AvroProvider("io.swagger.model.ListOfPublicServices");
        CborProvider cborProvider = new CborProvider();
        ProtobufProvider protobufProvider = new ProtobufProvider("io.swagger.model.ListOfPublicServices");
        IonProvider ionProvider = new IonProvider();
        MsgPackProvider msgPackProvider = new MsgPackProvider();
        BsonProvider bsonProvider = new BsonProvider();
        SmileProvider smileProvider = new SmileProvider();
        
        List<ProviderBase> providers1 = new ArrayList<ProviderBase>();
        providers1.add(jsonProvider);
        providers1.add(xmlProvider);
        
        List<JsonldProvider> providers2 = new ArrayList<JsonldProvider>();
        providers2.add(jsonldProvider);
        
        List<BinaryProvider> providers3 = new ArrayList<BinaryProvider>();
        providers3.add(avroProvider);
        providers3.add(cborProvider); 
        providers3.add(protobufProvider);
        providers3.add(ionProvider);
        providers3.add(msgPackProvider);
        providers3.add(bsonProvider);
        providers3.add(smileProvider);
        
        
        
        
        api = JAXRSClientFactory.create("http://localhost:8080/swagger-cxf-server/api/", ApiApi.class, providers3);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        ClientConfiguration config = WebClient.getConfig(client);
        MediaType arg0 = new MediaType("application","msgpack");
        client.accept(arg0);
    }

    
    /**
     * Validate data
     *
     * Validate data given the url and the profile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDataTest() {
        String profile = null;
        long now = System.currentTimeMillis();
        Timestamp ts = new Timestamp(now);
        System.out.println("Start time:" + ts);
        ListOfPublicServices response = api.getPublicServices("1","10","test");
        //assertNotNull(response);
        // TODO: test validations
        long after = System.currentTimeMillis();
        Timestamp ts2 = new Timestamp(after);
        System.out.println("End time:" + ts2);
        System.out.println("Diff:" + (after-now));
        System.out.println(response.toString());
//        assertEquals("46",response.getViolations().get(0).toString());
        assertNotNull(response.toString());
        
        
        
    }
    
}
