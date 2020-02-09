package smartshare.administrationservice.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ObjectAccessRequestFromUi {

    private String userName;
    private String bucketName;
    private String objectName;
    private String ownerName;
    private String access;

    public ObjectAccessRequestFromUi(String userName, String bucketName, String objectName, String ownerName, String access) {
        this.userName = userName;
        this.bucketName = bucketName;
        this.objectName = objectName;
        this.ownerName = ownerName;
        this.access = access;
    }

    public String getUserName() {
        return userName;
    }

    public String getBucketName() {
        return bucketName;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAccess() {
        return access;
    }

    @Override
    public String toString() {
        return "ObjectAccessRequestFromUi{" +
                "userName='" + userName + '\'' +
                ", bucketName='" + bucketName + '\'' +
                ", objectName='" + objectName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", access='" + access + '\'' +
                '}';
    }
}
