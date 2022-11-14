package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;

/**
 * Simplified view on external addresses, which in addition acts as a table to store replicated external address data.
 */
@CdsName("my.bookshop.Addresses")
public interface Addresses_ extends StructuredType<Addresses_> {
  String CDS_NAME = "my.bookshop.Addresses";

  ElementRef<String> ID();

  ElementRef<String> businessPartner();

  ElementRef<String> country();

  ElementRef<String> city();

  ElementRef<String> postalCode();

  ElementRef<String> street();

  ElementRef<String> houseNumber();

  ElementRef<Boolean> tombstone();
}
