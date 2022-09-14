package com.demo.mybatis.entity;

public class Goods {
  private Integer goodId;
  private String title;
  private String subTitle;
  private Float originalCost;
  private Float currentPrice;
  private Float discount;
  private Integer isFreeDelivery;

  public Integer getGoodId() {
    return goodId;
  }

  public String getTitle() {
    return title;
  }

  public String getSubTitle() {
    return subTitle;
  }

  public Float getOriginalCost() {
    return originalCost;
  }

  public Float getCurrentPrice() {
    return currentPrice;
  }

  public Float getDiscount() {
    return discount;
  }

  public Integer getIsFreeDelivery() {
    return isFreeDelivery;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  @Override
  public String toString() {
    return "Goods{" +
        "goodId=" + goodId +
        ", title='" + title + '\'' +
        ", subTitle='" + subTitle + '\'' +
        ", originalCost=" + originalCost +
        ", currentPrice=" + currentPrice +
        ", discount=" + discount +
        ", isFreeDelivery=" + isFreeDelivery +
        ", categoryId=" + categoryId +
        '}';
  }

  private Integer categoryId;

}
