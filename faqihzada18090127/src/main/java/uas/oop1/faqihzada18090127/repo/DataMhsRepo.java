package uas.oop1.faqihzada18090127.repo;

import uas.oop1.faqihzada18090127.entity.DataMhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}