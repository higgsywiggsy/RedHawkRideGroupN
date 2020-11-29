public class ride {

    private String startLocation;
    private String endLocation;
    private Double payment;
    private String rideAssignment;
    private String rideHistory;

    public static void main(String[] args) {

        Public static void requestRide() {
            get p.first_name;
            get p.username;
            get currentLocation ();
            send drive request to drivers;
        }
        Public static int startDrive () {
            Record current time(starting time);
            Return current time
        }
        Public static void stopDrive () {
            Record current_time when the trip has completed;
            Return ride length by subtracting end time by start time;
        }
        Public static void updateLocation () {
            Return currentlocation ()
            //use a location API perhaps
        }
        Public static void makePayment () {
            input(bankAccount);
            Check account.bankAccount():bool(digit comparison)
            Return True or false; //if bank account match
        }
        Public static void riderAssign () {
            Driver pressed accept;
            updateLocation(driver);
            Gives direction to currentLocation (passenger);
        }
        Public static void chargeRider () {
            if stopDriving() == true
            {
                Send payment request to passenger;
                Passenger can tip 10 %, 15 %, or 20 % and confirm payment;
            }

        }

    }

}
