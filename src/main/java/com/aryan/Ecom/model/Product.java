package com.aryan.Ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity //this annotation is required for the jpa TO convert this class into a Table, basically for ORM
@Component
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private String prodDesc;
    private String prodBrand;
    private BigDecimal prodPrice;
    private String prodCat;
    private Date prodReldate;
    private Boolean prodAvl;
    private int prodQuant;

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", prodDesc='" + prodDesc + '\'' +
                ", prodBrand='" + prodBrand + '\'' +
                ", prodPrice=" + prodPrice +
                ", prodCat='" + prodCat + '\'' +
                ", prodReldate=" + prodReldate +
                ", prodAvl=" + prodAvl +
                ", prodQuant=" + prodQuant +
                '}';
    }




}
