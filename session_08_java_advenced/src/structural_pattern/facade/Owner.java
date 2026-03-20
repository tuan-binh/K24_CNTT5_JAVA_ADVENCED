package structural_pattern.facade;

public class Owner {
    private AddressFinder addressFinder;
    private ContactService contactService;
    private PaymentService paymentService;

    public Owner() {
        this.addressFinder = new AddressFinder();
        this.contactService = new ContactService();
        this.paymentService = new PaymentService();
    }

    public void rentApartment() {
        System.out.println("--- Bắt đầu tìm kiếm ---");
        addressFinder.findAddress();
        contactService.makeContact();
        paymentService.collectMoney();
        System.out.println("--- Đưa chìa khoá cho người thuê ---");
    }
}
