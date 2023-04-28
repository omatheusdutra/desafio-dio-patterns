package com.dio.estrutural;

/**
 *
 * @author Matheus
 */
public class CafeSimples implements Cafe {

    @Override
    public double getPreco() {
        return 0.5;
    }

    @Override
    public String getComplementos() {
        return "Café";
    }
}
