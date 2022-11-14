package cds.gen.adminservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.String;
import java.util.function.Function;

@CdsName("AdminService.Books.texts")
public interface BooksTexts_ extends StructuredType<BooksTexts_> {
  String CDS_NAME = "AdminService.Books.texts";

  ElementRef<String> ID_texts();

  ElementRef<String> locale();

  ElementRef<String> ID();

  ElementRef<String> title();

  ElementRef<String> descr();

  ElementRef<Boolean> IsActiveEntity();

  ElementRef<Boolean> HasActiveEntity();

  ElementRef<Boolean> HasDraftEntity();

  DraftAdministrativeData_ DraftAdministrativeData();

  DraftAdministrativeData_ DraftAdministrativeData(
      Function<DraftAdministrativeData_, CqnPredicate> filter);

  ElementRef<String> DraftAdministrativeData_DraftUUID();

  BooksTexts_ SiblingEntity();

  BooksTexts_ SiblingEntity(Function<BooksTexts_, CqnPredicate> filter);
}
