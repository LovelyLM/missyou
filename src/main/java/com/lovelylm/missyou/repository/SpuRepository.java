package com.lovelylm.missyou.repository;
import com.lovelylm.missyou.model.Spu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by LovelyLM
 * 2020/3/19 10:18
 */
@Repository
public interface SpuRepository extends JpaRepository<Spu,Long> {
    Spu findOneById(Long id);
    Page<Spu> findByCategoryIdOrderByCreateTimeDesc(Long id, Pageable pageable);
    Page<Spu> findByRootCategoryIdOrderByCreateTime(Long id, Pageable pageable);
}
