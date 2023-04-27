package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Pay;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface PayMapper {

    @Select("select * from payroll")
    List<Pay> list();


    @Delete("delete from payroll where payroll_id = #{id}")
    void deleteById(Integer id);


    @Insert("insert into payroll (payroll_id, employee_id, pay_date, gross_pay) values(#{payrollId},#{employeeId},#{payDate},#{grossPay})")
    void insert(Pay pay);

    @Update("Update payroll SET employee_id = #{employeeId}, pay_date = #{payDate}, gross_pay = #{grossPay} WHERE payroll_id = #{payrollId}")
    void update(Pay pay);
}
