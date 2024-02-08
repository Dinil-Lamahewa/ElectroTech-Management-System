package edu.icet.electrottech_management_system.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrderDetailDto {
    private Long orderDetailId;
    private Long orderId;
    private Long partId;
    private int quantity;
    private double price;
}
