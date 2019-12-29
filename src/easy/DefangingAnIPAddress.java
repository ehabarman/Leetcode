package easy;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}
