package in.sp.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
