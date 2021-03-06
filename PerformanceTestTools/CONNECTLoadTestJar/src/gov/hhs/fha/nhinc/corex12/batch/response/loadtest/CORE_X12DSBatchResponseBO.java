package gov.hhs.fha.nhinc.corex12.batch.response.loadtest;

import gov.hhs.fha.nhinc.common.nhinccommon.AssertionType;
import gov.hhs.fha.nhinc.corex12.docsubmission.genericbatch.response.adapter.proxy.AdapterCORE_X12DGenericBatchResponseProxy;
import gov.hhs.fha.nhinc.loadtest.DataManager;
import org.caqh.soap.wsdl.corerule2_2_0.COREEnvelopeBatchSubmission;
import org.caqh.soap.wsdl.corerule2_2_0.COREEnvelopeBatchSubmissionResponse;
import org.apache.log4j.Logger;

public class CORE_X12DSBatchResponseBO implements AdapterCORE_X12DGenericBatchResponseProxy {

    private static final Logger LOG = Logger.getLogger(CORE_X12DSBatchResponseBO.class);

    @Override
    public COREEnvelopeBatchSubmissionResponse batchSubmitTransaction(COREEnvelopeBatchSubmission msg, AssertionType assertion) {
        DataManager dm = DataManager.getInstance();
        COREEnvelopeBatchSubmissionResponse response = null;

        try {
            response = dm.getCannedCoreX12BatchResponse();
        } catch (Exception e) {
            LOG.error("Exception occurred retriving response: " + e.getLocalizedMessage(), e);
        }

        return response;
    }

}
