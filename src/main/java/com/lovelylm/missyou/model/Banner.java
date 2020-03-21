package com.lovelylm.missyou.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

/**
 * Created by LovelyLM
 * 2020/3/18 15:48
 */

@Entity
@Getter
@Setter
public class Banner extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String img;
    private String title;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "bannerId")
    private List<BannerItem> items;
}
