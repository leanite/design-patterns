package structural.adapter;

public class MainUsage {
    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();

        Volt v3 = getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter,12);
        Volt v120 = getVolt(socketAdapter,120);

        System.out.println("v3 volts using adapter="+v3.getVolts());
        System.out.println("v12 volts using adapter="+v12.getVolts());
        System.out.println("v120 volts using adapter="+v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i) {
            case 3: return sockAdapter.get3Volt();
            case 12: return sockAdapter.get12Volt();
            case 120: return sockAdapter.get120Volt();
            default: return sockAdapter.get120Volt();
        }
    }
}
