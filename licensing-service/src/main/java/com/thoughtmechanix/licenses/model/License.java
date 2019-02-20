package com.thoughtmechanix.licenses.model;

public class License {

  private int id;
  private String productName;
  private String type;
  private int organizationId;

  // Private constructor, use builder instead
  private License() {
  }

  public int getId() {
    return id;
  }

  private void setId(int id) {
    this.id = id;
  }

  public String getProductName() {
    return productName;
  }

  private void setProductName(String productName) {
    this.productName = productName;
  }

  public String getType() {
    return type;
  }

  private void setType(String type) {
    this.type = type;
  }

  public int getOrganizationId() {
    return organizationId;
  }

  private void setOrganizationId(int organizationId) {
    this.organizationId = organizationId;
  }

  public static class Builder {

    private int id;
    private String productName;
    private String type;
    private int organizationId;

    public Builder() {
    }

    public Builder withId(int id) {
      this.id = id;
      return this;
    }

    public Builder withProductName(String productName) {
      this.productName = productName;
      return this;
    }

    public Builder withType(String type) {
      this.type = type;
      return this;
    }

    public Builder withOrganizationId(int organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    public License build() {
      License license = new License();
      license.setId(id);
      license.setProductName(productName);
      license.setType(type);
      license.setOrganizationId(organizationId);
      return license;
    }
  }
}
