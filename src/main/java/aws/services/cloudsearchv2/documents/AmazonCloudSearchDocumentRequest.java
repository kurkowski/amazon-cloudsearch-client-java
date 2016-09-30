package aws.services.cloudsearchv2.documents;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * This is the superclass for requests to add/update or delete a document.
 */
public abstract class AmazonCloudSearchDocumentRequest {

    public static final String ADD_DOCUMENT_REQUEST_TYPE = "add";
    public static final String DELETE_DOCUMENT_REQUEST_TYPE = "delete";

    /**
     * A unique ID for the document (docid).
     *
     * A document ID can contain the following characters: a-z (lower-case letters), 0-9, and _ (underscore). Document IDs cannot begin with an underscore.
     */
    public String id;

    /**
     * A document version number for the add or delete operation. The version is used to guarantee that older updates aren't accidentally applied,
     * and to provide control over the ordering of concurrent updates to the service. The document service guarantees that the update with the
     * highest version will be applied and remain there until an add or delete operation with a higher version number and the same document ID is
     * received. If you submit multiple add or delete operations with the same version number, which one takes precedence is undefined.
     * You must increase the version number every time you submit a new add or delete operation for a document.
     */
    public long version = 1;

    public AmazonCloudSearchDocumentRequest() {
        super();
    }

    public AmazonCloudSearchDocumentRequest(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public abstract String getRequestType();
}
