public class Flight extends Ticket  {

    private String flightNumber;
    private String airLine;
    private int SeatBooked;
    private int Maxcapacity;
    private boolean isSeatAvilable;

    public Flight(String street, String city, String state, String name, String mobileNo,
                  String email, String departureFrom, String departureDate, String departureTime,
                  String arrival, String arrivalDate, String arrivalTime, String pnr,
                  String seatNumber, double price, boolean isConfirmed, boolean isCancelled,
                  String flightNumber, String airLine, int seatBooked, int maxcapacity,boolean isSeatAvilable) {
        super(street, city, state, name, mobileNo, email, departureFrom, departureDate, departureTime, arrival,
                arrivalDate, arrivalTime, pnr, seatNumber, price, isConfirmed, isCancelled);
        this.flightNumber = flightNumber;
        this.airLine = airLine;
        this.SeatBooked = seatBooked;
        this.Maxcapacity = maxcapacity;
        this.isSeatAvilable=isSeatAvilable;
    }




   /* public Flight(String flightNumber, String airLine, int seatBooked, int maxcapacity) {
        this.flightNumber = flightNumber;
        this.airLine = airLine;
        SeatBooked = seatBooked;
        Maxcapacity = maxcapacity;
    }*/

    public String getFlightDetails()
    {
        String update= "Flight Number: " + flightNumber + ", Airline-Name: " + airLine +
                ", Max-capacity: " + Maxcapacity + ", Booked Seats: " + SeatBooked;
        return update;
    }

    public boolean checkAvailiability()
    {
        if(getSeatBooked()<getMaxcapacity())
        {
            return true;
        }else
        {
            return false;
        }
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirLine() {
        return airLine;
    }

    public int getSeatBooked() {
        return SeatBooked;
    }

    public int getMaxcapacity() {
        return Maxcapacity;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public void setSeatBooked(int seatBooked) {
        SeatBooked = seatBooked;
    }

    public void setMaxcapacity(int maxcapacity) {
        Maxcapacity = maxcapacity;
    }

    public boolean isSeatAvilable() {
        return getMaxcapacity()>getSeatBooked();
    }


}
