package com.sqgxy.jmp.ems_bs.entity;

public class Product {
    /**
     *商品id
     */
     private int spid;
     /**
      *商品名称
      */
      private String spname;
      /*
      * 商品原价
      */
      private double spjprice;
    /*
     * 商品售价
     */
    private double spsprice;
    /**
     *商品数量
     */
     private int spcount;
     /**
      *商品的图片
      */
      private String sppic;
      /**
       *商品的快递方式
       */
       private String spExpress;

       /*生成属性的get set方法*/

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public double getSpjprice() {
        return spjprice;
    }

    public void setSpjprice(double spjprice) {
        this.spjprice = spjprice;
    }

    public double getSpsprice() {
        return spsprice;
    }

    public void setSpsprice(double spsprice) {
        this.spsprice = spsprice;
    }

    public int getSpcount() {
        return spcount;
    }

    public void setSpcount(int spcount) {
        this.spcount = spcount;
    }

    public String getSppic() {
        return sppic;
    }

    public void setSppic(String sppic) {
        this.sppic = sppic;
    }

    public String getSpExpress() {
        return spExpress;
    }

    public void setSpExpress(String spExpress) {
        this.spExpress = spExpress;
    }
}
