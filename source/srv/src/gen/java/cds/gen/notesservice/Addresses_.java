package cds.gen.notesservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

/**
 * Simplified view on external addresses, which is used as an association target in Notes.
 */
@CdsName("NotesService.Addresses")
public interface Addresses_ extends StructuredType<Addresses_> {
  String CDS_NAME = "NotesService.Addresses";

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
