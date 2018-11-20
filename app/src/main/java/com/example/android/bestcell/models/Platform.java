package com.example.android.bestcell.models;

import com.example.android.bestcell.R;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Platform {

    private String platform;
    private int icon;
    private List<Manufacturer> deviceList;

    public String getPlatform() {
        return platform;
    }

    public int getIcon() {
        return icon;
    }

    public List<Manufacturer> getDeviceList() {
        return deviceList;
    }

    public Platform() {
    }

    public Platform(String platform, int icon, List<Manufacturer> devices) {
        this.platform = platform;
        this.icon = icon;
        this.deviceList = devices;
    }

    public static List<Platform> getData() {
        List<Platform> platforms = new ArrayList<>();
        platforms.add(new Platform("Andriod", R.drawable.android_os, getAndroidDevices()));
        platforms.add(new Platform("Iphone", R.drawable.apple_os, getiOSDevices()));
        platforms.add(new Platform("Windows", R.drawable.windows_os, getWindowsDevices()));
        return platforms;
    }

    private static List<Manufacturer> getAndroidDevices() {
        List<Manufacturer> phones = new ArrayList<>();

        List<Model> models = new ArrayList<>();
        models.add(new Model("Test Android Model 1"));
        models.add(new Model("Test Android Model 2"));
        models.add(new Model("Test Android Model 3"));
        models.add(new Model("Test Android Model 4"));

        phones.add(new Manufacturer("Samsung", models));
        phones.add(new Manufacturer("OnePlus", models));
        phones.add(new Manufacturer("Xiaomi", models));
        phones.add(new Manufacturer("Vivo", models));
        phones.add(new Manufacturer("Oppo", models));
        phones.add(new Manufacturer("Asus", models));
        phones.add(new Manufacturer("Blackberry", models));
        phones.add(new Manufacturer("Lenovo", models));
        phones.add(new Manufacturer("Micromax", models));
        phones.add(new Manufacturer("Lava", models));
        phones.add(new Manufacturer("Intex", models));
        phones.add(new Manufacturer("Karbon", models));
        phones.add(new Manufacturer("Yu Mobiles", models));

        return phones;
    }

    private static List<Manufacturer> getiOSDevices() {
        List<Manufacturer> phones = new ArrayList<>();

        List<Model> models = new ArrayList<>();

        models.add(new Model("I Phone XS Max"));
        models.add(new Model("I Phone XS"));
        models.add(new Model("I Phone XR"));
        models.add(new Model("I Phone X"));
        models.add(new Model("I Phone 8 PLus"));
        models.add(new Model("I Phone 8"));
        models.add(new Model("I Phone 7 Plus"));
        models.add(new Model("I Phone 7"));
        models.add(new Model("I Phone SE"));
        models.add(new Model("I Phone 6S Plus"));
        models.add(new Model("I Phone 6S"));
        models.add(new Model("I Phone 6 Plus"));
        models.add(new Model("I Phone 6"));
        models.add(new Model("I Phone 5S"));
        models.add(new Model("I Phone 5C"));
        models.add(new Model("I Phone 5"));
        models.add(new Model("I Phone 4S"));
        models.add(new Model("I Phone 4"));

        phones.add(new Manufacturer("Apple", models));

        return phones;
    }

    private static List<Manufacturer> getWindowsDevices() {
        List<Manufacturer> phones = new ArrayList<>();

        List<Model> models = new ArrayList<>();
        models.add(new Model("Nokia Lumia 800"));
        models.add(new Model("Nokia Lumia 710"));
        models.add(new Model("Nokia Lumia 900"));
        models.add(new Model("Nokia Lumia 610"));
        models.add(new Model("Nokia Lumia 510"));
        models.add(new Model("Nokia Lumia 820"));
        models.add(new Model("Nokia Lumia 920"));
        models.add(new Model("Nokia Lumia 505"));
        models.add(new Model("Nokia Lumia 620"));
        models.add(new Model("Nokia Lumia 520"));
        models.add(new Model("Nokia Lumia 720"));
        models.add(new Model("Nokia Lumia 925"));
        models.add(new Model("Nokia Lumia 1020"));
        models.add(new Model("Nokia Lumia 625"));
        models.add(new Model("Nokia Lumia 1320"));
        models.add(new Model("Nokia Lumia 1520"));
        models.add(new Model("Nokia Lumia 2520"));
        models.add(new Model("Nokia Lumia 525"));
        models.add(new Model("Nokia Lumia Icon"));
        models.add(new Model("Nokia Lumia 930"));
        models.add(new Model("Nokia Lumia 630"));
        models.add(new Model("Nokia Lumia 530"));
        models.add(new Model("Nokia Lumia 730 Dual Sim"));
        models.add(new Model("Nokia Lumia 735"));
        models.add(new Model("Nokia Lumia 830"));

        phones.add(new Manufacturer("Nokia", models));

        models = new ArrayList<>();
        models.add(new Model("Microsoft Lumia 535"));
        models.add(new Model("Microsoft Lumia 435"));
        models.add(new Model("Microsoft Lumia 532"));
        models.add(new Model("Microsoft Lumia 640"));
        models.add(new Model("Microsoft Lumia 640 XL"));
        models.add(new Model("Microsoft Lumia 540"));
        models.add(new Model("Microsoft Lumia 950"));
        models.add(new Model("Microsoft Lumia 950 XL"));
        models.add(new Model("Microsoft Lumia 550"));
        models.add(new Model("Microsoft Lumia 650"));

        phones.add(new Manufacturer("Microsoft", models));

        return phones;
    }
}
