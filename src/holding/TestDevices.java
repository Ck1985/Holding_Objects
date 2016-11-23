package holding;
import java.util.*;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/27/2016.
 */
class Device{
    private String name;
    private int model;
    Device(String name, int model){
        this.name = name;
        this.model = model;
    }
    private String getName(){
        return this.name;
    }
    public int getModel(){
        return this.model;
    }
    public String toString(){
        return this.getName();
    }
}
public class TestDevices {
    public static void main(String[] args){
        Device[] devices = new Device[]{
                new Device("Car", 1991),
                new Device("Bicycle", 1908),
                new Device("AirPlane", 1880),
                new Device("SpaceShip", 1960),
                new Device("Boat", 1000),
                new Device("DeviceUnderWater", 1920),
                new Device("DeviceUnderGroudn", 2020)
        };
        List<Device> deviceList = new ArrayList<Device>(Arrays.asList(devices));
        List<Device> subList = deviceList.subList(2,5);
        print("1: devicesLst: " + deviceList);
        print("2: subList: " + subList);
        deviceList.removeAll(subList);
        print("3: devicesList: " + deviceList);
    }
}
