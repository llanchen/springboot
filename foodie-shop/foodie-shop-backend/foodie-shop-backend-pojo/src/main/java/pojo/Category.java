package pojo;

import java.io.Serializable;

@Table(name = "`category`")
public class Category implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 分类名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 分类类型
     */
    @Column(name = "`type`")
    private Integer type;

    /**
     * 父id
     */
    @Column(name = "`father_id`")
    private Integer fatherId;

    /**
     * 图标
     */
    @Column(name = "`logo`")
    private String logo;

    /**
     * 口号
     */
    @Column(name = "`slogan`")
    private String slogan;

    /**
     * 分类图
     */
    @Column(name = "`cat_image`")
    private String catImage;

    /**
     * 背景颜色
     */
    @Column(name = "`bg_color`")
    private String bgColor;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分类类型
     *
     * @return type - 分类类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置分类类型
     *
     * @param type 分类类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取父id
     *
     * @return father_id - 父id
     */
    public Integer getFatherId() {
        return fatherId;
    }

    /**
     * 设置父id
     *
     * @param fatherId 父id
     */
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    /**
     * 获取图标
     *
     * @return logo - 图标
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置图标
     *
     * @param logo 图标
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取口号
     *
     * @return slogan - 口号
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * 设置口号
     *
     * @param slogan 口号
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    /**
     * 获取分类图
     *
     * @return cat_image - 分类图
     */
    public String getCatImage() {
        return catImage;
    }

    /**
     * 设置分类图
     *
     * @param catImage 分类图
     */
    public void setCatImage(String catImage) {
        this.catImage = catImage;
    }

    /**
     * 获取背景颜色
     *
     * @return bg_color - 背景颜色
     */
    public String getBgColor() {
        return bgColor;
    }

    /**
     * 设置背景颜色
     *
     * @param bgColor 背景颜色
     */
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
}
