package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.time.Instant;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("my.bookshop.Authors")
public interface Authors_ extends StructuredType<Authors_> {
  String CDS_NAME = "my.bookshop.Authors";

  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  ElementRef<String> name();

  ElementRef<LocalDate> dateOfBirth();

  ElementRef<LocalDate> dateOfDeath();

  ElementRef<String> placeOfBirth();

  ElementRef<String> placeOfDeath();

  Books_ books();

  Books_ books(Function<Books_, CqnPredicate> filter);
}
