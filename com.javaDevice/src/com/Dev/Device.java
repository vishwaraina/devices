package com.Dev;
import java.util.*;

public class Device{

    int Deviceno;
    String DeviceName;
    int DevicePrice;
    Device(int Deviceno, String DeviceName, int DevicePrice){
        this.Deviceno= Deviceno;
        this.DeviceName=DeviceName;
        this.DevicePrice=DevicePrice;
    }
    public int getDeviceno(){
        return Deviceno;
    }
    public int  getDevicePrice(){
        return DevicePrice;
    }
    public String getDeviceName(){
        return DeviceName;
    }
    public String toString(){
        return Deviceno+" "+DeviceName+" "+DevicePrice;
    }
    public static class main {
        public static void main(String[] args) {
            Collection<Device> c = new ArrayList<Device>();
            Scanner scan = new Scanner(System.in);
            int a;
            do {
                System.out.println("1.Add details");
                System.out.println("2.Display details");
                System.out.println("3.Find details");
                System.out.println("4.Delete details");
                System.out.print("Enter choice");
                a = scan.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Enter Deviceno:");
                        int Deviceno = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Enter DeviceName:");
                        String DeviceName = scan.nextLine();
                        System.out.println("Enter DevicePrice:");
                        int DevicePrice = scan.nextInt();
                        c.add(new Device(Deviceno, DeviceName, DevicePrice));
                        break;

                    case 2:
                        System.out.println(c);
                        break;

                    case 3:
                        Boolean found = false;
                        System.out.print("Dev no?:");
                        int Devno = scan.nextInt();
                        Iterator<Device> i = c.iterator();
                        while (i.hasNext()) {
                            Device e = i.next();
                            if (e.getDeviceno() == Devno) {
                                System.out.println(e);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("not found");
                        }
                        break;
                    case 4:
                        found = false;
                        System.out.print("Dev no?:");
                        Deviceno = scan.nextInt();
                        i = c.iterator();
                        while (i.hasNext()) {
                            Device e = i.next();
                            if (e.getDeviceno() == Deviceno) {
                                i.remove();
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("not found");
                        } else {
                            System.out.println("Device details removed");
                        }
                        break;
                }
            } while (a != 0);
            scan.close();
        }


    }
}