public class Ticket {

    private String departureFrom;
    private String departureDate;
    private String departureTime;

    private String Arrival;
    private String ArrivalDate;
    private String ArrivalTime;

    private String pnr;
    private String seatNumber;
    private double Price;
    private boolean isConfirmed;
    private boolean isCancelled;


    public Ticket(String departureFrom, String departureDate, String departureTime,
                  String arrival, String arrivalDate, String arrivalTime, String pnr,
                  String seatNumber, double price, boolean isConfirmed, boolean isCancelled) {

        this.departureFrom = departureFrom;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        Arrival = arrival;
        ArrivalDate = arrivalDate;
        ArrivalTime = arrivalTime;
        this.pnr = pnr;
        this.seatNumber = seatNumber;
        Price = price;
        this.isConfirmed = isConfirmed;
        this.isCancelled = isCancelled;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrival() {
        return Arrival;
    }

    public String getArrivalDate() {
        return ArrivalDate;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public String getPnr() {
        return pnr;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return Price;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setDepartureFrom(String departureFrom) {
        this.departureFrom = departureFrom;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrival(String arrival) {
        Arrival = arrival;
    }

    public void setArrivalDate(String arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
