package data;

import base.Bike;
import base.Location;
import base.Parcel;
import base.ParcelStatus;
import base.Person;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        bikes[0] = new Bike("nmax",155);
        bikes[1] = new Bike("xmax",300);
        bikes[2] = new Bike("pcx",150);
        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        person[0] = new Person ("Tanawat", "Naklor");
        person[1] = new Person ("Jirasin","Chatbanyong");
        person[2] = new Person ("Naruebet", "Pattarasanya");
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels[0] = new Parcel(12, ParcelStatus.READY_TO_SHIP, new Location(15.8441,16.25454));
        parcels[1] = new Parcel(24, ParcelStatus.DELIVERED, new Location(13.02534,16.1464)); 
        parcels[2] = new Parcel(63, ParcelStatus.DELIVERED, new Location(15.5218,16.5158)); 
        parcels[3] = new Parcel(40, ParcelStatus.SHIPPING, new Location(15.15345,16.5418));
        parcels[4] = new Parcel(11, ParcelStatus.SHIPPING, new Location(15.81551,16.8315));
        parcels[5] = new Parcel(22, ParcelStatus.DELIVERED, new Location(15.85645,16.8202)); 
        parcels[6] = new Parcel(13, ParcelStatus.READY_TO_SHIP, new Location(15.0121,16.2122)); 
        parcels[7] = new Parcel(19, ParcelStatus.DELIVERED, new Location(15.1231,16.2251)); 
        parcels[8] = new Parcel(24, ParcelStatus.READY_TO_SHIP, new Location(15.0215,16.0216)); 
        parcels[9] = new Parcel(26, ParcelStatus.READY_TO_SHIP, new Location(15.3156,16.5644)); 
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
