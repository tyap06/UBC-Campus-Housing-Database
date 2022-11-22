package Model;

import java.util.Date;

public class ResidenceStaff extends Model{
    int staffID;
    String staffName;
    Date birthDate;
    int sinNo;
    String residenceLifePosition;
    String buildingMaintenanceTitle;
    String diningHall;
    String diningHallPosition;

    public ResidenceStaff(int staffID, String staffName, Date birthDate, int sinNo, String residenceLifePosition, String buildingMaintenanceTitle, String diningHall, String diningHallPosition) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.birthDate = birthDate;
        this.sinNo = sinNo;
        this.residenceLifePosition = residenceLifePosition;
        this.buildingMaintenanceTitle = buildingMaintenanceTitle;
        this.diningHall = diningHall;
        this.diningHallPosition = diningHallPosition;
    }

    public int getStaffID() {
        return this.staffID;
    }

    public String getStaffName() {
        return this.staffName;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public int getSinNo() {
        return this.sinNo;
    }

    public String getResidenceLifePosition() {
        return this.residenceLifePosition;
    }

    public String getBuildingMaintenanceTitle() {
        return this.buildingMaintenanceTitle;
    }

    public String getDiningHall() {
        return this.diningHall;
    }

    public String diningHallPosition() {
        return this.diningHallPosition;
    }
}
