package cds.gen.cds.outbox;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;
import java.time.Instant;

@CdsName("cds.outbox.Messages")
public interface Messages_ extends StructuredType<Messages_> {
  String CDS_NAME = "cds.outbox.Messages";

  ElementRef<String> ID();

  ElementRef<Instant> timestamp();

  ElementRef<String> target();

  ElementRef<String> msg();

  ElementRef<Integer> attempts();

  ElementRef<Integer> partition();
}
