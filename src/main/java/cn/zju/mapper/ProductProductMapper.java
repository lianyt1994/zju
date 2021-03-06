package cn.zju.mapper;

import cn.zju.bean.ProductProduct;
import cn.zju.bean.ProductProductExample;
import java.util.List;

import cn.zju.dto.ProductQueryDto;
import org.apache.ibatis.annotations.Param;

public interface ProductProductMapper {

    List<ProductProduct> selectProductLimit(ProductQueryDto productQueryDto);

    Integer SelectProductCount(ProductQueryDto productQueryDto);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int countByExample(ProductProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int deleteByExample(ProductProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int insert(ProductProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int insertSelective(ProductProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    List<ProductProduct> selectByExample(ProductProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    ProductProduct selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductProduct record, @Param("example") ProductProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int updateByExample(@Param("record") ProductProduct record, @Param("example") ProductProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int updateByPrimaryKeySelective(ProductProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_product
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int updateByPrimaryKey(ProductProduct record);
}