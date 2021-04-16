package com.company;

import com.company.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner enter = new Scanner(System.in); //static oldugu icin buraya yazdik (burayi sor)
    public static List<Flat> flats = new ArrayList<>();
    public static List<TenantLetter> tenantLetters = new ArrayList<>();
    public static List<Person>people = new ArrayList<>();
    public static com.company.models.items items =new items();
    public static Vehicle vehicle = new Vehicle();
    public static Person p = new Person();

    public static void main(String[] args) {
        boolean exit= true;
        int result=0;
        Flat flat1 = new Flat(1,"12",12, "blue", 15);
        Flat flat2 = new Flat(2,"13",10, "yellow", 7);
        Flat flat3 = new Flat(3,"14",15, "black", 18);

        Person p1= new Person("Sedanur", "Sevilmisdal", "123456789", "Dikenca", Boolean.FALSE); //boolean flase olayini sor
        Person p2= new Person("David", "Beckham", "321654987", "London", Boolean.FALSE);
        Person p3= new Person("Kuba", "Kassan","987654321","Przemysl",Boolean.FALSE);

        people.add(p1);
        people.add(p2);
        people.add(p3);

        flats.add(flat1);
        flats.add(flat2);
        flats.add(flat3);

        while(exit){
            System.out.println("welcome...");

            System.out.println("1-To sort the rental apartments");
            System.out.println("2- Rent the apartment");
            System.out.println("3-Personal items");
            System.out.println("4-Add items in Parking Place");
            System.out.println("5- Remove the items in Parking Place");
            System.out.println("6- Add the vehicle in own Parking place");
            System.out.println("7- Remove the vehicle in own Parking place");
            System.out.println("8- exit");

            result = enter.nextInt();
            switch (result){
                case 1: flats();
                break;

                case 2: RentTheFlat();
                break;
                
                case 3: SortThePersonalItems(p1);
                break;
                case 4:int index=enter.nextInt();
                    addPersonalItems(p,items,index);
                    break;
                case 5:
                    int indexx=enter.nextInt();
                    removePersonalItems(p,items, indexx);
                    break;
                case 6:
                    int indexxx=enter.nextInt();
                    AddPersonalVehicle(p, vehicle, indexxx);
                    break;

                case 7:
                    int indexxxx=enter.nextInt();
                    RemovePersoalVehicle(p, vehicle, indexxxx);
                    break;


                case 8:
                    exit=false;
                    break;
            }

        }

    }

    private static void RemovePersoalVehicle(Person p, Vehicle vehicle, int index) {
        p.getParkingPlace().get(index).RemoveVehicle(vehicle.getName());
    }

    private static void AddPersonalVehicle(Person p, Vehicle vehicle, int index) {
        p.getParkingPlace().get(index).addVehicle(vehicle);
    }

    private static void removePersonalItems(Person p, items items, int index) {
    p.getParkingPlace().get(index).RemoveItems(items.getName());
    }

    private static void addPersonalItems(Person p, items items, int index) {
        p.getParkingPlace().get(index).addItems(items);
    }

    private static void SortThePersonalItems(Person p) {
        if (p.getParkingPlace().size()==0) {
            throw new IllegalArgumentException("there is no rented parking place for this person");
        }else {
            for(int i=0;i<p.getParkingPlace().size();i++) {
                System.out.println("Number of Parking Place: "+p.getParkingPlace().get(i).getNumber());
            }
        }
    }

    private static void RentTheFlat() {
        flats();
        System.out.println("Please write TenantLetter information: ");
        String name=enter.nextLine();
        String surname=enter.nextLine();
        String PeselNumber =enter.nextLine();
        String addres=enter.nextLine();
        boolean FirstTenant =enter.hasNext();
        String ContractNo=enter.nextLine();
        String StartOfDate=enter.nextLine();
        String EndOfDate=enter.nextLine();
        if(FirstTenant==Boolean.TRUE) {
            System.out.println("The first name to collect rents: "+name);
        }
        TenantLetter kontrat=new TenantLetter( name,surname,PeselNumber,addres,FirstTenant,ContractNo,StartOfDate,EndOfDate);
        tenantLetters.add(kontrat);
    }

    public static void flats(){
        for(int i=0; i<flats.size(); i++){
            System.out.println("Number of Flat:" + flats.get(i).getFlatNo() +
                    "Flat No " + flats.get(i).getRoomNo() +
                    " colour of Room "+ flats.get(i).getColour() +
                    " Weidt of Room" + flats.get(i).getWeidt() +
                    " Height of Room" + flats.get(i).getHeight() + "\n");
        }
    }

}
