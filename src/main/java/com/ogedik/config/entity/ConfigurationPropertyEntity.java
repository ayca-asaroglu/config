/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.ogedik.config.constants.ConfigurationConstants;

import entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author orkun.gedik
 */
@Entity
@Getter
@Setter
@ToString
public class ConfigurationPropertyEntity extends AbstractEntity {

  @Id
  @Column(name = ConfigurationConstants.COLS.PROPERTY_KEY)
  private String propertyKey;

  @Column(name = ConfigurationConstants.COLS.PROPERTY_VALUE)
  private String propertyValue;

}
