package shopping.mart.app.api.cart.response;

import java.util.List;
import java.util.Objects;

public final class CartResponse {

    private long cartId;
    private List<ProductResponse> productResponses;

    public CartResponse() {
    }

    public CartResponse(long cartId, List<ProductResponse> productResponses) {
        this.cartId = cartId;
        this.productResponses = productResponses;
    }

    public long getCartId() {
        return cartId;
    }

    public List<ProductResponse> getProductResponses() {
        return productResponses;
    }

    public static final class ProductResponse {
        private long id;
        private int count;
        private String imageUrl;
        private String name;

        public ProductResponse() {
        }

        public ProductResponse(final long id, final int count, final String imageUrl, final String name) {
            this.id = id;
            this.count = count;
            this.imageUrl = imageUrl;
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public int getCount() {
            return count;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ProductResponse)) {
                return false;
            }
            ProductResponse that = (ProductResponse) o;
            return id == that.id && count == that.count && Objects.equals(imageUrl, that.imageUrl)
                    && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, count, imageUrl, name);
        }
    }
}