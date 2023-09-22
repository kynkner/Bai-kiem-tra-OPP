package entity;

import logic.ItemLogic;
import logic.StaffLogic;

import java.util.Arrays;

public class SalesList {
    private Staff staff;
    private SaleslistDetaisl[] detaisl;

    public SalesList(Staff staff, SaleslistDetaisl[] detaisl) {
        this.staff = staff;
        this.detaisl = detaisl;
    }


    @Override
    public String toString() {
        return "SalesList{" +
                "staff=" + staff +
                ", detaisl=" + Arrays.toString(detaisl) +
                '}';
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public SaleslistDetaisl[] getDetaisl() {
        return detaisl;
    }

    public void setDetaisl(SaleslistDetaisl[] detaisl) {
        this.detaisl = detaisl;
    }
}
