package miu.edu.lab11.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import miu.edu.lab11.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>
{
    @Query("select e from Employee e where e.id= :id")
    public Employee findByEmployeeNumber(@Param("id") Long employeeNumber);

    @Query("select e from Employee e inner join e.phones p where p.areaCode = :areaCode and p.prefix = :prefix and p.number = :number")
    public Employee locateOneEmployeeByHisNumber(Integer areaCode, Integer prefix, Integer number);
 }

