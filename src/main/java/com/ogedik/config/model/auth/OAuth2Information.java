/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.model.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @author orkun.gedik
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OAuth2Information implements AuthInformation {

  @NotNull
  private String token;
}
