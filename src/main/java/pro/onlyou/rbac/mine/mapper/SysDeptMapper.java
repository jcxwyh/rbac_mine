package pro.onlyou.rbac.mine.mapper;

import pro.onlyou.rbac.mine.entity.SysDept;

public interface SysDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int insert(SysDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int insertSelective(SysDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    SysDept selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysDept record);
}