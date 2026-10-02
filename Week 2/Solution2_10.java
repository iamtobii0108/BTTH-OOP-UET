package Bai2_10;
class SmartLight {
    private String id;
    private String name;
    private int brightness;
    public SmartLight(String id, String name, int brightness) {
        this.id = id;
        this.name = name;
        this.brightness = brightness;
    }
    public SmartLight(String id, String name) {
        this(id, name, 50);
    }
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    public void setBrightness(String preset) {
        if (preset.equals("MAX")) {
            this.setBrightness(100);
        } else if (preset.equals("MIN")) {
            this.setBrightness(10);
        } else if (preset.equals("ECO")) {
            this.setBrightness(30);
        }
    }
    public void connectToHub(CentralHub hub) {
        hub.registerDevice(this);
    }
    public String getName() { return name; }
    public int getBrightness() { return brightness; }
}
class CentralHub {
    public void registerDevice(SmartLight light) {
        System.out.println("[HUB] Đang kết nối với thiết bị: " + light.getName());
    }
}
class MainSmartLight {
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();
        SmartLight l1 = new SmartLight("L01", "Đèn phòng khách", 80);
        SmartLight l2 = new SmartLight("L02", "Đèn ngủ");
        l2.setBrightness("ECO");
        l1.connectToHub(hub);
        l2.connectToHub(hub);
        System.out.println("Độ sáng l1: " + l1.getBrightness());
        System.out.println("Độ sáng l2: " + l2.getBrightness());
    }
}