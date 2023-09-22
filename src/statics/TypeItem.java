package statics;

public enum TypeItem {
    Electronic("Điện tử"),
    Refrigeration("Điện lạnh"),
    Computer("Máy tính"),
    Officeequipment("Thiết bị văn phòng");

    public String value;

    TypeItem(String value) {
        this.value = value;
    }
}
