package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_SupplierDunning")
public interface ASupplierDunning extends CdsData {
  String SUPPLIER = "Supplier";

  String COMPANY_CODE = "CompanyCode";

  String DUNNING_AREA = "DunningArea";

  String DUNNING_BLOCK = "DunningBlock";

  String DUNNING_LEVEL = "DunningLevel";

  String DUNNING_PROCEDURE = "DunningProcedure";

  String DUNNING_RECIPIENT = "DunningRecipient";

  String LAST_DUNNED_ON = "LastDunnedOn";

  String LEG_DUNNING_PROCEDURE_ON = "LegDunningProcedureOn";

  String DUNNING_CLERK = "DunningClerk";

  String AUTHORIZATION_GROUP = "AuthorizationGroup";

  String SUPPLIER_ACCOUNT_GROUP = "SupplierAccountGroup";

  @CdsName(SUPPLIER)
  String getSupplier();

  @CdsName(SUPPLIER)
  void setSupplier(String supplier);

  @CdsName(COMPANY_CODE)
  String getCompanyCode();

  @CdsName(COMPANY_CODE)
  void setCompanyCode(String companyCode);

  @CdsName(DUNNING_AREA)
  String getDunningArea();

  @CdsName(DUNNING_AREA)
  void setDunningArea(String dunningArea);

  @CdsName(DUNNING_BLOCK)
  String getDunningBlock();

  @CdsName(DUNNING_BLOCK)
  void setDunningBlock(String dunningBlock);

  @CdsName(DUNNING_LEVEL)
  String getDunningLevel();

  @CdsName(DUNNING_LEVEL)
  void setDunningLevel(String dunningLevel);

  @CdsName(DUNNING_PROCEDURE)
  String getDunningProcedure();

  @CdsName(DUNNING_PROCEDURE)
  void setDunningProcedure(String dunningProcedure);

  @CdsName(DUNNING_RECIPIENT)
  String getDunningRecipient();

  @CdsName(DUNNING_RECIPIENT)
  void setDunningRecipient(String dunningRecipient);

  @CdsName(LAST_DUNNED_ON)
  LocalDate getLastDunnedOn();

  @CdsName(LAST_DUNNED_ON)
  void setLastDunnedOn(LocalDate lastDunnedOn);

  @CdsName(LEG_DUNNING_PROCEDURE_ON)
  LocalDate getLegDunningProcedureOn();

  @CdsName(LEG_DUNNING_PROCEDURE_ON)
  void setLegDunningProcedureOn(LocalDate legDunningProcedureOn);

  @CdsName(DUNNING_CLERK)
  String getDunningClerk();

  @CdsName(DUNNING_CLERK)
  void setDunningClerk(String dunningClerk);

  @CdsName(AUTHORIZATION_GROUP)
  String getAuthorizationGroup();

  @CdsName(AUTHORIZATION_GROUP)
  void setAuthorizationGroup(String authorizationGroup);

  @CdsName(SUPPLIER_ACCOUNT_GROUP)
  String getSupplierAccountGroup();

  @CdsName(SUPPLIER_ACCOUNT_GROUP)
  void setSupplierAccountGroup(String supplierAccountGroup);

  ASupplierDunning_ ref();

  static ASupplierDunning create() {
    return Struct.create(ASupplierDunning.class);
  }
}
