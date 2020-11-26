package mum.domain;

public class Calculator {
    Integer add1, add2, mult1, mult2, sum, product;

    public Integer getAdd1() {
        return add1;
    }

    public void setAdd1(Integer add1) {
        this.add1 = add1;
    }

    public Integer getAdd2() {
        return add2;
    }

    public void setAdd2(Integer add2) {
        this.add2 = add2;
    }

    public Integer getMult1() {
        return mult1;
    }

    public void setMult1(Integer mult1) {
        this.mult1 = mult1;
    }

    public Integer getMult2() {
        return mult2;
    }

    public void setMult2(Integer mult2) {
        this.mult2 = mult2;
    }

    public Integer getSum() {
        return sum;
    }

    public Integer getProduct() {
        return product;
    }

    public void calcSum(){
        this.sum = add1 + add2;
    }

    public void calcProduct(){
        this.product = mult1 * mult2;
    }
}
