package cn.zju.mapper;

import cn.zju.bean.ProductColor;
import cn.zju.bean.ProductColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductColorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int countByExample(ProductColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int deleteByExample(ProductColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int insert(ProductColor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int insertSelective(ProductColor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    List<ProductColor> selectByExample(ProductColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    ProductColor selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductColor record, @Param("example") ProductColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int updateByExample(@Param("record") ProductColor record, @Param("example") ProductColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int updateByPrimaryKeySelective(ProductColor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bbs_color
     *
     * @mbggenerated Sun Apr 29 22:23:11 CST 2018
     */
    int updateByPrimaryKey(ProductColor record);
}