package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

/**
 * Simplified view on external addresses, which is used as an association target in Notes.
 */
@CdsName("my.bookshop.NoteableAddresses")
public interface NoteableAddresses_ extends StructuredType<NoteableAddresses_> {
  String CDS_NAME = "my.bookshop.NoteableAddresses";

  ElementRef<String> ID();

  ElementRef<String> businessPartner();

  ElementRef<String> country();

  ElementRef<String> city();

  ElementRef<String> postalCode();

  ElementRef<String> street();

  ElementRef<String> houseNumber();

  Notes_ notes();

  Notes_ notes(Function<Notes_, CqnPredicate> filter);
}
