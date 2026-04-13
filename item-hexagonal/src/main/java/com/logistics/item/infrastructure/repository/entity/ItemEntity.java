package com.logistics.item.infrastructure.repository.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class ItemEntity {
    private String id;
    private String name;
}