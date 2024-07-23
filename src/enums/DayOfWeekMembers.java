package enums;

public enum DayOfWeekMembers {
    MONDAY ("Monday" , 1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6),
    SUNDAY("Sunday",7);

    private final String fullName;
    private final int nrOfDay;

    private DayOfWeekMembers(String fullName, int nrOfDay){
        this.fullName=fullName;
        this.nrOfDay=nrOfDay;
    }

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNrOfDay() {
        return nrOfDay;
    }
}
