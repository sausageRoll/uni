package com.lozko.uni.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class Book {

  @Id
  @SequenceGenerator(name="pk_b_sequence",sequenceName="book_id_seq", allocationSize=1)
  @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_b_sequence")
  private final int id;
  private final int clientId;
  private final int sum;
}
