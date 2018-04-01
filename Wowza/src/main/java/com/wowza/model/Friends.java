package com.wowza.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Friends {
    private long user_id;
    private String full_name;
}
