package bai1_5;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor có tham số
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter cho id
    public String getId() {
        return id;
    }

    // Getter cho desc
    public String getDesc() {
        return desc;
    }

    // Getter cho qty
    public int getQty() {
        return qty;
    }

    // Setter cho qty
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter cho unitPrice
    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter cho unitPrice
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Tính tổng giá trị hóa đơn (quantity * unit price)
    public double getTotal() {
        return qty * unitPrice;
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}

