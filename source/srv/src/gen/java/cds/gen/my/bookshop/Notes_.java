package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

@CdsName("my.bookshop.Notes")
public interface Notes_ extends StructuredType<Notes_> {
  String CDS_NAME = "my.bookshop.Notes";

  ElementRef<String> ID();

  ElementRef<String> note();

  NoteableAddresses_ address();

  NoteableAddresses_ address(Function<NoteableAddresses_, CqnPredicate> filter);

  ElementRef<String> address_ID();

  ElementRef<String> address_businessPartner();
}
