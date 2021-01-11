package jpabook.jpashop.service;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateItemDto { //data transmission to object
    //이걸로 itemService에 있는 string name, int price, int StockQuantity를 하나로 파라미터를 줄일 수 있다.
}
