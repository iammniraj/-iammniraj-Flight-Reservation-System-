public class TouristTicket extends Ticket{


    private String hotelAddress;
    private String[] touristLocation ;
    int locationIndex=0;

    public TouristTicket(String name, String mobileNo, String email,
                         String street, String city, String state,
                         String departureFrom, String departureDate, String departureTime,
                         String arrival, String arrivalDate, String arrivalTime, String pnr,
                         String seatNumber, double price, boolean isConfirmed,
                         boolean isCancelled ,String hotelAddress  ) {
        super( name, mobileNo, email,street, city, state, departureFrom, departureDate, departureTime, arrival, arrivalDate, arrivalTime, pnr, seatNumber, price, isConfirmed, isCancelled);
        this.hotelAddress = hotelAddress;
        this.touristLocation= new String[5];
    }



    /*public TouristTicket(String departureFrom, String departureDate, String departureTime,
                         String arrival, String arrivalDate, String arrivalTime,
                         String pnr, String seatNumber, double price, boolean isConfirmed, boolean isCancelled,
                         String hotelAddress ) {
        super( departureFrom, departureDate, departureTime, arrival, arrivalDate, arrivalTime, pnr, seatNumber, price, isConfirmed, isCancelled);
        this.hotelAddress = hotelAddress;
        this.touristLocation= new String[5];
    }*/




    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocation() {
        for(int i=0;i<touristLocation.length;i++)
        {
            System.out.println(touristLocation[i]);
        }
        return touristLocation;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setTouristLocation(String location) {

        int length = touristLocation.length;

        for (int i = locationIndex; i < length; i++) {
                touristLocation[i] = location;
            /*if (touristLocation[i] == "") {
            }*/

        }
        locationIndex++;

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
