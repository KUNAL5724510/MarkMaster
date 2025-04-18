package MarkMaster.com.MarkMaster.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import MarkMaster.com.MarkMaster.Entity.Student;

public interface student extends JpaRepository<Student, Integer> {
    // This interface will automatically provide CRUD operations for the Student entity
    // You can add custom query methods here if needed

}
