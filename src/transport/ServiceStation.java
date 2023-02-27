package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private static Queue<Transport> transports;

    public ServiceStation() {
        this.transports = new LinkedList<>();
    }

    public Queue<Transport> getTransports() {
        return transports;
    }

    public void setTransports(Queue<Transport> transports) {
        this.transports = transports;
    }

    public static void addMachineToQueue(Transport transport) {
            transports.offer(transport);
        }

    public void carryMaintenance() {
        transports.remove();
        for (Transport t : transports) {
            System.out.println(t.getBrand());

        }
    }
}
