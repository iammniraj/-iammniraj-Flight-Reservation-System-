public class Source {
    public static void main(String[] args) {

        TouristTicket tic=new TouristTicket("Save-Cookie","+91 123-4567-890","abcdefg@yahoo.com",
                "123","Delhi","New-Delhi","NDLS",
                "01/01/2001","01:01:59 am","MAS",
                "02/01/2001","01:01:59 pm","CDX1231RZY","16W",1234.56,true,false,"123 Pank-Avenue Chennai-600073");
        printTicketDetails(tic);
      //  tic.printFullTicketDetails();

                RegularTicket tic1=new RegularTicket("Save-World","+91 457-4567-890","iammworld@yahoo.com",
                "123","Delhi","New-Delhi","NDLS",
                "01/01/2001","01:01:59 am","MAS",
                "02/01/2001","01:01:59 pm","HRY1231PST",
                        "16W",1234.56,true,false, new String[]{"Food" , "Water" , "Snacks"});
        printTicketDetails(tic1);
        //tic1.printFullTicketDetails();

    }
    public static void printTicketDetails(Ticket ticket)
    {
        String pnr=ticket.getPnr();
        System.out.println(pnr);

    }
}
