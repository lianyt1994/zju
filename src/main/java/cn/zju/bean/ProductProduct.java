package cn.zju.bean;

import java.util.Arrays;
import java.util.Date;

public class ProductProduct {
    private String[] images;

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.brand_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Long brandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.name
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.weight
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Float weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.is_new
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Boolean isNew;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.is_hot
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Boolean isHot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.is_commend
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Boolean isCommend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.is_show
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Boolean isShow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.img_url
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private String imgUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.is_del
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Boolean isDel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.description
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.package_list
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private String packageList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.colors
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private String colors;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.sizes
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private String sizes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bbs_product.create_time
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.id
     *
     * @return the value of bbs_product.id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.id
     *
     * @param id the value for bbs_product.id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.brand_id
     *
     * @return the value of bbs_product.brand_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.brand_id
     *
     * @param brandId the value for bbs_product.brand_id
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.name
     *
     * @return the value of bbs_product.name
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.name
     *
     * @param name the value for bbs_product.name
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.weight
     *
     * @return the value of bbs_product.weight
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.weight
     *
     * @param weight the value for bbs_product.weight
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.is_new
     *
     * @return the value of bbs_product.is_new
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Boolean getIsNew() {
        return isNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.is_new
     *
     * @param isNew the value for bbs_product.is_new
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.is_hot
     *
     * @return the value of bbs_product.is_hot
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Boolean getIsHot() {
        return isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.is_hot
     *
     * @param isHot the value for bbs_product.is_hot
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.is_commend
     *
     * @return the value of bbs_product.is_commend
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Boolean getIsCommend() {
        return isCommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.is_commend
     *
     * @param isCommend the value for bbs_product.is_commend
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setIsCommend(Boolean isCommend) {
        this.isCommend = isCommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.is_show
     *
     * @return the value of bbs_product.is_show
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.is_show
     *
     * @param isShow the value for bbs_product.is_show
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.img_url
     *
     * @return the value of bbs_product.img_url
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.img_url
     *
     * @param imgUrl the value for bbs_product.img_url
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.is_del
     *
     * @return the value of bbs_product.is_del
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Boolean getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.is_del
     *
     * @param isDel the value for bbs_product.is_del
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.description
     *
     * @return the value of bbs_product.description
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.description
     *
     * @param description the value for bbs_product.description
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.package_list
     *
     * @return the value of bbs_product.package_list
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public String getPackageList() {
        return packageList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.package_list
     *
     * @param packageList the value for bbs_product.package_list
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setPackageList(String packageList) {
        this.packageList = packageList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.colors
     *
     * @return the value of bbs_product.colors
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public String getColors() {
        return colors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.colors
     *
     * @param colors the value for bbs_product.colors
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setColors(String colors) {
        this.colors = colors == null ? null : colors.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.sizes
     *
     * @return the value of bbs_product.sizes
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public String getSizes() {
        return sizes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.sizes
     *
     * @param sizes the value for bbs_product.sizes
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setSizes(String sizes) {
        this.sizes = sizes == null ? null : sizes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bbs_product.create_time
     *
     * @return the value of bbs_product.create_time
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bbs_product.create_time
     *
     * @param createTime the value for bbs_product.create_time
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ProductProduct{" +
                "images=" + Arrays.toString(images) +
                ", id=" + id +
                ", brandId=" + brandId +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isNew=" + isNew +
                ", isHot=" + isHot +
                ", isCommend=" + isCommend +
                ", isShow=" + isShow +
                ", imgUrl='" + imgUrl + '\'' +
                ", isDel=" + isDel +
                ", description='" + description + '\'' +
                ", packageList='" + packageList + '\'' +
                ", colors='" + colors + '\'' +
                ", sizes='" + sizes + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}