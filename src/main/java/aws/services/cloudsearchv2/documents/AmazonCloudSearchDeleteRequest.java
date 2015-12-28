package aws.services.cloudsearchv2.documents;

/**
 * This is class is used make a delete request for a document.
 * 
 * @author Tahseen Ur Rehman Fida
 * @email tahseen.ur.rehman@gmail.com
 *
 */
public class AmazonCloudSearchDeleteRequest extends AmazonCloudSearchDocumentRequest {

    public AmazonCloudSearchDeleteRequest() {
        super();
    }

    public AmazonCloudSearchDeleteRequest(String id) {
        super(id);
    }

    @Override
    public String getRequestType() {
        return DELETE_DOCUMENT_REQUEST_TYPE;
    }
}
