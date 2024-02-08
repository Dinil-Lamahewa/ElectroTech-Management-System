package edu.icet.electrottech_management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ItemDto {
    private Long itemId;
    private String name;
    private String category;
    private String standardFee;
}
