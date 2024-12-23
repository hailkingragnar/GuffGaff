package org.web.guffgaff.guffgaff.dto;

import lombok.*;


@ToString
@Data
public class MessageDTO {
    private String message;
    private String sender;
    private String receiver;
    private String date;

}
