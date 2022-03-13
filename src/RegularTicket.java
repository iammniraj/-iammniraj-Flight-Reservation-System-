public class RegularTicket extends Ticket {
    private String[]specialServices={"Food" , "Water" , "Snacks"};

    public RegularTicket(String name, String mobileNo, String email,
                         String street, String city, String state,
                         String departureFrom, String departureDate, String departureTime,
                         String arrival, String arrivalDate, String arrivalTime,
                         String pnr, String seatNumber, double price,
                         boolean isConfirmed, boolean isCancelled,
                         String[] specialServices
                         ) {
        super( name, mobileNo, email,street, city, state, departureFrom, departureDate, departureTime,
                arrival, arrivalDate, arrivalTime, pnr, seatNumber, price, isConfirmed, isCancelled);
        this.specialServices=specialServices;
    }





    /*public RegularTicket(String departureFrom, String departureDate, String departureTime,
                         String arrival, String arrivalDate, String arrivalTime,
                         String pnr, String seatNumber, double price, boolean isConfirmed, boolean isCancelled ,String[] specialServices) {
        super(departureFrom, departureDate, departureTime, arrival, arrivalDate, arrivalTime, pnr, seatNumber, price, isConfirmed, isCancelled);
        this.specialServices=specialServices;
    }*/

    public String[] getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String[] specialServices) {
        this.specialServices = specialServices;
    }
}
