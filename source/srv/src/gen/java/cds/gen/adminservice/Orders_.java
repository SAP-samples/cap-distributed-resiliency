package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.function.Function;

@CdsName("AdminService.Orders")
public interface Orders_ extends StructuredType<Orders_> {
  String CDS_NAME = "AdminService.Orders";

  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  ElementRef<String> OrderNo();

  OrderItems_ Items();

  OrderItems_ Items(Function<OrderItems_, CqnPredicate> filter);

  ElementRef<String> buyer();

  ElementRef<BigDecimal> total();

  Currencies_ currency();

  Currencies_ currency(Function<Currencies_, CqnPredicate> filter);

  ElementRef<String> currency_code();

  Addresses_ shippingAddress();

  Addresses_ shippingAddress(Function<Addresses_, CqnPredicate> filter);

  ElementRef<String> shippingAddress_ID();

  ElementRef<String> shippingAddress_businessPartner();

  ElementRef<Boolean> IsActiveEntity();

  ElementRef<Boolean> HasActiveEntity();

  ElementRef<Boolean> HasDraftEntity();

  DraftAdministrativeData_ DraftAdministrativeData();

  DraftAdministrativeData_ DraftAdministrativeData(
      Function<DraftAdministrativeData_, CqnPredicate> filter);

  ElementRef<String> DraftAdministrativeData_DraftUUID();

  Orders_ SiblingEntity();

  Orders_ SiblingEntity(Function<Orders_, CqnPredicate> filter);
}
