package com.example.onlinebookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.Data;

@Entity
@Table(name = "books", uniqueConstraints = @UniqueConstraint(columnNames = {"isbn"}))
@Data
public class Book {
    @Id
    private Long id;
    @NotNull(message = "Title cannot be null")
    private String title;
    @NotNull(message = "Author cannot be null")
    private String author;
    @NotNull(message = "Isbn cannot be null")
    private String isbn;
    @NotNull(message = "Price cannot be null")
    private BigDecimal price;
    private String description;
    private String coverImage;
}
