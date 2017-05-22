/**
 * 
 */
package gov.hhs.fha.nhinc.adapterdocregistry;

import gov.hhs.fha.nhinc.common.nhinccommon.AssertionType;
import gov.hhs.fha.nhinc.messaging.client.CONNECTClient;
import gov.hhs.fha.nhinc.messaging.client.CONNECTClientFactory;
import gov.hhs.fha.nhinc.messaging.service.port.ServicePortDescriptor;

/**
 * @author achidambaram
 * 
 */
public class AdapterDocRegistrySoapClientFactory extends CONNECTClientFactory {

    private static AdapterDocRegistrySoapClientFactory instance = new AdapterDocRegistrySoapClientFactory();

    /*
     * (non-Javadoc)
     * 
     * @see
     * gov.hhs.fha.nhinc.messaging.client.CONNECTClientFactory#getCONNECTClientSecured(gov.hhs.fha.nhinc.messaging.service
     * .port.ServicePortDescriptor, java.lang.String, gov.hhs.fha.nhinc.common.nhinccommon.AssertionType)
     */
    @Override
    public <T> CONNECTClient<T> getCONNECTClientSecured(ServicePortDescriptor<T> portDescriptor, String url,
            AssertionType assertion) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * gov.hhs.fha.nhinc.messaging.client.CONNECTClientFactory#getCONNECTClientSecured(gov.hhs.fha.nhinc.messaging.service
     * .port.ServicePortDescriptor, java.lang.String, gov.hhs.fha.nhinc.common.nhinccommon.AssertionType,
     * java.lang.String, java.lang.String)
     */
    
    public <T> CONNECTClient<T> getCONNECTClientSecured(ServicePortDescriptor<T> portDescriptor, String url,
            AssertionType assertion, String wsAddressing, String subscriptionId) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * gov.hhs.fha.nhinc.messaging.client.CONNECTClientFactory#getCONNECTClientSecured(gov.hhs.fha.nhinc.messaging.service
     * .port.ServicePortDescriptor, gov.hhs.fha.nhinc.common.nhinccommon.AssertionType, java.lang.String,
     * java.lang.String, java.lang.String)
     */
    @Override
    public <T> CONNECTClient<T> getCONNECTClientSecured(ServicePortDescriptor<T> portDescriptor,
            AssertionType assertion, String url, String targetHomeCommunityId, String serviceName) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * gov.hhs.fha.nhinc.messaging.client.CONNECTClientFactory#getCONNECTClientUnsecured(gov.hhs.fha.nhinc.messaging
     * .service.port.ServicePortDescriptor, java.lang.String, gov.hhs.fha.nhinc.common.nhinccommon.AssertionType,
     * java.lang.String)
     */
    /*
     * @Override public <T> CONNECTClient<T> getCONNECTClientUnsecured(ServicePortDescriptor<T> portDescriptor, String
     * url, AssertionType assertion, String methodName) {
     * 
     * return null; }
     */

    /*
     * (non-Javadoc)
     * 
     * @see
     * gov.hhs.fha.nhinc.messaging.client.CONNECTClientFactory#getCONNECTClientUnsecured(gov.hhs.fha.nhinc.messaging
     * .service.port.ServicePortDescriptor, java.lang.String, gov.hhs.fha.nhinc.common.nhinccommon.AssertionType)
     */
    @Override
    public <T> CONNECTClient<T> getCONNECTClientUnsecured(ServicePortDescriptor<T> portDescriptor, String url,
            AssertionType assertion) {
        return new AdapterDocRegistryClientUnsecured<T>(portDescriptor, url, assertion);
    }

    public static CONNECTClientFactory getInstance() {
        return AdapterDocRegistrySoapClientFactory.instance;
    }

}
