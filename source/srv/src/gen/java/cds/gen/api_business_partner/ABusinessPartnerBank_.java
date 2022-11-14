package cds.gen.api_business_partner;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;
import java.time.Instant;
import java.time.LocalDate;

@CdsName("API_BUSINESS_PARTNER.A_BusinessPartnerBank")
public interface ABusinessPartnerBank_ extends StructuredType<ABusinessPartnerBank_> {
  String CDS_NAME = "API_BUSINESS_PARTNER.A_BusinessPartnerBank";

  ElementRef<String> BusinessPartner();

  ElementRef<String> BankIdentification();

  ElementRef<String> BankCountryKey();

  ElementRef<String> BankName();

  ElementRef<String> BankNumber();

  ElementRef<String> SWIFTCode();

  ElementRef<String> BankControlKey();

  ElementRef<String> BankAccountHolderName();

  ElementRef<String> BankAccountName();

  ElementRef<Instant> ValidityStartDate();

  ElementRef<Instant> ValidityEndDate();

  ElementRef<String> IBAN();

  ElementRef<LocalDate> IBANValidityStartDate();

  ElementRef<String> BankAccount();

  ElementRef<String> BankAccountReferenceText();

  ElementRef<Boolean> CollectionAuthInd();

  ElementRef<String> CityName();

  ElementRef<String> AuthorizationGroup();
}
