package example.project.GodClassExample;

import java.util.Date;

public class PaySchedule {

    String payDay;  // TODO: make this variable private and be accessed through getter/setter

    public PaySchedule(String payDay) {
        this.setPayDay(payDay);
    }

    public void setPayDay(String payDay) {
        this.payDay = payDay;
    }

    public String getPayDay() {
        return payDay;
    }
}
