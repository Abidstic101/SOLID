package HotelManagement;

public class Customer {

    String userName;
    static int cost=0;
    RoomType room=new RoomType();

    void displayInformation(String userName)
    {
        this.userName=userName;
        System.out.println("Customer:"+userName);
        System.out.println("\nThanks for booking in our Hotel SUST\n");
        System.out.println("Your total cost is "+cost+" taka\n");
        System.out.println("Have a nice day\n");
    }
    void roomBookingOnSpot(String userName,int roomtype,int roomAmount)
    {

        room.information(userName, roomtype, roomAmount);
        cost+=room.calculateprice();
    }
    void roomBookingOnline(String userName,int roomtype,int roomAmount)
    {

        room.information(userName, roomtype, roomAmount);
        cost+=room.calculatepriceOnline();
    }
    void cancel(String userName,int roomtype,int roomAmount)
    {
        Cancel cancel=new Cancel();
        cancel.information(userName, roomtype, roomAmount);
        cost=0;


    }


}
