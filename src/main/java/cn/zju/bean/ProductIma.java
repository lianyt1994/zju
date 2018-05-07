package cn.zju.bean;

import java.util.Arrays;

public class ProductIma {
    private Long id;
    private Byte[] imag;
    private Byte[] imag2;

    @Override
    public String toString() {
        return "ProductIma{" +
                "id=" + id +
                ", imag=" + Arrays.toString(imag) +
                ", imag2=" + Arrays.toString(imag2) +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte[] getImag() {
        return imag;
    }

    public void setImag(Byte[] imag) {
        this.imag = imag;
    }

    public Byte[] getImag2() {
        return imag2;
    }

    public void setImag2(Byte[] imag2) {
        this.imag2 = imag2;
    }
}
