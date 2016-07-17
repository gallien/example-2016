package de.htwberlin.mae.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="anzahl-artikelbezeichnung", types={Warenkorb.class})
public interface WarenkorbAnzahlArtikelProjection {
	
	Integer getAnzahl();
	
	@Value("#{target.artikel.bezeichnung}")
	String getBezeichnung();
}
