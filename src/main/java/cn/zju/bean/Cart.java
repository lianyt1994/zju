package cn.zju.bean;

public class Cart {
    private Integer id;

    private String user;

    private Integer productId;

    private Integer amount;

    private String productName;

    private String packageList;

    public String getPackageList() {
        return packageList;
    }

    public void setPackageList(String packageList) {
        this.packageList = packageList;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Cart(String user, Integer productId) {
        this.user = user;
        this.productId = productId;
    }

    public Cart(Integer id) {
        this.id = id;
    }

    public Cart(Integer id, String user, Integer productId, Integer amount, String productName) {
        this.id = id;
        this.user = user;
        this.productId = productId;
        this.amount = amount;
        this.productName = productName;
    }

    public Cart(Integer id, String user, Long productId, Integer amount, String productName) {
        this.id = id;
        this.user = user;
        this.productId = Math.toIntExact(productId);
        this.amount = amount;
        this.productName = productName;
    }

    public Cart(Integer id, String user, Integer productId, Integer amount) {
        this.id = id;
        this.user = user;
        this.productId = productId;
        this.amount = amount;
    }

    public Cart(String user, Integer productId, Integer amount) {
        this.user = user;
        this.productId = productId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", productId=" + productId +
                ", amount=" + amount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
