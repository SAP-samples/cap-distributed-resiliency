package cds.gen.api_business_partner;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("API_BUSINESS_PARTNER.A_BuPaIndustry")
public interface ABuPaIndustry extends CdsData {
  String INDUSTRY_SECTOR = "IndustrySector";

  String INDUSTRY_SYSTEM_TYPE = "IndustrySystemType";

  String BUSINESS_PARTNER = "BusinessPartner";

  String IS_STANDARD_INDUSTRY = "IsStandardIndustry";

  String INDUSTRY_KEY_DESCRIPTION = "IndustryKeyDescription";

  @CdsName(INDUSTRY_SECTOR)
  String getIndustrySector();

  @CdsName(INDUSTRY_SECTOR)
  void setIndustrySector(String industrySector);

  @CdsName(INDUSTRY_SYSTEM_TYPE)
  String getIndustrySystemType();

  @CdsName(INDUSTRY_SYSTEM_TYPE)
  void setIndustrySystemType(String industrySystemType);

  @CdsName(BUSINESS_PARTNER)
  String getBusinessPartner();

  @CdsName(BUSINESS_PARTNER)
  void setBusinessPartner(String businessPartner);

  @CdsName(IS_STANDARD_INDUSTRY)
  String getIsStandardIndustry();

  @CdsName(IS_STANDARD_INDUSTRY)
  void setIsStandardIndustry(String isStandardIndustry);

  @CdsName(INDUSTRY_KEY_DESCRIPTION)
  String getIndustryKeyDescription();

  @CdsName(INDUSTRY_KEY_DESCRIPTION)
  void setIndustryKeyDescription(String industryKeyDescription);

  ABuPaIndustry_ ref();

  static ABuPaIndustry create() {
    return Struct.create(ABuPaIndustry.class);
  }
}
