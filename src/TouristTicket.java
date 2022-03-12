public class TouristTicket extends Ticket{


    private String hotelAddress;
    private String[] touristLocation;


    public TouristTicket(String departureFrom, String departureDate, String departureTime,
                         String arrival, String arrivalDate, String arrivalTime,
                         String pnr, String seatNumber, double price, boolean isConfirmed, boolean isCancelled,
                         String hotelAddress, String[] touristLocation) {
        super(departureFrom, departureDate, departureTime, arrival, arrivalDate, arrivalTime, pnr, seatNumber, price, isConfirmed, isCancelled);
        this.hotelAddress = hotelAddress;
        this.touristLocation = new String[5];
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setTouristLocation(String location) {

        int length = touristLocation.length;

        for (int i = 0; i < length; i++) {
            if (touristLocation[i] == "") {
                touristLocation[i] = location;
            }
        }

    }

    public void deleteTouristLocation(String location) {
        int length=touristLocation.length;
        for(int i=0;i<=length;i++)
        {
            if(touristLocation[i]==location)
            {
                String temp=touristLocation[i];
                touristLocation[i]=touristLocation[length-1];
                touristLocation[length-1]="";
                length=touristLocation.length-1;
            }
        }
    }
}
