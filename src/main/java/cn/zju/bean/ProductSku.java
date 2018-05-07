package cn.zju.bean;

import java.util.Date;

public class ProductSku {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_sku.id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_sku.product_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Long productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_sku.color_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Long colorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_sku.size
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private String size;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_sku.market_price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Float marketPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_sku.price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Float price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_sku.delive_fee
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Float deliveFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_sku.stock
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Integer stock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_sku.upper_limit
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Integer upperLimit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_sku.create_time
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_sku.id
     *
     * @return the value of bbs_sku.id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_sku.id
     *
     * @param id the value for bbs_sku.id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_sku.product_id
     *
     * @return the value of bbs_sku.product_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_sku.product_id
     *
     * @param productId the value for bbs_sku.product_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_sku.color_id
     *
     * @return the value of bbs_sku.color_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Long getColorId() {
        return colorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_sku.color_id
     *
     * @param colorId the value for bbs_sku.color_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_sku.size
     *
     * @return the value of bbs_sku.size
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public String getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_sku.size
     *
     * @param size the value for bbs_sku.size
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_sku.market_price
     *
     * @return the value of bbs_sku.market_price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Float getMarketPrice() {
        return marketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_sku.market_price
     *
     * @param marketPrice the value for bbs_sku.market_price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setMarketPrice(Float marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_sku.price
     *
     * @return the value of bbs_sku.price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_sku.price
     *
     * @param price the value for bbs_sku.price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_sku.delive_fee
     *
     * @return the value of bbs_sku.delive_fee
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Float getDeliveFee() {
        return deliveFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_sku.delive_fee
     *
     * @param deliveFee the value for bbs_sku.delive_fee
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setDeliveFee(Float deliveFee) {
        this.deliveFee = deliveFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_sku.stock
     *
     * @return the value of bbs_sku.stock
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_sku.stock
     *
     * @param stock the value for bbs_sku.stock
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_sku.upper_limit
     *
     * @return the value of bbs_sku.upper_limit
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Integer getUpperLimit() {
        return upperLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_sku.upper_limit
     *
     * @param upperLimit the value for bbs_sku.upper_limit
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_sku.create_time
     *
     * @return the value of bbs_sku.create_time
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_sku.create_time
     *
     * @param createTime the value for bbs_sku.create_time
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}