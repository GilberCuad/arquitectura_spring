package proyecto_arquitectura.demo_arquitectura.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import proyecto_arquitectura.demo_arquitectura.models.Student;
//import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
//Mongorepository tiene los metodos para el crud
List<Student> findByAttend(boolean asistio);
List<Student> findByNameContaining(String name);
}


