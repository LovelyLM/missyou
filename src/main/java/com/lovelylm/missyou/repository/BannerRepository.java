package com.lovelylm.missyou.repository;

import com.lovelylm.missyou.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by LovelyLM
 * 2020/3/19 10:18
 */
@Repository
public interface BannerRepository extends JpaRepository<Banner,Long> {
    Banner findOneById(Long id);
    Banner findOneByName(String name);
}
