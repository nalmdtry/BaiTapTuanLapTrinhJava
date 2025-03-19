package baitoanbatdongsan;

public class BatDongSan {
    private String title;
    private String price;
    private String address;
    private String area;
    private String description;

    public BatDongSan(String title, String price, String address, String area, String description) {
        this.title = title;
        this.price = price;
        this.address = address;
        this.area = area;
        this.description = description;
    }

    // Getters và setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	public Object getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

    // Tương tự cho các thuộc tính khác
}
