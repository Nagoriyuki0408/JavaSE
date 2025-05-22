package com.nagoriyuki.demo8Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String name;
    private double price;
    private String actor;
    private double score;
}
