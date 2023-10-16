
public class Invoice_Q1 {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice_Q1(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity > 0 ? quantity : 0;
        this.pricePerItem = pricePerItem > 0.0 ? pricePerItem : 0.0;
    }



    public String getPartNumber() {
		return partNumber;
	}


	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}



	public String getPartDescription() {
		return partDescription;
	}



	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getPricePerItem() {
		return pricePerItem;
	}



	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}



	public double calculateInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        Invoice_Q1 invoice1 = new Invoice_Q1("12345", "Widget", 5, 12.50);
        Invoice_Q1 invoice2 = new Invoice_Q1("67890", "Gadget", -2, -8.75);

        System.out.println("Invoice 1:");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Part Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price Per Item: " + invoice1.getPricePerItem());
        System.out.println("Total Amount: " + invoice1.calculateInvoiceAmount());

        System.out.println("\nInvoice 2:");
        System.out.println("Part Number: " + invoice2.getPartNumber());
        System.out.println("Part Description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price Per Item: " + invoice2.getPricePerItem());
        System.out.println("Total Amount: " + invoice2.calculateInvoiceAmount());
    }
}
