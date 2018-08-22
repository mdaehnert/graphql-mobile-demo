package de.mdaehnert.graphql.mobile.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue
  private Integer id;

  @Column
  private String name;

}