package cn.zju.bean;

import java.util.Date;

public class Order {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.deliver_fee
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Float deliverFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.total_price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Float totalPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.order_price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Float orderPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.payment_way
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Integer paymentWay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.payment_cash
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Integer paymentCash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.delivery
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Integer delivery;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.is_confirm
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Boolean isConfirm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.is_paiy
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Integer isPaiy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.order_state
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Integer orderState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.create_date
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.note
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_order.buyer_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Long buyerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.id
     *
     * @return the value of bbs_order.id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.id
     *
     * @param id the value for bbs_order.id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.deliver_fee
     *
     * @return the value of bbs_order.deliver_fee
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Float getDeliverFee() {
        return deliverFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.deliver_fee
     *
     * @param deliverFee the value for bbs_order.deliver_fee
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setDeliverFee(Float deliverFee) {
        this.deliverFee = deliverFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.total_price
     *
     * @return the value of bbs_order.total_price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Float getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.total_price
     *
     * @param totalPrice the value for bbs_order.total_price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.order_price
     *
     * @return the value of bbs_order.order_price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Float getOrderPrice() {
        return orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.order_price
     *
     * @param orderPrice the value for bbs_order.order_price
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setOrderPrice(Float orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.payment_way
     *
     * @return the value of bbs_order.payment_way
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Integer getPaymentWay() {
        return paymentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.payment_way
     *
     * @param paymentWay the value for bbs_order.payment_way
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setPaymentWay(Integer paymentWay) {
        this.paymentWay = paymentWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.payment_cash
     *
     * @return the value of bbs_order.payment_cash
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Integer getPaymentCash() {
        return paymentCash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.payment_cash
     *
     * @param paymentCash the value for bbs_order.payment_cash
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setPaymentCash(Integer paymentCash) {
        this.paymentCash = paymentCash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.delivery
     *
     * @return the value of bbs_order.delivery
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Integer getDelivery() {
        return delivery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.delivery
     *
     * @param delivery the value for bbs_order.delivery
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.is_confirm
     *
     * @return the value of bbs_order.is_confirm
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Boolean getIsConfirm() {
        return isConfirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.is_confirm
     *
     * @param isConfirm the value for bbs_order.is_confirm
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setIsConfirm(Boolean isConfirm) {
        this.isConfirm = isConfirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.is_paiy
     *
     * @return the value of bbs_order.is_paiy
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Integer getIsPaiy() {
        return isPaiy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.is_paiy
     *
     * @param isPaiy the value for bbs_order.is_paiy
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setIsPaiy(Integer isPaiy) {
        this.isPaiy = isPaiy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.order_state
     *
     * @return the value of bbs_order.order_state
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Integer getOrderState() {
        return orderState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.order_state
     *
     * @param orderState the value for bbs_order.order_state
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.create_date
     *
     * @return the value of bbs_order.create_date
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.create_date
     *
     * @param createDate the value for bbs_order.create_date
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.note
     *
     * @return the value of bbs_order.note
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.note
     *
     * @param note the value for bbs_order.note
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_order.buyer_id
     *
     * @return the value of bbs_order.buyer_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_order.buyer_id
     *
     * @param buyerId the value for bbs_order.buyer_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }
}