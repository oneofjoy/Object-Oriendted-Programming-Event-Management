class PrivateRequest {

    private int requestId;
    private String customerName;
    private String eventName;
    private String location;
    private String date;
    private String status;

    // constructor
    public PrivateRequest(int requestId, String customerName, String eventName, String location, String date) {

        this.requestId = requestId;
        this.customerName = customerName;
        this.eventName = eventName;
        this.location = location;
        this.date = date;

        // default status
        this.status = "Pending";
    }

    // getter
    public int getRequestId() {
        return requestId;
    }

    public String getStatus() {
        return status;
    }

    // setter
    public void setStatus(String status) {
        this.status = status;
    }

    // display
    public void showRequest() {

        System.out.println("Request ID : " + requestId);
        System.out.println("Customer   : " + customerName);
        System.out.println("Event Name : " + eventName);
        System.out.println("Location   : " + location);
        System.out.println("Date       : " + date);
        System.out.println("Status     : " + status);
    }
}