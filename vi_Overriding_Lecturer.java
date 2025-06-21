package utms;

public class Lecturer extends User {
    private String department;

    public Lecturer(String name, String userId, String department) {
        super(name, userId);
        this.department = department;
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + getName() + " requests transport for lecture.");
    }
}

class TransportOfficer extends User {
    public TransportOfficer(String name, String userId) {
        super(name, userId);
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + getName() + " manages transport scheduling.");
    }
}
