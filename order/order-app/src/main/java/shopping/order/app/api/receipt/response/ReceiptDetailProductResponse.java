package shopping.order.app.api.receipt.response;

public class ReceiptDetailProductResponse {

    private Long productId;
    private String name;
    private String price;
    private String imageUrl;
    private int quantity;

    public ReceiptDetailProductResponse() {
    }

    public ReceiptDetailProductResponse(Long productId, String name, String price, String imageUrl, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getQuantity() {
        return quantity;
    }
}