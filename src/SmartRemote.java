class SmartRemote extends Remote {
    SmartRemote() {
        super(); // Call the default constructor of the Remote class
    }

    SmartRemote(TV tv) {
        super(tv); // Call the parameterized constructor of the Remote class with the TV instance
    }

    void showYoutube() {
        if (tv instanceof SmartTV) {
            ((SmartTV) tv).Youtube();
        } else {
            System.out.println("Cannot show Youtube on this TV");
        }
    }
}
