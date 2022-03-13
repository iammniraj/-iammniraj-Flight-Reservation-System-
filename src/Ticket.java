public class Ticket extends Passenger  {

    private  Ticket tickType;

    private String departureFrom;
    private String departureDate;
    private String departureTime;

    private String arrival;
    private String arrivalDate;
    private String arrivalTime;

    private String pnr;
    private String seatNumber;
    private double price;
    private boolean isConfirmed;
    private boolean isCancelled;

    public Ticket(String name, String mobileNo, String email,
                  String street, String city, String state,
                  String departureFrom, String departureDate, String departureTime,
                  String arrival, String arrivalDate, String arrivalTime, String pnr,
                  String seatNumber, double price, boolean isConfirmed, boolean isCancelled) {
        super(street, city, state, name, mobileNo, email);
        this.departureFrom = departureFrom;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrival = arrival;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.pnr = pnr;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isConfirmed = isConfirmed;
        this.isCancelled = isCancelled;
    }

    public void printFullTicketDetails()
    {
        System.out.println(super.getContactDetails() +" "+super.getAdressDetails()+" "+ "departureFrom " +departureFrom + " departureDate " +departureDate+
                " departureTime "+departureTime +"arrival place" +arrival+" arrivalDate "+arrivalDate +" arrivalTime "+arrivalTime +
                " PNR "+pnr+" seatNumber "+seatNumber+" price "+price +" isConfirmed "+isConfirmed+ " isCancelled "+isCancelled );
    }


    /*public Ticket( String departureFrom, String departureDate, String departureTime,
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
    }*/

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
        return arrival;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getPnr() {
        return pnr;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
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
        this.arrival = arrival;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
