package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.model.License;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

  @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
  public License getLicenses(
      @PathVariable("organizationId") String organizationId,
      @PathVariable("licenseId") String licenseId) {
    return new License.Builder()
        .withId(Integer.parseInt(licenseId))
        .withProductName("product name for id: " + licenseId)
        .withType("type for id: " + licenseId)
        .withOrganizationId(Integer.parseInt(organizationId))
        .build();
  }
}
