package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_SupplierPartnerFunc")
public interface ASupplierPartnerFunc extends CdsData {
  String SUPPLIER = "Supplier";

  String PURCHASING_ORGANIZATION = "PurchasingOrganization";

  String SUPPLIER_SUBRANGE = "SupplierSubrange";

  String PLANT = "Plant";

  String PARTNER_FUNCTION = "PartnerFunction";

  String PARTNER_COUNTER = "PartnerCounter";

  String DEFAULT_PARTNER = "DefaultPartner";

  String CREATION_DATE = "CreationDate";

  String CREATED_BY_USER = "CreatedByUser";

  String REFERENCE_SUPPLIER = "ReferenceSupplier";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  @CdsName(SUPPLIER)
  String getSupplier();

  @CdsName(SUPPLIER)
  void setSupplier(String supplier);

  @CdsName(PURCHASING_ORGANIZATION)
  String getPurchasingOrganization();

  @CdsName(PURCHASING_ORGANIZATION)
  void setPurchasingOrganization(String purchasingOrganization);

  @CdsName(SUPPLIER_SUBRANGE)
  String getSupplierSubrange();

  @CdsName(SUPPLIER_SUBRANGE)
  void setSupplierSubrange(String supplierSubrange);

  @CdsName(PLANT)
  String getPlant();

  @CdsName(PLANT)
  void setPlant(String plant);

  @CdsName(PARTNER_FUNCTION)
  String getPartnerFunction();

  @CdsName(PARTNER_FUNCTION)
  void setPartnerFunction(String partnerFunction);

  @CdsName(PARTNER_COUNTER)
  String getPartnerCounter();

  @CdsName(PARTNER_COUNTER)
  void setPartnerCounter(String partnerCounter);

  @CdsName(DEFAULT_PARTNER)
  Boolean getDefaultPartner();

  @CdsName(DEFAULT_PARTNER)
  void setDefaultPartner(Boolean defaultPartner);

  @CdsName(CREATION_DATE)
  LocalDate getCreationDate();

  @CdsName(CREATION_DATE)
  void setCreationDate(LocalDate creationDate);

  @CdsName(CREATED_BY_USER)
  String getCreatedByUser();

  @CdsName(CREATED_BY_USER)
  void setCreatedByUser(String createdByUser);

  @CdsName(REFERENCE_SUPPLIER)
  String getReferenceSupplier();

  @CdsName(REFERENCE_SUPPLIER)
  void setReferenceSupplier(String referenceSupplier);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  ASupplierPartnerFunc_ ref();

  static ASupplierPartnerFunc create() {
    return Struct.create(ASupplierPartnerFunc.class);
  }
}
