package org.injae.domain;

import lombok.Data;

@Data
public class OrderVO {

    private int mno;
    private int qty;

    public OrderVO(String str){
        String[] arr = str.split("_");
        if(arr.length != 2){
            return;
        }
        this.mno = Integer.parseInt(arr[0]);
        this.qty = Integer.parseInt(arr[1]);
    }
}