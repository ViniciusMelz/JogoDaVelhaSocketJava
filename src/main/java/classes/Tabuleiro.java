/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author Johnn
 */
public class Tabuleiro implements Serializable{
    
    private static final long serialVersionUID = 123456789L;
    
    private String b1;
    private String b2;
    private String b3;
    private String b4;
    private String b5;
    private String b6;
    private String b7;
    private String b8;
    private String b9;

    public Tabuleiro() {
        b1 = "";
        b2 = "";
        b3 = "";
        b4 = "";
        b5 = "";
        b6 = "";
        b7 = "";
        b8 = "";
        b9 = "";
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public String getB4() {
        return b4;
    }

    public void setB4(String b4) {
        this.b4 = b4;
    }

    public String getB5() {
        return b5;
    }

    public void setB5(String b5) {
        this.b5 = b5;
    }

    public String getB6() {
        return b6;
    }

    public void setB6(String b6) {
        this.b6 = b6;
    }

    public String getB7() {
        return b7;
    }

    public void setB7(String b7) {
        this.b7 = b7;
    }

    public String getB8() {
        return b8;
    }

    public void setB8(String b8) {
        this.b8 = b8;
    }

    public String getB9() {
        return b9;
    }

    public void setB9(String b9) {
        this.b9 = b9;
    }

    @Override
    public String toString() {
        return "Dados{" + "b1=" + b1 + ", b2=" + b2 + ", b3=" + b3 + ", b4=" + b4 + ", b5=" + b5 + ", b6=" + b6 + ", b7=" + b7 + ", b8=" + b8 + ", b9=" + b9 + '}';
    }
    
    
    
}
