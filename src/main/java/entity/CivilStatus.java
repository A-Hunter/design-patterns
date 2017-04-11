package entity;

/**
 * Created by Ghazi Ennacer on 12/04/2017.
 */
public enum CivilStatus {
    SINGLE("Single"), MARRIED("Married");

    public String status;

    CivilStatus(String status) {
        this.status = status;
    }

    public static String getStatus(CivilStatus status) {
        return status.status;
    }
}
