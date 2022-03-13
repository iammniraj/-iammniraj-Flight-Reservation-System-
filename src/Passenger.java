public class Passenger {

    private static Address address;
    private static Contact contact;
    private static int idCounter;

    public  Passenger(String street ,String city, String state,
                      String name,String mobileNo,String email) {

        this.address =new Address(street, city, state);
        this.contact=new Contact(name, mobileNo, email);
        idCounter++;
    }
    public int getPassengerCount()
    {
        return idCounter;
    }

    public String getContactDetails()
    {
        return "name : "+contact.name+" number : "+contact.mobileNo+" email : "+contact.email;
    }


    public void updateContactDetails(String name, String number, String email) {
        contact.name=name;
        contact.mobileNo=number;
        contact.email=email;
    }

    public String getAdressDetails()
    {
        return "street : "+ address.street+" city : "+address.city+" state : "+address.state;
    }

    public void updateAdressDetails(String street, String city, String state)
    {
        address.street=street;
        address.city=city;
        address.state=state;
    }

    public  static class Contact {
        private String name;
        private String mobileNo;
        private String email;

        public Contact(String name, String mobileNo, String email) {
            this.name = name;
            this.mobileNo = mobileNo;
            this.email = email;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getMobileNo() {
            return mobileNo;
        }

        public String getEmail() {
            return email;
        }
    }

    public static class Address {
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }
    }


}
