package com.ohgiraffers.test;

public class Cinnamoroll extends Sanrio{
    private String goodstype;

    public Cinnamoroll(){};
    public Cinnamoroll(String name, int price, double size, String goodstype){
        super(name, price, size);
        this.goodstype = goodstype;
    }

    public void setGoodstype(String goodstype){this.goodstype = goodstype;}
    public String getGoodstype(){return this.goodstype;}

    @Override
    public String info(){
        return super.info()+", 굿즈형태 : "+this.goodstype;
    }
}
