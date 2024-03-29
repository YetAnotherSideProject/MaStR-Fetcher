# AllgemeineFunktionen



## GetLokaleUhrzeit

Diese Funktion dient zum Testen der Verbindung von einem Client zu dem Webdienst des Marktstammdatenregisters.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr></table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>LokaleUhrzeit</td>
<td>Die aktuelle Uhrzeit</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>



## GetLokaleUhrzeitMitAuthentifizierung

Diese Funktion dient zum Testen der Verbindung von einem Client zu dem Webdienst des Marktstammdatenregisters. Über die Webdienst-Schlüssel Angabe kann die Authentifizierung überprüft werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>LokaleUhrzeitMitAuthentifizierung</td>
<td>Die aktuelle Uhrzeit</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>



## GetListeKatalogkategorien

Diese Funktion ermöglicht das Abrufen der verfügbaren Kategorien des dynamischen MaStR-Katalogs. Nicht alle Kataloge sind statisch und damit als Enumerationen abgebildet. Ein Teil der Kataloge sind dynamisch. Durch diese Funktion können die verfügbaren Katalogkategorien abgerufen werden. Mit diesen Angaben können über die Funktion „GetKatalogwerte“ die Werte zu den Kategorien abgerufen werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Katalogkategorien[]</td>
<td></td>
<td><a href="#katalogkategorie">Katalogkategorie</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetKatalogwerte

Diese Funktion ermöglicht das Abrufen der verfügbaren Werte der gewünschten Kategorie des dynamischen MaStR-Katalogs. Dieser Katalog ist eine kategorisierte Sammlung von Schlüssel-Werte-Paaren.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>id</td>
<td>Id der Katalogkategorie</td>
<td><a href="#katalogkategorieid">KatalogkategorieId</a></td>
<td>Ja</td>
<td>1</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Katalogwerte[]</td>
<td></td>
<td><a href="#katalogwert">Katalogwert</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetBilanzierungsgebiete

Diese Funktion ermöglicht das Abrufen der Bilanzierungsgebiete des angegebenen Marktakteurs.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des Marktakteurs, dessen Bilanzierungsgebiete abgerufen werden sollen</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Bilanzierungsgebiete[]</td>
<td></td>
<td><a href="#bilanzierungsgebiet">Bilanzierungsgebiet</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetAktuellerStandTageskontingent

Diese Funktion liefert den aktuellen Stand des Abrufzählers des Tageskontingents für den Marktakteur, dem der Benutzer des angegebenen Webdienst-Schlüssels zugeordnet ist. Ist kein Kontingent festgelegt, wird -1 zurückgegeben.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>AktuellerStandTageskontingent</td>
<td>Der aktuelle Stand des Kontingents des angegebenen Benutzers</td>
<td>int</td>
<td>Ja</td>
<td>1234</td>
</tr>
<tr>
<td>AktuellesLimitTageskontingent</td>
<td>Das aktuelle Limit des Kontingents des angegebenen Benutzers</td>
<td>int</td>
<td>Ja</td>
<td>10000</td>
</tr>
</table>

# Akteur



## GetGefilterteListeMarktakteure

Diese Funktion ermöglicht das Abrufen einer Liste mit öffentlichen Marktakteuren, die der Suchanfrage entsprechen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>name</td>
<td>Name der Organisation mit dem rechtsformergänzenden Namenszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Stromerzeuger Süd AG</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Postleitzahl des Marktakteurs</td>
<td>string</td>
<td>Nein</td>
<td>89241</td>
</tr>
<tr>
<td>ort</td>
<td>Ort des Marktakteurs</td>
<td>string</td>
<td>Nein</td>
<td>München</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland des Marktakteurs</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>marktfunktion</td>
<td>Marktfunktion des Marktakteurs</td>
<td><a href="#marktfunktionenum">MarktfunktionEnum</a></td>
<td>Nein</td>
<td>Stromnetzbetreiber</td>
</tr>
<tr>
<td>Marktrollen[]</td>
<td>Auflistung der zugeordneten Marktrollen und deren Daten</td>
<td><a href="#marktrollenenum">MarktrollenEnum</a></td>
<td>Nein</td>
<td>z.B.: NetzbetreiberAnschlussnetzbetreiberStrom</td>
</tr>
<tr>
<td>MarktrolleMastrNummerIds[]</td>
<td>Die MaStR-Nummer der Marktrolle des Marktakteurs entsprechend dem Nummernkreis</td>
<td><a href="#marktrollemastrnummerid">MarktrolleMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890AN</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Marktakteure[]</td>
<td></td>
<td><a href="#marktakteur">Marktakteur</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetListeAlleMarktakteure

Diese Funktion ermöglicht das Abrufen einer Liste mit allen öffentlichen Marktakteuren. Es können nur aktive, legitimierte Marktakteure abgerufen werden, die keine Privatpersonen sind.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>ListeMarktakteure[]</td>
<td></td>
<td><a href="#marktakteur">Marktakteur</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetListeFreigegebeneMarktakteure

Diese Funktion ermöglicht das Abrufen einer Liste der Marktakteure, für die der aufrufende Marktakteur eine Datenfreigabe besitzt.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>ListeMarktakteure[]</td>
<td></td>
<td><a href="#marktakteur">Marktakteur</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetMarktakteur

Diese Funktion ermöglicht das Abrufen von Informationen zu einem Marktakteur. Es werden nur öffentlich zugängliche Daten von aktiven und legitimierten Marktakteuren übermittelt. Es können auch Daten von Marktakteuren abgerufen werden, für die der abrufende Marktakteur eine gültige Datenfreigabe besitzt. Das Abrufen von Informationen von privaten Marktakteuren (natürlichen Personen) ist nicht möglich.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>mastrNummer</td>
<td>Die MaStR-Nummer des gewünschten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>MastrNummer</td>
<td>Die MaStR-Nummer des gewünschten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>DatumLetzeAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Personenart</td>
<td>Angabe der Personenart des Marktakteurs: natürliche Person oder Organisation</td>
<td><a href="#personenartenum">PersonenartEnum</a></td>
<td>Ja</td>
<td>Organisation</td>
</tr>
<tr>
<td>MarktakteurAnrede</td>
<td>Anrede der natürlichen Person</td>
<td><a href="#salutationenum">SalutationEnum</a></td>
<td>Nein</td>
<td>Herr</td>
</tr>
<tr>
<td>MarktakteurTitel</td>
<td>Titel der natürlichen Person</td>
<td><a href="#titelenum">TitelEnum</a></td>
<td>Nein</td>
<td>Dr</td>
</tr>
<tr>
<td>MarktakteurVorname</td>
<td>Vorname der natürlichen Person</td>
<td>string</td>
<td>Nein</td>
<td>Janine</td>
</tr>
<tr>
<td>MarktakteurNachname</td>
<td>Nachname der natürlichen Person</td>
<td>string</td>
<td>Nein</td>
<td>Mustermann</td>
</tr>
<tr>
<td>Geburtsdatum</td>
<td>Geburtsdatum der natürlichen Person</td>
<td>date</td>
<td>Nein</td>
<td>2000-07-25</td>
</tr>
<tr>
<td>Firmenname</td>
<td>Name der Firma mit dem rechtsformergänzenden Namenszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Stromnetz Land AG</td>
</tr>
<tr>
<td>Marktfunktion</td>
<td>Marktfunktion des Marktakteurs</td>
<td><a href="#marktfunktionenum">MarktfunktionEnum</a></td>
<td>Ja</td>
<td>Stromnetzbetreiber</td>
</tr>
<tr>
<td>Rechtsform</td>
<td>Rechtsform der Organsiation</td>
<td><a href="#katalogwert">Katalogwert</a></td>
<td>Nein</td>
<td>AG</td>
</tr>
<tr>
<td>SonstigeRechtsform</td>
<td>Angabe der Rechtsform, wenn Sonstige gewählt wurde</td>
<td>string</td>
<td>Nein</td>
<td>SW</td>
</tr>
<tr>
<td>Marktrollen[]</td>
<td>Auflistung der zugeordneten Marktrollen und deren Daten</td>
<td><a href="#marktrolle">Marktrolle</a></td>
<td>Nein</td>
<td>z.B.: NetzbetreiberAnschlussnetzbetreiberStrom</td>
</tr>
<tr>
<td>Marktakteursvertreter</td>
<td>Der zugeordnete, verantwortliche Marktakteursvertreter</td>
<td>string</td>
<td>Ja</td>
<td>Frau Erika Mustermann</td>
</tr>
<tr>
<td>Land</td>
<td>Das Land, in dem der Marktakteur seinen Sitz hat</td>
<td><a href="#landenum">LandEnum</a></td>
<td>Nein</td>
<td>Oesterreich</td>
</tr>
<tr>
<td>Region</td>
<td>Region</td>
<td>string</td>
<td>Nein</td>
<td>Region</td>
</tr>
<tr>
<td>Strasse</td>
<td>Die Straße, in der der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Musterfrau-Str.</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Die Hausnummer, an der der Marktakteur seinen Sitz hat.</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Optionaler Zusatz zur Anschrift des Marktakteurs.</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Die Postleitzahl, in deren Gebiet der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>1600</td>
</tr>
<tr>
<td>Ort</td>
<td>Der Ort, in dem der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Wien</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Das Bundesland, in dem der Marktakteur seinen Sitz hat.</td>
<td><a href="#bundeslaenderenum">BundeslaenderEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>Netz</td>
<td>Netz des Netzbetreibers (nur bei Netzbetreibern)</td>
<td><a href="#netz">Netz</a></td>
<td>Nein</td>
<td>[Objekt]</td>
</tr>
<tr>
<td>Nuts2</td>
<td>NUTS-II-Region</td>
<td><a href="#nutszweiregion">NutsZweiRegion</a></td>
<td>Nein</td>
<td>AT13</td>
</tr>
<tr>
<td>AbweichenderNameFirmenname</td>
<td>Abweichender Name/Firmenname</td>
<td>string</td>
<td>Nein</td>
<td>Stromnetz Land AG</td>
</tr>
<tr>
<td>Email</td>
<td>E-Mail des Marktakteurs</td>
<td>string</td>
<td>Ja</td>
<td>mail@landstrom.ag</td>
</tr>
<tr>
<td>Telefon</td>
<td>Telefonnummer des Marktakteurs</td>
<td>string</td>
<td>Ja</td>
<td>039111223344</td>
</tr>
<tr>
<td>Fax</td>
<td>Faxnummer des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>039111223355</td>
</tr>
<tr>
<td>Webseite</td>
<td>Internetadresse des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>www.landstrom.ag</td>
</tr>
<tr>
<td>ImHandelsregisterEingetragen</td>
<td>Angabe ob der Anlagenbetreiber im Handelsregister eingetragen ist</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Registergericht</td>
<td>Angabe des Registergerichts, bei dem die Organisation registriert ist</td>
<td><a href="#erweiterterkatalogwert">ErweiterterKatalogwert</a></td>
<td>Ja</td>
<td>Amtsgericht Stendal</td>
</tr>
<tr>
<td>RegistergerichtAusland</td>
<td>Angabe des Registergerichts, bei dem die Organisation registriert ist, wenn im Ausland</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>Amtsgericht Luxemburg</td>
</tr>
<tr>
<td>Registernummer</td>
<td>Registernummer des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>HRB 21016</td>
</tr>
<tr>
<td>RegisternummerAusland</td>
<td>Registernummer des Marktakteurs, wenn im Ausland</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>XY 21016</td>
</tr>
<tr>
<td>Taetigkeitsbeginn</td>
<td>Tätigkeitsbeginn des Marktakteurs</td>
<td>date</td>
<td>Nein</td>
<td>2010-05-06</td>
</tr>
<tr>
<td>AcerCode</td>
<td>Der ACER-Code des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>ACE2442523454</td>
</tr>
<tr>
<td>Umsatzsteueridentifikationsnummer</td>
<td>Die USt-Id Nummer des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>DE235583371</td>
</tr>
<tr>
<td>Taetigkeitsende</td>
<td>Das Tätigkeitsende des Marktakteurs</td>
<td><a href="#erweitertesdate">ErweitertesDate</a></td>
<td>Ja</td>
<td>2012-05-06</td>
</tr>
<tr>
<td>BundesnetzagenturBetriebsnummer</td>
<td>BNetzA-Betriebsnummer des Netzbetreibers (nur bei Stromnetzbetreiber, Gasnetzbetreiber)</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>12345678</td>
</tr>
<tr>
<td>AdresseIstZustelladresse</td>
<td>Angabe ob an die angegebene Adresse Dokumente zugestellt werden können</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>ZustellLand</td>
<td>Land - Zustelladresse</td>
<td><a href="#landenum">LandEnum</a></td>
<td>Nein</td>
<td>Land</td>
</tr>
<tr>
<td>ZustellPostleitzahl</td>
<td>Postleitzahl - Zustelladresse</td>
<td>string</td>
<td>Nein</td>
<td>PLZ</td>
</tr>
<tr>
<td>ZustellOrt</td>
<td>Ort - Zustelladresse</td>
<td>string</td>
<td>Nein</td>
<td>Ort</td>
</tr>
<tr>
<td>ZustellStrasse</td>
<td>Straße - Zustelladresse</td>
<td>string</td>
<td>Nein</td>
<td>Straße</td>
</tr>
<tr>
<td>ZustellStrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellHausnummer</td>
<td>Hausnummer - Zustelladresse</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>Hausnummer</td>
</tr>
<tr>
<td>ZustellHausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellAdresszusatz</td>
<td>Adresszusatz - Zustelladresse</td>
<td>string</td>
<td>Nein</td>
<td>Adresszusatz</td>
</tr>
<tr>
<td>Kmu</td>
<td>Kleinst-, Klein- oder mittleres Unternehmen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>EinkommenAusSelbstaendigerArbeit</td>
<td>Angabe ob der Anlagenbetreiber Einkommen aus selbstständiger Arbeit erziehlt</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>TelefonnummerVMav</td>
<td>Telefonnummer des vMAV</td>
<td>string</td>
<td>Nein</td>
<td>039111223344</td>
</tr>
<tr>
<td>EmailVMav</td>
<td>E-Mailadresse des vMAV</td>
<td>string</td>
<td>Nein</td>
<td>erika.mustermann@musterstromag.de</td>
</tr>
<tr>
<td>RegistrierungsdatumMarktakteur</td>
<td>Registrierungsdatum</td>
<td>date</td>
<td>Nein</td>
<td>2000-12-31-</td>
</tr>
<tr>
<td>HauptwirtdschaftszweigAbteilung</td>
<td>Hauptwirtschaftszweig - Abteilung</td>
<td><a href="#naceabteilungenum">NaceAbteilungEnum</a></td>
<td>Nein</td>
<td>EnumValue</td>
</tr>
<tr>
<td>HauptwirtdschaftszweigGruppe</td>
<td>Hauptwirtschaftszweig - Gruppe</td>
<td><a href="#nacegruppeenum">NaceGruppeEnum</a></td>
<td>Nein</td>
<td>EnumValue</td>
</tr>
<tr>
<td>HauptwirtdschaftszweigAbschnitt</td>
<td>Hauptwirtschaftszweig - Abschnitt</td>
<td><a href="#naceabschnittenum">NaceAbschnittEnum</a></td>
<td>Nein</td>
<td>EnumValue</td>
</tr>
<tr>
<td>Direktvermarktungsunternehmen</td>
<td>Direktvermarktungsunternehmen</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BelieferungVonLetztverbrauchernStrom</td>
<td>Belieferung von Letztverbrauchern</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BelieferungHaushaltskundenStrom</td>
<td>Belieferung von Haushaltskunden mit Strom</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Gasgrosshaendler</td>
<td>Gasgroßhändler</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Stromgrosshaendler</td>
<td>Stromgroßhändler</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BelieferungVonLetztverbrauchernGas</td>
<td>Belieferung von Letztverbrauchern</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BelieferungHaushaltskundenGas</td>
<td>Belieferung von Haushaltskunden mit Gas</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
</table>



## GetMeineMarktakteure

Diese Funktion ermöglicht das Abrufen einer Liste der eigenen und nicht gelöschten Marktakteure, denen der Benutzer zugeordnet ist. Die Funktion übergibt auch die deaktivierten Marktakteure, denen der Benutzer zugeordnet ist

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>ListeMarktakteure[]</td>
<td></td>
<td><a href="#marktakteur">Marktakteur</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>

# Anlage



## GetListeLetzteAktualisierung

Diese Funktion ermöglicht das Abrufen einer Liste mit Einheiten und Objekten und deren Aktualisierungsdaten.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>DatumAb der Einheit [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>Einheitart</td>
<td>Art der Einheit</td>
<td><a href="#einheitartenum">EinheitArtEnum</a></td>
<td>Nein</td>
<td>Stromerzeugungseinheit</td>
</tr>
<tr>
<td>Einheittyp</td>
<td>Typ der Einheit</td>
<td><a href="#einheittypenum">EinheitTypEnum</a></td>
<td>Nein</td>
<td>Solareinheit</td>
</tr>
<tr>
<td>VerknuepftesObjektArt</td>
<td>Das mit Einheit verknuepfte Objekt</td>
<td><a href="#einheitletzteaktualisierungobjektenum">EinheitLetzteAktualisierungObjektEnum</a></td>
<td>Ja</td>
<td>KWK</td>
</tr>
<tr>
<td>VerknuepftesObjektDatumAb</td>
<td>DatumAb des verknuepften Objekts</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>VerknuepftesObjektId</td>
<td>Die MaStR-Nummer oder die Id des gesuchten Objektes</td>
<td>string</td>
<td>Nein</td>
<td>129891</td>
</tr>
<tr>
<td>EinheitMastrNummern[]</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Einheiten[]</td>
<td></td>
<td><a href="#einheitletzteaktualisierung">EinheitLetzteAktualisierung</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetListeAlleEinheiten

Diese Funktion ermöglicht das Abrufen einer Liste mit allen aktiven, öffentlich sichtbaren Einheiten.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>einheitMastrNummern[]</td>
<td></td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Einheiten[]</td>
<td></td>
<td><a href="#einheit">Einheit</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetListeFreigegebeneEinheiten

Diese Funktion ermöglicht das Abrufen einer Liste mit allen Einheiten, bei denen der abrufende Marktakteur auf Grund von Datenfreigaben eine Leseberechtigung besitzt. Dies ist gegeben, wenn ihm mindestens eines der Geheimnisfelder der Einheit über eine Datenfreigabe freigegeben wurde.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Einheiten[]</td>
<td></td>
<td><a href="#einheit">Einheit</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetMeineEinheiten

Diese Funktion ermöglicht das Abrufen einer Liste mit allen Einheiten, bei denen der Marktakteur Anlagenbetreiber ist. Die Ausgabe von Daten einer gelöschten Einheit erfolgt eingeschränkt.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Einheiten[]</td>
<td></td>
<td><a href="#einheit">Einheit</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetListeEinheitenInMeinemNetz

Diese Funktion ermöglicht das Abrufen einer Liste mit allen Einheiten, bei denen der Netzbetreiber auf Grund von Datenfreigaben eine Leseberechtigung besitzt. Dies ist gegeben, wenn ihm mindestens eines der Geheimnisfelder der Einheit über eine Datenfreigabe freigegeben wurde.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Einheiten[]</td>
<td></td>
<td><a href="#einheit">Einheit</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetListeGeloeschteUndDeaktivierteEinheiten

Diese Funktion ermöglicht das Abrufen einer Liste mit gelöschten Einheiten.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>einheitMastrNummern[]</td>
<td></td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>AnlagenSystemstatus</td>
<td></td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>AnlageBetriebsstatus</td>
<td>Betriebsstatus der Anlage, welche sich aus den zugeordneten Einheiten ergibt</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Nein</td>
<td>InPlanung</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMitStatus[]</td>
<td></td>
<td><a href="#einheitmitstatus">EinheitMitStatus</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetEinheitWind

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit der Art „Wind“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Windpark II Einheit 14</td>
</tr>
<tr>
<td>Weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALESPK-P</td>
</tr>
<tr>
<td>WeicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>Kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>Energietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Ja</td>
<td>Wind</td>
</tr>
<tr>
<td>Bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>150.112</td>
</tr>
<tr>
<td>Nettonennleistung</td>
<td>Nettonennleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>148.987</td>
</tr>
<tr>
<td>Schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>9900123000007</td>
</tr>
<tr>
<td>FernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>FernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>FernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Ja</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>PraequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordneten Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>NameWindpark</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Windparks, dessen Teil die Einheit ist</td>
<td>string</td>
<td>Ja</td>
<td>Windpark II - Felddorf</td>
</tr>
<tr>
<td>Lage</td>
<td>Angabe, ob die Stromerzeugungseinheit an Land oder auf See errichtet wurde</td>
<td><a href="#windlageenum">WindLageEnum</a></td>
<td>Ja</td>
<td>WindAnLand</td>
</tr>
<tr>
<td>Seelage</td>
<td>Wird die Windenergieanlage in der Nordsee oder in der Ostsee betrieben?</td>
<td><a href="#seelageenum">SeelageEnum</a></td>
<td>Nein</td>
<td>Ostsee</td>
</tr>
<tr>
<td>ClusterOstsee</td>
<td>Cluster in der Ostsee</td>
<td><a href="#clusterostseeenum">ClusterOstseeEnum</a></td>
<td>Nein</td>
<td>I</td>
</tr>
<tr>
<td>ClusterNordsee</td>
<td>Cluster in der Nordsee</td>
<td><a href="#clusternordseeenum">ClusterNordseeEnum</a></td>
<td>Nein</td>
<td>I</td>
</tr>
<tr>
<td>Hersteller</td>
<td>Hersteller der Einheit</td>
<td><a href="#katalogwert">Katalogwert</a></td>
<td>Nein</td>
<td>EnerconGmbH</td>
</tr>
<tr>
<td>Technologie</td>
<td>Technologie der Stromerzeugung: Horizontalläufer oder Vertikalläufer</td>
<td><a href="#windanlagetechnologieenum">WindanlageTechnologieEnum</a></td>
<td>Nein</td>
<td>Vertikallaeufer</td>
</tr>
<tr>
<td>Typenbezeichnung</td>
<td>Typenbezeichnung der Einheit</td>
<td>string</td>
<td>Ja</td>
<td>Wind FX2</td>
</tr>
<tr>
<td>Nabenhoehe</td>
<td>Die Nabenhöhe der Erzeugungseinheit</td>
<td>decimal</td>
<td>Ja</td>
<td>12.987</td>
</tr>
<tr>
<td>Rotordurchmesser</td>
<td></td>
<td>decimal</td>
<td>Ja</td>
<td>35.989</td>
</tr>
<tr>
<td>Rotorblattenteisungssystem</td>
<td>Ein Rotorblattenteisungssystem, auch als Rotorblattenteisungsanlage bezeichnet, ist eine Vorrichtung, die dazu dient, die Rotorblätter von Windkraftanlagen eisfrei zu halten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AuflageAbschaltungLeistungsbegrenzung</td>
<td>Auflagen zu Abschaltungen oder Leistungsbegrenzungen?</td>
<td>boolean</td>
<td>Ja</td>
<td>true</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchallimmissionsschutzNachts</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schallimmissionsschutz in der Nacht bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchallimmissionsschutzTagsueber</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schallimmissionsschutz tagsüber bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchattenwurf</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schattenwurf bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungTierschutz</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Tierschutz bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungEiswurf</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Eiswurf bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSonstige</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von sonstigen Gründen bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Wassertiefe</td>
<td>Wassertiefe am Standort der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Ja</td>
<td>140.123</td>
</tr>
<tr>
<td>Kuestenentfernung</td>
<td>Küstenentfernung des Standort der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Ja</td>
<td>147.254</td>
</tr>
<tr>
<td>Buergerenergie</td>
<td>Bürgerenergieeigenschaft der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Nachtkennzeichen</td>
<td>Nachtkennzeichen der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der zugeordneten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
</table>



## GetEinheitSolar

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit der Art „Solar“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Windpark II Einheit 14</td>
</tr>
<tr>
<td>Weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALESPK-P</td>
</tr>
<tr>
<td>WeicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>Kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>Energietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Ja</td>
<td>Wind</td>
</tr>
<tr>
<td>Bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>150.112</td>
</tr>
<tr>
<td>Nettonennleistung</td>
<td>Nettonennleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>148.987</td>
</tr>
<tr>
<td>Schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>9900123000007</td>
</tr>
<tr>
<td>FernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>FernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>FernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Ja</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>PraequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordneten Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>zugeordneteWirkleistungWechselrichter</td>
<td>Wechselrichterleistung der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>147.254</td>
</tr>
<tr>
<td>GemeinsamerWechselrichterMitSpeicher</td>
<td>Gemeinsamer Wechselrichter mit Stromspeicher</td>
<td><a href="#wechselrichterenum">WechselrichterEnum</a></td>
<td>Nein</td>
<td>GemeinsamerWechselrichterMitStromspeicher</td>
</tr>
<tr>
<td>AnzahlModule</td>
<td>Anzahl der Module dieser Stromerzeugungseinheit</td>
<td>int</td>
<td>Nein</td>
<td>12</td>
</tr>
<tr>
<td>Lage</td>
<td>Errichtungsort der Stromerzeugungseinheit</td>
<td><a href="#solarlageenum">SolarLageEnum</a></td>
<td>Nein</td>
<td>Freiflaeche</td>
</tr>
<tr>
<td>Leistungsbegrenzung</td>
<td>Die Leistung der Stromerzeugungseinheit ist auf einen bestimmten prozentualen Leistungsanteil begrenzt</td>
<td><a href="#solarleistungsbegrenzungenum">SolarLeistungsbegrenzungEnum</a></td>
<td>Nein</td>
<td>Ja70Prozent</td>
</tr>
<tr>
<td>EinheitlicheAusrichtungUndNeigungswinkel</td>
<td>Angabe, ob einheitliche Ausrichtung und Neigungswinkel bestehen.</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Hauptausrichtung</td>
<td>Die Ausrichtung bezeichnet die Himmelsrichtung.</td>
<td><a href="#anlagenartsolarausrichtungenum">AnlagenartSolarAusrichtungEnum</a></td>
<td>Nein</td>
<td>Nord</td>
</tr>
<tr>
<td>HauptausrichtungNeigungswinkel</td>
<td>Der Neigungswinkel bezeichnet den Winkel gegenüber der Horizontalen.</td>
<td><a href="#anlagenartsolarneigungswinkelenum">AnlagenartSolarNeigungswinkelEnum</a></td>
<td>Nein</td>
<td>Ueber60</td>
</tr>
<tr>
<td>Nebenausrichtung</td>
<td>Weitere Ausrichtung der Stromerzeugungseinheit neben der Hauptausrichtung</td>
<td><a href="#anlagenartsolarausrichtungenum">AnlagenartSolarAusrichtungEnum</a></td>
<td>Nein</td>
<td>Nord</td>
</tr>
<tr>
<td>NebenausrichtungNeigungswinkel</td>
<td>Neigungswinkel in Grad zur Horizontalen (der Nebenausrichtung)</td>
<td><a href="#anlagenartsolarneigungswinkelenum">AnlagenartSolarNeigungswinkelEnum</a></td>
<td>Nein</td>
<td>Ueber60</td>
</tr>
<tr>
<td>InAnspruchGenommeneFlaeche</td>
<td>In Anspruch genommene Fläche</td>
<td>decimal</td>
<td>Nein</td>
<td>456.981</td>
</tr>
<tr>
<td>ArtDerFlaeche[]</td>
<td>Art der in Anspruch genommenen Fläche</td>
<td><a href="#solarflaechenartenum">SolarFlaechenartEnum</a></td>
<td>Nein</td>
<td>BimaFlaeche</td>
</tr>
<tr>
<td>InAnspruchGenommeneAckerflaeche</td>
<td>In Anspruch genommene Ackerfläche</td>
<td>decimal</td>
<td>Nein</td>
<td>124.098</td>
</tr>
<tr>
<td>Nutzungsbereich</td>
<td>Vorrangige Nutzung des in Anspruch genommenen Gebäudes</td>
<td><a href="#nutzungsbereichenum">NutzungsbereichEnum</a></td>
<td>Nein</td>
<td>Industrie</td>
</tr>
<tr>
<td>Buergerenergie</td>
<td>Bürgerenergieeigenschaft der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der zugeordneten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
</table>



## GetEinheitBiomasse

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit der Art „Biomasse“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Windpark II Einheit 14</td>
</tr>
<tr>
<td>Weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALESPK-P</td>
</tr>
<tr>
<td>WeicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>Kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>Energietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Ja</td>
<td>Wind</td>
</tr>
<tr>
<td>Bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>150.112</td>
</tr>
<tr>
<td>Nettonennleistung</td>
<td>Nettonennleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>148.987</td>
</tr>
<tr>
<td>Schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>9900123000007</td>
</tr>
<tr>
<td>FernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>FernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>FernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Ja</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>PraequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordneten Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>Hauptbrennstoff</td>
<td>Welcher Einsatzstoff oder Brennstoff wird hauptsächlich benutzt</td>
<td><a href="#biomassebrennstoffenum">BiomasseBrennstoffEnum</a></td>
<td>Nein</td>
<td>Rinde</td>
</tr>
<tr>
<td>Biomasseart</td>
<td>Art der Biomasse</td>
<td><a href="#biomasseartenum">BiomasseArtEnum</a></td>
<td>Nein</td>
<td>FesteBiomasse</td>
</tr>
<tr>
<td>Technologie</td>
<td>Technologie der Stromerzeugung</td>
<td><a href="#technologieverbrennungsanlageenum">TechnologieVerbrennungsanlageEnum</a></td>
<td>Ja</td>
<td>KalinaCycle</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der zugeordneten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>KwkMastrNummer</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Nein</td>
<td>KWK91234567890</td>
</tr>
</table>



## GetEinheitWasser

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit der Art „Wasser“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Windpark II Einheit 14</td>
</tr>
<tr>
<td>Weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALESPK-P</td>
</tr>
<tr>
<td>WeicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>Kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>Energietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Ja</td>
<td>Wind</td>
</tr>
<tr>
<td>Bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>150.112</td>
</tr>
<tr>
<td>Nettonennleistung</td>
<td>Nettonennleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>148.987</td>
</tr>
<tr>
<td>Schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>9900123000007</td>
</tr>
<tr>
<td>FernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>FernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>FernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Ja</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>PraequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordneten Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>NameKraftwerk</td>
<td>Name des Kraftwerks</td>
<td>string</td>
<td>Ja</td>
<td>Wasserpark 2</td>
</tr>
<tr>
<td>ArtDerWasserkraftanlage</td>
<td>Art der Stromerzeugung aus Wasserkraft</td>
<td><a href="#artderwasserkraftanlageenum">ArtDerWasserkraftanlageEnum</a></td>
<td>Nein</td>
<td>Meeresenergie</td>
</tr>
<tr>
<td>AnzeigeEinerStilllegung</td>
<td>Anzeige einer Stilllegung nach §13b Abs.1 Satz 1</td>
<td>boolean</td>
<td>Ja</td>
<td>Vorlaeufig</td>
</tr>
<tr>
<td>ArtDerStilllegung</td>
<td>Art der Stilllegung nach §13b</td>
<td><a href="#artderstilllegungenum">ArtDerStilllegungEnum</a></td>
<td>Ja</td>
<td>Vorlaeufig</td>
</tr>
<tr>
<td>DatumBeginnVorlaeufigenOderEndgueltigenStilllegung</td>
<td>Beginn der vorläufigen oder endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>DatumBeendigungVorlaeufigenStilllegung</td>
<td>Beendigung der vorläufigen Stilllegung nach §13b</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>MinderungStromerzeugung</td>
<td>Auflagen, die zur Minderung der Stromerzeugung führen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilGrenzkraftwerk</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>NettonennleistungDeutschland</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die in ein deutsches Stromnetz eingespeist werden kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>458.145</td>
</tr>
<tr>
<td>ArtDesZuflusses</td>
<td>Welche Art von Zufluss wird zur Stromerzeugung verwendet</td>
<td><a href="#zuflussartenum">ZuflussartEnum</a></td>
<td>Nein</td>
<td>Flusskraftwerk</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der zugeordneten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
</table>



## GetEinheitGeothermieGrubengasDruckentspannung

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit der Art „Geo-, Solarthermie, Grubengas, Klärschlamm“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Windpark II Einheit 14</td>
</tr>
<tr>
<td>Weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALESPK-P</td>
</tr>
<tr>
<td>WeicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>Kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>Energietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Ja</td>
<td>Wind</td>
</tr>
<tr>
<td>Bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>150.112</td>
</tr>
<tr>
<td>Nettonennleistung</td>
<td>Nettonennleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>148.987</td>
</tr>
<tr>
<td>Schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>9900123000007</td>
</tr>
<tr>
<td>FernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>FernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>FernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Ja</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>PraequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordneten Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>Technologie</td>
<td>Technologie der Stromerzeugung</td>
<td><a href="#technologieverbrennungsanlageenum">TechnologieVerbrennungsanlageEnum</a></td>
<td>Nein</td>
<td>Stirlingmotor</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der zugeordneten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>KwkMastrNummer</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Nein</td>
<td>KWK91234567890</td>
</tr>
</table>



## GetEinheitVerbrennung

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit der Art „Verbrennung“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Windpark II Einheit 14</td>
</tr>
<tr>
<td>Weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALESPK-P</td>
</tr>
<tr>
<td>WeicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>Kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>Energietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Ja</td>
<td>Wind</td>
</tr>
<tr>
<td>Bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>150.112</td>
</tr>
<tr>
<td>Nettonennleistung</td>
<td>Nettonennleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>148.987</td>
</tr>
<tr>
<td>Schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>9900123000007</td>
</tr>
<tr>
<td>FernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>FernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>FernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Ja</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>PraequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordneten Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>NameKraftwerk</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist.</td>
<td>string</td>
<td>Ja</td>
<td>Braunkohle Power Holstein 2</td>
</tr>
<tr>
<td>NameKraftwerksblock</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist.</td>
<td>string</td>
<td>Nein</td>
<td>Süd 2</td>
</tr>
<tr>
<td>DatumBaubeginn</td>
<td>Tatsächlicher bzw. geplanter Spatenstich auf der Baustelle</td>
<td>date</td>
<td>Nein</td>
<td>2014-03-04</td>
</tr>
<tr>
<td>AnzeigeEinerStilllegung</td>
<td>Anzeige einer Stilllegung nach §13b Abs.1 Satz 1</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>ArtDerStilllegung</td>
<td>Art der Stilllegung nach §13b</td>
<td><a href="#artderstilllegungenum">ArtDerStilllegungEnum</a></td>
<td>Ja</td>
<td>Vorlaeufig</td>
</tr>
<tr>
<td>DatumBeginnVorlaeufigenOderEndgueltigenStilllegung</td>
<td>Beginn der vorläufigen oder endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>DatumBeendigungVorlaeufigenStilllegung</td>
<td>Beendigung der vorläufigen Stilllegung nach §13b</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>SteigerungNettonennleistungKombibetrieb</td>
<td>Steigerung der Nettonennleistung durch Kombibetrieb</td>
<td>decimal</td>
<td>Nein</td>
<td>512.147</td>
</tr>
<tr>
<td>AnlageIstImKombibetrieb</td>
<td>Angabe ob die Stromerzeugungseinheit im Kombibetrieb betrieben wird</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>MastrNummernKombibetrieb</td>
<td>MaStR-Nummern der Einheiten im Kombibetrieb</td>
<td>string</td>
<td>Nein</td>
<td>SEE91234567890; SEE99876543210</td>
</tr>
<tr>
<td>NetzreserveAbDatum</td>
<td>Datum der Überführung der Stromerzeugungseinheit in die Netzreserve.</td>
<td>date</td>
<td>Nein</td>
<td>2014-05-06</td>
</tr>
<tr>
<td>SicherheitsbereitschaftAbDatum</td>
<td>Datum des Übergangs in die Sicherheitsbereitschaft</td>
<td>date</td>
<td>Nein</td>
<td>2016-07-09</td>
</tr>
<tr>
<td>Hauptbrennstoff</td>
<td>Welcher Einsatzstoff oder Brennstoff wird hauptsächlich benutzt</td>
<td><a href="#verbrennungbrennstoffenum">VerbrennungBrennstoffEnum</a></td>
<td>Ja</td>
<td>Fluessiggas</td>
</tr>
<tr>
<td>WeitererHauptbrennstoff</td>
<td></td>
<td><a href="#erweiterterweiterebrennstoffe">ErweiterterWeitereBrennstoffe</a></td>
<td>Ja</td>
<td>Kokereigas</td>
</tr>
<tr>
<td>WeitereBrennstoffe</td>
<td></td>
<td><a href="#erweiterteweiterebrennstoffe">ErweiterteWeitereBrennstoffe</a></td>
<td>Ja</td>
<td>Dieselkraftstoff</td>
</tr>
<tr>
<td>VerknuepfteErzeugungseinheiten[]</td>
<td>Liste von MaStR Nummern mit den verknüpften Stromerzeugern</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>SEE91234567890 Verbrennung</td>
</tr>
<tr>
<td>BestandteilGrenzkraftwerk</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>NettonennleistungDeutschland</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die in ein deutsches Stromnetz eingespeist werden kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>458.145</td>
</tr>
<tr>
<td>AnteiligNutzungsberechtigte</td>
<td>Namen und Adressen der Letztverbraucher, die ein anteiliges vertragliches Nutzungsrecht an einer bestimmten Erzeugungskapazität dieser Stromerzeugungseinheit gemäß § 104 Absatz 4 EEG wie eine eigenständige Erzeugungseinheit betreiben.</td>
<td>string</td>
<td>Nein</td>
<td> Strom Deutschland AG, Strasse 4 54784 Köln; Strom
                  Westfeld GmbH Weg 4 23541 Vorort 
                </td>
</tr>
<tr>
<td>Notstromaggregat</td>
<td>Angabe ob die Stromerzeugungseinheit zur Versorgung bei Stromnetzstörungen dient (Notstromaggregat)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Einsatzort</td>
<td>An welchem Einsatzort wird die Stromerzeugungseinheit als Notstromaggregat betrieben</td>
<td><a href="#einsatzortenum">EinsatzortEnum</a></td>
<td>Nein</td>
<td>Hotel</td>
</tr>
<tr>
<td>KwkMastrNummer</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Nein</td>
<td>KWK91234567890</td>
</tr>
<tr>
<td>Technologie</td>
<td>Technologie der Stromerzeugung</td>
<td><a href="#technologieverbrennungsanlageenum">TechnologieVerbrennungsanlageEnum</a></td>
<td>Nein</td>
<td>Vertikallaeufer</td>
</tr>
<tr>
<td>AusschliesslicheVerwendungImKombibetrieb</td>
<td>Angabe, dass die Einheit ausschließlich im Kombibetrieb betrieben wird</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetEinheitKernkraft

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit der Art „Kernkraft“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Windpark II Einheit 14</td>
</tr>
<tr>
<td>Weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALESPK-P</td>
</tr>
<tr>
<td>WeicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>Kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>Energietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Ja</td>
<td>Wind</td>
</tr>
<tr>
<td>Bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>150.112</td>
</tr>
<tr>
<td>Nettonennleistung</td>
<td>Nettonennleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>148.987</td>
</tr>
<tr>
<td>Schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>9900123000007</td>
</tr>
<tr>
<td>FernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>FernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>FernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Ja</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>PraequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordneten Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>NameKraftwerk</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerks, dessen Teil die Stromerzeugungseinheit ist.</td>
<td>string</td>
<td>Ja</td>
<td>Kernkraft 2000 - Stadtdorf</td>
</tr>
<tr>
<td>NameKraftwerksblock</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist.</td>
<td>string</td>
<td>Nein</td>
<td>Südhang 2</td>
</tr>
<tr>
<td>Technologie</td>
<td>Technologie der Stromerzeugung</td>
<td><a href="#technologiekernkraftenum">TechnologieKernkraftEnum</a></td>
<td>Nein</td>
<td>Druckwasserreaktor</td>
</tr>
</table>



## GetEinheitStromSpeicher

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit der Art „Speicher“. Es können alle öffentlichen Felder einer Anlage abgerufen werden. Für die nichtöffentlichen Anlagen oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Windpark II Einheit 14</td>
</tr>
<tr>
<td>Weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALESPK-P</td>
</tr>
<tr>
<td>WeicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>Kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>Energietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Ja</td>
<td>Wind</td>
</tr>
<tr>
<td>Bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>150.112</td>
</tr>
<tr>
<td>Nettonennleistung</td>
<td>Nettonennleistung in kW</td>
<td>decimal</td>
<td>Ja</td>
<td>148.987</td>
</tr>
<tr>
<td>Schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>9900123000007</td>
</tr>
<tr>
<td>FernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>FernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>FernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Ja</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>PraequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordneten Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>Einsatzort</td>
<td>An welchem Einsatzort wird die Stromerzeugungseinheit als Notstromaggregat betrieben</td>
<td><a href="#einsatzortenum">EinsatzortEnum</a></td>
<td>Nein</td>
<td>Hotel</td>
</tr>
<tr>
<td>AcDcKoppelung</td>
<td>AC oder DC gekoppeltes System</td>
<td><a href="#systemkopplungenum">SystemkopplungEnum</a></td>
<td>Nein</td>
<td>ACgekoppeltesSystem</td>
</tr>
<tr>
<td>Batterietechnologie</td>
<td>Batterietechnologie</td>
<td><a href="#batterietechnologieenum">BatterieTechnologieEnum</a></td>
<td>Nein</td>
<td>BleiSaeureBatterie</td>
</tr>
<tr>
<td>PumpbetriebLeistungsaufnahme</td>
<td>Höchste elektrische Dauerleistung, die dem Netz für den Pumpbetrieb unter Nennbedingungen entnommen werden kann</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>PumpbetriebKontinuierlichRegelbar</td>
<td>Die Wasserkraftanlage ist im Pumpbetrieb kontinuierlich regelbar</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Pumpspeichertechnologie</td>
<td>Technologie des Pumpspeichers</td>
<td><a href="#pumpspeichertechnologieenum">PumpspeichertechnologieEnum</a></td>
<td>Nein</td>
<td>PumpspeicheranlageMitNatuerlichemZufluss</td>
</tr>
<tr>
<td>Notstromaggregat</td>
<td>Angabe ob die Stromerzeugungseinheit zur Versorgung bei Stromnetzstörungen dient (Notstromaggregat)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilGrenzkraftwerk</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>NettonennleistungDeutschland</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die in ein deutsches Stromnetz eingespeist werden kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>458.145</td>
</tr>
<tr>
<td>ZugeordnenteWirkleistungWechselrichter</td>
<td>Zugeordnente Wirkleistung des/der Wechselrichter</td>
<td>decimal</td>
<td>Nein</td>
<td>144.987</td>
</tr>
<tr>
<td>NutzbareSpeicherkapazitaet</td>
<td>Nutzbare Speicherkapazität</td>
<td>decimal</td>
<td>Nein</td>
<td>478.251</td>
</tr>
<tr>
<td>SpeMastrNummer</td>
<td>MaStR-Nummer der verknüpften Speicheranlage</td>
<td><a href="#stromspeichermastrnummerid">StromSpeicherMastrNummerId</a></td>
<td>Nein</td>
<td>SPE91234567890</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der zugeordneten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>EegAnlagentyp</td>
<td>Typ der Einheit</td>
<td><a href="#einheittypenum">EinheitTypEnum</a></td>
<td>Nein</td>
<td>Stromspeichereinheit</td>
</tr>
<tr>
<td>Technologie</td>
<td>Technologie der Stromspeicherung</td>
<td><a href="#technologiespeicherenum">TechnologieSpeicherEnum</a></td>
<td>Nein</td>
<td>Batterie</td>
</tr>
</table>



## GetEinheitStromVerbraucher

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit der Art „Stromverbraucher“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>Einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>9900123000007</td>
</tr>
<tr>
<td>TechnischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>NameStromverbrauchseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromverbrauchseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Glaswerk GmbH - Magdeburg</td>
</tr>
<tr>
<td>AnzahlStromverbrauchseinheitenGroesser50Mw</td>
<td>Anzahl einzelner Stromverbrauchseinheiten größer 50 MW</td>
<td>int</td>
<td>Nein</td>
<td>23</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordnete Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890 
                </td>
</tr>
</table>



## GetEinheitGasErzeuger

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit des Typs „Gaserzeuger“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameGaserzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Gaserzeugungseinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Gasomat 12</td>
</tr>
<tr>
<td>Technologie</td>
<td>Technologie der Gaserzeugung</td>
<td><a href="#technologiegaserzeugungenum">TechnologieGasErzeugungEnum</a></td>
<td>Nein</td>
<td>LiquifidNaturalGas</td>
</tr>
<tr>
<td>Erzeugungsleistung</td>
<td>Leistung der Gaserzeugungseinheit</td>
<td>decimal</td>
<td>Ja</td>
<td>125.987</td>
</tr>
<tr>
<td>MastrNummer</td>
<td>MaStR-Nummer des zu dieser Einheit zugeordneten Speichers</td>
<td><a href="#gasspeichermastrnummerid">GasSpeicherMastrNummerId</a></td>
<td>Ja</td>
<td>GSE91234567890</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordnete Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890 
                </td>
</tr>
</table>



## GetEinheitGasSpeicher

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit des Typs „Gasspeicher“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameGasspeicher</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Gasspeichereinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Gasporenfeld 23</td>
</tr>
<tr>
<td>Speicherart</td>
<td>Art der Gasspeicherung</td>
<td><a href="#gasspeicherartenum">GasSpeicherartEnum</a></td>
<td>Ja</td>
<td>Porenspeicher</td>
</tr>
<tr>
<td>MaximalNutzbaresArbeitsgasvolumen</td>
<td>Maximal nutzbares Arbeitsgasvolumen</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>MaximaleEinspeicherleistung</td>
<td>Maximale Einspeicherleistung</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>MaximaleAusspeicherleistung</td>
<td>Maximale Ausspeicherleistung</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>DurchschnittlicherBrennwert</td>
<td>Durchschnittlicher Brennwert des Gas im Speicher</td>
<td>decimal</td>
<td>Nein</td>
<td>11.10</td>
</tr>
<tr>
<td>Weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALESPK-P</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordnete Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890 
                </td>
</tr>
<tr>
<td>SpeMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordneten Gasspeicheranlage</td>
<td><a href="#gasspeichermastrnummerid">GasSpeicherMastrNummerId</a></td>
<td>Nein</td>
<td>GSE91234567890</td>
</tr>
</table>



## GetEinheitGasVerbraucher

Diese Funktion ermöglicht das Abrufen der Daten für eine Einheit des Typs „Gasverbraucher“. Es können alle öffentlichen Felder einer Einheit abgerufen werden. Für die nichtöffentlichen Einheiten oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
                </td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Geprueft</td>
</tr>
<tr>
<td>Netzbetreiberzuordnungen[]</td>
<td>Eine Liste von Netzbetreiberzuordnungen</td>
<td><a href="#netzbetreiberzuordnung">Netzbetreiberzuordnung</a></td>
<td>Nein</td>
<td>SNB91234567890 - 2017-08-02 - Geprueft</td>
</tr>
<tr>
<td>NetzbetreiberpruefungDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Betreibers der Einheit</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>NetzbetreiberMastrNummer[]</td>
<td>MaStR-Nummer des Netzbetreibers/der Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>Deutschland</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Standort der Einheit: Bundesland</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>Landkreis</td>
<td>Standort der Einheit: Landkreis</td>
<td>string</td>
<td>Nein</td>
<td>Bördekreis</td>
</tr>
<tr>
<td>Gemeinde</td>
<td>Standort der Einheit: Gemeinde</td>
<td>string</td>
<td>Nein</td>
<td>Sülztal</td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td>Standort der Einheit: Gemeindeschlüssel</td>
<td>string</td>
<td>Nein</td>
<td>15125414</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Ja</td>
<td>39179</td>
</tr>
<tr>
<td>Gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>FlurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>Strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Hinterhaus</td>
</tr>
<tr>
<td>Ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Ja</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>Laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>Breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>UtmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>UtmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>UtmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>GaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>GaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>GeplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>DatumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-02</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AltAnlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des ehemaligen Betreibers der Einheit, wenn ein Betreiberwechsel durchgeführt wurde</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumRegistrierungDesBetreiberwechsels</td>
<td>Datum der Registrierung des Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-07-02</td>
</tr>
<tr>
<td>NameGasverbrauchsseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der NameGasverbrauchsseinheit.</td>
<td>string</td>
<td>Ja</td>
<td>Gasomat 12</td>
</tr>
<tr>
<td>TechnischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>MaximaleGasbezugsleistung</td>
<td>Maximale Gasbezugsleistung zur Stromerzeugung</td>
<td>decimal</td>
<td>Nein</td>
<td>147.984</td>
</tr>
<tr>
<td>EinheitDientDerStromerzeugung</td>
<td>Angabe ob die Gasverbrauchseinheit zur Stromerzeugung dient (Gaskraftwerk)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der zu dieser Einheit zugeordnete Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890 
                </td>
</tr>
<tr>
<td>VerknuepfteEinheiten[]</td>
<td>Liste von MaStR Nummern mit den verknüpften Stromerzeugern</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>SEE91234567890 Verbrennung</td>
</tr>
</table>



## GetEinheitGenehmigung

Diese Funktion ermöglicht das Abrufen der Daten für eine Genehmigung.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>genMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Ja</td>
<td>GEN91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>MaStR-Nummer der Genehmigung</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Ja</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Art</td>
<td>Art der Genehmigung</td>
<td><a href="#genehmigungsartenum">GenehmigungsartEnum</a></td>
<td>Ja</td>
<td>NachBImSchG13BImSchV</td>
</tr>
<tr>
<td>Datum</td>
<td>Datum, ab dem die Genehmigung für Bau oder Betrieb der Stromerzeugungseinheit erteilt ist</td>
<td>date</td>
<td>Ja</td>
<td>2017-08-03</td>
</tr>
<tr>
<td>Behoerde</td>
<td>Behörde, die Genehmigung ausgestellt hat</td>
<td>string</td>
<td>Ja</td>
<td>Gericht Suhl</td>
</tr>
<tr>
<td>Aktenzeichen</td>
<td>Aktenzeichen der Genehmigung, welche die Genehmigungsbehörde vergeben hat</td>
<td>string</td>
<td>Nein</td>
<td>2016/141547/245636</td>
</tr>
<tr>
<td>Frist</td>
<td>Datum, bis zu dem gemäß der Genehmigung mit der Errichtung oder dem Betrieb der Anlage begonnen werden muss</td>
<td><a href="#erweitertesdate">ErweitertesDate</a></td>
<td>Ja</td>
<td>2018-01-02</td>
</tr>
<tr>
<td>WasserrechtsNummer</td>
<td>Nummer der wasserrechtlichen Genehmigung</td>
<td>string</td>
<td>Nein</td>
<td>W3253455G</td>
</tr>
<tr>
<td>WasserrechtAblaufdatum</td>
<td>Datum, an dem die wasserrechtliche Genehmigung abläuft</td>
<td><a href="#erweitertesdate">ErweitertesDate</a></td>
<td>Nein</td>
<td>2019-02-09</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Genehmigung</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-12</td>
</tr>
<tr>
<td>VerknuepfteEinheiten[]</td>
<td>Mit dieser Genehmigung verknüpfte Einheiten</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>.</td>
</tr>
</table>



## GetStromSpeicher

Diese Funktion ermöglicht das Abrufen der Daten für einen Stromspeicher. Es können alle öffentlichen Felder eines Speichers abgerufen werden. Für die nichtöffentlichen Speicher oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>speMastrNummer</td>
<td>Die MaStR-Nummer des gewünschten Stromspeichers</td>
<td><a href="#stromspeichermastrnummerid">StromSpeicherMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>SpeMastrNummer</td>
<td></td>
<td><a href="#stromspeichermastrnummerid">StromSpeicherMastrNummerId</a></td>
<td>Ja</td>
<td></td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum des Speicher</td>
<td>date</td>
<td>Ja</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>NutzbareSpeicherkapazitaet</td>
<td>Nutzbare Speicherkapazität in kWh</td>
<td>decimal</td>
<td>Nein</td>
<td>256.784</td>
</tr>
<tr>
<td>VerknuepfteEinheit[]</td>
<td>Die verknüpften Einheiten zu diesem Objekt</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>[OBJEKT]</td>
</tr>
<tr>
<td>AnlageBetriebsstatus</td>
<td>Betriebsstatus der Anlage, welche sich aus den zugeordneten Einheiten ergibt</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
</table>



## GetGasSpeicher

Diese Funktion ermöglicht das Abrufen der Daten für einen Gasspeicher. Es können alle öffentlichen Felder eines Speichers abgerufen werden. Für die nichtöffentlichen Speicher oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>speMastrNummer</td>
<td>Die MaStR-Nummer des Gas Speichers</td>
<td><a href="#gasspeichermastrnummerid">GasSpeicherMastrNummerId</a></td>
<td>Ja</td>
<td>GSE91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>SpeMastrNummer</td>
<td>MaStR-Nummer des Gas Speichers</td>
<td><a href="#gasspeichermastrnummerid">GasSpeicherMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Speichername</td>
<td>Name des Gas Speichers</td>
<td>string</td>
<td>Ja</td>
<td>Fernspeicher XCY 2</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum des Speichers</td>
<td>date</td>
<td>Ja</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>AnlageBetriebsstatus</td>
<td>Betriebsstatus der Anlage, welche sich aus den zugeordneten Einheiten ergibt</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>VerknuepfteEinheit[]</td>
<td>Die verknüpften Einheiten zu diesem Objekt</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>[OBJEKT]</td>
</tr>
</table>



## GetAnlageEegWind

Diese Funktion ermöglicht das Abrufen der Daten für eine EEG-Anlage des Typs „Wind“. Eine EEG Wind Anlage ist im Verhältnis 1:1 mit einer Einheit verknüpft. Es können alle öffentlichen Felder einer Anlage abgerufen werden. Für die nichtöffentlichen Anlagen oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der EEG-Anlage</td>
<td>date</td>
<td>Ja</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>EegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der verknüpften Einheit</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>AnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregister</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>B354453</td>
</tr>
<tr>
<td>AnlagenschluesselEeg</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td>string</td>
<td>Nein</td>
<td>E2325426</td>
</tr>
<tr>
<td>PrototypAnlage</td>
<td>Die Windenergieanlage ist als Prototyp zertifiziert.</td>
<td>boolean</td>
<td>Ja</td>
<td>true</td>
</tr>
<tr>
<td>PilotAnlage</td>
<td>Die Windenergieanlage ist eine Pilotwindanlage</td>
<td>boolean</td>
<td>Ja</td>
<td>true</td>
</tr>
<tr>
<td>InstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>VerhaeltnisErtragsschaetzungReferenzertrag</td>
<td>Verhältnis der Ertragseinschätzung zum Referenzertrag ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Ja</td>
<td>47.954</td>
</tr>
<tr>
<td>VerhaeltnisReferenzertragErtrag5Jahre</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 5 Jahren ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Ja</td>
<td>51.254</td>
</tr>
<tr>
<td>VerhaeltnisReferenzertragErtrag10Jahre</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 10 Jahren ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Ja</td>
<td>57.54</td>
</tr>
<tr>
<td>VerhaeltnisReferenzertragErtrag15Jahre</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 15 Jahren ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Ja</td>
<td>87.45</td>
</tr>
<tr>
<td>AusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Ja</td>
<td>true</td>
</tr>
<tr>
<td>Zuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>AnlageBetriebsstatus</td>
<td>Betriebsstatus der Anlage, welche sich aus den zugeordneten Einheiten ergibt</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>VerknuepfteEinheit[]</td>
<td>Die verknüpften Einheiten zu diesem Objekt</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>[OBJEKT]</td>
</tr>
</table>



## GetAnlageEegSolar

Diese Funktion ermöglicht das Abrufen der Daten für eine EEG-Anlage des Typs „Solar“. Eine EEG Solar Anlage ist im Verhältnis 1:1 mit einer Einheit verknüpft. Es können alle öffentlichen Felder einer Anlage abgerufen werden. Für die nichtöffentlichen Anlagen oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der EEG-Anlage</td>
<td>date</td>
<td>Ja</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>EegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der verknüpften Einheit</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>InanspruchnahmeZahlungNachEeg</td>
<td>Werden oder wurden für die Solaranlage Zahlungen des Netzbetreibers in Anspruch genommen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AnlagenschluesselEeg</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td>string</td>
<td>Nein</td>
<td>E2325426</td>
</tr>
<tr>
<td>AnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregister</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>B354453</td>
</tr>
<tr>
<td>InstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>RegistrierungsnummerPvMeldeportal</td>
<td>Durch die Bundesagentur vergeben Nummer bei der Registrierung im PV-Meldeportal</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>ASO-123445</td>
</tr>
<tr>
<td>MieterstromZugeordnet</td>
<td>Gibt an, ob die Solaranlage der Veräußerungsform des Mieterstromzuschlags zugeordnet wurde</td>
<td>boolean</td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>MieterstromRegistrierungsdatum</td>
<td>Datum, an dem die Anlage erstmalig der Veräußerungsform des Mieterstromzuschlags zugeordnet worden ist.</td>
<td>date</td>
<td>Nein</td>
<td>2013-12-31</td>
</tr>
<tr>
<td>MieterstromErsteZuordnungZuschlag</td>
<td>Datum, an dem die Anlage erstmalig der Veräußerungsform des Mieterstromzuschlags zugeordnet worden ist.</td>
<td>date</td>
<td>Nein</td>
<td>2013-12-31</td>
</tr>
<tr>
<td>AusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>ZugeordneteGebotsmenge</td>
<td>Bezuschlagte Gebotsmenge, die der EEG-Anlage zugeordnet wurde</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>Zuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern (Mehrfachnennung möglich)</td>
<td>string</td>
<td>Nein</td>
<td>A15847;A15848;A15849</td>
</tr>
<tr>
<td>AnlageBetriebsstatus</td>
<td>Betriebsstatus der Anlage, welche sich aus den zugeordneten Einheiten ergibt</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>VerknuepfteEinheit[]</td>
<td>Die verknüpften Einheiten zu diesem Objekt</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>[OBJEKT]</td>
</tr>
</table>



## GetAnlageEegBiomasse

Diese Funktion ermöglicht das Abrufen der Daten für eine EEG-Anlage des Typs „Biomasse“. Eine EEG Biomasse Anlage ist im Verhältnis 1:n mit Einheiten verknüpft. Es können alle öffentlichen Felder einer Anlage abgerufen werden. Für die nichtöffentlichen Anlagen oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der EEG-Anlage</td>
<td>date</td>
<td>Ja</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>EegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der verknüpften Einheit</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>AnlagenschluesselEeg</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td>string</td>
<td>Nein</td>
<td>E2325426</td>
</tr>
<tr>
<td>AnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregister</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>B354453</td>
</tr>
<tr>
<td>InstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>AusschliesslicheVerwendungBiomasse</td>
<td>Ausschließliche Verwendung von Biomasse im Sinne der Biomasse-Verordnung</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Ja</td>
<td>true</td>
</tr>
<tr>
<td>Zuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>BiogasInanspruchnahmeFlexiPraemie</td>
<td>Angabe ob für die Anlage Flexibilitätsprämie in anspruch genommen wird</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BiogasDatumInanspruchnahmeFlexiPraemie</td>
<td>Datum der erstmaligen Inanspruchnahme der Flexibilitätsprämie</td>
<td>date</td>
<td>Nein</td>
<td>2014-12-31</td>
</tr>
<tr>
<td>BiogasLeistungserhoehung</td>
<td>Angabe, ob die Leistung der Anlage im Zusammenhang mit der Flexibilitätsprämie erhöht wird</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BiogasDatumLeistungserhoehung</td>
<td>Datum der Inbetriebnahme der Leistungserhöhung</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-11</td>
</tr>
<tr>
<td>BiogasUmfangLeistungserhoehung</td>
<td>Umfang der Leistungserhöhung bei dieser Biogas-Anlage nach dem 31.07.2014</td>
<td>decimal</td>
<td>Nein</td>
<td>125.987</td>
</tr>
<tr>
<td>BiogasGaserzeugungskapazitaet</td>
<td>Leistungsangabe: Kapazität an Gas, das erzeugt werden kann. Gasproduktionskapazität nach Genehmigungsbescheid, bzw. anhand der eingesetzten Inputstoffe.</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Ja</td>
<td>241.369</td>
</tr>
<tr>
<td>Hoechstbemessungsleistung</td>
<td>Höchstbemessungsleistung der Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>785.987</td>
</tr>
<tr>
<td>BiomethanErstmaligerEinsatz</td>
<td>Datum des erstmaligen ausschließlichen Einsatzes von Biomethan</td>
<td><a href="#erweitertesdate">ErweitertesDate</a></td>
<td>Ja</td>
<td>2013-12-14</td>
</tr>
<tr>
<td>AnlageBetriebsstatus</td>
<td>Betriebsstatus der Anlage, welche sich aus den zugeordneten Einheiten ergibt</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>VerknuepfteEinheit[]</td>
<td>Die verknüpften Einheiten zu diesem Objekt</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>[OBJEKT]</td>
</tr>
</table>



## GetAnlageEegWasser

Diese Funktion ermöglicht das Abrufen der Daten für eine EEG-Anlage des Typs „Wasser“. Eine EEG Wasser Anlage ist im Verhältnis 1:n mit Einheiten verknüpft. Es können alle öffentlichen Felder einer Anlage abgerufen werden. Für die nichtöffentlichen Anlagen oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der EEG-Anlage</td>
<td>date</td>
<td>Ja</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>EegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der verknüpften Einheit</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>AnlagenschluesselEeg</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td>string</td>
<td>Nein</td>
<td>E2325426</td>
</tr>
<tr>
<td>AnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregister</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>B354453</td>
</tr>
<tr>
<td>InstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>AnlageBetriebsstatus</td>
<td>Betriebsstatus der Anlage, welche sich aus den zugeordneten Einheiten ergibt</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>Ertuechtigung[]</td>
<td></td>
<td><a href="#ertuechtigung">Ertuechtigung</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>VerknuepfteEinheit[]</td>
<td>Die verknüpften Einheiten zu diesem Objekt</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>[OBJEKT]</td>
</tr>
</table>



## GetAnlageEegSpeicher

Diese Funktion ermöglicht das Abrufen der Daten für eine EEG-Anlage des Typs „Speicher“. Eine EEG Speicher Anlage ist im Verhältnis 1:1 mit Einheiten verknüpft. Es können alle öffentlichen Felder einer Anlage abgerufen werden. Für die nichtöffentlichen Anlagen oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der EEG-Anlage</td>
<td>date</td>
<td>Ja</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>EegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der verknüpften Einheit</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegAnlagenschluessel</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td>string</td>
<td>Nein</td>
<td>E2325426</td>
</tr>
<tr>
<td>eegZuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>eegAusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>VerknuepfteEinheit[]</td>
<td>Die verknüpften Einheiten zu diesem Objekt</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>[OBJEKT]</td>
</tr>
</table>



## GetAnlageEegGeothermieGrubengasDruckentspannung

Diese Funktion ermöglicht das Abrufen der Daten für eine EEG-Anlage des Typs „Geo-, Solarthermie – Gruben-, Klärschlamm“. Eine EEG Geo-, Solarthermie – Gruben-, Klärschlamm Anlage ist im Verhältnis 1:n mit Einheiten verknüpft. Es können alle öffentlichen Felder einer Anlage abgerufen werden. Für die nichtöffentlichen Anlagen oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der EEG-Anlage</td>
<td>date</td>
<td>Ja</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>EegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>MaStR-Nummer der verknüpften Einheit</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>AnlagenschluesselEeg</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td>string</td>
<td>Nein</td>
<td>E2325426</td>
</tr>
<tr>
<td>AnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregister</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>B354453</td>
</tr>
<tr>
<td>InstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>AnlageBetriebsstatus</td>
<td>Betriebsstatus der Anlage, welche sich aus den zugeordneten Einheiten ergibt</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>InPlanung</td>
</tr>
<tr>
<td>VerknuepfteEinheit[]</td>
<td>Die verknüpften Einheiten zu diesem Objekt</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>[OBJEKT]</td>
</tr>
</table>



## GetAnlageKwk

Diese Funktion ermöglicht das Abrufen der Daten für eine KWK-Anlage. Eine KWK-Anlage ist im Verhältnis 1:n mit Einheiten verknüpft. Es können alle öffentlichen Felder einer Anlage abgerufen werden. Für die nichtöffentlichen Anlagen oder Datenfelder bedarf es einer separaten Datenfreigabe.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>kwkMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten EEG-Anlage</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>KwkMastrNummer</td>
<td>MaStR-Nummer der verknüpften Einheit</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Ja</td>
<td>KWK91234567890</td>
</tr>
<tr>
<td>AusschreibungZuschlag</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt?</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Zuschlagnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer.</td>
<td>string</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der KWK-Anlage</td>
<td>date</td>
<td>Ja</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der KWK-Anlage</td>
<td>date</td>
<td>Ja</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>ThermischeNutzleistung</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWKG-Anlage abgeben kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>12.54</td>
</tr>
<tr>
<td>ElektrischeKwkLeistung</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>41.45</td>
</tr>
<tr>
<td>VerknuepfteEinheiten[]</td>
<td>Liste von MaStR Nummern mit den verknüpften Stromerzeugern</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>SEE91234567890 Verbrennung</td>
</tr>
<tr>
<td>AnlageBetriebsstatus</td>
<td>Betriebsstatus der Anlage, welche sich aus den zugeordneten Einheiten ergibt</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>INPLANUNG</td>
</tr>
</table>



## GetListeAlleLokationen

Diese Funktion ermöglicht das Abrufen einer Liste mit allen aktiven, öffentlich sichtbaren Lokationen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>mastrNummer[]</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>[SEL91234567890], [GEL91234567890]</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Lokationen[]</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokation">Lokation</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
</table>



## GetListeFreigegebeneLokationen

Diese Funktion ermöglicht das Abrufen einer Liste mit allen Lokationen, bei denen der Marktakteur Betreiber mindestens einer Einheit ist oder bei denen der Marktakteur, auf Grund seiner Zuordnung als Anschlussnetzbetreiber oder im Allgemeinen eine Datenfreigabe erhalten hat.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Lokationen[]</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokation">Lokation</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
</table>



## GetLokationStromErzeuger

Diese Funktion ermöglicht das Abrufen der Daten für eine Lokation des Typs „Stromerzeuger“.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>lokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>MastrNummer</td>
<td>Die MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NameDerTechnischenLokation</td>
<td>Name der technischen Lokation</td>
<td>string</td>
<td>Nein</td>
<td>54-Haupt-3354</td>
</tr>
<tr>
<td>VerknuepfteEinheiten[]</td>
<td>Mit der Lokation verknüpfte Einheiten</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>SEE91234567890 Solare Energie</td>
</tr>
<tr>
<td>Netzanschlusspunkte[]</td>
<td>Bezeichnung des Netzanschlusspunktes</td>
<td><a href="#netzanschlusspunktstrom">NetzanschlusspunktStrom</a></td>
<td>Nein</td>
<td>STR-34524-1234-Q</td>
</tr>
</table>



## GetLokationStromVerbraucher

Diese Funktion ermöglicht das Abrufen der Daten für eine Lokation des Typs „Stromverbraucher“.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>lokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>MastrNummer</td>
<td>Die MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NameDerTechnischenLokation</td>
<td>Name der technischen Lokation</td>
<td>string</td>
<td>Nein</td>
<td>54-Haupt-3354</td>
</tr>
<tr>
<td>VerknuepfteEinheiten[]</td>
<td>Mit der Lokation verknüpfte Einheiten</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>SEE91234567890 Solare Energie</td>
</tr>
<tr>
<td>Netzanschlusspunkte[]</td>
<td>Bezeichnung des Netzanschlusspunktes</td>
<td><a href="#netzanschlusspunktstrom">NetzanschlusspunktStrom</a></td>
<td>Nein</td>
<td>STR-34524-1234-Q</td>
</tr>
</table>



## GetLokationGasErzeuger

Diese Funktion ermöglicht das Abrufen der Daten für eine Lokation des Typs „Gaserzeuger“.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>lokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>MastrNummer</td>
<td>Die MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>GEL91234567890</td>
</tr>
<tr>
<td>NameDerTechnischenLokation</td>
<td>Name der technischen Lokation</td>
<td>string</td>
<td>Nein</td>
<td>54-Haupt-3354</td>
</tr>
<tr>
<td>VerknuepfteEinheiten[]</td>
<td>Mit der Lokation verknüpfte Einheiten</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>Gaserzeuger GEE91234567890</td>
</tr>
<tr>
<td>Netzanschlusspunkte[]</td>
<td>Bezeichnung des Netzanschlusspunktes</td>
<td><a href="#netzanschlusspunktgas">NetzanschlusspunktGas</a></td>
<td>Nein</td>
<td>GAN91234567890</td>
</tr>
</table>



## GetLokationGasVerbraucher

Diese Funktion ermöglicht das Abrufen der Daten für eine Lokation des Typs „Gasverbraucher“.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>lokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>MastrNummer</td>
<td>Die MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>GEL91234567890</td>
</tr>
<tr>
<td>NameDerTechnischenLokation</td>
<td>Name der technischen Lokation</td>
<td>string</td>
<td>Nein</td>
<td>54-Haupt-3354</td>
</tr>
<tr>
<td>VerknuepfteEinheiten[]</td>
<td>Mit der Lokation verknüpfte Einheiten</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>Gaserzeuger GEE91234567890</td>
</tr>
<tr>
<td>Netzanschlusspunkte[]</td>
<td>Bezeichnung des Netzanschlusspunktes</td>
<td><a href="#netzanschlusspunktgas">NetzanschlusspunktGas</a></td>
<td>Nein</td>
<td>GAN91234567890</td>
</tr>
</table>



## GetGefilterteListeStromErzeuger

Diese Funktion ermöglicht das Abrufen einer Liste mit Einheiten, die der Suchanfrage entsprechen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>einheitBetriebsstatus</td>
<td>Status der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Nein</td>
<td>InBetrieb</td>
</tr>
<tr>
<td>name</td>
<td>Name der Stromerzeugungseinheit</td>
<td>string</td>
<td>Nein</td>
<td>Windpark II – FFM</td>
</tr>
<tr>
<td>energietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Nein</td>
<td>Klaerschlamm</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Postleitzahl der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>89241</td>
</tr>
<tr>
<td>ort</td>
<td>Ort der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>Leverkusen</td>
</tr>
<tr>
<td>einheitBundesland</td>
<td>Bundesland einer der Einheiten</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung der Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>123.789</td>
</tr>
<tr>
<td>bruttoleistungKleiner</td>
<td>Bruttoleistung der Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>123.789</td>
</tr>
<tr>
<td>bruttoleistungGroesser</td>
<td>Bruttoleistung der Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>123.789</td>
</tr>
<tr>
<td>nettoleistung</td>
<td>Nettoleistung der Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>123.789</td>
</tr>
<tr>
<td>nettoleistungKleiner</td>
<td>Nettoleistung der Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>123.789</td>
</tr>
<tr>
<td>nettoleistungGroesser</td>
<td>Nettoleistung der Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>123.789</td>
</tr>
<tr>
<td>hauptbrennstoff</td>
<td>Hauptbrennstoff der Einheiten</td>
<td><a href="#brennstofflageenum">BrennstoffLageEnum</a></td>
<td>Nein</td>
<td>Grubengas</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>inbetriebnahmedatumKleiner</td>
<td>Inbetriebnahmedatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>inbetriebnahmedatumGroesser</td>
<td>Inbetriebnahmedatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Einheiten</td>
<td><a href="#technologieverbrennungsanlageenum">TechnologieVerbrennungsanlageEnum</a></td>
<td>Nein</td>
<td>Dampfmotor</td>
</tr>
<tr>
<td>lokationNetzbetreiber</td>
<td>Einer der zugeordneter Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>lokationSpannungsebene</td>
<td>Eine der zugeordneten Spannungsebenen</td>
<td><a href="#spannungsebeneenum">SpannungsebeneEnum</a></td>
<td>Nein</td>
<td>Mittelspannung</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2017-06-05</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumKleiner</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2017-06-05</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumGroesser</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2017-06-05</td>
</tr>
<tr>
<td>zuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer</td>
<td>string</td>
<td>Nein</td>
<td>1253647B</td>
</tr>
<tr>
<td>speicherNutzbareSpeicherkapazität</td>
<td>Kapazität des optional an der Einheit angeschlossenen Speichers</td>
<td>decimal</td>
<td>Nein</td>
<td>234.789</td>
</tr>
<tr>
<td>speicherNutzbareSpeicherkapazitätKleiner</td>
<td>Kapazität des optional an der Einheit angeschlossenen Speichers</td>
<td>decimal</td>
<td>Nein</td>
<td>234.789</td>
</tr>
<tr>
<td>speicherNutzbareSpeicherkapazitätGroesser</td>
<td>Kapazität des optional an der Einheit angeschlossenen Speichers</td>
<td>decimal</td>
<td>Nein</td>
<td>234.789</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>RegistrierungsdatumKleiner</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>RegistrierungsdatumGroesser</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>netzRegelzone</td>
<td>Regelzone des Bilanzierungsgebietes</td>
<td><a href="#regelzoneenum">RegelzoneEnum</a></td>
<td>Nein</td>
<td>Amprion</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>Betreiber der Anlage.</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Einheiten[]</td>
<td></td>
<td><a href="#einheit">Einheit</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetGefilterteListeStromVerbraucher

Diese Funktion ermöglicht das Abrufen einer Liste mit Einheiten, die der Suchanfrage entsprechen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>einheitBetriebsstatus</td>
<td>Status der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Nein</td>
<td>InBetrieb</td>
</tr>
<tr>
<td>name</td>
<td>Name der Stromverbrauchseinheit</td>
<td>string</td>
<td>Nein</td>
<td>Glasschmelz AG</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Postleitzahl des Standorts der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>47842</td>
</tr>
<tr>
<td>ort</td>
<td>Ort des Standorts der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>Leverkusen</td>
</tr>
<tr>
<td>einheitBundesland</td>
<td>Bundesland einer der Einheiten</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>anzahlStromverbraucherGroesser50Mw</td>
<td>Anzahl angeschlossener Stromverbrauchseinheiten größer 50 MW</td>
<td>int</td>
<td>Nein</td>
<td>4</td>
</tr>
<tr>
<td>anzahlStromverbraucherGroesser50MwKleiner</td>
<td>Anzahl angeschlossener Stromverbrauchseinheiten größer 50 MW</td>
<td>int</td>
<td>Nein</td>
<td>123.789</td>
</tr>
<tr>
<td>anzahlStromverbraucherGroesser50MwGroesser</td>
<td>Anzahl angeschlossener Stromverbrauchseinheiten größer 50 MW</td>
<td>int</td>
<td>Nein</td>
<td>123.789</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>inbetriebnahmedatumKleiner</td>
<td>Inbetriebnahmedatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>inbetriebnahmedatumGroesser</td>
<td>Inbetriebnahmedatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>lokationNetzbetreiber</td>
<td>Einer der zugeordneter Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>lokationSpannungsebene</td>
<td>Eine der zugeordneten Spannungsebenen</td>
<td><a href="#spannungsebeneenum">SpannungsebeneEnum</a></td>
<td>Nein</td>
<td>Mittelspannung</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>RegistrierungsdatumKleiner</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>RegistrierungsdatumGroesser</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>netzRegelzone</td>
<td>Regelzone des Bilanzierungsgebietes</td>
<td><a href="#regelzoneenum">RegelzoneEnum</a></td>
<td>Nein</td>
<td>Amprion</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>Betreiber der Anlage.</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Einheiten[]</td>
<td></td>
<td><a href="#einheit">Einheit</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetGefilterteListeGasErzeuger

Diese Funktion ermöglicht das Abrufen einer Liste mit Einheiten, die der Suchanfrage entsprechen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>einheitBetriebsstatus</td>
<td>Status der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Nein</td>
<td>InBetrieb</td>
</tr>
<tr>
<td>name</td>
<td>Name der Gaserzeugungseinheit</td>
<td>string</td>
<td>Nein</td>
<td>Gasometer II – FFM</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Postleitzahl des Standorts der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>89241</td>
</tr>
<tr>
<td>ort</td>
<td>Ort des Standorts der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>Leverkusen</td>
</tr>
<tr>
<td>einheitBundesland</td>
<td>Bundesland einer der Einheiten</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>erzeugungsleistung</td>
<td>Leistung der Gaserzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>erzeugungsleistungKleiner</td>
<td>Leistung der Gaserzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>erzeugungsleistungGroesser</td>
<td>Leistung der Gaserzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>inbetriebnahmedatumKleiner</td>
<td>Inbetriebnahmedatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>inbetriebnahmedatumGroesser</td>
<td>Inbetriebnahmedatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Gaserzeugungseinheit</td>
<td><a href="#technologiegaserzeugungenum">TechnologieGasErzeugungEnum</a></td>
<td>Nein</td>
<td>LiquifidNaturalGas</td>
</tr>
<tr>
<td>lokationNetzbetreiber</td>
<td>Einer der zugeordneter Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>RegistrierungsdatumKleiner</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>RegistrierungsdatumGroesser</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>Betreiber der Anlage.</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Einheiten[]</td>
<td></td>
<td><a href="#einheit">Einheit</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetGefilterteListeGasVerbraucher

Diese Funktion ermöglicht das Abrufen einer Liste mit Einheiten, die der Suchanfrage entsprechen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>einheitBetriebsstatus</td>
<td>Status der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Nein</td>
<td>InBetrieb</td>
</tr>
<tr>
<td>name</td>
<td>Name der Gaserzeugungseinheit</td>
<td>string</td>
<td>Nein</td>
<td>Gasometer II – FFM</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Postleitzahl des Standorts der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>89241</td>
</tr>
<tr>
<td>ort</td>
<td>Ort des Standorts der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>Leverkusen</td>
</tr>
<tr>
<td>einheitBundesland</td>
<td>Bundesland einer der Einheiten</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>bezugsleistung</td>
<td>Die maximale Gasbezugsleistung</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>bezugsleistungKleiner</td>
<td>Die maximale Gasbezugsleistung</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>bezugsleistungGroesser</td>
<td>Die maximale Gasbezugsleistung</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>inbetriebnahmedatumKleiner</td>
<td>Inbetriebnahmedatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>inbetriebnahmedatumGroesser</td>
<td>Inbetriebnahmedatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2017-02-04</td>
</tr>
<tr>
<td>gasverbrauchseinheitDientDerStromerzeugung</td>
<td>Angabe ob die Gasverbrauchseinheit zur Stromerzeugung dient (Gaskraftwerk)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>lokationNetzbetreiber</td>
<td>Einer der zugeordneter Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>RegistrierungsdatumKleiner</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>RegistrierungsdatumGroesser</td>
<td>Registrierungsdatum der Einheiten</td>
<td>date</td>
<td>Nein</td>
<td>2017-09-02</td>
</tr>
<tr>
<td>AnlagenbetreiberMastrNummer</td>
<td>Betreiber der Anlage.</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Einheiten[]</td>
<td></td>
<td><a href="#einheit">Einheit</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetGefilterteListeLokationenStromErzeuger

Diese Funktion ermöglicht das Abrufen einer Liste mit Lokationen, die der Suchanfrage entsprechen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>NameDerTechnischenLokation</td>
<td>Name der technischen Lokation</td>
<td>string</td>
<td>Nein</td>
<td>CON-12544-32</td>
</tr>
<tr>
<td>netzanschlusspunktAnzahl</td>
<td>Anzahl der Netzanschlusspunkte an der Lokation</td>
<td>int</td>
<td>Nein</td>
<td>4</td>
</tr>
<tr>
<td>netzanschlusspunktAnzahlKleiner</td>
<td>Anzahl der Netzanschlusspunkte an der Lokation</td>
<td>int</td>
<td>Nein</td>
<td>4</td>
</tr>
<tr>
<td>netzanschlusspunktAnzahlGroesser</td>
<td>Anzahl der Netzanschlusspunkte an der Lokation</td>
<td>int</td>
<td>Nein</td>
<td>4</td>
</tr>
<tr>
<td>einheitEnergietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Nein</td>
<td>Klaerschlamm</td>
</tr>
<tr>
<td>einheitPostleitzahl</td>
<td>Postleitzahl einer der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>89241</td>
</tr>
<tr>
<td>einheitOrt</td>
<td>Ort einer der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>Leverkusen</td>
</tr>
<tr>
<td>einheitBundesland</td>
<td>Bundesland einer der Einheiten</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>netzanschlusspunktNetzbetreiberMastrNummer</td>
<td>Einer der zugeordneter Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzanschlusspunktSpannungsebene</td>
<td>Eine der zugeordneten Spannungsebenen</td>
<td><a href="#spannungsebeneenum">SpannungsebeneEnum</a></td>
<td>Nein</td>
<td>Mittelspannung</td>
</tr>
<tr>
<td>netzRegelzone</td>
<td>Regelzone des Bilanzierungsgebietes</td>
<td><a href="#regelzoneenum">RegelzoneEnum</a></td>
<td>Nein</td>
<td>Amprion</td>
</tr>
<tr>
<td>Yeic</td>
<td>Y-Code des Bilanzierungsgebietes</td>
<td>string</td>
<td>Nein</td>
<td>11YV00000007046U</td>
</tr>
<tr>
<td>Bilanzierungsgebiet</td>
<td>Bezeichnung des Bilanzierungsgebietes</td>
<td>string</td>
<td>Nein</td>
<td>Stromareal ABC</td>
</tr>
<tr>
<td>netzanschlusspunktMesslokation</td>
<td>Messlokation von einem der Netzanschlusspunkte</td>
<td>string</td>
<td>Nein</td>
<td>DE00056266802…</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Lokationen[]</td>
<td></td>
<td><a href="#lokation">Lokation</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetGefilterteListeLokationenStromVerbraucher

Diese Funktion ermöglicht das Abrufen einer Liste mit Lokationen, die der Suchanfrage entsprechen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>NameDerTechnischenLokation</td>
<td>Name der technischen Lokation</td>
<td>string</td>
<td>Nein</td>
<td>CON-12544-32</td>
</tr>
<tr>
<td>einheitAnzahlUeber50Mw</td>
<td>Anzahl der angeschlossener Einheiten > 50 MW</td>
<td>int</td>
<td>Nein</td>
<td>4</td>
</tr>
<tr>
<td>einheitAnzahlUeber50MwKleiner</td>
<td>Anzahl der angeschlossener Einheiten > 50 MW</td>
<td>int</td>
<td>Nein</td>
<td>4</td>
</tr>
<tr>
<td>einheitAnzahlUeber50MwGroesser</td>
<td>Anzahl der angeschlossener Einheiten > 50 MW</td>
<td>int</td>
<td>Nein</td>
<td>4</td>
</tr>
<tr>
<td>einheitEnergietraeger</td>
<td>Energieträger der Einheit</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Nein</td>
<td>Klaerschlamm</td>
</tr>
<tr>
<td>einheitPostleitzahl</td>
<td>Postleitzahl einer der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>89241</td>
</tr>
<tr>
<td>einheitOrt</td>
<td>Ort einer der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>Leverkusen</td>
</tr>
<tr>
<td>einheitBundesland</td>
<td>Bundesland einer der Einheiten</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>netzanschlusspunktNetzbetreiberMastrNummer</td>
<td>Einer der zugeordneter Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzanschlusspunktSpannungsebene</td>
<td>Eine der zugeordneten Spannungsebenen</td>
<td><a href="#spannungsebeneenum">SpannungsebeneEnum</a></td>
<td>Nein</td>
<td>Mittelspannung</td>
</tr>
<tr>
<td>netzRegelzone</td>
<td>Regelzone des Bilanzierungsgebietes</td>
<td><a href="#regelzoneenum">RegelzoneEnum</a></td>
<td>Nein</td>
<td>Amprion</td>
</tr>
<tr>
<td>Yeic</td>
<td>Y-Code des Bilanzierungsgebietes</td>
<td>string</td>
<td>Nein</td>
<td>11YV00000007046U</td>
</tr>
<tr>
<td>Bilanzierungsgebiet</td>
<td>Bezeichnung des Bilanzierungsgebietes</td>
<td>string</td>
<td>Nein</td>
<td>Stromareal ABC</td>
</tr>
<tr>
<td>netzanschlusspunktMesslokation</td>
<td>Messlokation von einem der Netzanschlusspunkte</td>
<td>string</td>
<td>Nein</td>
<td>DE00056266802…</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Lokationen[]</td>
<td></td>
<td><a href="#lokation">Lokation</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetGefilterteListeLokationenGasErzeuger

Diese Funktion ermöglicht das Abrufen einer Liste mit Lokationen, die der Suchanfrage entsprechen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>NameDerTechnischenLokation</td>
<td>Name der technischen Lokation</td>
<td>string</td>
<td>Nein</td>
<td>CON-12544-32</td>
</tr>
<tr>
<td>einheitTechnologie</td>
<td>Technologie</td>
<td><a href="#technologiegaserzeugungenum">TechnologieGasErzeugungEnum</a></td>
<td>Nein</td>
<td>FoerderungFossilenErdgases</td>
</tr>
<tr>
<td>einheitSummeErzeugerleistung</td>
<td>Die Summe der Erzeugerleistung der angeschlossenen Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>einheitSummeErzeugerleistungKleiner</td>
<td>Die Summe der Erzeugerleistung der angeschlossenen Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>einheitSummeErzeugerleistungGroesser</td>
<td>Die Summe der Erzeugerleistung der angeschlossenen Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>einheitPostleitzahl</td>
<td>Postleitzahl einer der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>89241</td>
</tr>
<tr>
<td>einheitOrt</td>
<td>Ort einer der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>Leverkusen</td>
</tr>
<tr>
<td>einheitBundesland</td>
<td>Bundesland einer der Einheiten</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>netzanschlusspunktNetzbetreiberMastrNummer</td>
<td>Einer der zugeordneter Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzanschlusspunktGasqualitaet</td>
<td>Gasqualität am Netzanschlusspunkt</td>
<td><a href="#gasqualitaetenum">GasqualitaetEnum</a></td>
<td>Nein</td>
<td>LGas</td>
</tr>
<tr>
<td>netzanschlusspunktBezeichnung</td>
<td>Bezeichnung des Netzanschlusspunktes</td>
<td>string</td>
<td>Nein</td>
<td>GAS-34524-1234-Q</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Lokationen[]</td>
<td></td>
<td><a href="#lokation">Lokation</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetGefilterteListeLokationenGasVerbraucher

Diese Funktion ermöglicht das Abrufen einer Liste mit Lokationen, die der Suchanfrage entsprechen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>NameDerTechnischenLokation</td>
<td>Name der technischen Lokation</td>
<td>string</td>
<td>Nein</td>
<td>CON-12544-32</td>
</tr>
<tr>
<td>einheitSummeMaximaleBezugsleistung</td>
<td>Die Summe der maximalen Bezugsleistung der angeschlossenen Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>einheitSummeMaximaleBezugsleistungKleiner</td>
<td>Die Summe der maximalen Bezugsleistung der angeschlossenen Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>einheitSummeMaximaleBezugsleistungGroesser</td>
<td>Die Summe der maximalen Bezugsleistung der angeschlossenen Einheiten</td>
<td>decimal</td>
<td>Nein</td>
<td>4556.987</td>
</tr>
<tr>
<td>einheitPostleitzahl</td>
<td>Postleitzahl einer der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>89241</td>
</tr>
<tr>
<td>einheitOrt</td>
<td>Ort einer der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>Leverkusen</td>
</tr>
<tr>
<td>einheitBundesland</td>
<td>Bundesland einer der Einheiten</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>netzanschlusspunktNetzbetreiberMastrNummer</td>
<td>Einer der zugeordneter Netzbetreiber</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzanschlusspunktGasqualitaet</td>
<td>Gasqualität am Netzanschlusspunkt</td>
<td><a href="#gasqualitaetenum">GasqualitaetEnum</a></td>
<td>Nein</td>
<td>LGas</td>
</tr>
<tr>
<td>netzanschlusspunktBezeichnung</td>
<td>Bezeichnung des Netzanschlusspunktes</td>
<td>string</td>
<td>Nein</td>
<td>GAS-34524-1234-Q</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>Lokationen[]</td>
<td></td>
<td><a href="#lokation">Lokation</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>

# Netzbetreiberpruefung



## GetListeMeineNetzbetreiberpruefungen

Diese Funktion ermöglicht das Abrufen von Netzbetreiberprüfungen für einen angegebenen Netzbetreiber. Mit dem „DatumAb“ kann die Ausgabe eingeschränkt werden. Es werden in diesem Fall nur die Objekte geliefert, die ab diesem Zeitpunkt erstellt oder geändert wurden. Wird kein Datum angegeben, erfolgt eine komplette Auslieferung der Daten.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>abPruefungsstartTermin</td>
<td>Erstmaliger Start der Prüfung.</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-07-25T00:00:00.0000000</td>
</tr>
<tr>
<td>netzbetreiberpruefungIds[]</td>
<td>Ermöglicht das Abrufen von Informationen zu bestimmten Netzbetreiberprüfungen</td>
<td>int</td>
<td>Nein</td>
<td>[34665436], [35358765] 
                </td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>kategorie</td>
<td>Kategorie der Netzbetreiberprüfung</td>
<td><a href="#netzbetreiberpruefungskategorieenum">NetzbetreiberpruefungsKategorieEnum</a></td>
<td>Nein</td>
<td>WiedervorlageNetzbetreiberpruefung</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>ListeNetzbetreiberpruefungen[]</td>
<td></td>
<td><a href="#netzbetreiberpruefung">Netzbetreiberpruefung</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## ErneuteNetzbetreiberpruefungStarten

Diese Funktion ermöglicht das Auslösen einer neuen Netzbetreiberprüfung.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>neustartGrund</td>
<td>Der Grund des Neustarts einer Netzbetreiberprüfung</td>
<td>string</td>
<td>Nein</td>
<td></td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>neueNetzbetreiberpruefungId</td>
<td>Die ID des neuen Netzbetreiberprüfungsprozesses</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>alteNetzbetreiberpruefungId</td>
<td>Die ID des alten Netzbetreiberprüfungsprozesses</td>
<td>int</td>
<td>Nein</td>
<td>5975653</td>
</tr>
</table>



## VerschiebeEinheitZuAndererLokation

Diese Funktion ermöglicht das Umhängen einer Einheit an eine bereits bestehende Lokation. Die Ziellokation wird durch eine Einheit identifiziert, die bereits mit der Lokation verknüpft ist. Die alte Lokation und deren mögliche Netzanschlusspunkte werden abschließend entfernt, wenn keine weitere Einheit an der Lokation hängt. Nur der zuständige Netzbetreiber ist in der Lage, diese Funktion aufzurufen und kann Lokationen zuordnen, an denen der Netzbetreiber bereits mit mindestens einem Netzanschlusspunkt vertreten ist. Die Zuordnung ist nur sortenrein nach Einheitenart (Stromerzeuger, Stromverbraucher, Gaserzeuger, Gasverbraucher) möglich.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>letzteAenderungUrsprungEinheit</td>
<td>Originaldatum der letzten Änderung der Ursprungseinheit</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>letzteAenderungZielLoktion</td>
<td>Originaldatum der letzten Änderung der Ziellokation</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>letzteAenderungZielEinheit</td>
<td>Originaldatum der letzten Änderung der Zieleinheit</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>ursprungEinheitMastrNummer</td>
<td>Die MaStR-Nummer der zu verschiebenden Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>zielLokationMastrNummer</td>
<td>MaStR-Nummer der gewünschten Ziellokation.</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91012345678</td>
</tr>
<tr>
<td>zielEinheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Zieleinheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## VerschiebeEinheitZuNeuerLokation

Diese Funktion ermöglicht das Umhängen einer Einheit von der aktuell zugeordneten Lokation an eine neue Lokation, die mit dieser Funktion automatisch erstellt wird. Die Einheit wird damit entkoppelt. Dieser Prozess ist Teil der Netzbetreiberprüfung. Die alte Lokation und deren mögliche Netzanschlusspunkte werden abschließend entfernt, wenn keine weitere Einheit an der Lokation hängt.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>letzteAenderungUrsprungLokation</td>
<td>Originaldatum der letzten Änderung der Ursprungslokation</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>ursprungEinheitMastrNummer</td>
<td>Die MaStR-Nummer der zu verschiebenden Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>neueLokationName</td>
<td>Name der neuen Lokation</td>
<td>string</td>
<td>Ja</td>
<td>LOKA-546-PQ1</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## SetNetzbetreiberpruefungAbgeschlossen

Diese Funktion ermöglicht das Beenden einer Netzbetreiberprüfung. Sie setzt den Status der Netzbetreiberprüfung auf „Netzbetreiberprüfung erfolgreich abgeschlossen“. Der Vorgang ist damit abgeschlossen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td><a href="#netzbetreiberpruefungid">NetzbetreiberpruefungId</a></td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine optionale Beschreibung</td>
<td>string</td>
<td>Nein</td>
<td>Ihr Bearbeiter: Herr Max Mustermann -1234</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## SetDatenkorrekturErforderlich

Diese Funktion ermöglicht die Statussetzung einer Netzbetreiberprüfung, für den Fall, dass Daten nicht korrekt sind und der Dateninhaber zu einer Datenkorrektur aufgefordert werden soll. Sie setzt den Status auf „Datenkorrektur“ und öffnet ein Ticket „Aufforderung zur Datenkorrektur“ für den Anlagenbetreiber. Diese Funktion kann nur aufgerufen werden, wenn mindestens ein Korrekturvorschlag an der angebenen Netzbetreiberprüfung hinterlegt ist. Vorschläge werden über die Funktionen „SetKorrekturvorschlag…“ erfasst und damit an einer Netzbetreiberprüfung hinterlegt.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td><a href="#netzbetreiberpruefungid">NetzbetreiberpruefungId</a></td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## SetNetzbetreiberNichtZustaendig

Diese Funktion ermöglicht die Angabe, dass der Netzbetreiber nicht für diese Netzbetreiberprüfung zuständig ist. Sie setzt den Status der Netzbetreiberprüfung auf „Netzbetreiber nicht zuständig“. Der Vorgang ist damit abgeschlossen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td><a href="#netzbetreiberpruefungid">NetzbetreiberpruefungId</a></td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Kommentarfeld für mögliche Hinweiser</td>
<td>string</td>
<td>Nein</td>
<td>Der NB ist die Netz Landstrom AG</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## SetKlaerungErforderlich

Diese Funktion ermöglicht die Angabe, dass der Netzbetreiber diese Prüfung direkt an die Bundesnetzagentur leiten möchte. Dies ist z.B. immer dann der Fall, wenn der Netzbetreiber den Verdacht einer „Falschanmeldung einer Anlage“ hat. Setzt den Status „Klärung“ und öffnet ein Ticket „Klärungsprozess BNetzA“ für die Fachadministratoren der Bundesnetzagentur.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td><a href="#netzbetreiberpruefungid">NetzbetreiberpruefungId</a></td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Die Beschreibung ist verpflichtend anzugeben</td>
<td>string</td>
<td>Ja</td>
<td>Ihr Bearbeiter: Herr Max Mustermann -1234</td>
</tr>
<tr>
<td>klaerungsGrund</td>
<td>Angabe des Grunds für die Klärung bei der BNetzA</td>
<td><a href="#klaerungsgrundenum">KlaerungsGrundEnum</a></td>
<td>Ja</td>
<td>EinheitExistiertNicht</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## SetKorrekturBetriebsstatus

Diese Funktion ermöglicht eine Aufforderung zur Betriebsstatuskorrektur zu erstellen. Die Korrektur kann bei Einheiten mit dem Status "In Betrieb" auf „In Planung“ oder „Endgültig stillgelegt“ erfolgen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td><a href="#netzbetreiberpruefungid">NetzbetreiberpruefungId</a></td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung für den Anlagenbetreiber</td>
<td>string</td>
<td>Ja</td>
<td>Laut unseren Unterlagen ein abweichender Betriebsstatus</td>
</tr>
<tr>
<td>korrekturBetriebsStatus</td>
<td>Korrektur zum Betriebsstatus der Einheit</td>
<td><a href="#korrekturbetriebsstatusenum">KorrekturBetriebsStatusEnum</a></td>
<td>Ja</td>
<td>EndgueltigStillgelegt</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td> 	2023-01-01</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2021-12-31</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## GetKorrekturVorschlagBetriebsstatus

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Betriebsstatuskorrektur. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung für den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Laut unseren Unterlagen ein abweichender Betriebsstatus</td>
</tr>
<tr>
<td>korrekturBetriebsStatus</td>
<td>Korrektur zum Betriebsstatus der Einheit</td>
<td><a href="#korrekturbetriebsstatusenum">KorrekturBetriebsStatusEnum</a></td>
<td>Nein</td>
<td>EndgueltigStillgelegt</td>
</tr>
<tr>
<td>korrekturBetriebsStatusZuPruefen</td>
<td>Korrektur zum Betriebsstatus der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>01.01.2023</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>31.12.2021</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetWiedervorlageVorschlagBetriebsstatus

Diese Funktion ermöglicht das Abrufen der Antwort des Anlagenbetreibers zur Betriebsstatuskorrektur (Wiedervorlage). Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung für den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Laut unseren Unterlagen ein abweichender Betriebsstatus</td>
</tr>
<tr>
<td>korrekturBetriebsStatus</td>
<td>Korrektur zum Betriebsstatus der Einheit</td>
<td><a href="#korrekturbetriebsstatusenum">KorrekturBetriebsStatusEnum</a></td>
<td>Nein</td>
<td>EndgueltigStillgelegt</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>01.01.2023</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>31.12.2021</td>
</tr>
</table>



## SetKorrekturBetriebsstatusAbgeschlossen

Diese Funktion ermöglicht die Übernahme der Betriebsstatuskorrektur. Der Vorgang ist damit abgeschlossen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td><a href="#netzbetreiberpruefungid">NetzbetreiberpruefungId</a></td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung für den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Laut unseren Unterlagen ein abweichender Betriebsstatus</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## SetEegAnlagenschluessel

Diese Funktion ermöglicht Netzbetreibenden das Setzen eines EEG-Anlagenschlüssels für eine EEG-Anlage in ihrem Netz

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>MaStR-Nummer der betroffenen Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegAnlagenschluessel</td>
<td>Anlagenschlüssel der EEG-Anlage</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>E1004701000ZE000000513535VS000001</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## SetStilllegungAbgelehnt

Diese Funktion ermöglicht die Angabe, dass der Netzbetreiber die Registrierung der Stilllegung einer Einheit ablehnt

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td><a href="#netzbetreiberpruefungid">NetzbetreiberpruefungId</a></td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>ablehnungsGrund</td>
<td>Grund der Ablehnung</td>
<td>string</td>
<td>Ja</td>
<td>Ausversehen gedrückt</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine optionale Beschreibung</td>
<td>string</td>
<td>Nein</td>
<td>Ihr Bearbeiter: Herr Max Mustermann</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## SetAntragAufFristverlaengerung

Diese Funktion ermöglicht die Antragstellung auf Fristverlängerung

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungTicketId</td>
<td>Die aktuelle Ticket-Id des Prozesses</td>
<td><a href="#netzbetreiberpruefungticketid">NetzbetreiberpruefungTicketId</a></td>
<td>Ja</td>
<td>7890</td>
</tr>
<tr>
<td>FristverlaengerungGrund</td>
<td>Letzter Vorgang des Prozesses</td>
<td><a href="#fristverlaengerunggrundenum">FristverlaengerungGrundEnum</a></td>
<td>Ja</td>
<td>BetreiberwechselmeldungFehlt</td>
</tr>
<tr>
<td>FristverlaengerungErlaeuterung</td>
<td>Begründungstext (nur möglich bei Katalogwert sonstiges)</td>
<td>string</td>
<td>Nein</td>
<td>Bearbeitung nicht möglich</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## RuecknahmeFristverlaengerung

Diese Funktion ermöglicht die Rücknahme der Fristverlängerung

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungTicketId</td>
<td>Die aktuelle Ticket-Id des Prozesses</td>
<td><a href="#netzbetreiberpruefungticketid">NetzbetreiberpruefungTicketId</a></td>
<td>Ja</td>
<td>7890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitWind

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Bioweltreaktor 2354</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>Inselbetriebsfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameWindpark</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Windparks, dessen Teil die Einheit ist</td>
<td>string</td>
<td>Nein</td>
<td>Windpark II - Felddorf</td>
</tr>
<tr>
<td>nameWindparkZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Windparks, dessen Teil die Einheit ist (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>lage</td>
<td>Angabe, ob die Stromerzeugungseinheit an Land oder auf See errichtet wurde</td>
<td><a href="#windlageenum">WindLageEnum</a></td>
<td>Nein</td>
<td>WindAnLand</td>
</tr>
<tr>
<td>lageZuPruefen</td>
<td>Angabe, ob die Stromerzeugungseinheit an Land oder auf See errichtet wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>seelage</td>
<td>Wird die Windenergieanlage in der Nordsee oder in der Ostsee betrieben?</td>
<td><a href="#seelageenum">SeelageEnum</a></td>
<td>Nein</td>
<td>Ostsee</td>
</tr>
<tr>
<td>seelageZuPruefen</td>
<td>Wird die Windenergieanlage in der Nordsee oder in der Ostsee betrieben? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>clusterOstsee</td>
<td>.</td>
<td><a href="#clusterostseeenum">ClusterOstseeEnum</a></td>
<td>Nein</td>
<td>II</td>
</tr>
<tr>
<td>clusterOstseeZuPruefen</td>
<td>. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>clusterNordsee</td>
<td>.</td>
<td><a href="#clusternordseeenum">ClusterNordseeEnum</a></td>
<td>Nein</td>
<td>III</td>
</tr>
<tr>
<td>clusterNordseeZuPruefen</td>
<td>. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Stromerzeugung: Horizontalläufer oder Vertikalläufer</td>
<td><a href="#windanlagetechnologieenum">WindanlageTechnologieEnum</a></td>
<td>Nein</td>
<td>Vertikallaeufer</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Technologie der Stromerzeugung: Horizontalläufer oder Vertikalläufer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>herstellerId</td>
<td>Id des Herstellers der Einheit</td>
<td><a href="#katalogwertid">KatalogwertId</a></td>
<td>Nein</td>
<td>923</td>
</tr>
<tr>
<td>herstellerIdZuPruefen</td>
<td>Id des Herstellers der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>typenbezeichnung</td>
<td>Typenbezeichnung der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>Wind FX2</td>
</tr>
<tr>
<td>typenbezeichnungZuPruefen</td>
<td>Typenbezeichnung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nabenhoehe</td>
<td>Die Nabenhöhe der Erzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>12.987</td>
</tr>
<tr>
<td>nabenhoeheZuPruefen</td>
<td>Die Nabenhöhe der Erzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>rotordurchmesser</td>
<td>Die Rotordurchmesser der Erzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>35.989</td>
</tr>
<tr>
<td>rotordurchmesserZuPruefen</td>
<td>Die Rotordurchmesser der Erzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Rotorblattenteisungssystem</td>
<td>Ein Rotorblattenteisungssystem, auch als Rotorblattenteisungsanlage bezeichnet, ist eine Vorrichtung, die dazu dient, die Rotorblätter von Windkraftanlagen eisfrei zu halten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>RotorblattenteisungssystemZuPruefen</td>
<td>Ein Rotorblattenteisungssystem, auch als Rotorblattenteisungsanlage bezeichnet, ist eine Vorrichtung, die dazu dient, die Rotorblätter von Windkraftanlagen eisfrei zu halten (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hoehe</td>
<td>Höhe der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>123.784</td>
</tr>
<tr>
<td>hoeheZuPruefen</td>
<td>Höhe der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>auflageAbschaltungLeistungsbegrenzung</td>
<td>Auflagen zu Abschaltungen oder Leistungsbegrenzungen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>auflageAbschaltungLeistungsbegrenzungZuPruefen</td>
<td>Auflagen zu Abschaltungen oder Leistungsbegrenzungen? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchallimmissionsschutzNachts</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schallimmissionsschutz in der Nacht bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchallimmissionsschutzNachtsZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schallimmissionsschutz in der Nacht bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchallimmissionsschutzTagsueber</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schallimmissionsschutz tagsüber bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchallimmissionsschutzTagsueberZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schallimmissionsschutz tagsüber bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchattenwurf</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schattenwurf bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchattenwurfZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schattenwurf bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungTierschutz</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Tierschutz bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungTierschutzZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Tierschutz bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungEiswurf</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Eiswurf bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungEiswurfZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Eiswurf bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSonstige</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von sonstigen Gründen bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSonstigeZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von sonstigen Gründen bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>wassertiefe</td>
<td>Wassertiefe am Standort der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>140.123</td>
</tr>
<tr>
<td>wassertiefeZuPruefen</td>
<td>Wassertiefe am Standort der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kuestenentfernung</td>
<td>Küstenentfernung des Standorts der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>147.254</td>
</tr>
<tr>
<td>kuestenentfernungZuPruefen</td>
<td>Küstenentfernung des Standorts der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>MaStR-Nummer der zugeordneten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegMastrNummerZuPruefen</td>
<td>MaStR-Nummer der zugeordneten EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegPrototypAnlage</td>
<td>Die Windenergieanlage ist als Prototyp zertifiziert.</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegPrototypAnlageZuPruefen</td>
<td>Die Windenergieanlage ist als Prototyp zertifiziert. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegPilotAnlage</td>
<td>Die Windenergieanlage ist eine Pilotwindanlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegPilotAnlageZuPruefen</td>
<td>Die Windenergieanlage ist eine Pilotwindanlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>19.05.1903</td>
</tr>
<tr>
<td>eegInstallierteLeistungZuPruefen</td>
<td>Installierte Nettonennleistung der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegVerhaeltnisErtragsschaetzungReferenzertrag</td>
<td>Verhältnis der Ertragseinschätzung zum Referenzertrag ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Nein</td>
<td>47.954</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtragZuPruefen</td>
<td>Verhältnis der Ertragseinschätzung zum Referenzertrag ermittelt nach Anlage 2 des EEG (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag5Jahre</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 5 Jahren ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Nein</td>
<td>23.4</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag5JahreZuPruefen</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 5 Jahren ermittelt nach Anlage 2 des EEG (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag10Jahre</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 10 Jahren ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Nein</td>
<td>57.54</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag10JahreZuPruefen</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 10 Jahren ermittelt nach Anlage 2 des EEG (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag15Jahre</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 15 Jahren ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Nein</td>
<td>87.45</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag15JahreZuPruefen</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 15 Jahren ermittelt nach Anlage 2 des EEG (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegAusschreibungZuschlagZuPruefen</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegZuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>eegZuschlagsnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Buergerenergie</td>
<td>Bürgerenergieeigenschaft der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BuergerenergieZuPruefen</td>
<td>Bürgerenergieeigenschaft der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Nachtkennzeichen</td>
<td>Nachtkennzeichen der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>NachtkennzeichenZuPruefen</td>
<td>Nachtkennzeichen der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitAnlagenbetreiber

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung für den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>Personenart</td>
<td>Angabe der Personenart des Marktakteurs: natürliche Person oder Organisation</td>
<td><a href="#personenartenum">PersonenartEnum</a></td>
<td>Nein</td>
<td>Organisation</td>
</tr>
<tr>
<td>PersonenartZuPruefen</td>
<td>Angabe der Personenart des Marktakteurs: natürliche Person oder Organisation (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Firmenname</td>
<td>Name der Firma mit dem rechtsformergänzenden Namenszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Stromnetz Land AG</td>
</tr>
<tr>
<td>FirmennameZuPruefen</td>
<td>Name der Firma mit dem rechtsformergänzenden Namenszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>RechtsformId</td>
<td>Id der Rechtsform des Marktakteurs</td>
<td><a href="#katalogwertid">KatalogwertId</a></td>
<td>Nein</td>
<td>345</td>
</tr>
<tr>
<td>RechtsformIdZuPruefen</td>
<td>Id der Rechtsform des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>SonstigeRechtsform</td>
<td>Rechtsform des Marktakteurs wenn 'Sonstiges' gewählt wurde</td>
<td>string</td>
<td>Nein</td>
<td>SW</td>
</tr>
<tr>
<td>SonstigeRechtsformZuPruefen</td>
<td>Rechtsform des Marktakteurs wenn 'Sonstiges' gewählt wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Anrede</td>
<td>Anrede der natürlichen Person</td>
<td><a href="#salutationenum">SalutationEnum</a></td>
<td>Nein</td>
<td>Herr</td>
</tr>
<tr>
<td>AnredeZuPruefen</td>
<td>Anrede der natürlichen Person (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Titel</td>
<td>Titel der natürlichen Person</td>
<td><a href="#titelenum">TitelEnum</a></td>
<td>Nein</td>
<td>Dr</td>
</tr>
<tr>
<td>TitelZuPruefen</td>
<td>Titel der natürlichen Person (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Vorname</td>
<td>Vorname der natürlichen Person</td>
<td>string</td>
<td>Nein</td>
<td>Max</td>
</tr>
<tr>
<td>VornameZuPruefen</td>
<td>Vorname der natürlichen Person (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Nachname</td>
<td>Name der natürlichen Person</td>
<td>string</td>
<td>Nein</td>
<td>Mustermann</td>
</tr>
<tr>
<td>NachnameZuPruefen</td>
<td>Name der natürlichen Person (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Geburtsdatum</td>
<td>Geburtsdatum der natürlichen Person</td>
<td>date</td>
<td>Nein</td>
<td>2000-07-25</td>
</tr>
<tr>
<td>GeburtsdatumZuPruefen</td>
<td>Geburtsdatum der natürlichen Person (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Die Postleitzahl, in deren Gebiet der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>1600</td>
</tr>
<tr>
<td>PostleitzahlZuPruefen</td>
<td>Die Postleitzahl, in deren Gebiet der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Strasse</td>
<td>Die Straße, in der der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Musterfrau-Str.</td>
</tr>
<tr>
<td>StrasseZuPruefen</td>
<td>Die Straße, in der der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Die Hausnummer, an der der Marktakteur seinen Sitz hat.</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>2</td>
</tr>
<tr>
<td>HausnummerZuPruefen</td>
<td>Die Hausnummer, an der der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Optionaler Zusatz zur Anschrift des Marktakteurs.</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>AdresszusatzZuPruefen</td>
<td>Optionaler Zusatz zur Anschrift des Marktakteurs. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Ort</td>
<td>Der Ort, in dem der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Wien</td>
</tr>
<tr>
<td>OrtZuPruefen</td>
<td>Der Ort, in dem der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Das Bundesland, in dem der Marktakteur seinen Sitz hat.</td>
<td><a href="#bundeslaenderenum">BundeslaenderEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>BundeslandZuPruefen</td>
<td>Das Bundesland, in dem der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Land</td>
<td>Das Land, in dem der Marktakteur seinen Sitz hat</td>
<td><a href="#landenum">LandEnum</a></td>
<td>Nein</td>
<td>Oesterreich</td>
</tr>
<tr>
<td>LandZuPruefen</td>
<td>Der Staat, in dem der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AdresseIstZustelladresse</td>
<td>Angabe ob an die angegebene Adresse Dokumente zugestellt werden können</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AdresseIstZustelladresseZuPruefen</td>
<td>Angabe ob an die angegebene Adresse Dokumente zugestellt werden können(Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>ZustellPostleitzahl</td>
<td>Die Postleitzahl, in deren Gebiet der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>1600</td>
</tr>
<tr>
<td>ZustellPostleitzahlZuPruefen</td>
<td>Die Postleitzahl, in deren Gebiet der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellStrasse</td>
<td>Die Straße, in der der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Musterfrau-Str.</td>
</tr>
<tr>
<td>ZustellStrasseZuPruefen</td>
<td>Die Straße, in der der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellStrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellHausnummer</td>
<td>Die Hausnummer, an der der Marktakteur seinen Sitz hat.</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>2</td>
</tr>
<tr>
<td>ZustellHausnummerZuPruefen</td>
<td>Die Hausnummer, an der der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellHausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellAdresszusatz</td>
<td>Optionaler Zusatz zur Anschrift des Marktakteurs.</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>ZustellAdresszusatzZuPruefen</td>
<td>Optionaler Zusatz zur Anschrift des Marktakteurs. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellOrt</td>
<td>Der Ort, in dem der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Wien</td>
</tr>
<tr>
<td>ZustellOrtZuPruefen</td>
<td>Der Ort, in dem der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellLand</td>
<td>Das Land, in dem der Marktakteur seinen Sitz hat</td>
<td><a href="#landenum">LandEnum</a></td>
<td>Nein</td>
<td>Oesterreich</td>
</tr>
<tr>
<td>ZustellLandZuPruefen</td>
<td>Der Staat, in dem der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AbweichenderNameFirmenname</td>
<td>Abweichender Name/Firmenname</td>
<td>string</td>
<td>Nein</td>
<td>Stromnetz Land AG</td>
</tr>
<tr>
<td>AbweichenderNameFirmennameZuPruefen</td>
<td>Abweichender Name/Firmenname (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Email</td>
<td>E-Mail des Marktakteurs</td>
<td>string</td>
<td>Nein</td>
<td>mail@landstrom.ag</td>
</tr>
<tr>
<td>EmailZuPruefen</td>
<td>E-Mail des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Telefon</td>
<td>Telefonnummer des Marktakteurs</td>
<td>string</td>
<td>Nein</td>
<td>39111223344</td>
</tr>
<tr>
<td>TelefonZuPruefen</td>
<td>Telefonnummer des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Fax</td>
<td>Faxnummer des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>39111223355</td>
</tr>
<tr>
<td>FaxZuPruefen</td>
<td>Faxnummer des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Webseite</td>
<td>Internetadresse des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>www.landstrom.ag</td>
</tr>
<tr>
<td>WebseiteZuPruefen</td>
<td>Internetadresse des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ImHandelsregisterEingetragen</td>
<td>Angabe ob der Anlagenbetreiber im Handelsregister eingetragen ist</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>ImHandelsregisterEingetragenZuPruefen</td>
<td>Angabe ob der Anlagenbetreiber im Handelsregister eingetragen ist (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>RegistergerichtId</td>
<td>Angabe des Registergerichts, bei dem die Organisation registriert ist</td>
<td><a href="#erweiterterkatalogwertid">ErweiterterKatalogwertId</a></td>
<td>Nein</td>
<td>548</td>
</tr>
<tr>
<td>RegistergerichtIdZuPruefen</td>
<td>Angabe des Registergerichts, bei dem die Organisation registriert ist (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Registernummer</td>
<td>Registernummer des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>HRB 21016</td>
</tr>
<tr>
<td>RegisternummerZuPruefen</td>
<td>Registernummer des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>RegistergerichtAusland</td>
<td>Angabe des Registergerichts, bei dem die Organisation registriert ist, wenn im Ausland</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>Amtsgericht Luxemburg</td>
</tr>
<tr>
<td>RegistergerichtAuslandZuPruefen</td>
<td>Angabe des Registergerichts, bei dem die Organisation registriert ist (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>RegisternummerAusland</td>
<td>Registernummer des Marktakteurs, wenn im Ausland</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>XY 21016</td>
</tr>
<tr>
<td>RegisternummerAuslandZuPruefen</td>
<td>Registernummer des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Taetigkeitsbeginn</td>
<td>Tätigkeitsbeginn des Marktakteurs</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>TaetigkeitsbeginnZuPruefen</td>
<td>Tätigkeitsbeginn des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Taetigkeitsende</td>
<td>Tätigkeitsende des Marktakteurs</td>
<td><a href="#erweitertesdate">ErweitertesDate</a></td>
<td>Nein</td>
<td>2012-05-06</td>
</tr>
<tr>
<td>TaetigkeitsendeZuPruefen</td>
<td>Tätigkeitsende des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AcerCode</td>
<td>Der ACER-Code des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>ACE2442523454</td>
</tr>
<tr>
<td>AcerCodeZuPruefen</td>
<td>Der ACER-Code des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Umsatzsteueridentifikationsnummer</td>
<td>Die USt-Id Nummer des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>DE235583371</td>
</tr>
<tr>
<td>UmsatzsteueridentifikationsnummerZuPruefen</td>
<td>Die USt-Id Nummer des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>HauptwirtdschaftszweigGruppe</td>
<td>Hauptwirtschaftszweig - Gruppe</td>
<td><a href="#nacegruppeenum">NaceGruppeEnum</a></td>
<td>Nein</td>
<td>EnumValue</td>
</tr>
<tr>
<td>HauptwirtdschaftszweigGruppeZuPruefen</td>
<td>Hauptwirtschaftszweig - Gruppe (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Kmu</td>
<td>Kleinst-, Klein- oder mittleres Unternehmen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>KmuZuPruefen</td>
<td>Kleinst-, Klein- oder mittleres Unternehmen? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>EinkommenAusSelbstaendigerArbeit</td>
<td>Angabe ob der Anlagenbetreiber Einkommen aus selbstständiger Arbeit erziehlt</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>EinkommenAusSelbstaendigerArbeitZuPruefen</td>
<td>Angabe ob der Anlagenbetreiber Einkommen aus selbstständiger Arbeit erziehlt (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitSolar

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Bioweltreaktor 2354</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>Inselbetriebsfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>zugeordneteWirkleistungWechselrichter</td>
<td>Wechselrichterleistung der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>147.254</td>
</tr>
<tr>
<td>zugeordneteWirkleistungWechselrichterZuPruefen</td>
<td>Wechselrichterleistung der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemeinsamerWechselrichterMitSpeicher</td>
<td>Gemeinsamer Wechselrichter mit Stromspeicher</td>
<td><a href="#wechselrichterenum">WechselrichterEnum</a></td>
<td>Nein</td>
<td>GemeinsamerWechselrichterMitStromspeicher</td>
</tr>
<tr>
<td>gemeinsamerWechselrichterMitSpeicherZuPruefen</td>
<td>Gemeinsamer Wechselrichter mit Stromspeicher (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>anzahlModule</td>
<td>Anzahl der Module dieser Stromerzeugungseinheit</td>
<td>int</td>
<td>Nein</td>
<td>12</td>
</tr>
<tr>
<td>anzahlModuleZuPruefen</td>
<td>Anzahl der Module dieser Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>lage</td>
<td>Errichtungsort der Stromerzeugungseinheit</td>
<td><a href="#solarlageenum">SolarLageEnum</a></td>
<td>Nein</td>
<td>Freiflaeche</td>
</tr>
<tr>
<td>lageZuPruefen</td>
<td>Errichtungsort der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>leistungsbegrenzung</td>
<td>Die Leistung der Stromerzeugungseinheit ist auf einen bestimmten prozentualen Leistungsanteil begrenzt</td>
<td><a href="#solarleistungsbegrenzungenum">SolarLeistungsbegrenzungEnum</a></td>
<td>Nein</td>
<td>Ja70Prozent</td>
</tr>
<tr>
<td>leistungsbegrenzungZuPruefen</td>
<td>Die Leistung der Stromerzeugungseinheit ist auf einen bestimmten prozentualen Leistungsanteil begrenzt (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitlicheAusrichtungUndNeigungswinkel</td>
<td>Angabe, ob einheitliche Ausrichtung und Neigungswinkel bestehen.</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>einheitlicheAusrichtungUndNeigungswinkelZuPruefen</td>
<td>Angabe, ob einheitliche Ausrichtung und Neigungswinkel bestehen. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hauptausrichtung</td>
<td>Die Ausrichtung bezeichnet die Himmelsrichtung.</td>
<td><a href="#anlagenartsolarausrichtungenum">AnlagenartSolarAusrichtungEnum</a></td>
<td>Nein</td>
<td>Nord</td>
</tr>
<tr>
<td>hauptausrichtungZuPruefen</td>
<td>Die Ausrichtung bezeichnet die Himmelsrichtung. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hauptausrichtungNeigungswinkel</td>
<td>Der Neigungswinkel bezeichnet den Winkel gegenüber der Horizontalen.</td>
<td><a href="#anlagenartsolarneigungswinkelenum">AnlagenartSolarNeigungswinkelEnum</a></td>
<td>Nein</td>
<td>Ueber60</td>
</tr>
<tr>
<td>hauptausrichtungNeigungswinkelZuPruefen</td>
<td>Der Neigungswinkel bezeichnet den Winkel gegenüber der Horizontalen. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nebenausrichtung</td>
<td>Weitere Ausrichtung der Stromerzeugungseinheit neben der Hauptausrichtung</td>
<td><a href="#anlagenartsolarausrichtungenum">AnlagenartSolarAusrichtungEnum</a></td>
<td>Nein</td>
<td>Nord</td>
</tr>
<tr>
<td>nebenausrichtungZuPruefen</td>
<td>Weitere Ausrichtung der Stromerzeugungseinheit neben der Hauptausrichtung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nebenausrichtungNeigungswinkel</td>
<td>Neigungswinkel in Grad zur Horizontalen(der Nebenausrichtung)</td>
<td><a href="#anlagenartsolarneigungswinkelenum">AnlagenartSolarNeigungswinkelEnum</a></td>
<td>Nein</td>
<td>Ueber60</td>
</tr>
<tr>
<td>nebenausrichtungNeigungswinkelZuPruefen</td>
<td>Neigungswinkel in Grad zur Horizontalen(der Nebenausrichtung) (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inAnspruchGenommeneFlaeche</td>
<td>In Anspruch genommene Fläche</td>
<td>decimal</td>
<td>Nein</td>
<td>456.981</td>
</tr>
<tr>
<td>inAnspruchGenommeneFlaecheZuPruefen</td>
<td>In Anspruch genommene Fläche</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>artDerFlaeche[]</td>
<td>Art der in Anspruch genommenen Fläche</td>
<td><a href="#solarflaechenartenum">SolarFlaechenartEnum</a></td>
<td>Nein</td>
<td>BimaFlaeche</td>
</tr>
<tr>
<td>artDerFlaecheZuPruefen</td>
<td>Art der in Anspruch genommenen Fläche (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inAnspruchGenommeneAckerflaeche</td>
<td>In Anspruch genommene Ackerfläche</td>
<td>decimal</td>
<td>Nein</td>
<td>124.098</td>
</tr>
<tr>
<td>inAnspruchGenommeneAckerflaecheZuPruefen</td>
<td>In Anspruch genommene Ackerfläche</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nutzungsbereich</td>
<td>Vorrangige Nutzung des in Anspruch genommenen Gebäudes</td>
<td><a href="#nutzungsbereichenum">NutzungsbereichEnum</a></td>
<td>Nein</td>
<td>Industrie</td>
</tr>
<tr>
<td>nutzungsbereichZuPruefen</td>
<td>Vorrangige Nutzung des in Anspruch genommenen Gebäudes (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInanspruchnahmeZahlungNachEeg</td>
<td>Werden oder wurden für die Solaranlage Zahlungen des Netzbetreibers in Anspruch genommen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegInanspruchnahmeZahlungNachEegZuPruefen</td>
<td>Werden oder wurden für die Solaranlage Zahlungen des Netzbetreibers in Anspruch genommen? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>B354453</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregisterZuPruefen</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>eegInstallierteLeistungZuPruefen</td>
<td>Installierte Nettonennleistung der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegRegistrierungsnummerPvMeldeportal</td>
<td>Durch die Bundesagentur vergebene Nummer bei der Registrierung im PV-Meldeportal</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>ASO-123445</td>
</tr>
<tr>
<td>eegRegistrierungsnummerPvMeldeportalZuPruefen</td>
<td>Durch die Bundesagentur vergebene Nummer bei der Registrierung im PV-Meldeportal (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegMieterstromZugeordnet</td>
<td>Gibt an, ob die Solaranlage der Veräußerungsform des Mieterstromzuschlags zugeordnet wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegMieterstromZugeordnetZuPruefen</td>
<td>Gibt an, ob die Solaranlage der Veräußerungsform des Mieterstromzuschlags zugeordnet wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegMieterstromRegistrierungsdatum</td>
<td>Datum, an dem die Anlage erstmalig der Veräußerungsform des Mieterstromzuschlags zugeordnet worden ist.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>eegMieterstromRegistrierungsdatumZuPruefen</td>
<td>Datum, an dem die Anlage erstmalig der Veräußerungsform des Mieterstromzuschlags zugeordnet worden ist. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegMieterstromErsteZuordnungZuschlag</td>
<td>Datum, an dem die Anlage erstmalig der Veräußerungsform des Mieterstromzuschlags zugeordnet worden ist.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>eegMieterstromErsteZuordnungZuschlagZuPruefen</td>
<td>Datum, an dem die Anlage erstmalig der Veräußerungsform des Mieterstromzuschlags zugeordnet worden ist. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegAusschreibungZuschlagZuPruefen</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegZuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>eegZuschlagsnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegZugeordneteGebotsmenge</td>
<td>Bezuschlagte Gebotsmenge, die der EEG-Anlage zugeordnet wurde</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>eegZugeordneteGebotsmengeZuPruefen</td>
<td>Bezuschlagte Gebotsmenge, die der EEG-Anlage zugeordnet wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Buergerenergie</td>
<td>Bürgerenergieeigenschaft der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BuergerenergieZuPruefen</td>
<td>Bürgerenergieeigenschaft der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitBiomasse

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Bioweltreaktor 2354</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>Inselbetriebsfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegungZuPruefen</td>
<td>Beginn der vorläufigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetriebZuPruefen</td>
<td>Datum der Wiederaufnahme des Betriebs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hauptbrennstoff</td>
<td>Welcher Einsatzstoff oder Brennstoff wird hauptsächlich benutzt</td>
<td><a href="#biomassebrennstoffenum">BiomasseBrennstoffEnum</a></td>
<td>Nein</td>
<td>Rinde</td>
</tr>
<tr>
<td>hauptbrennstoffZuPruefen</td>
<td>Welcher Einsatzstoff oder Brennstoff wird hauptsächlich benutzt (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Stromerzeugung</td>
<td><a href="#technologieverbrennungsanlageenum">TechnologieVerbrennungsanlageEnum</a></td>
<td>Nein</td>
<td>KalinaCycle</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Technologie der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilEEGAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilEEGAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>MaStR-Nummer der verknüpften EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>B354453</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregisterZuPruefen</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>eegInstallierteLeistungZuPruefen</td>
<td>Installierte Nettonennleistung der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAusschliesslicheVerwendungBiomasse</td>
<td>Ausschließliche Verwendung von Biomasse im Sinne der Biomasse-Verordnung</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegAusschliesslicheVerwendungBiomasseZuPruefen</td>
<td>Ausschließliche Verwendung von Biomasse im Sinne der Biomasse-Verordnung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegAusschreibungZuschlagZuPruefen</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasZuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>eegBiogasZuschlagsnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasInanspruchnahmeFlexiPraemie</td>
<td>Angabe ob für die Anlage Flexibilitätsprämie in anspruch genommen wird</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegBiogasInanspruchnahmeFlexiPraemieZuPruefen</td>
<td>Angabe, ob für die Anlage Flexibilitätsprämie in anspruch genommen wird (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasDatumInanspruchnahmeFlexiPraemie</td>
<td>Datum der erstmaligen Inanspruchnahme der Flexibilitätsprämie</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>eegBiogasDatumInanspruchnahmeFlexiPraemieZuPruefen</td>
<td>Datum der erstmaligen Inanspruchnahme der Flexibilitätsprämie (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasLeistungserhoehung</td>
<td>Angabe, ob die Leistung der Anlage im Zusammenhang mit der Flexibilitätsprämie erhöht wird</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegBiogasLeistungserhoehungZuPruefen</td>
<td>Angabe, ob die Leistung der Anlage im Zusammenhang mit der Flexibilitätsprämie erhöht wird (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasDatumLeistungserhoehung</td>
<td>Datum der Inbetriebnahme der Leistungserhöhung</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>eegBiogasDatumLeistungserhoehungZuPruefen</td>
<td>Datum der Inbetriebnahme der Leistungserhöhung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasUmfangLeistungserhoehung</td>
<td>Umfang der Leistungserhöhung bei dieser Biogas-Anlage nach dem 31.07.2014</td>
<td>decimal</td>
<td>Nein</td>
<td>125.987</td>
</tr>
<tr>
<td>eegBiogasUmfangLeistungserhoehungZuPruefen</td>
<td>Umfang der Leistungserhöhung bei dieser Biogas-Anlage nach dem 31.07.2014 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasGaserzeugungskapazitaet</td>
<td>Leistungsangabe: Kapazität an Gas, das erzeugt werden kann. Gasproduktions-kapazität nach Genehmig-ungsbescheid, bzw. anhand der eingesetzten Inputstoffe.</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Nein</td>
<td>241.369</td>
</tr>
<tr>
<td>eegBiogasGaserzeugungskapazitaetZuPruefen</td>
<td>Leistungsangabe: Kapazität an Gas, das erzeugt werden kann. Gasproduktions-kapazität nach Genehmig-ungsbescheid, bzw. anhand der eingesetzten Inputstoffe. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegHoechstbemessungsleistung</td>
<td>Höchstbemessungsleistung der Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>785.987</td>
</tr>
<tr>
<td>eegHoechstbemessungsleistungZuPruefen</td>
<td>Höchste Bemessungsleistung der Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiomethanErstmaligerEinsatz</td>
<td>Datum des erstmaligen ausschließlichen Einsatzes von Biomethan</td>
<td><a href="#erweitertesdate">ErweitertesDate</a></td>
<td>Nein</td>
<td>14.12.2013</td>
</tr>
<tr>
<td>eegBiomethanErstmaligerEinsatzZuPruefen</td>
<td>Datum des erstmaligen ausschließlichen Einsatzes von Biomethan (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilKWKAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilKWKAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>kwkMastrNummer</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Nein</td>
<td>KWK91234567890</td>
</tr>
<tr>
<td>kwkMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlag</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt?</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlagZuPruefen</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkZuschlagnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer.</td>
<td>string</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkZuschlagnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der KWK-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2018-01-01</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkThermischeNutzleistung</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>12.54</td>
</tr>
<tr>
<td>kwkThermischeNutzleistungZuPruefen</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistung</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>41.45</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistungZuPruefen</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitWasser

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Bioweltreaktor 2354</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>Inselbetriebsfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameKraftwerk</td>
<td>Name des Kraftwerks</td>
<td>string</td>
<td>Nein</td>
<td>Wasserpark 2</td>
</tr>
<tr>
<td>nameKraftwerkZuPruefen</td>
<td>Name des Kraftwerks (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AnzeigeEinerStilllegung</td>
<td>Anzeige einer Stilllegung nach §13b Abs.1 Satz 1</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AnzeigeEinerStilllegungZuPruefen</td>
<td>Anzeige einer Stilllegung nach §13b Abs.1 Satz 1 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ArtDerStilllegung</td>
<td>Art der Stilllegung nach §13b</td>
<td><a href="#artderstilllegungenum">ArtDerStilllegungEnum</a></td>
<td>Nein</td>
<td>Vorlaeufig</td>
</tr>
<tr>
<td>ArtDerStilllegungZuPruefen</td>
<td>Art der Stilllegung nach §13b (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumBeginnVorlaeufigenOderEndgueltigenStilllegung</td>
<td>Beginn der vorläufigen oder endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>DatumBeginnVorlaeufigenOderEndgueltigenStilllegungZuPruefen</td>
<td>Beginn der vorläufigen oder endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumBeendigungVorlaeufigenStilllegung</td>
<td>Beendigung der vorläufigen Stilllegung nach §13b</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>DatumBeendigungVorlaeufigenStilllegungZuPruefen</td>
<td>Beendigung der vorläufigen Stilllegung nach §13b (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetriebZuPruefen</td>
<td>Datum der Wiederaufnahme des Betriebs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>artDerWasserkraftanlage</td>
<td>Art der Stromerzeugung aus Wasserkraft</td>
<td><a href="#artderwasserkraftanlageenum">ArtDerWasserkraftanlageEnum</a></td>
<td>Nein</td>
<td>Meeresenergie</td>
</tr>
<tr>
<td>artDerWasserkraftanlageZuPruefen</td>
<td>Art der Stromerzeugung aus Wasserkraft (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>minderungStromerzeugung</td>
<td>Auflagen, die zur Minderung der Stromerzeugung führen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>minderungStromerzeugungZuPruefen</td>
<td>Auflagen, die zur Minderung der Stromerzeugung führen? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerk</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerkZuPruefen</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistungDeutschland</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>458.145</td>
</tr>
<tr>
<td>nettonennleistungDeutschlandZuPruefen</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>artDesZuflusses</td>
<td>Welche Art von Zufluss wird zur Stromerzeugung verwendet</td>
<td><a href="#zuflussartenum">ZuflussartEnum</a></td>
<td>Nein</td>
<td>Flusskraftwerk</td>
</tr>
<tr>
<td>artDesZuflussesZuPruefen</td>
<td>Welche Art von Zufluss wird zur Stromerzeugung verwendet (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilEEGAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilEEGAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>MaStR-Nummer der verknüpften-EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften-EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>B354453</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregisterZuPruefen</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>eegInstallierteLeistungZuPruefen</td>
<td>Installierte Nettonennleistung der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitGeothermieGrubengasDruckentspannung

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Bioweltreaktor 2354</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>Inselbetriebsfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Stromerzeugung</td>
<td><a href="#technologieverbrennungsanlageenum">TechnologieVerbrennungsanlageEnum</a></td>
<td>Nein</td>
<td>Stirlingmotor</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Technologie der Stromerzeugung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilEEGAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilEEGAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>MaStR-Nummer der verknüpften EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregister</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>B354453</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregisterZuPruefen</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregister (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>eegInstallierteLeistungZuPruefen</td>
<td>Installierte Nettonennleistung der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilKWKAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilKWKAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>kwkMastrNummer</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Nein</td>
<td>KWK91234567890</td>
</tr>
<tr>
<td>kwkMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlag</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt?</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlagZuPruefen</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkZuschlagnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer.</td>
<td>string</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkZuschlagnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der KWK-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2018-01-01</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkThermischeNutzleistung</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>12.54</td>
</tr>
<tr>
<td>kwkThermischeNutzleistungZuPruefen</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistung</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>41.45</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistungZuPruefen</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitVerbrennung

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Bioweltreaktor 2354</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Einheit ist für die Vorhaltung und Erbringung von Regelenergie präqualifiziert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>Inselbetriebsfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameKraftwerk</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist.</td>
<td>string</td>
<td>Nein</td>
<td>Braunkohle Power Holstein 2</td>
</tr>
<tr>
<td>nameKraftwerkZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameKraftwerksblock</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist.</td>
<td>string</td>
<td>Nein</td>
<td>Süd 2</td>
</tr>
<tr>
<td>nameKraftwerksblockZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AnzeigeEinerStilllegung</td>
<td>Anzeige einer Stilllegung nach §13b Abs.1 Satz 1</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AnzeigeEinerStilllegungZuPruefen</td>
<td>Anzeige einer Stilllegung nach §13b Abs.1 Satz 1 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ArtDerStilllegung</td>
<td>Art der Stilllegung nach §13b</td>
<td><a href="#artderstilllegungenum">ArtDerStilllegungEnum</a></td>
<td>Nein</td>
<td>Vorlaeufig</td>
</tr>
<tr>
<td>ArtDerStilllegungZuPruefen</td>
<td>Art der Stilllegung nach §13b (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumBaubeginn</td>
<td>Tatsächlicher bzw. geplanter Spatenstich auf der Baustelle</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>datumBaubeginnZuPruefen</td>
<td>Tatsächlicher bzw. geplanter Spatenstich auf der Baustelle (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegungZuPruefen</td>
<td>Beginn der vorläufigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumBeendigungVorlaeufigenStilllegung</td>
<td>Beendigung der vorläufigen Stilllegung nach §13b</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>DatumBeendigungVorlaeufigenStilllegungZuPruefen</td>
<td>Beendigung der vorläufigen Stilllegung nach §13b (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>steigerungNettonennleistungKombibetrieb</td>
<td>Steigerung der Nettonennleistung durch Kombibetrieb</td>
<td>decimal</td>
<td>Nein</td>
<td>512.147</td>
</tr>
<tr>
<td>steigerungNettonennleistungKombibetriebZuPruefen</td>
<td>Steigerung der Nettonennleistung durch Kombibetrieb (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>anlageIstImKombibetrieb</td>
<td>Angabe ob die Stromerzeugungseinheit im Kombibetrieb betrieben wird</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>anlageIstImKombibetriebZuPruefen</td>
<td>Angabe ob die Stromerzeugungseinheit im Kombibetrieb betrieben wird (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>mastrNummernKombibetrieb</td>
<td>MaStR-Nummern der Einheiten im Kombibetrieb</td>
<td>string</td>
<td>Nein</td>
<td>SEE91234567890; SEE99876543210</td>
</tr>
<tr>
<td>mastrNummernKombibetriebZuPruefen</td>
<td>MaStR-Nummern der Einheiten im Kombibetrieb (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>netzreserveAbDatum</td>
<td>Datum der Überführung der Stromerzeugungseinheit in die Netzreserve.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>netzreserveAbDatumZuPruefen</td>
<td>Datum der Überführung der Stromerzeugungseinheit in die Netzreserve. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>sicherheitsbereitschaftAbDatum</td>
<td>Datum des Beginns der vorläufigen Stilllegung mit Übergang in die Sicherheitsbereitschaft</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>sicherheitsbereitschaftAbDatumZuPruefen</td>
<td>Datum des Beginns der vorläufigen Stilllegung mit Übergang in die Sicherheitsbereitschaft (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>energietraeger</td>
<td>Energieträger</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Nein</td>
<td>Steinkohle</td>
</tr>
<tr>
<td>energietraegerZuPruefen</td>
<td>Energieträger (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hauptbrennstoff</td>
<td>Hauptbrennstoff</td>
<td><a href="#verbrennungbrennstoffenum">VerbrennungBrennstoffEnum</a></td>
<td>Nein</td>
<td>Fluessiggas</td>
</tr>
<tr>
<td>hauptbrennstoffZuPruefen</td>
<td>Hauptbrennstoff (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weitererHauptbrennstoff</td>
<td>Weiterer Hauptbrennstoff</td>
<td><a href="#erweiterterweiterebrennstoffe">ErweiterterWeitereBrennstoffe</a></td>
<td>Nein</td>
<td>Kokereigas</td>
</tr>
<tr>
<td>weitererHauptbrennstoffZuPruefen</td>
<td>Weiterer Hauptbrennstoff (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weitereBrennstoffe</td>
<td>Weitere Brennstoffe</td>
<td><a href="#erweiterteweiterebrennstoffe">ErweiterteWeitereBrennstoffe</a></td>
<td>Nein</td>
<td>Dieselkraftstoff</td>
</tr>
<tr>
<td>weitereBrennstoffeZuPruefen</td>
<td>Weitere Brennstoffe (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>verknuepfteErzeugungseinheiten[]</td>
<td>Liste von MaStR Nummern mit den verknüpften Stromerzeugern</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>SEE91234567890 Verbrennung</td>
</tr>
<tr>
<td>verknuepfteErzeugungseinheitenZuPruefen</td>
<td>Liste von MaStR Nummern mit den verknüpften Stromerzeugern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerk</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerkZuPruefen</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistungDeutschland</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>458.145</td>
</tr>
<tr>
<td>nettonennleistungDeutschlandZuPruefen</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>anteiligNutzungsberechtigte</td>
<td>Namen und die Adresse der Letztverbraucher an, die ein anteiliges vertragliches Nutzungsrecht an einer bestimmten Erzeugungskapazität dieser Stromerzeugungseinheit gemäß § 104 Absatz 4 EEG wie eine eigenständige Erzeugungseinheit betreiben.</td>
<td>string</td>
<td>Nein</td>
<td>Strom Deutschland AG, Strasse 4 54784 Köln, Strom
                  Westfeld GmbH Weg 4 23541 Vorort</td>
</tr>
<tr>
<td>anteiligNutzungsberechtigteZuPruefen</td>
<td>Namen und die Adresse der Letztverbraucher an, die ein anteiliges vertragliches Nutzungsrecht an einer bestimmten Erzeugungskapazität dieser Stromerzeugungseinheit gemäß § 104 Absatz 4 EEG wie eine eigenständige Erzeugungseinheit betreiben. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>notstromaggregat</td>
<td>Angabe ob die Stromerzeugungseinheit zur Versorgung bei Stromnetzstörungen dient (Notstromaggregat)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>notstromaggregatZuPruefen</td>
<td>Angabe ob die Stromerzeugungseinheit zur Versorgung bei Stromnetzstörungen dient (Notstromaggregat) (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Stromerzeugung</td>
<td><a href="#technologieverbrennungsanlageenum">TechnologieVerbrennungsanlageEnum</a></td>
<td>Nein</td>
<td>Dampfmotor</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Technologie der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzort</td>
<td>An welchem Einsatzort wird die Stromerzeugungseinheit als Notstromaggregat betrieben</td>
<td><a href="#einsatzortenum">EinsatzortEnum</a></td>
<td>Nein</td>
<td>Hotel</td>
</tr>
<tr>
<td>einsatzortZuPruefen</td>
<td>An welchem Einsatzort wird die Stromerzeugungseinheit als Notstromaggregat betrieben (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilKWKAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilKWKAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>kwkMastrNummer</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Nein</td>
<td>KWK91234567890</td>
</tr>
<tr>
<td>kwkMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlag</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt?</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlagZuPruefen</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkZuschlagnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer.</td>
<td>string</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkZuschlagnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der KWK-Anlage</td>
<td>date</td>
<td>Nein</td>
<td> 2018-01-01</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkThermischeNutzleistung</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>12.54</td>
</tr>
<tr>
<td>kwkThermischeNutzleistungZuPruefen</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistung</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>41.45</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistungZuPruefen</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AusschliesslicheVerwendungImKombibetrieb</td>
<td>Angabe, dass die Einheit ausschließlich im Kombibetrieb betrieben wird</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AusschliesslicheVerwendungImKombibetriebZuPruefen</td>
<td>Angabe, dass die Einheit ausschließlich im Kombibetrieb betrieben wird (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitGasSpeicher

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>speichername</td>
<td>Name des Speicher</td>
<td>string</td>
<td>Nein</td>
<td>Fernspeicher XCY 2</td>
</tr>
<tr>
<td>speichernameZuPruefen</td>
<td>Name des Speicher (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>speicherart</td>
<td>Art der Gasspeicherung</td>
<td><a href="#gasspeicherartenum">GasSpeicherartEnum</a></td>
<td>Nein</td>
<td>Kavernenspeicher</td>
</tr>
<tr>
<td>speicherartZuPruefen</td>
<td>Art der Gasspeicherung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>maximalNutzbaresArbeitsgasvolumen</td>
<td>Maximal nutzbares Arbeitsgasvolumen</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>maximalNutzbaresArbeitsgasvolumenZuPruefen</td>
<td>Maximal nutzbares Arbeitsgasvolumen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>maximaleEinspeicherleistung</td>
<td>Maximale Einspeicherleistung</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>maximaleEinspeicherleistungZuPruefen</td>
<td>Maximale Einspeicherleistung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>maximaleAusspeicherleistung</td>
<td>Maximale Ausspeicherleistung</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>maximaleAusspeicherleistungZuPruefen</td>
<td>Maximale Ausspeicherleistung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>durchschnittlicherBrennwert</td>
<td>Durchschnittlicher Brennwert des Gas im Speicher</td>
<td>decimal</td>
<td>Nein</td>
<td>11.10</td>
</tr>
<tr>
<td>durchschnittlicherBrennwertZuPruefen</td>
<td>Durchschnittlicher Brennwert des Gas im Speicher (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>speGasSpeicheranlage</td>
<td>Liste von MaStR Nummern mit den verknüpften Gasspeichern</td>
<td><a href="#gasspeichermastrnummerid">GasSpeicherMastrNummerId</a></td>
<td>Nein</td>
<td>GSA9123456789</td>
</tr>
<tr>
<td>speGasSpeicheranlageZuPruefen</td>
<td>Liste von MaStR Nummern mit den verknüpften Gasspeichern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitStromVerbraucher

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>NameStromverbrauchseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromverbrauchseinheit</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>NameStromverbrauchseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromverbrauchseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>anzahlStromverbrauchseinheitenGroesser50Mw</td>
<td>Anzahl angeschlossener Stromverbrauchseinheiten größer 50 MW</td>
<td>int</td>
<td>Nein</td>
<td>23</td>
</tr>
<tr>
<td>anzahlStromverbrauchseinheitenGroesser50MwZuPruefen</td>
<td>Anzahl angeschlossener Stromverbrauchseinheiten größer 50 MW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitGasErzeuger

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Gaserzeugung</td>
<td><a href="#technologiegaserzeugungenum">TechnologieGasErzeugungEnum</a></td>
<td>Nein</td>
<td>LiquifidNaturalGas</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Verwendete Technologie (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>erzeugungsleistung</td>
<td>Leistung der Gaserzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>125.987</td>
</tr>
<tr>
<td>erzeugungsleistungZuPruefen</td>
<td>Leistung der Gaserzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitGasVerbraucher

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>maximaleGasbezugsleistung</td>
<td>Maximale Gasbezugsleistung zur Stromerzeugung</td>
<td>decimal</td>
<td>Nein</td>
<td>147.984</td>
</tr>
<tr>
<td>maximaleGasbezugsleistungZuPruefen</td>
<td>Maximale Gasbezugsleistung zur Stromerzeugung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitDientDerStromerzeugung</td>
<td>Angabe ob die Gasverbrauchseinheit zur Stromerzeugung dient (Gaskraftwerk)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>einheitDientDerStromerzeugungZuPruefen</td>
<td>Angabe ob die Gasverbrauchseinheit zur Stromerzeugung dient (Gaskraftwerk) (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## SetKorrekturVorschlagEinheitStromSpeicher

Diese Funktion ermöglicht dem Netzbetreiber einen Vorschlag zur Datenänderung, im Rahmen einer Datenkorrekturaufforderung, an den Anlagenbetreiber zu übermitteln. Der Netzbetreiber ändert die Werte in dem Objekt ab, welche nach seiner Kenntnis fehlerhaft sind, und sendet das Objekt als Antwort über diese Funktion. Der Vorschlag muss anschließend mit der Funktion „SetDatenkorrekturErforderlich“ übermittelt werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Optional: Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung. Leer = neuer Vorschlag, gefüllt = Update eines bestehenden Vorschlags</td>
<td>int</td>
<td>Nein</td>
<td>1323545</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung fürden Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>1</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geographischeLage</td>
<td>Angabe der Korrekturdaten für die geographische Lage (nur eine der Unterstrukturen darf befüllt werden)</td>
<td><a href="#korrekturdatengeographischelage">KorrekturdatenGeographischeLage</a></td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Turbine 2</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie des Stromspeichers</td>
<td><a href="#technologiespeicherenum">TechnologieSpeicherEnum</a></td>
<td>Nein</td>
<td>Batterie</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Technologie der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>Inselbetriebsfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>acDcKoppelung</td>
<td>AC oder DC gekoppeltes System</td>
<td><a href="#systemkopplungenum">SystemkopplungEnum</a></td>
<td>Nein</td>
<td>ACgekoppeltesSystem</td>
</tr>
<tr>
<td>acDcKoppelungZuPruefen</td>
<td>AC oder DC gekoppeltes System (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>batterietechnologie</td>
<td>Batterietechnologie</td>
<td><a href="#batterietechnologieenum">BatterieTechnologieEnum</a></td>
<td>Nein</td>
<td>BleiSaeureBatterie</td>
</tr>
<tr>
<td>batterietechnologieZuPruefen</td>
<td>Batterietechnologie (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Präqualifiziert für Regelenergie?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Präqualifiziert für Regelenergie? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>pumpbetriebLeistungsaufnahme</td>
<td>Höchste elektrische Dauerleistung, die dem Netz für den Pumpbetrieb unter Nennbedingungen entnommen werden kann</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>pumpbetriebLeistungsaufnahmeZuPruefen</td>
<td>Höchste elektrische Dauerleistung, die dem Netz für den Pumpbetrieb unter Nennbedingungen entnommen werden kann (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>pumpbetriebKontinuierlichRegelbar</td>
<td>Die Wasserkraftanlage ist im Pumpbetrieb kontinuierlich regelbar</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>pumpbetriebKontinuierlichRegelbarZuPruefen</td>
<td>Die Wasserkraftanlage ist im Pumpbetrieb kontinuierlich regelbar (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Pumpspeichertechnologie</td>
<td>Technologie des Pumpspeichers</td>
<td><a href="#pumpspeichertechnologieenum">PumpspeichertechnologieEnum</a></td>
<td>Nein</td>
<td>PumpspeicheranlageMitNatuerlichemZufluss</td>
</tr>
<tr>
<td>PumpspeichertechnologieZuPruefen</td>
<td>Technologie des Pumpspeichers (Prüfungsflag)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerk</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerkZuPruefen</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistungDeutschland</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>458.145</td>
</tr>
<tr>
<td>nettonennleistungDeutschlandZuPruefen</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>notstromaggregat</td>
<td>Angabe ob die Stromerzeugungseinheit zur Versorgung bei Stromnetzstörungen dient (Notstromaggregat)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>notstromaggregatZuPruefen</td>
<td>Angabe ob die Stromerzeugungseinheit zur Versorgung bei Stromnetzstörungen dient (Notstromaggregat) (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzort</td>
<td>An welchem Einsatzort wird die Stromerzeugungseinheit als Notstromaggregat betrieben</td>
<td><a href="#einsatzortenum">EinsatzortEnum</a></td>
<td>Nein</td>
<td>Hotel</td>
</tr>
<tr>
<td>einsatzortZuPruefen</td>
<td>An welchem Einsatzort wird die Stromerzeugungseinheit als Notstromaggregat betrieben (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>zugeordnenteWirkleistungWechselrichter</td>
<td>Zugeordnente Wirkleistung des/der Wechselrichter</td>
<td>decimal</td>
<td>Nein</td>
<td>125.587</td>
</tr>
<tr>
<td>zugeordnenteWirkleistungWechselrichterZuPruefen</td>
<td>Zugeordnente Wirkleistung des/der Wechselrichter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>speNutzbareSpeicherkapazitaet</td>
<td>Nutzbare Speicherkapazität</td>
<td>decimal</td>
<td>Nein</td>
<td>478.251</td>
</tr>
<tr>
<td>speNutzbareSpeicherkapazitaetZuPruefen</td>
<td>Nutzbare Speicherkapazität (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilEEGAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilEEGAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegZuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>eegZuschlagsnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegAusschreibungZuschlagZuPruefen</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitWind

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Turbine 2</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Präqualifiziert für Regelenergie?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Präqualifiziert für Regelenergie? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>(Prüfungskennzeichen)Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameWindpark</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Windparks, dessen Teil die Einheit ist</td>
<td>string</td>
<td>Nein</td>
<td>Windpark II - Felddorf</td>
</tr>
<tr>
<td>nameWindparkZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Windparks, dessen Teil die Einheit ist (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>lage</td>
<td>Angabe, ob die Stromerzeugungseinheit an Land oder auf See errichtet wurde</td>
<td><a href="#windlageenum">WindLageEnum</a></td>
<td>Nein</td>
<td>WindAnLand</td>
</tr>
<tr>
<td>lageZuPruefen</td>
<td>Angabe, ob die Stromerzeugungseinheit an Land oder auf See errichtet wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>seelage</td>
<td>Wird die Windenergieanlage in der Nordsee oder in der Ostsee betrieben?</td>
<td><a href="#seelageenum">SeelageEnum</a></td>
<td>Nein</td>
<td>Ostsee</td>
</tr>
<tr>
<td>seelageZuPruefen</td>
<td>Wird die Windenergieanlage in der Nordsee oder in der Ostsee betrieben? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>clusterOstsee</td>
<td>.</td>
<td><a href="#clusterostseeenum">ClusterOstseeEnum</a></td>
<td>Nein</td>
<td>II</td>
</tr>
<tr>
<td>clusterOsteseeZuPruefen</td>
<td>. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>clusterNordsee</td>
<td>.</td>
<td><a href="#clusternordseeenum">ClusterNordseeEnum</a></td>
<td>Nein</td>
<td>III</td>
</tr>
<tr>
<td>clusterNordseeZuPruefen</td>
<td>. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Stromerzeugung: Horizontalläufer oder Vertikalläufer</td>
<td><a href="#windanlagetechnologieenum">WindanlageTechnologieEnum</a></td>
<td>Nein</td>
<td>Vertikallaeufer</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Technologie der Stromerzeugung: Horizontalläufer oder Vertikalläufer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>herstellerId</td>
<td>Id des Herstellers der Einheit</td>
<td><a href="#katalogwertid">KatalogwertId</a></td>
<td>Nein</td>
<td>345</td>
</tr>
<tr>
<td>herstellerIdZuPruefen</td>
<td>Id des Herstellers der Einheit(Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>typenbezeichnung</td>
<td>Typenbezeichnung der Einheit</td>
<td>string</td>
<td>Nein</td>
<td>Wind FX2</td>
</tr>
<tr>
<td>typenbezeichnungZuPruefen</td>
<td>Typenbezeichnung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nabenhoehe</td>
<td>Die Nabenhöhe der Erzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>12.987</td>
</tr>
<tr>
<td>nabenhoeheZuPruefen</td>
<td>Die Nabenhöhe der Erzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>rotordurchmesser</td>
<td>Die Rotordurchmesser der Erzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>35.989</td>
</tr>
<tr>
<td>rotordurchmesserZuPruefen</td>
<td>Die Rotordurchmesser der Erzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Rotorblattenteisungssystem</td>
<td>Ein Rotorblattenteisungssystem, auch als Rotorblattenteisungsanlage bezeichnet, ist eine Vorrichtung, die dazu dient, die Rotorblätter von Windkraftanlagen eisfrei zu halten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>RotorblattenteisungssystemZuPruefen</td>
<td>Ein Rotorblattenteisungssystem, auch als Rotorblattenteisungsanlage bezeichnet, ist eine Vorrichtung, die dazu dient, die Rotorblätter von Windkraftanlagen eisfrei zu halten (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hoehe</td>
<td>Höhe der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>123.784</td>
</tr>
<tr>
<td>hoeheZuPruefen</td>
<td>Höhe der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>auflageAbschaltungLeistungsbegrenzung</td>
<td>Auflagen zu Abschaltungen oder Leistungsbegrenzungen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>auflageAbschaltungLeistungsbegrenzungZuPruefen</td>
<td>Auflagen zu Abschaltungen oder Leistungsbegrenzungen? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchallimmissionsschutzNachts</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schallimmissionsschutz in der Nacht bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchallimmissionsschutzNachtsZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schallimmissionsschutz in der Nacht bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchallimmissionsschutzTagsueber</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schallimmissionsschutz tagsüber bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchallimmissionsschutzTagsueberZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schallimmissionsschutz tagsüber bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchattenwurf</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schattenwurf bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSchattenwurfZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Schattenwurf bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungTierschutz</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Tierschutz bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungTierschutzZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Tierschutz bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungEiswurf</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Eiswurf bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungEiswurfZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von Eiswurf bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSonstige</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von sonstigen Gründen bestehen</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AuflagenAbschaltungSonstigeZuPruefen</td>
<td>Angabe, ob Auflagen zur Abschaltung auf Grund von sonstigen Gründen bestehen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>wassertiefe</td>
<td>Wassertiefe am Standort der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>140.123</td>
</tr>
<tr>
<td>wassertiefeZuPruefen</td>
<td>Wassertiefe am Standort der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kuestenentfernung</td>
<td>Küstenentfernung des Standorts der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>147.254</td>
</tr>
<tr>
<td>kuestenentfernungZuPruefen</td>
<td>Küstenentfernung des Standorts der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenschluessel</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>E2325426</td>
</tr>
<tr>
<td>eegAnlagenschluesselZuPruefen</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>MaStR-Nummer der zugeordneten EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegMastrNummerZuPruefen</td>
<td>MaStR-Nummer der zugeordneten EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegPrototypAnlage</td>
<td>Die Windenergieanlage ist als Prototyp zertifiziert.</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegPrototypAnlageZuPruefen</td>
<td>Die Windenergieanlage ist als Prototyp zertifiziert. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegPilotAnlage</td>
<td>Die Windenergieanlage ist eine Pilotwindanlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegPilotAnlageZuPruefen</td>
<td>Die Windenergieanlage ist eine Pilotwindanlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>eegInstallierteLeistungZuPruefen</td>
<td>Installierte Nettonennleistung der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegVerhaeltnisErtragsschaetzungReferenzertrag</td>
<td>Verhältnis der Ertragseinschätzung zum Referenzertrag ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Ja</td>
<td>47.954</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtragZuPruefen</td>
<td>Verhältnis der Ertragseinschätzung zum Referenzertrag ermittelt nach Anlage 2 des EEG (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag5Jahre</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 5 Jahren ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Ja</td>
<td>51.254</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag5JahreZuPruefen</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 5 Jahren ermittelt nach Anlage 2 des EEG (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag10Jahre</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 10 Jahren ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Ja</td>
<td>57.54</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag10JahreZuPruefen</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 10 Jahren ermittelt nach Anlage 2 des EEG (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag15Jahre</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 15 Jahren ermittelt nach Anlage 2 des EEG</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Ja</td>
<td>87.45</td>
</tr>
<tr>
<td>eegVerhaeltnisReferenzertragErtrag15JahreZuPruefen</td>
<td>Verhältnis des Ertrags zum Referenzertrag nach Ablauf des Referenzzeitraums von 15 Jahren ermittelt nach Anlage 2 des EEG (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegAusschreibungZuschlagZuPruefen</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegZuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>eegZuschlagsnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Buergerenergie</td>
<td>Bürgerenergieeigenschaft der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BuergerenergieZuPruefen</td>
<td>Bürgerenergieeigenschaft der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Nachtkennzeichen</td>
<td>Nachtkennzeichen der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>NachtkennzeichenZuPruefen</td>
<td>Nachtkennzeichen der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitAnlagenbetreiber

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>korrekturVorschlagMarktakteur</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Eine Beschreibung für den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>Personenart</td>
<td>Angabe der Personenart des Marktakteurs: natürliche Person oder Organisation</td>
<td><a href="#personenartenum">PersonenartEnum</a></td>
<td>Nein</td>
<td>Organisation</td>
</tr>
<tr>
<td>PersonenartZuPruefen</td>
<td>Angabe der Personenart des Marktakteurs: natürliche Person oder Organisation (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Firmenname</td>
<td>Name der Firma mit dem rechtsformergänzenden Namenszusatz</td>
<td>string</td>
<td>Nein</td>
<td>Stromnetz Land AG</td>
</tr>
<tr>
<td>FirmennameZuPruefen</td>
<td>Name der Firma mit dem rechtsformergänzenden Namenszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>RechtsformId</td>
<td>Id der Rechtsform des Marktakteurs</td>
<td><a href="#katalogwertid">KatalogwertId</a></td>
<td>Nein</td>
<td>345</td>
</tr>
<tr>
<td>RechtsformIdZuPruefen</td>
<td>Id der Rechtsform des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>SonstigeRechtsform</td>
<td>Rechtsform des Marktakteurs wenn 'Sonstiges' gewählt wurde</td>
<td>string</td>
<td>Nein</td>
<td>SW</td>
</tr>
<tr>
<td>SonstigeRechtsformZuPruefen</td>
<td>Rechtsform des Marktakteurs wenn 'Sonstiges' gewählt wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Anrede</td>
<td>Anrede der natürlichen Person</td>
<td><a href="#salutationenum">SalutationEnum</a></td>
<td>Nein</td>
<td>Herr</td>
</tr>
<tr>
<td>AnredeZuPruefen</td>
<td>Anrede der natürlichen Person (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Titel</td>
<td>Titel der natürlichen Person</td>
<td><a href="#titelenum">TitelEnum</a></td>
<td>Nein</td>
<td>Dr</td>
</tr>
<tr>
<td>TitelZuPruefen</td>
<td>Titel der natürlichen Person (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Vorname</td>
<td>Vorname der natürlichen Person</td>
<td>string</td>
<td>Nein</td>
<td>Max</td>
</tr>
<tr>
<td>VornameZuPruefen</td>
<td>Vorname der natürlichen Person (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Nachname</td>
<td>Name der natürlichen Person</td>
<td>string</td>
<td>Nein</td>
<td>Mustermann</td>
</tr>
<tr>
<td>NachnameZuPruefen</td>
<td>Name der natürlichen Person (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Geburtsdatum</td>
<td>Geburtsdatum der natürlichen Person</td>
<td>date</td>
<td>Nein</td>
<td>2000-07-25</td>
</tr>
<tr>
<td>GeburtsdatumZuPruefen</td>
<td>Geburtsdatum der natürlichen Person (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Die Postleitzahl, in deren Gebiet der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>1600</td>
</tr>
<tr>
<td>PostleitzahlZuPruefen</td>
<td>Die Postleitzahl, in deren Gebiet der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Strasse</td>
<td>Die Straße, in der der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Musterfrau-Str.</td>
</tr>
<tr>
<td>StrasseZuPruefen</td>
<td>Die Straße, in der der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>StrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Die Hausnummer, an der der Marktakteur seinen Sitz hat.</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>2</td>
</tr>
<tr>
<td>HausnummerZuPruefen</td>
<td>Die Hausnummer, an der der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>HausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Adresszusatz</td>
<td>Optionaler Zusatz zur Anschrift des Marktakteurs.</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>AdresszusatzZuPruefen</td>
<td>Optionaler Zusatz zur Anschrift des Marktakteurs. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Ort</td>
<td>Der Ort, in dem der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Wien</td>
</tr>
<tr>
<td>OrtZuPruefen</td>
<td>Der Ort, in dem der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Das Bundesland, in dem der Marktakteur seinen Sitz hat.</td>
<td><a href="#bundeslaenderenum">BundeslaenderEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>BundeslandZuPruefen</td>
<td>Das Bundesland, in dem der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Land</td>
<td>Das Land, in dem der Marktakteur seinen Sitz hat</td>
<td><a href="#landenum">LandEnum</a></td>
<td>Nein</td>
<td>Oesterreich</td>
</tr>
<tr>
<td>LandZuPruefen</td>
<td>Der Staat, in dem der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AdresseIstZustelladresse</td>
<td>Angabe ob an die angegebene Adresse Dokumente zugestellt werden können</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>AdresseIstZustelladresseZuPruefen</td>
<td>Angabe ob an die angegebene Adresse Dokumente zugestellt werden können(Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>ZustellPostleitzahl</td>
<td>Die Postleitzahl, in deren Gebiet der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>1600</td>
</tr>
<tr>
<td>ZustellPostleitzahlZuPruefen</td>
<td>Die Postleitzahl, in deren Gebiet der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellStrasse</td>
<td>Die Straße, in der der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Musterfrau-Str.</td>
</tr>
<tr>
<td>ZustellStrasseZuPruefen</td>
<td>Die Straße, in der der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellStrasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellHausnummer</td>
<td>Die Hausnummer, an der der Marktakteur seinen Sitz hat.</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>2</td>
</tr>
<tr>
<td>ZustellHausnummerZuPruefen</td>
<td>Die Hausnummer, an der der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellHausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellAdresszusatz</td>
<td>Optionaler Zusatz zur Anschrift des Marktakteurs.</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>ZustellAdresszusatzZuPruefen</td>
<td>Optionaler Zusatz zur Anschrift des Marktakteurs. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellOrt</td>
<td>Der Ort, in dem der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Wien</td>
</tr>
<tr>
<td>ZustellOrtZuPruefen</td>
<td>Der Ort, in dem der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ZustellLand</td>
<td>Das Land, in dem der Marktakteur seinen Sitz hat</td>
<td><a href="#landenum">LandEnum</a></td>
<td>Nein</td>
<td>Oesterreich</td>
</tr>
<tr>
<td>ZustellLandZuPruefen</td>
<td>Der Staat, in dem der Marktakteur seinen Sitz hat. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AbweichenderNameFirmenname</td>
<td>Abweichender Name/Firmenname</td>
<td>string</td>
<td>Nein</td>
<td>Stromnetz Land AG</td>
</tr>
<tr>
<td>AbweichenderNameFirmennameZuPruefen</td>
<td>Abweichender Name/Firmenname (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Email</td>
<td>E-Mail des Marktakteurs</td>
<td>string</td>
<td>Nein</td>
<td>mail@landstrom.ag</td>
</tr>
<tr>
<td>EmailZuPruefen</td>
<td>E-Mail des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Telefon</td>
<td>Telefonnummer des Marktakteurs</td>
<td>string</td>
<td>Nein</td>
<td>39111223344</td>
</tr>
<tr>
<td>TelefonZuPruefen</td>
<td>Telefonnummer des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Fax</td>
<td>Faxnummer des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>39111223355</td>
</tr>
<tr>
<td>FaxZuPruefen</td>
<td>Faxnummer des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Webseite</td>
<td>Internetadresse des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>www.landstrom.ag</td>
</tr>
<tr>
<td>WebseiteZuPruefen</td>
<td>Internetadresse des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ImHandelsregisterEingetragen</td>
<td>Angabe ob der Anlagenbetreiber im Handelsregister eingetragen ist</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>ImHandelsregisterEingetragenZuPruefen</td>
<td>Angabe ob der Anlagenbetreiber im Handelsregister eingetragen ist (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>RegistergerichtId</td>
<td>Angabe des Registergerichts, bei dem die Organisation registriert ist</td>
<td><a href="#erweiterterkatalogwertid">ErweiterterKatalogwertId</a></td>
<td>Nein</td>
<td>548</td>
</tr>
<tr>
<td>RegistergerichtIdZuPruefen</td>
<td>Angabe des Registergerichts, bei dem die Organisation registriert ist (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Registernummer</td>
<td>Registernummer des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>HRB 21016</td>
</tr>
<tr>
<td>RegisternummerZuPruefen</td>
<td>Registernummer des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>RegistergerichtAusland</td>
<td>Angabe des Registergerichts, bei dem die Organisation registriert ist, wenn im Ausland</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>Amtsgericht Luxemburg</td>
</tr>
<tr>
<td>RegistergerichtAuslandZuPruefen</td>
<td>Angabe des Registergerichts, bei dem die Organisation registriert ist (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>RegisternummerAusland</td>
<td>Registernummer des Marktakteurs, wenn im Ausland</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>XY 21016</td>
</tr>
<tr>
<td>RegisternummerAuslandZuPruefen</td>
<td>Registernummer des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Taetigkeitsbeginn</td>
<td>Tätigkeitsbeginn des Marktakteurs</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>TaetigkeitsbeginnZuPruefen</td>
<td>Tätigkeitsbeginn des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Taetigkeitsende</td>
<td>Tätigkeitsende des Marktakteurs</td>
<td><a href="#erweitertesdate">ErweitertesDate</a></td>
<td>Nein</td>
<td>2012-05-06</td>
</tr>
<tr>
<td>TaetigkeitsendeZuPruefen</td>
<td>Tätigkeitsende des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AcerCode</td>
<td>Der ACER-Code des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>ACE2442523454</td>
</tr>
<tr>
<td>AcerCodeZuPruefen</td>
<td>Der ACER-Code des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Umsatzsteueridentifikationsnummer</td>
<td>Die USt-Id Nummer des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>DE235583371</td>
</tr>
<tr>
<td>UmsatzsteueridentifikationsnummerZuPruefen</td>
<td>Die USt-Id Nummer des Marktakteurs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>HauptwirtdschaftszweigGruppe</td>
<td>Hauptwirtschaftszweig - Gruppe</td>
<td><a href="#nacegruppeenum">NaceGruppeEnum</a></td>
<td>Nein</td>
<td>EnumValue</td>
</tr>
<tr>
<td>HauptwirtdschaftszweigGruppeZuPruefen</td>
<td>Hauptwirtschaftszweig - Gruppe (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>Kmu</td>
<td>Kleinst-, Klein- oder mittleres Unternehmen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>KmuZuPruefen</td>
<td>Kleinst-, Klein- oder mittleres Unternehmen? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>EinkommenAusSelbstaendigerArbeit</td>
<td>Angabe ob der Anlagenbetreiber Einkommen aus selbstständiger Arbeit erziehlt</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>EinkommenAusSelbstaendigerArbeitZuPruefen</td>
<td>Angabe ob der Anlagenbetreiber Einkommen aus selbstständiger Arbeit erziehlt(Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitSolar

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Turbine 2</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Präqualifiziert für Regelenergie?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Präqualifiziert für Regelenergie? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>(Prüfungskennzeichen)Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>zugeordneteWirkleistungWechselrichter</td>
<td>Wechselrichterleistung der Stromerzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>147.254</td>
</tr>
<tr>
<td>zugeordneteWirkleistungWechselrichterZuPruefen</td>
<td>Wechselrichterleistung der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemeinsamerWechselrichterMitSpeicher</td>
<td>Gemeinsamer Wechselrichter mit Stromspeicher</td>
<td><a href="#wechselrichterenum">WechselrichterEnum</a></td>
<td>Nein</td>
<td>GemeinsamerWechselrichterMitStromspeicher</td>
</tr>
<tr>
<td>gemeinsamerWechselrichterMitSpeicherZuPruefen</td>
<td>Gemeinsamer Wechselrichter mit Stromspeicher (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>anzahlModule</td>
<td>Anzahl der Module dieser Stromerzeugungseinheit</td>
<td>int</td>
<td>Nein</td>
<td>12</td>
</tr>
<tr>
<td>anzahlModuleZuPruefen</td>
<td>Anzahl der Module dieser Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>lage</td>
<td>Errichtungsort der Stromerzeugungseinheit</td>
<td><a href="#solarlageenum">SolarLageEnum</a></td>
<td>Nein</td>
<td>Freiflaeche</td>
</tr>
<tr>
<td>lageZuPruefen</td>
<td>Errichtungsort der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>leistungsbegrenzung</td>
<td>Die Leistung der Stromerzeugungseinheit ist auf einen bestimmten prozentualen Leistungsanteil begrenzt</td>
<td><a href="#solarleistungsbegrenzungenum">SolarLeistungsbegrenzungEnum</a></td>
<td>Nein</td>
<td>Ja70Prozent</td>
</tr>
<tr>
<td>leistungsbegrenzungZuPruefen</td>
<td>Die Leistung der Stromerzeugungseinheit ist auf einen bestimmten prozentualen Leistungsanteil begrenzt (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitlicheAusrichtungUndNeigungswinkel</td>
<td>Angabe, ob einheitliche Ausrichtung und Neigungswinkel bestehen.</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>einheitlicheAusrichtungUndNeigungswinkelZuPruefen</td>
<td>Angabe, ob einheitliche Ausrichtung und Neigungswinkel bestehen. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hauptausrichtung</td>
<td>Die Ausrichtung bezeichnet die Himmelsrichtung.</td>
<td><a href="#anlagenartsolarausrichtungenum">AnlagenartSolarAusrichtungEnum</a></td>
<td>Nein</td>
<td>Nord</td>
</tr>
<tr>
<td>hauptausrichtungZuPruefen</td>
<td>Die Ausrichtung bezeichnet die Himmelsrichtung. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hauptausrichtungNeigungswinkel</td>
<td>Der Neigungswinkel bezeichnet den Winkel gegenüber der Horizontalen.</td>
<td><a href="#anlagenartsolarneigungswinkelenum">AnlagenartSolarNeigungswinkelEnum</a></td>
<td>Nein</td>
<td>Ueber60</td>
</tr>
<tr>
<td>hauptausrichtungNeigungswinkelZuPruefen</td>
<td>Der Neigungswinkel bezeichnet den Winkel gegenüber der Horizontalen. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nebenausrichtung</td>
<td>Weitere Ausrichtung der Stromerzeugungseinheit neben der Hauptausrichtung</td>
<td><a href="#anlagenartsolarausrichtungenum">AnlagenartSolarAusrichtungEnum</a></td>
<td>Nein</td>
<td>Nord</td>
</tr>
<tr>
<td>nebenausrichtungZuPruefen</td>
<td>Weitere Ausrichtung der Stromerzeugungseinheit neben der Hauptausrichtung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nebenausrichtungNeigungswinkel</td>
<td>Neigungswinkel in Grad zur Horizontalen(der Nebenausrichtung)</td>
<td><a href="#anlagenartsolarneigungswinkelenum">AnlagenartSolarNeigungswinkelEnum</a></td>
<td>Nein</td>
<td>Ueber60</td>
</tr>
<tr>
<td>nebenausrichtungNeigungswinkelZuPruefen</td>
<td>Neigungswinkel in Grad zur Horizontalen(der Nebenausrichtung) (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inAnspruchGenommeneFlaeche</td>
<td>In Anspruch genommene Fläche</td>
<td>decimal</td>
<td>Nein</td>
<td>456.981</td>
</tr>
<tr>
<td>inAnspruchGenommeneFlaecheZuPruefen</td>
<td>In Anspruch genommene Fläche (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>artDerFlaeche[]</td>
<td>Art der in Anspruch genommenen Fläche</td>
<td><a href="#solarflaechenartenum">SolarFlaechenartEnum</a></td>
<td>Nein</td>
<td>BimaFlaeche</td>
</tr>
<tr>
<td>artDerFlaecheZuPruefen</td>
<td>Art der in Anspruch genommenen Fläche (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inAnspruchGenommeneAckerflaeche</td>
<td>In Anspruch genommene Ackerfläche</td>
<td>decimal</td>
<td>Nein</td>
<td>124.098</td>
</tr>
<tr>
<td>inAnspruchGenommeneAckerflaecheZuPruefen</td>
<td>In Anspruch genommene Ackerfläche (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nutzungsbereich</td>
<td>Vorrangige Nutzung des in Anspruch genommenen Gebäudes</td>
<td><a href="#nutzungsbereichenum">NutzungsbereichEnum</a></td>
<td>Nein</td>
<td>Industrie</td>
</tr>
<tr>
<td>nutzungsbereichZuPruefen</td>
<td>Vorrangige Nutzung des in Anspruch genommenen Gebäudes (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>MaStR-Nummer der EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegMastrNummerZuPreufen</td>
<td>MaStR-Nummer der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInanspruchnahmeZahlungNachEeg</td>
<td>Werden oder wurden für die Solaranlage Zahlungen des Netzbetreibers in Anspruch genommen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegInanspruchnahmeZahlungNachEegZuPruefen</td>
<td>Werden oder wurden für die Solaranlage Zahlungen des Netzbetreibers in Anspruch genommen? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenschluessel</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>E2325426</td>
</tr>
<tr>
<td>eegAnlagenschluesselZuPruefen</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>B354453</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregisterZuPruefen</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>eegInstallierteLeistungZuPruefen</td>
<td>Installierte Nettonennleistung der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegRegistrierungsnummerPvMeldeportal</td>
<td>Durch die Bundesagentur vergebene Nummer bei der Registrierung im PV-Meldeportal</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>ASO-123445</td>
</tr>
<tr>
<td>eegRegistrierungsnummerPvMeldeportalZuPruefen</td>
<td>Durch die Bundesagentur vergebene Nummer bei der Registrierung im PV-Meldeportal (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegMieterstromZugeordnet</td>
<td>Gibt an, ob die Solaranlage der Veräußerungsform des Mieterstromzuschlags zugeordnet wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegMieterstromZugeordnetZuPruefen</td>
<td>Gibt an, ob die Solaranlage der Veräußerungsform des Mieterstromzuschlags zugeordnet wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegMieterstromRegistrierungsdatum</td>
<td>Datum, an dem die Anlage erstmalig der Veräußerungsform des Mieterstromzuschlags zugeordnet worden ist.</td>
<td>date</td>
<td>Nein</td>
<td>2013-12-31</td>
</tr>
<tr>
<td>eegMieterstromRegistrierungsdatumZuPruefen</td>
<td>Datum, an dem die Anlage erstmalig der Veräußerungsform des Mieterstromzuschlags zugeordnet worden ist. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegMieterstromErsteZuordnungZuschlag</td>
<td>Datum, an dem die Anlage erstmalig der Veräußerungsform des Mieterstromzuschlags zugeordnet worden ist.</td>
<td>date</td>
<td>Nein</td>
<td>2013-12-31</td>
</tr>
<tr>
<td>eegMieterstromErsteZuordnungZuschlagZuPruefen</td>
<td>Datum, an dem die Anlage erstmalig der Veräußerungsform des Mieterstromzuschlags zugeordnet worden ist. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegAusschreibungZuschlagZuPruefen</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegZuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>eegZuschlagsnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegZugeordneteGebotsmenge</td>
<td>Bezuschlagte Gebotsmenge, die der EEG-Anlage zugeordnet wurde</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>eegZugeordneteGebotsmengeZuPruefen</td>
<td>Bezuschlagte Gebotsmenge, die der EEG-Anlage zugeordnet wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Buergerenergie</td>
<td>Bürgerenergieeigenschaft der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BuergerenergieZuPruefen</td>
<td>Bürgerenergieeigenschaft der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitBiomasse

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Turbine 2</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Präqualifiziert für Regelenergie?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Präqualifiziert für Regelenergie? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>(Prüfungskennzeichen)Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegung</td>
<td>Beginn der vorläufigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>DatumBeginnVoruebergehendeStilllegungZuPruefen</td>
<td>Beginn der vorläufigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetriebZuPruefen</td>
<td>Datum der Wiederaufnahme des Betriebs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hauptbrennstoff</td>
<td>Welcher Einsatzstoff oder Brennstoff wird hauptsächlich benutzt</td>
<td><a href="#biomassebrennstoffenum">BiomasseBrennstoffEnum</a></td>
<td>Nein</td>
<td>Rinde</td>
</tr>
<tr>
<td>hauptbrennstoffZuPruefen</td>
<td>Welcher Einsatzstoff oder Brennstoff wird hauptsächlich benutzt (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Stromerzeugung</td>
<td><a href="#technologieverbrennungsanlageenum">TechnologieVerbrennungsanlageEnum</a></td>
<td>Nein</td>
<td>KalinaCycle</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Technologie der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilEEGAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilEEGAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>MaStR-Nummer der verknüpften EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenschluessel</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>E2325426</td>
</tr>
<tr>
<td>eegAnlagenschluesselZuPruefen</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>B354453</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregisterZuPruefen</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>eegInstallierteLeistungZuPruefen</td>
<td>Installierte Nettonennleistung der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAusschliesslicheVerwendungBiomasse</td>
<td>Ausschließliche Verwendung von Biomasse im Sinne der Biomasse-Verordnung</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegAusschliesslicheVerwendungBiomasseZuPruefen</td>
<td>Ausschließliche Verwendung von Biomasse im Sinne der Biomasse-Verordnung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegAusschreibungZuschlagZuPruefen</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasZuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>eegBiogasZuschlagsnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasInanspruchnahmeFlexiPraemie</td>
<td>Angabe ob für die Anlage Flexibilitätsprämie in anspruch genommen wird</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegBiogasInanspruchnahmeFlexiPraemieZuPruefen</td>
<td>Angabe ob für die Anlage Flexibilitätsprämie in anspruch genommen wird (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasDatumInanspruchnahmeFlexiPraemie</td>
<td>Datum der erstmaligen Inanspruchnahme der Flexibilitätsprämie</td>
<td>date</td>
<td>Nein</td>
<td>2014-12-31</td>
</tr>
<tr>
<td>eegBiogasDatumInanspruchnahmeFlexiPraemieZuPruefen</td>
<td>Datum der erstmaligen Inanspruchnahme der Flexibilitätsprämie (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasLeistungserhoehung</td>
<td>Angabe, ob die Leistung der Anlage im Zusammenhang mit der Flexibilitätsprämie erhöht wird</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegBiogasLeistungserhoehungZuPruefen</td>
<td>Angabe, ob die Leistung der Anlage im Zusammenhang mit der Flexibilitätsprämie erhöht wird (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasDatumLeistungserhoehung</td>
<td>Datum der Inbetriebnahme der Leistungserhöhung</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-11</td>
</tr>
<tr>
<td>eegBiogasDatumLeistungserhoehungZuPruefen</td>
<td>Datum der Inbetriebnahme der Leistungserhöhung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasUmfangLeistungserhoehung</td>
<td>Umfang der Leistungserhöhung bei dieser Biogas-Anlage nach dem 31.07.2014</td>
<td>decimal</td>
<td>Nein</td>
<td>125.987</td>
</tr>
<tr>
<td>eegBiogasUmfangLeistungserhoehungZuPruefen</td>
<td>Umfang der Leistungserhöhung bei dieser Biogas-Anlage nach dem 31.07.2014 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiogasGaserzeugungskapazitaet</td>
<td>Leistungsangabe: Kapazität an Gas, das erzeugt werden kann. Gasproduktions-kapazität nach Genehmig-ungsbescheid, bzw. anhand der eingesetzten Inputstoffe.</td>
<td><a href="#erweitertesdecimal">ErweitertesDecimal</a></td>
<td>Ja</td>
<td>241.369</td>
</tr>
<tr>
<td>eegBiogasGaserzeugungskapazitaetZuPruefen</td>
<td>Leistungsangabe: Kapazität an Gas, das erzeugt werden kann. Gasproduktions-kapazität nach Genehmig-ungsbescheid, bzw. anhand der eingesetzten Inputstoffe. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegHoechstbemessungsleistung</td>
<td>Höchstbemessungsleistung der Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>785.987</td>
</tr>
<tr>
<td>eegHoechstbemessungsleistungZuPruefen</td>
<td>Höchstbemessungsleistung der Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegBiomethanErstmaligerEinsatz</td>
<td>Datum des erstmaligen ausschließlichen Einsatzes von Biomethan</td>
<td><a href="#erweitertesdate">ErweitertesDate</a></td>
<td>Ja</td>
<td>2013-12-14</td>
</tr>
<tr>
<td>eegBiomethanErstmaligerEinsatzZuPruefen</td>
<td>Datum des erstmaligen ausschließlichen Einsatzes von Biomethan (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilKWKAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilKWKAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>kwkMastrNummer</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Nein</td>
<td>KWK91234567890</td>
</tr>
<tr>
<td>kwkMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlag</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt?</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlagZuPruefen</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkZuschlagnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer.</td>
<td>string</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkZuschlagnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der KWK-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2018-01-01</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkThermischeNutzleistung</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>12.54</td>
</tr>
<tr>
<td>kwkThermischeNutzleistungZuPruefen</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistung</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>41.45</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistungZuPruefen</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitWasser

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Turbine 2</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Präqualifiziert für Regelenergie?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Präqualifiziert für Regelenergie? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>(Prüfungskennzeichen)Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameKraftwerk</td>
<td>Name des Kraftwerks</td>
<td>string</td>
<td>Nein</td>
<td>Wasserpark 2</td>
</tr>
<tr>
<td>nameKraftwerkZuPruefen</td>
<td>Name des Kraftwerks (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AnzeigeEinerStilllegung</td>
<td>Anzeige einer Stilllegung nach §13b Abs.1 Satz 1</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AnzeigeEinerStilllegungZuPruefen</td>
<td>Anzeige einer Stilllegung nach §13b Abs.1 Satz 1 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ArtDerStilllegung</td>
<td>Art der Stilllegung nach §13b</td>
<td><a href="#artderstilllegungenum">ArtDerStilllegungEnum</a></td>
<td>Nein</td>
<td>Vorlaeufig</td>
</tr>
<tr>
<td>ArtDerStilllegungZuPruefen</td>
<td>Art der Stilllegung nach §13b (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumBeginnVorlaeufigenOderEndgueltigenStilllegung</td>
<td>Beginn der vorläufigen oder endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>DatumBeginnVorlaeufigenOderEndgueltigenStilllegungZuPruefen</td>
<td>Beginn der vorläufigen oder endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumBeendigungVorlaeufigenStilllegung</td>
<td>Beendigung der vorläufigen Stilllegung nach §13b</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>DatumBeendigungVorlaeufigenStilllegungZuPruefen</td>
<td>Beendigung der vorläufigen Stilllegung nach §13b (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetriebZuPruefen</td>
<td>Datum der Wiederaufnahme des Betriebs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>artDerWasserkraftanlage</td>
<td>Art der Stromerzeugung aus Wasserkraft</td>
<td><a href="#artderwasserkraftanlageenum">ArtDerWasserkraftanlageEnum</a></td>
<td>Nein</td>
<td>Meeresenergie</td>
</tr>
<tr>
<td>artDerWasserkraftanlageZuPruefen</td>
<td>Art der Stromerzeugung aus Wasserkraft (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>minderungStromerzeugung</td>
<td>Auflagen, die zur Minderung der Stromerzeugung führen?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>minderungStromerzeugungZuPruefen</td>
<td>Auflagen, die zur Minderung der Stromerzeugung führen? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerk</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerkZuPruefen</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistungDeutschland</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>458.145</td>
</tr>
<tr>
<td>nettonennleistungDeutschlandZuPruefen</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>artDesZuflusses</td>
<td>Welche Art von Zufluss wird zur Stromerzeugung verwendet</td>
<td><a href="#zuflussartenum">ZuflussartEnum</a></td>
<td>Nein</td>
<td>Flusskraftwerk</td>
</tr>
<tr>
<td>artDesZuflussesZuPruefen</td>
<td>Welche Art von Zufluss wird zur Stromerzeugung verwendet (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilEEGAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilEEGAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>MaStR-Nummer der verknüpften-EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften-EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenschluessel</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>E2325426</td>
</tr>
<tr>
<td>eegAnlagenschluesselZuPruefen</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>B354453</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregisterZuPruefen</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregisters (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>eegInstallierteLeistungZuPruefen</td>
<td>Installierte Nettonennleistung der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitGeothermieGrubengasDruckentspannung

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Turbine 2</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Präqualifiziert für Regelenergie?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Präqualifiziert für Regelenergie? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>(Prüfungskennzeichen)Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Stromerzeugung</td>
<td><a href="#technologieverbrennungsanlageenum">TechnologieVerbrennungsanlageEnum</a></td>
<td>Nein</td>
<td>Stirlingmotor</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Technologie der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilEEGAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilEEGAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegMastrNummer</td>
<td>MaStR-Nummer der verknüpften EEG-Anlage</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>eegMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenschluessel</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>E2325426</td>
</tr>
<tr>
<td>eegAnlagenschluesselZuPruefen</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregister</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregister</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>B354453</td>
</tr>
<tr>
<td>eegAnlagenkennzifferAnlagenregisterZuPruefen</td>
<td>Anlagenkennziffer aus der Registrierungsbestätigung des Anlagenregister (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInstallierteLeistung</td>
<td>Installierte Nettonennleistung der EEG-Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>1235.541</td>
</tr>
<tr>
<td>eegInstallierteLeistungZuPruefen</td>
<td>Installierte Nettonennleistung der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilKWKAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilKWKAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>kwkMastrNummer</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Nein</td>
<td>KWK91234567890</td>
</tr>
<tr>
<td>kwkMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>c</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlag</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt?</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlagZuPruefen</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkZuschlagnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer.</td>
<td>string</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkZuschlagnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der KWK-Anlage</td>
<td>date</td>
<td>Nein</td>
<td> 2018-01-01</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkThermischeNutzleistung</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>12.54</td>
</tr>
<tr>
<td>kwkThermischeNutzleistungZuPruefen</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistung</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>41.45</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistungZuPruefen</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitVerbrennung

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Turbine 2</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Präqualifiziert für Regelenergie?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Präqualifiziert für Regelenergie? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>(Prüfungskennzeichen)Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameKraftwerk</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist.</td>
<td>string</td>
<td>Nein</td>
<td>Braunkohle Power Holstein 2</td>
</tr>
<tr>
<td>nameKraftwerkZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameKraftwerksblock</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist.</td>
<td>string</td>
<td>Nein</td>
<td>Süd 2</td>
</tr>
<tr>
<td>nameKraftwerksblockZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung des Kraftwerksblocks, dessen Teil die Stromerzeugungseinheit ist. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumBaubeginn</td>
<td>Tatsächlicher bzw. geplanter Spatenstich auf der Baustelle</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>datumBaubeginnZuPruefen</td>
<td>Tatsächlicher bzw. geplanter Spatenstich auf der Baustelle (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AnzeigeEinerStilllegung</td>
<td>Anzeige einer Stilllegung nach §13b Abs.1 Satz 1</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AnzeigeEinerStilllegungZuPruefen</td>
<td>Anzeige einer Stilllegung nach §13b Abs.1 Satz 1 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ArtDerStilllegung</td>
<td>Art der Stilllegung nach §13b</td>
<td><a href="#artderstilllegungenum">ArtDerStilllegungEnum</a></td>
<td>Nein</td>
<td>Vorlaeufig</td>
</tr>
<tr>
<td>ArtDerStilllegungZuPruefen</td>
<td>Art der Stilllegung nach §13b (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumBeginnVorlaeufigenOderEndgueltigenStilllegung</td>
<td>Beginn der vorläufigen oder endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>DatumBeginnVorlaeufigenOderEndgueltigenStilllegungZuPruefen</td>
<td>Beginn der vorläufigen oder endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumBeendigungVorlaeufigenStilllegung</td>
<td>Beendigung der vorläufigen Stilllegung nach §13b</td>
<td>date</td>
<td>Nein</td>
<td>2014-01-02</td>
</tr>
<tr>
<td>DatumBeendigungVorlaeufigenStilllegungZuPruefen</td>
<td>Beendigung der vorläufigen Stilllegung nach §13b (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetrieb</td>
<td>Datum der Wiederaufnahme des Betriebs</td>
<td>date</td>
<td>Nein</td>
<td>2015-01-02</td>
</tr>
<tr>
<td>DatumWiederaufnahmeBetriebZuPruefen</td>
<td>Datum der Wiederaufnahme des Betriebs (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>steigerungNettonennleistungKombibetrieb</td>
<td>Steigerung der Nettonennleistung durch Kombibetrieb</td>
<td>decimal</td>
<td>Nein</td>
<td>512.147</td>
</tr>
<tr>
<td>steigerungNettonennleistungKombibetriebZuPruefen</td>
<td>Steigerung der Nettonennleistung durch Kombibetrieb (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>anlageIstImKombibetrieb</td>
<td>Angabe ob die Stromerzeugungseinheit im Kombibetrieb betrieben wird</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>anlageIstImKombibetriebZuPruefen</td>
<td>Angabe ob die Stromerzeugungseinheit im Kombibetrieb betrieben wird (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>mastrNummernKombibetrieb</td>
<td>MaStR-Nummern der Einheiten im Kombibetrieb</td>
<td>string</td>
<td>Nein</td>
<td>SEE91234567890; SEE99876543210</td>
</tr>
<tr>
<td>mastrNummernKombibetriebZuPruefen</td>
<td>MaStR-Nummern der Einheiten im Kombibetrieb (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>netzreserveAbDatum</td>
<td>Datum der Überführung der Stromerzeugungseinheit in die Netzreserve.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>netzreserveAbDatumZuPruefen</td>
<td>Datum der Überführung der Stromerzeugungseinheit in die Netzreserve. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>sicherheitsbereitschaftAbDatum</td>
<td>Datum des Beginns der vorläufigen Stilllegung mit Übergang in die Sicherheitsbereitschaft</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>sicherheitsbereitschaftAbDatumZuPruefen</td>
<td>Datum des Beginns der vorläufigen Stilllegung mit Übergang in die Sicherheitsbereitschaft (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>energietraeger</td>
<td>Energieträger</td>
<td><a href="#energietraegerenum">EnergietraegerEnum</a></td>
<td>Nein</td>
<td>Steinkohle</td>
</tr>
<tr>
<td>energietraegerZuPruefen</td>
<td>Energieträger (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hauptbrennstoff</td>
<td>Hauptbrennstoff</td>
<td><a href="#verbrennungbrennstoffenum">VerbrennungBrennstoffEnum</a></td>
<td>Nein</td>
<td>Fluessiggas</td>
</tr>
<tr>
<td>hauptbrennstoffZuPruefen</td>
<td>Hauptbrennstoff (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weitererHauptbrennstoff</td>
<td>Weiterer Hauptbrennstoff</td>
<td><a href="#erweiterterweiterebrennstoffe">ErweiterterWeitereBrennstoffe</a></td>
<td>Ja</td>
<td>Kokereigas</td>
</tr>
<tr>
<td>weitererHauptbrennstoffZuPruefen</td>
<td>Weiterer Hauptbrennstoff (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weitereBrennstoffe</td>
<td>Weitere Brennstoffe</td>
<td><a href="#erweiterteweiterebrennstoffe">ErweiterteWeitereBrennstoffe</a></td>
<td>Ja</td>
<td>Dieselkraftstoff</td>
</tr>
<tr>
<td>weitereBrennstoffeZuPruefen</td>
<td>Weitere Brennstoffe (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>verknuepfteErzeugungseinheiten[]</td>
<td>Liste von MaStR Nummern mit den verknüpften Stromerzeugern</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Nein</td>
<td>SEE91234567890 Verbrennung</td>
</tr>
<tr>
<td>verknuepfteErzeugungseinheitenZuPruefen</td>
<td>Liste von MaStR Nummern mit den verknüpften Stromerzeugern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerk</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerkZuPruefen</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistungDeutschland</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>458.145</td>
</tr>
<tr>
<td>nettonennleistungDeutschlandZuPruefen</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>anteiligNutzungsberechtigte</td>
<td>Namen und die Adresse der Letztverbraucher an, die ein anteiliges vertragliches Nutzungsrecht an einer bestimmten Erzeugungskapazität dieser Stromerzeugungseinheit gemäß § 104 Absatz 4 EEG wie eine eigenständige Erzeugungseinheit betreiben.</td>
<td>string</td>
<td>Nein</td>
<td>Strom Deutschland AG, Strasse 4 54784 Köln, Strom
                  Westfeld GmbH Weg 4 23541 Vorort</td>
</tr>
<tr>
<td>anteiligNutzungsberechtigteZuPruefen</td>
<td>Namen und die Adresse der Letztverbraucher an, die ein anteiliges vertragliches Nutzungsrecht an einer bestimmten Erzeugungskapazität dieser Stromerzeugungseinheit gemäß § 104 Absatz 4 EEG wie eine eigenständige Erzeugungseinheit betreiben. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>notstromaggregat</td>
<td>Angabe ob die Stromerzeugungseinheit zur Versorgung bei Stromnetzstörungen dient (Notstromaggregat)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>notstromaggregatZuPruefen</td>
<td>Angabe ob die Stromerzeugungseinheit zur Versorgung bei Stromnetzstörungen dient (Notstromaggregat) (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Stromerzeugung</td>
<td><a href="#technologieverbrennungsanlageenum">TechnologieVerbrennungsanlageEnum</a></td>
<td>Nein</td>
<td>Dampfmotor</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Technologie der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzort</td>
<td>An welchem Einsatzort wird die Stromerzeugungseinheit als Notstromaggregat betrieben</td>
<td><a href="#einsatzortenum">EinsatzortEnum</a></td>
<td>Nein</td>
<td>Hotel</td>
</tr>
<tr>
<td>einsatzortZuPruefen</td>
<td>An welchem Einsatzort wird die Stromerzeugungseinheit als Notstromaggregat betrieben (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilKWKAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilKWKAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>kwkMastrNummer</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Nein</td>
<td>KWK91234567890</td>
</tr>
<tr>
<td>kwkMastrNummerZuPruefen</td>
<td>MaStR-Nummer der verknüpften KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlag</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt?</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkAusschreibungZuschlagZuPruefen</td>
<td>Wurde für die KWK-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkZuschlagnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer.</td>
<td>string</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkZuschlagnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummer. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>A1234</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der KWK-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2018-01-01</td>
</tr>
<tr>
<td>kwkInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der KWK-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkThermischeNutzleistung</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>12.54</td>
</tr>
<tr>
<td>kwkThermischeNutzleistungZuPruefen</td>
<td>Die höchste Nutzwärmeerzeugung unter Nennbedingungen, die die KWK-Anlage abgeben kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistung</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage</td>
<td>decimal</td>
<td>Nein</td>
<td>41.45</td>
</tr>
<tr>
<td>kwkElektrischeKwkLeistungZuPruefen</td>
<td>Die höchste an den Generatorklemmen abgebbare elektrische Wirkleistung der Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AusschliesslicheVerwendungImKombibetrieb</td>
<td>Angabe, dass die Einheit ausschließlich im Kombibetrieb betrieben wird</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>AusschliesslicheVerwendungImKombibetriebZuPruefen</td>
<td>Angabe, dass die Einheit ausschließlich im Kombibetrieb betrieben wird (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitGasSpeicher

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>speichername</td>
<td>Name des Speicher</td>
<td>string</td>
<td>Nein</td>
<td>Fernspeicher XCY 2</td>
</tr>
<tr>
<td>speichernameZuPruefen</td>
<td>Name des Speicher (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>speicherart</td>
<td>Art der Gasspeicherung</td>
<td><a href="#gasspeicherartenum">GasSpeicherartEnum</a></td>
<td>Nein</td>
<td>Kavernenspeicher</td>
</tr>
<tr>
<td>speicherartZuPruefen</td>
<td>Art der Gasspeicherung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>maximalNutzbaresArbeitsgasvolumen</td>
<td>Maximal nutzbares Arbeitsgasvolumen</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>maximalNutzbaresArbeitsgasvolumenZuPruefen</td>
<td>Maximal nutzbares Arbeitsgasvolumen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>maximaleEinspeicherleistung</td>
<td>Maximale Einspeicherleistung</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>maximaleEinspeicherleistungZuPruefen</td>
<td>Maximale Einspeicherleistung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>maximaleAusspeicherleistung</td>
<td>Maximale Ausspeicherleistung</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>maximaleAusspeicherleistungZuPruefen</td>
<td>Maximale Ausspeicherleistung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>durchschnittlicherBrennwert</td>
<td>Durchschnittlicher Brennwert des Gas im Speicher</td>
<td>decimal</td>
<td>Nein</td>
<td>11.10</td>
</tr>
<tr>
<td>durchschnittlicherBrennwertZuPruefen</td>
<td>Durchschnittlicher Brennwert des Gas im Speicher (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>speGasSpeicheranlage</td>
<td>Liste von MaStR Nummern mit den verknüpften Gasspeichern</td>
<td><a href="#gasspeichermastrnummerid">GasSpeicherMastrNummerId</a></td>
<td>Nein</td>
<td>GSA9123456789</td>
</tr>
<tr>
<td>speGasSpeicheranlageZuPruefen</td>
<td>Liste von MaStR Nummern mit den verknüpften Gasspeichern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitStromVerbraucher

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NameStromverbrauchseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromverbrauchseinheit</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>NameStromverbrauchseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromverbrauchseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzverantwortlicher</td>
<td>Marktpartner-ID des Einsatzverantwortlichen</td>
<td>string</td>
<td>Nein</td>
<td>ANB91234567890</td>
</tr>
<tr>
<td>einsatzverantwortlicherZuPruefen</td>
<td>Marktpartner-ID des Einsatzverantwortlichen (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatum</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft.</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>technischesInbetriebnahmedatumZuPruefen</td>
<td>Erstmalige Inbetriebsetzung der Stromverbrauchseinheit nach Herstellung der technischen Betriebsbereitschaft. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>anzahlStromverbrauchseinheitenGroesser50Mw</td>
<td>Anzahl angeschlossener Stromverbrauchseinheiten größer 50 MW</td>
<td>int</td>
<td>Nein</td>
<td>23</td>
</tr>
<tr>
<td>anzahlStromverbrauchseinheitenGroesser50MwZuPruefen</td>
<td>Anzahl angeschlossener Stromverbrauchseinheiten größer 50 MW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitGasErzeuger

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie der Gaserzeugung</td>
<td><a href="#technologiegaserzeugungenum">TechnologieGasErzeugungEnum</a></td>
<td>Nein</td>
<td>LiquifidNaturalGas</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Verwendete Technologie (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>erzeugungsleistung</td>
<td>Leistung der Gaserzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>125.987</td>
</tr>
<tr>
<td>erzeugungsleistungZuPruefen</td>
<td>Leistung der Gaserzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitGasVerbraucher

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>maximaleGasbezugsleistung</td>
<td>Maximale Gasbezugsleistung zur Stromerzeugung</td>
<td>decimal</td>
<td>Nein</td>
<td>147.984</td>
</tr>
<tr>
<td>maximaleGasbezugsleistungZuPruefen</td>
<td>Maximale Gasbezugsleistung zur Stromerzeugung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einheitDientDerStromerzeugung</td>
<td>Angabe ob die Gasverbrauchseinheit zur Stromerzeugung dient (Gaskraftwerk)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>einheitDientDerStromerzeugungZuPruefen</td>
<td>Angabe ob die Gasverbrauchseinheit zur Stromerzeugung dient (Gaskraftwerk) (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## GetKorrekturVorschlagEinheitStromSpeicher

Diese Funktion ermöglicht das Abrufen eines Vorschlags zur Datenänderung. Die Funktion kann nur von dem Netzbetreiber ausgeführt werden, der den Vorschlag ursprünglich erstellt hat und der damit ein Teil der Netzbetreiberprüfung ist.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags innerhalb einer Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>1323545</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>124443</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die ID des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>5975654</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Ja</td>
<td>124443</td>
</tr>
<tr>
<td>beschreibung</td>
<td>Ein möglicher Kommentar an den Anlagenbetreiber</td>
<td>string</td>
<td>Nein</td>
<td>Ihre Daten unterscheiden sich</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>strasse</td>
<td>Standort der Einheit: Straße</td>
<td>string</td>
<td>Nein</td>
<td>Holzweg</td>
</tr>
<tr>
<td>strasseZuPruefen</td>
<td>Standort der Einheit: Straße (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>strasseNichtGefunden</td>
<td>Angabe, dass die angegebene Strasse nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummer</td>
<td>Standort der Einheit: Hausnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>4</td>
</tr>
<tr>
<td>hausnummerZuPruefen</td>
<td>Standort der Einheit: Hausnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>hausnummerNichtGefunden</td>
<td>Angabe, dass die angegebene Hausnummer nicht aus dem BKG-Adressdatenbestand stammt</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>adresszusatz</td>
<td>Standort der Einheit: Adresszusatz</td>
<td>string</td>
<td>Nein</td>
<td>a</td>
</tr>
<tr>
<td>adresszusatzZuPruefen</td>
<td>Standort der Einheit: Adresszusatz (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>postleitzahl</td>
<td>Standort der Einheit: Postleitzahl</td>
<td>string</td>
<td>Nein</td>
<td>39179</td>
</tr>
<tr>
<td>postleitzahlZuPruefen</td>
<td>Standort der Einheit: Postleitzahl (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gemarkung</td>
<td>Standort der Einheit: Gemarkung</td>
<td>string</td>
<td>Nein</td>
<td>896-98</td>
</tr>
<tr>
<td>gemarkungZuPruefen</td>
<td>Standort der Einheit: Gemarkung (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>flurFlurstuecknummern</td>
<td>Standort der Einheit: Flur und/oder Flurstücke</td>
<td>string</td>
<td>Nein</td>
<td>123-784</td>
</tr>
<tr>
<td>flurFlurstuecknummernZuPruefen</td>
<td>Standort der Einheit: Flur und/oder Flurstücke (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>ort</td>
<td>Standort der Einheit: Ort</td>
<td>string</td>
<td>Nein</td>
<td>Langenweddingen</td>
</tr>
<tr>
<td>ortZuPruefen</td>
<td>Standort der Einheit: Ort (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bundesland</td>
<td>Bundesland der Einheit</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>bundeslandZuPruefen</td>
<td>Bundesland der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>land</td>
<td>Standort der Einheit: Land</td>
<td><a href="#laendereinheitenenum">LaenderEinheitenEnum</a></td>
<td>Nein</td>
<td>Deutschland</td>
</tr>
<tr>
<td>landZuPruefen</td>
<td>Standort der Einheit: Land (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>51.254</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad nach WGS84 (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>2010-06-05</td>
</tr>
<tr>
<td>inbetriebnahmedatumZuPruefen</td>
<td>Datum der Inbetriebnahme (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegung</td>
<td>Datum der endgültigen Stilllegung der Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2025-10-24</td>
</tr>
<tr>
<td>datumEndgueltigeStilllegungZuPruefen</td>
<td>Datum der endgültigen Stilllegung der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatum</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>date</td>
<td>Nein</td>
<td>2014-10-24</td>
</tr>
<tr>
<td>geplantesInbetriebnahmedatumZuPruefen</td>
<td>Geplantes Inbetriebnahmedatum der Stromerzeugungsseinheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>DatumDesBetreiberwechsels</td>
<td>Datum des realen Betreiberwechsels</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>DatumDesBetreiberwechselsZuPruefen</td>
<td>Datum des realen Betreiberwechsels (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nameStromerzeugungseinheit</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit.</td>
<td>string</td>
<td>Nein</td>
<td>Turbine 2</td>
</tr>
<tr>
<td>nameStromerzeugungseinheitZuPruefen</td>
<td>Vom Betreiber frei wählbare Bezeichnung der Stromerzeugungseinheit. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weic</td>
<td>W-Code der Stromerzeugungseinheit</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>11XVE-SALES-PK-P</td>
</tr>
<tr>
<td>weicZuPruefen</td>
<td>W-Code der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>weicDisplayName</td>
<td>Displayname des W-EIC</td>
<td>string</td>
<td>Nein</td>
<td>VES-PK</td>
</tr>
<tr>
<td>weicDisplayNameZuPruefen</td>
<td>Displayname des W-EIC (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>kraftwerksnummer</td>
<td>Bundesnetzagentur-Kraftwerksnummer</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>BNA0019</td>
</tr>
<tr>
<td>kraftwerksnummerZuPruefen</td>
<td>Bundesnetzagentur-Kraftwerksnummer (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bruttoleistung</td>
<td>Bruttoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>150.112</td>
</tr>
<tr>
<td>bruttoleistungZuPruefen</td>
<td>Bruttoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistung</td>
<td>Nettoleistung in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>148.987</td>
</tr>
<tr>
<td>nettonennleistungZuPruefen</td>
<td>Nettoleistung in kW (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>technologie</td>
<td>Technologie des Stromspeichers</td>
<td><a href="#technologiespeicherenum">TechnologieSpeicherEnum</a></td>
<td>Nein</td>
<td>Batterie</td>
</tr>
<tr>
<td>technologieZuPruefen</td>
<td>Technologie der Stromerzeugungseinheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>schwarzstartfaehigkeit</td>
<td>Schwarzstartfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>schwarzstartfaehigkeitZuPruefen</td>
<td>Schwarzstartfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeit</td>
<td>Inselbetriebsfähigkeit der Einheit</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>inselbetriebsfaehigkeitZuPruefen</td>
<td>Inselbetriebsfähigkeit der Einheit (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNb</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitNbZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Netzbetreiber (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDv</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>fernsteuerbarkeitDvZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch einen Direktvermarkter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDr</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>fernsteuerbarkeitDrZuPruefen</td>
<td>Fernsteuerbarkeit der Einheit durch Dritte (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>acDcKoppelung</td>
<td>AC oder DC gekoppeltes System</td>
<td><a href="#systemkopplungenum">SystemkopplungEnum</a></td>
<td>Nein</td>
<td>ACgekoppeltesSystem</td>
</tr>
<tr>
<td>acDcKoppelungZuPruefen</td>
<td>AC oder DC gekoppeltes System (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>batterietechnologie</td>
<td>Batterietechnologie</td>
<td><a href="#batterietechnologieenum">BatterieTechnologieEnum</a></td>
<td>Nein</td>
<td>BleiSaeureBatterie</td>
</tr>
<tr>
<td>batterietechnologieZuPruefen</td>
<td>Batterietechnologie (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergie</td>
<td>Präqualifiziert für Regelenergie?</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>praequalifiziertFuerRegelenergieZuPruefen</td>
<td>Präqualifiziert für Regelenergie? (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>pumpbetriebLeistungsaufnahme</td>
<td>Höchste elektrische Dauerleistung, die dem Netz für den Pumpbetrieb unter Nennbedingungen entnommen werden kann</td>
<td>decimal</td>
<td>Nein</td>
<td>1234.56</td>
</tr>
<tr>
<td>pumpbetriebLeistungsaufnahmeZuPruefen</td>
<td>Höchste elektrische Dauerleistung, die dem Netz für den Pumpbetrieb unter Nennbedingungen entnommen werden kann (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>pumpbetriebKontinuierlichRegelbar</td>
<td>Die Wasserkraftanlage ist im Pumpbetrieb kontinuierlich regelbar</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>pumpbetriebKontinuierlichRegelbarZuPruefen</td>
<td>Die Wasserkraftanlage ist im Pumpbetrieb kontinuierlich regelbar (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>Pumpspeichertechnologie</td>
<td>Technologie des Pumpspeichers</td>
<td><a href="#pumpspeichertechnologieenum">PumpspeichertechnologieEnum</a></td>
<td>Nein</td>
<td>PumpspeicheranlageMitNatuerlichemZufluss</td>
</tr>
<tr>
<td>PumpspeichertechnologieZuPruefen</td>
<td>Technologie des Pumpspeichers (Prüfungsflag)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einspeisungsart</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch</td>
<td><a href="#einspeisungsartenum">EinspeisungsartEnum</a></td>
<td>Nein</td>
<td>Volleinspeisung</td>
</tr>
<tr>
<td>einspeisungsartZuPruefen</td>
<td>Volleinspeisung oder TeileinspeisungEigenverbrauch (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerk</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>bestandteilGrenzkraftwerkZuPruefen</td>
<td>Gehört die Stromerzeugungseinheit zu einem Grenzkraftwerk (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nettonennleistungDeutschland</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann.</td>
<td>decimal</td>
<td>Nein</td>
<td>458.145</td>
</tr>
<tr>
<td>nettonennleistungDeutschlandZuPruefen</td>
<td>Die höchste elektrische Dauerleistung unter Nennbedingungen dieser Stromerzeugungseinheit, die dem deutschen Stromnetz zugerechnet werden kann. (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>notstromaggregat</td>
<td>Angabe ob die Stromerzeugungseinheit zur Versorgung bei Stromnetzstörungen dient (Notstromaggregat)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>notstromaggregatZuPruefen</td>
<td>Angabe ob die Stromerzeugungseinheit zur Versorgung bei Stromnetzstörungen dient (Notstromaggregat) (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>einsatzort</td>
<td>An welchem Einsatzort wird die Stromerzeugungseinheit als Notstromaggregat betrieben</td>
<td><a href="#einsatzortenum">EinsatzortEnum</a></td>
<td>Nein</td>
<td>Hotel</td>
</tr>
<tr>
<td>einsatzortZuPruefen</td>
<td>An welchem Einsatzort wird die Stromerzeugungseinheit als Notstromaggregat betrieben (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>zugeordnenteWirkleistungWechselrichter</td>
<td>Zugeordnente Wirkleistung des/der Wechselrichter</td>
<td>decimal</td>
<td>Nein</td>
<td>125.587</td>
</tr>
<tr>
<td>zugeordnenteWirkleistungWechselrichterZuPruefen</td>
<td>Zugeordnente Wirkleistung des/der Wechselrichter (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>nutzbareSpeicherkapazitaet</td>
<td>Nutzbare Speicherkapazität</td>
<td>decimal</td>
<td>Nein</td>
<td>478.251</td>
</tr>
<tr>
<td>nutzbareSpeicherkapazitaetZuPruefen</td>
<td>Nutzbare Speicherkapazität (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>BestandteilEEGAnlage</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>BestandteilEEGAnlageZuPruefen</td>
<td>Die Stromerzeugungseinheit ist Bestandteil einer EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegInbetriebnahmedatum</td>
<td>Inbetriebnahmedatum der EEG-Anlage</td>
<td>date</td>
<td>Nein</td>
<td>2012-12-31</td>
</tr>
<tr>
<td>eegInbetriebnahmedatumZuPruefen</td>
<td>Inbetriebnahmedatum der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAnlagenschluessel</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>E2325426</td>
</tr>
<tr>
<td>eegAnlagenschluesselZuPruefen</td>
<td>Vom Netzbetreiber vergebene Kennziffer zur Identifikation der EEG-Anlage (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegZuschlagsnummer</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern</td>
<td>string</td>
<td>Nein</td>
<td>A15847</td>
</tr>
<tr>
<td>eegZuschlagsnummerZuPruefen</td>
<td>Von der Bundesnetzagentur im Rahmen des Ausschreibungsverfahrens vergebene Nummern (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>eegAusschreibungZuschlag</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
<tr>
<td>eegAusschreibungZuschlagZuPruefen</td>
<td>Angabe ob für die EEG-Anlage Im Rahmen des Ausschreibungsverfahren der Bundesnetzagentur ein Zuschlag erlangt wurde (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>



## DeleteKorrekturvorschlag

Diese Funktion ermöglicht das Löschen von einem Korrekturvorschlag im Rahmen einer Netzbetreiberprüfung. Nur der zuständige Netzbetreiber ist in der Lage, diese Funktion aufzurufen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>korrekturVorschlagId</td>
<td>Die eindeutige Id des Korrekturvorschlags</td>
<td>int</td>
<td>Ja</td>
<td>1234</td>
</tr>
<tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td>int</td>
<td>Nein</td>
<td>1234</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>

# Netzanschlusspunkt



## SetNetzanschlusspunktStromErzeuger

Diese Funktion ermöglicht das Setzen und Ändern von Daten am Netzanschlusspunkt sowie das Erstellen eines Netzanschlusspunkts im Rahmen einer Netzbetreiberprüfung. Nur der zuständige Netzbetreiber ist in der Lage, diese Funktion aufzurufen. Um einen neuen Netzanschlusspunkt zu erstellen, muss der Parameter „netzanschlusspunktMastrNummer“ im Objekt "NetzanschlusspunktStrom" leer gelassen werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>lokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>nameDerTechnischenLokation</td>
<td>Bezeichnung der Lokation, mit dem der Netzanschlusspunkt verbunden ist</td>
<td>string</td>
<td>Nein</td>
<td>LLK.13554.2456</td>
</tr>
<tr>
<td>netzanschlusspunkt</td>
<td>Daten des Netzanschlusspunkts</td>
<td><a href="#netzanschlusspunktstrom">NetzanschlusspunktStrom</a></td>
<td>Ja</td>
<td>4567 STR-34524-1234-Q</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>netzanschlusspunktMastrNummer</td>
<td>MaStR-Nummer des Netzanschlusses.</td>
<td><a href="#netzanschlusspunktmastrnummerid">NetzanschlusspunktMastrNummerId</a></td>
<td>Ja</td>
<td>GAN91234567890</td>
</tr>
</table>



## SetNetzanschlusspunktStromVerbraucher

Diese Funktion ermöglicht das Setzen von Daten an einem Netzanschlusspunkt im Rahmen einer Netzbetreiberprüfung. Nur der zuständige Netzbetreiber ist in der Lage, diese Funktion aufzurufen. Um einen neuen Netzanschlusspunkt zu erstellen, muss der Parameter „netzanschlusspunktMastrNummer“ im Objekt "NetzanschlusspunktStrom" leer gelassen werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>lokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>nameDerTechnischenLokation</td>
<td>Bezeichnung der Lokation, mit dem der Netzanschlusspunkt verbunden ist</td>
<td>string</td>
<td>Nein</td>
<td>LLK.13554.2456</td>
</tr>
<tr>
<td>netzanschlusspunkt</td>
<td>Daten des Netzanschlusspunkts</td>
<td><a href="#netzanschlusspunktstrom">NetzanschlusspunktStrom</a></td>
<td>Ja</td>
<td>4567 STR-34524-1234-Q</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>netzanschlusspunktMastrNummer</td>
<td>MaStR-Nummer des Netzanschlusses.</td>
<td><a href="#netzanschlusspunktmastrnummerid">NetzanschlusspunktMastrNummerId</a></td>
<td>Ja</td>
<td>GAN91234567890</td>
</tr>
</table>



## SetNetzanschlusspunktGasErzeuger

Diese Funktion ermöglicht das Setzen von Daten an einem Netzanschlusspunkt im Rahmen einer Netzbetreiberprüfung. Nur der zuständige Netzbetreiber ist in der Lage, diese Funktion aufzurufen. Um einen neuen Netzanschlusspunkt zu erstellen, muss der Parameter „netzanschlusspunktMastrNummer“ im Objekt "NetzanschlusspunktGas" leer gelassen werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>lokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>nameDerTechnischenLokation</td>
<td>Bezeichnung der Lokation, mit dem der Netzanschlusspunkt verbunden ist</td>
<td>string</td>
<td>Nein</td>
<td>LLK.13554.2456</td>
</tr>
<tr>
<td>netzanschlusspunkt</td>
<td>Daten des Netzanschlusspunkts</td>
<td><a href="#netzanschlusspunktgas">NetzanschlusspunktGas</a></td>
<td>Ja</td>
<td>1257 GAS-34524-1234-Q</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>netzanschlusspunktMastrNummer</td>
<td>MaStR-Nummer des Netzanschlusses.</td>
<td><a href="#netzanschlusspunktmastrnummerid">NetzanschlusspunktMastrNummerId</a></td>
<td>Ja</td>
<td>GAN91234567890</td>
</tr>
</table>



## SetNetzanschlusspunktGasVerbraucher

Diese Funktion ermöglicht das Setzen von Daten an einem Netzanschlusspunkt im Rahmen einer Netzbetreiberprüfung. Nur der zuständige Netzbetreiber ist in der Lage, diese Funktion aufzurufen. Um einen neuen Netzanschlusspunkt zu erstellen, muss der Parameter „netzanschlusspunktMastrNummer“ im Objekt "NetzanschlusspunktGas" leer gelassen werden.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>lokationMastrNummer</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>nameDerTechnischenLokation</td>
<td>Bezeichnung der Lokation, mit dem der Netzanschlusspunkt verbunden ist</td>
<td>string</td>
<td>Nein</td>
<td>LLK.13554.2456</td>
</tr>
<tr>
<td>netzanschlusspunkt</td>
<td>Daten des Netzanschlusspunkts</td>
<td><a href="#netzanschlusspunktgas">NetzanschlusspunktGas</a></td>
<td>Ja</td>
<td>1257 GAS-34524-1234-Q</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>netzanschlusspunktMastrNummer</td>
<td>MaStR-Nummer des Netzanschlusses.</td>
<td><a href="#netzanschlusspunktmastrnummerid">NetzanschlusspunktMastrNummerId</a></td>
<td>Ja</td>
<td>GAN91234567890</td>
</tr>
</table>



## DeleteNetzanschlusspunkt

Diese Funktion ermöglicht das Löschen von einem Netzanschlusspunkt an einer Lokation im Rahmen einer Netzbetreiberprüfung. Nur der zuständige Netzbetreiber ist in der Lage, diese Funktion aufzurufen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>netzanschlusspunktMastrNummer</td>
<td>MaStR-Nummer des Netzanschlusses.</td>
<td><a href="#netzanschlusspunktmastrnummerid">NetzanschlusspunktMastrNummerId</a></td>
<td>Ja</td>
<td>GAN91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
</table>



## GetListeMeineNetzanschlusspunkte

Diese Funktion ermöglicht das Abrufen von einem Netzanschlusspunkt an einer Lokation im Rahmen einer Netzbetreiberprüfung. Nur der zuständige Netzbetreiber ist in der Lage, diese Funktion aufzurufen.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>Einheitart</td>
<td>Art der Einheit</td>
<td><a href="#einheitartenum">EinheitArtEnum</a></td>
<td>Nein</td>
<td>Stromerzeugungseinheit</td>
</tr>
<tr>
<td>Einheittyp</td>
<td>Typ der Einheit</td>
<td><a href="#einheittypenum">EinheitTypEnum</a></td>
<td>Nein</td>
<td>Solareinheit</td>
</tr>
<tr>
<td>Regelzone</td>
<td>Regelzone des Netzanschlusspunktes</td>
<td><a href="#regelzoneenum">RegelzoneEnum</a></td>
<td>Nein</td>
<td>Amprion</td>
</tr>
<tr>
<td>einheitMastrNummer[]</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NetzanschlusspunktMastrNummer[]</td>
<td>MaStR-Nummer des Netzanschlusspunktes</td>
<td><a href="#netzanschlusspunktmastrnummerid">NetzanschlusspunktMastrNummerId</a></td>
<td>Nein</td>
<td>SAN91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>ListeNetzanschlusspunkte[]</td>
<td></td>
<td><a href="#netzanschlusspunktstromundgas">NetzanschlusspunktStromUndGas</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>



## GetListeAlleNetzanschlusspunkte

Diese Funktion ermöglicht das Abrufen von einem Netzanschlusspunkt an einer Lokation im Rahmen einer Netzbetreiberprüfung.

### Parameter

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>apiKey</td>
<td>Der Webdienst-Schlüssel für die Validierung.</td>
<td>string</td>
<td>Ja</td>
<td>4fil24gnio2gno24g2…</td>
</tr>
<tr>
<td>marktakteurMastrNummer</td>
<td>Die MaStR-Nummer des vom Webdienst-Benutzer verwendeten Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>startAb</td>
<td>Setzt den Beginn der zu liefernden Datensätze [Standardwert: 1].</td>
<td>int</td>
<td>Nein</td>
<td>100</td>
</tr>
<tr>
<td>datumAb</td>
<td>Einschränkung der abzurufenden Datenmenge auf geänderte Daten ab dem angegebenen Datum [Standardwert: NULL]</td>
<td>dateTime</td>
<td>Nein</td>
<td>2018-08-25T00:00:00.0000000</td>
</tr>
<tr>
<td>limit</td>
<td>Limit der maximal zu liefernden Datensätze [Standard-/Maximalwert: Maximum des eigenen Limits]</td>
<td>int</td>
<td>Nein</td>
<td>200</td>
</tr>
<tr>
<td>Einheitart</td>
<td>Art der Einheit</td>
<td><a href="#einheitartenum">EinheitArtEnum</a></td>
<td>Nein</td>
<td>Stromerzeugungseinheit</td>
</tr>
<tr>
<td>Einheittyp</td>
<td>Typ der Einheit</td>
<td><a href="#einheittypenum">EinheitTypEnum</a></td>
<td>Nein</td>
<td>Solareinheit</td>
</tr>
<tr>
<td>Regelzone</td>
<td>Regelzone des Netzanschlusspunktes</td>
<td><a href="#regelzoneenum">RegelzoneEnum</a></td>
<td>Nein</td>
<td>Amprion</td>
</tr>
<tr>
<td>einheitMastrNummer[]</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NetzanschlusspunktMastrNummer[]</td>
<td>MaStR-Nummer des Netzanschlusspunktes</td>
<td><a href="#netzanschlusspunktmastrnummerid">NetzanschlusspunktMastrNummerId</a></td>
<td>Nein</td>
<td>SAN91234567890</td>
</tr>
<tr>
<td>LokationMastrNummer[]</td>
<td>MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
</table>

### Antwort

<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Ergebniscode</td>
<td>Als Ergebniscode wird angegeben, ob die Anfrage korrekt verarbeitet wurde oder ob Daten nicht gefunden werden können. Bei Listenabfragen wird ebenfalls angegeben, ob weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs sind.</td>
<td><a href="#ergebniscodetyp">ErgebniscodeTyp</a></td>
<td>Ja</td>
<td>OK</td>
</tr>
<tr>
<td>AufrufVeraltet</td>
<td>Zeichen, ob eine neue Version der Webdienste bereitgestellt wird und bereits auf dem Testsystem existiert.</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>AufrufLebenszeitEnde</td>
<td>Datum, an dem diese Version des Webservice endet und durch eine neue ersetzt wird.</td>
<td>dateTime</td>
<td>Ja</td>
<td>2018-08-25T00:00:00.0000000 oder NULL</td>
</tr>
<tr>
<td>AufrufVersion</td>
<td>Die Versionsnummer des Webdienstes.</td>
<td>int</td>
<td>Ja</td>
<td>2</td>
</tr>
<tr>
<td>ListeNetzanschlusspunkte[]</td>
<td></td>
<td><a href="#netzanschlusspunktstromundgas">NetzanschlusspunktStromUndGas</a></td>
<td>Nein</td>
<td></td>
</tr>
</table>

# Datenstrukturen

## Bilanzierungsgebiet
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Id</td>
<td>Id des Bilanzierungsgebietes</td>
<td><a href="#bilanzierungsgebietid">BilanzierungsgebietId</a></td>
<td>Ja</td>
<td>14</td>
</tr>
<tr>
<td>Yeic</td>
<td>Y-Code des Bilanzierungsgebietes</td>
<td>string</td>
<td>Ja</td>
<td>11YV00000007046U</td>
</tr>
<tr>
<td>BilanzierungsgebietNetzanschlusspunkt</td>
<td>Bezeichnung des Bilanzierungsgebietes</td>
<td>string</td>
<td>Ja</td>
<td>Stromareal ABC</td>
</tr>
<tr>
<td>RegelzoneNetzanschlusspunkt</td>
<td>Regelzone des Netzanschlusspunktes</td>
<td><a href="#regelzoneenum">RegelzoneEnum</a></td>
<td>Ja</td>
<td>Amprion</td>
</tr>
</table>

## Einheit
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>EinheitMastrNummer</td>
<td>MaStR-Nummer der Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>DatumLetzeAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Name</td>
<td>Name der Einheit</td>
<td>string</td>
<td>Ja</td>
<td>Solarpark 4, Einheit 17</td>
</tr>
<tr>
<td>Einheitart</td>
<td>Art der Einheit</td>
<td><a href="#einheitartenum">EinheitArtEnum</a></td>
<td>Ja</td>
<td>Stromerzeugungseinheit</td>
</tr>
<tr>
<td>Einheittyp</td>
<td>Typ der Einheit</td>
<td><a href="#einheittypenum">EinheitTypEnum</a></td>
<td>Nein</td>
<td>Solareinheit</td>
</tr>
<tr>
<td>Standort</td>
<td>Standort der Einheit: Land (falls nicht Deutschland), Postleitzahl, Ort, Straße, Hausnummer, (falls Wind auf See: Seelage, Cluster)</td>
<td>string</td>
<td>Ja</td>
<td>Großer Weg 41 3912 Wien Österreich</td>
</tr>
<tr>
<td>Bruttoleistung</td>
<td>Buttoleistung der Einheit in kW</td>
<td>decimal</td>
<td>Nein</td>
<td>25000</td>
</tr>
<tr>
<td>Erzeugungsleistung</td>
<td>Leistung der Gaserzeugungseinheit</td>
<td>decimal</td>
<td>Nein</td>
<td>25000.002</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Nein</td>
<td>InPlanung</td>
</tr>
<tr>
<td>Anlagenbetreiber</td>
<td>Betreiber der Anlage.</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>EegMastrNummer</td>
<td>Angaben über optional zugeordnete EEG-Anlagen</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Nein</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>KwkMastrNummer</td>
<td>Angaben über optional zugeordnete KWK-Anlagen</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Nein</td>
<td>KWK91234567890</td>
</tr>
<tr>
<td>SpeMastrNummer</td>
<td>Angaben über optional zugeordnete Speicher</td>
<td><a href="#stromspeichermastrnummerid">StromSpeicherMastrNummerId</a></td>
<td>Nein</td>
<td>SPE91234567890</td>
</tr>
<tr>
<td>GenMastrNummer</td>
<td>Angaben über optional zugeordnete Genehmigungen</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Nein</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>BestandsanlageMastrNummer</td>
<td>Angaben über optional vorhandene MaStR-Nummer aus der Bestandsanlagenverwaltung</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567890</td>
</tr>
<tr>
<td>NichtVorhandenInMigriertenEinheiten</td>
<td>Angabe über das Nichtvorhandensein in den migrierten Einheiten</td>
<td>boolean</td>
<td>Nein</td>
<td>true</td>
</tr>
</table>

## EinheitLetzteAktualisierung
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>EinheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
             </td>
</tr>
<tr>
<td>Einheitart</td>
<td>Art der Einheit</td>
<td><a href="#einheitartenum">EinheitArtEnum</a></td>
<td>Ja</td>
<td>Stromerzeugungseinheit</td>
</tr>
<tr>
<td>Einheittyp</td>
<td>Typ der Einheit</td>
<td><a href="#einheittypenum">EinheitTypEnum</a></td>
<td>Ja</td>
<td>Solareinheit</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Nein</td>
<td>EndgueltigStillgelegt</td>
</tr>
<tr>
<td>EinheitDatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Anlagenbetreiber</td>
<td>Angaben über den zugeordneten Anlagenbetreiber</td>
<td><a href="#letzteaktualisierunganlagenbetreiber">LetzteAktualisierungAnlagenbetreiber</a></td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Lokation</td>
<td>Angaben über die zugeordnete Lokation</td>
<td><a href="#letzteaktualisierunglokation">LetzteAktualisierungLokation</a></td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>EEG</td>
<td>Angaben über die zugeordnete EEG</td>
<td><a href="#letzteaktualisierungeeg">LetzteAktualisierungEEG</a></td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>KWK</td>
<td>Angaben über die zugeordnete KWK</td>
<td><a href="#letzteaktualisierungkwk">LetzteAktualisierungKWK</a></td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Genehmigung</td>
<td>Angaben über die zugeordnete Genehmigung</td>
<td><a href="#letzteaktualisierunggenehmigung">LetzteAktualisierungGenehmigung</a></td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Speicher</td>
<td>Angaben über den zugeordneten Speicher</td>
<td><a href="#letzteaktualisierungspeicher">LetzteAktualisierungSpeicher</a></td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>Netzbetreiberpruefungsprozesse[]</td>
<td>Angaben über die zugeordneten NetzbetreiberPruefunungsProzesse</td>
<td><a href="#letzteaktualisierungnetzbetreiberpruefungsprozess">LetzteAktualisierungNetzbetreiberpruefungsprozess</a></td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>

## EinheitMitOrtUndPlz
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>MaStRNummer</td>
<td></td>
<td><a href="#mastrnummerid">MaStRNummerId</a></td>
<td>Ja</td>
<td></td>
</tr>
<tr>
<td>Einheittyp</td>
<td></td>
<td><a href="#einheittypenum">EinheitTypEnum</a></td>
<td>Ja</td>
<td></td>
</tr>
<tr>
<td>Einheitart</td>
<td></td>
<td><a href="#einheitartenum">EinheitArtEnum</a></td>
<td>Ja</td>
<td></td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td></td>
<td>dateTime</td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>Gemeinde</td>
<td></td>
<td>string</td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>Gemeindeschluessel</td>
<td></td>
<td>string</td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>Postleitzahl</td>
<td></td>
<td>string</td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>Ort</td>
<td></td>
<td>string</td>
<td>Nein</td>
<td></td>
</tr>
</table>

## EinheitMitStatus
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>einheitMastrNummer</td>
<td>Die MaStR-Nummer der gewünschten Einheit</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Ja</td>
<td>SEE91234567890 
             </td>
</tr>
<tr>
<td>Einheitart</td>
<td>Art der Einheit</td>
<td><a href="#einheitartenum">EinheitArtEnum</a></td>
<td>Ja</td>
<td>Stromerzeugungseinheit</td>
</tr>
<tr>
<td>Einheittyp</td>
<td>Typ der Einheit</td>
<td><a href="#einheittypenum">EinheitTypEnum</a></td>
<td>Ja</td>
<td>Solareinheit</td>
</tr>
<tr>
<td>EinheitSystemstatus</td>
<td>Systemstatus der Einheit</td>
<td><a href="#anlagensystemstatusenum">AnlagenSystemStatusEnum</a></td>
<td>Nein</td>
<td>Deaktiviert</td>
</tr>
<tr>
<td>EinheitBetriebsstatus</td>
<td>Betriebsstatus der Einheit</td>
<td><a href="#anlagenbetriebsstatusenum">AnlagenBetriebsStatusEnum</a></td>
<td>Nein</td>
<td>EndgueltigStillgelegt</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>

## Ertuechtigung
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Id</td>
<td>Id der Ertüchtigung</td>
<td><a href="#ertuechtigungid">ErtuechtigungId</a></td>
<td>Ja</td>
<td>123</td>
</tr>
<tr>
<td>ArtDerErtuechtigung</td>
<td>Ertüchtigungsmaßnahme bei Wasserkrafteinheiten</td>
<td><a href="#ertuechtigungsmassnahmewasserkraftenum">ErtuechtigungsmassnahmeWasserkraftEnum</a></td>
<td>Ja</td>
<td>AutomatischeWasserstandsregelung</td>
</tr>
<tr>
<td>DatumWiederinbetriebnahme</td>
<td>Datum der Wiederinbetriebnahme nach Durchführung der Ertüchtigungsmaßnahme</td>
<td>date</td>
<td>Nein</td>
<td>2018-07-08</td>
</tr>
<tr>
<td>ProzentualeErhoehungDesLv</td>
<td>Prozentuale Erhöhung des Leistungsvermögens</td>
<td>decimal</td>
<td>Ja</td>
<td>123.45</td>
</tr>
<tr>
<td>ZulassungspflichtigeMassnahme</td>
<td>Die Ertüchtigungsmaßnahme bedrufte einer wasserrechtlich Zulassung</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
</table>

## ErweiterteWeitereBrennstoffe
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Wert[]</td>
<td>Der Wert des Parameters als WeitereBrennstoffeEnum-Objekt. Dieser Wert muss angegeben bzw. als nicht vorhanden gekennzeichnet sein</td>
<td><a href="#weiterebrennstoffeenum">WeitereBrennstoffeEnum</a></td>
<td>Nein (nillable)</td>
<td>Katalogwert</td>
</tr>
<tr>
<td>NichtVorhanden</td>
<td>Angabe, ob der Wert nicht vorhanden ist</td>
<td>boolean</td>
<td>Ja (nillable)</td>
<td>true</td>
</tr>
</table>

## ErweiterterInt
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Wert</td>
<td>Der Wert des Parameters als Int. Dieser Wert muss angegeben bzw. als nicht vorhanden gekennzeichnet sein</td>
<td>int</td>
<td>Ja (nillable)</td>
<td>1234</td>
</tr>
<tr>
<td>NichtVorhanden</td>
<td>Angabe, ob der Wert nicht vorhanden ist</td>
<td>boolean</td>
<td>Ja (nillable)</td>
<td>true</td>
</tr>
</table>

## ErweiterterKatalogwert
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Wert</td>
<td>Der Wert des Parameters als Katalogwertobjekt. Dieser Wert muss angegeben bzw. als nicht vorhanden gekennzeichnet sein</td>
<td><a href="#katalogwert">Katalogwert</a></td>
<td>Ja (nillable)</td>
<td>Katalogwert</td>
</tr>
<tr>
<td>NichtVorhanden</td>
<td>Angabe, ob der Wert nicht vorhanden ist</td>
<td>boolean</td>
<td>Ja (nillable)</td>
<td>true</td>
</tr>
</table>

## ErweiterterKatalogwertId
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Wert</td>
<td>Der Wert des Parameters als KatalogwertId. Dieser Wert muss angegeben bzw. als nicht vorhanden gekennzeichnet sein</td>
<td><a href="#katalogwertid">KatalogwertId</a></td>
<td>Ja (nillable)</td>
<td>345</td>
</tr>
<tr>
<td>NichtVorhanden</td>
<td>Angabe, ob der Wert nicht vorhanden ist</td>
<td>boolean</td>
<td>Ja (nillable)</td>
<td>true</td>
</tr>
</table>

## ErweiterterString
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Wert</td>
<td>Der Wert des Parameters als String. Dieser Wert muss angegeben bzw. als nicht vorhanden gekennzeichnet sein</td>
<td>string</td>
<td>Ja (nillable)</td>
<td>ABCD 1234</td>
</tr>
<tr>
<td>NichtVorhanden</td>
<td>Angabe, ob der Wert nicht vorhanden ist</td>
<td>boolean</td>
<td>Ja (nillable)</td>
<td>true</td>
</tr>
</table>

## ErweiterterWeitereBrennstoffe
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Wert</td>
<td>Der Wert des Parameters als VerbrennungBrennstoffEnum-Objekt. Dieser Wert muss angegeben bzw. als nicht vorhanden gekennzeichnet sein</td>
<td><a href="#weiterebrennstoffeenum">WeitereBrennstoffeEnum</a></td>
<td>Ja (nillable)</td>
<td>Katalogwert</td>
</tr>
<tr>
<td>NichtVorhanden</td>
<td>Angabe, ob der Wert nicht vorhanden ist</td>
<td>boolean</td>
<td>Ja (nillable)</td>
<td>true</td>
</tr>
</table>

## ErweitertesDate
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Wert</td>
<td>Der Wert des Parameters als Date-Objekt. Dieser Wert muss angegeben bzw. als nicht vorhanden gekennzeichnet sein</td>
<td>date</td>
<td>Ja (nillable)</td>
<td>1979-05-06</td>
</tr>
<tr>
<td>NichtVorhanden</td>
<td>Angabe, ob der Wert nicht vorhanden ist</td>
<td>boolean</td>
<td>Ja (nillable)</td>
<td>true</td>
</tr>
</table>

## ErweitertesDecimal
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Wert</td>
<td>Der Wert des Parameters als Decimal-Objekt. Dieser Wert muss angegeben bzw. als nicht vorhanden gekennzeichnet sein</td>
<td>decimal</td>
<td>Ja (nillable)</td>
<td>12.34</td>
</tr>
<tr>
<td>NichtVorhanden</td>
<td>Angabe, ob der Wert nicht vorhanden ist</td>
<td>boolean</td>
<td>Ja (nillable)</td>
<td>true</td>
</tr>
</table>

## Katalogkategorie
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Id</td>
<td>Id der Katalogkategorie</td>
<td><a href="#katalogkategorieid">KatalogkategorieId</a></td>
<td>Ja</td>
<td>1</td>
</tr>
<tr>
<td>Name</td>
<td>Name der Katalogkategorie</td>
<td>string</td>
<td>Ja</td>
<td>Sparte</td>
</tr>
</table>

## Katalogwert
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Id</td>
<td>Id des Katalogwertes</td>
<td><a href="#katalogwertid">KatalogwertId</a></td>
<td>Ja</td>
<td>14</td>
</tr>
<tr>
<td>Wert</td>
<td>Wert des Katalogwertes</td>
<td>string</td>
<td>Ja</td>
<td>Strom</td>
</tr>
</table>

## KorrekturdatenGaussKrueger
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>gaussKruegerHoch</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert</td>
<td>decimal</td>
<td>Nein</td>
<td>4467223.649</td>
</tr>
<tr>
<td>gaussKruegerHochZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Hochwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>gaussKruegerRechts</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert</td>
<td>decimal</td>
<td>Nein</td>
<td>5767667.634</td>
</tr>
<tr>
<td>gaussKruegerRechtsZuPruefen</td>
<td>Koordinaten der Einheit: Gauß-Krüger-Rechtswert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

## KorrekturdatenGeographischeKoordinaten
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>laengengrad</td>
<td>Koordinaten der Einheit: Längengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>20.02.1900</td>
</tr>
<tr>
<td>laengengradZuPruefen</td>
<td>Koordinaten der Einheit: Längengrad (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>breitengrad</td>
<td>Koordinaten der Einheit: Breitengrad</td>
<td>decimal</td>
<td>Nein</td>
<td>12.597</td>
</tr>
<tr>
<td>breitengradZuPruefen</td>
<td>Koordinaten der Einheit: Breitengrad (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

## KorrekturdatenGeographischeLage
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>GeographischeKoordinaten</td>
<td>Angabe als geographische Koordinaten</td>
<td><a href="#korrekturdatengeographischekoordinaten">KorrekturdatenGeographischeKoordinaten</a></td>
<td>Ja</td>
<td></td>
</tr>
<tr>
<td>UTM</td>
<td>Angabe in UTM-Notation</td>
<td><a href="#korrekturdatenutm">KorrekturdatenUTM</a></td>
<td>Ja</td>
<td></td>
</tr>
<tr>
<td>GaussKrueger</td>
<td>Angabe in Gauß-Krüger-Notation</td>
<td><a href="#korrekturdatengausskrueger">KorrekturdatenGaussKrueger</a></td>
<td>Ja</td>
<td></td>
</tr>
</table>

## KorrekturdatenUTM
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>utmZonenwert</td>
<td>Koordinaten der Einheit: UTM-Zonenwert</td>
<td>int</td>
<td>Nein</td>
<td>32</td>
</tr>
<tr>
<td>utmZonenwertZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Zonenwert (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmEast</td>
<td>Koordinaten der Einheit: UTM-Ost</td>
<td>decimal</td>
<td>Nein</td>
<td>672876</td>
</tr>
<tr>
<td>utmEastZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Ost (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
<tr>
<td>utmNorth</td>
<td>Koordinaten der Einheit: UTM-Nord</td>
<td>decimal</td>
<td>Nein</td>
<td>5768696</td>
</tr>
<tr>
<td>utmNorthZuPruefen</td>
<td>Koordinaten der Einheit: UTM-Nord (Prüfungskennzeichen)</td>
<td>boolean</td>
<td>Nein</td>
<td>false</td>
</tr>
</table>

## LetzteAktualisierungAnlagenbetreiber
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>Anlagenbetreiber</td>
<td>Die MaStR-Nummer des Anlagenbetreibers</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>

## LetzteAktualisierungEEG
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>EegMastrNummer</td>
<td>Angaben über optional zugeordnete EEG-Anlagen</td>
<td><a href="#eegmastrnummerid">EegMastrNummerId</a></td>
<td>Ja</td>
<td>EEG91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>

## LetzteAktualisierungGenehmigung
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>GenMastrNummer</td>
<td>Angaben über optional zugeordnete Genehmigungen</td>
<td><a href="#genmastrnummerid">GenMastrNummerId</a></td>
<td>Ja</td>
<td>GEN91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>

## LetzteAktualisierungKWK
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>KwkMastrNummer</td>
<td>Angaben über optional zugeordnete KWK-Anlagen</td>
<td><a href="#kwkmastrnummerid">KwkMastrNummerId</a></td>
<td>Ja</td>
<td>KWK91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>

## LetzteAktualisierungLokation
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>LokationMastrNummer</td>
<td>Die MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>

## LetzteAktualisierungNetzbetreiberpruefungsprozess
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td><a href="#netzbetreiberpruefungid">NetzbetreiberpruefungId</a></td>
<td>Ja</td>
<td>131433</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>

## LetzteAktualisierungSpeicher
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>SpeMastrNummer</td>
<td>Angaben über optional zugeordnete Speicher</td>
<td><a href="#stromspeichermastrnummerid">StromSpeicherMastrNummerId</a></td>
<td>Ja</td>
<td>SPE91234567890</td>
</tr>
<tr>
<td>DatumLetzteAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
</table>

## Lokation
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>LokationMastrNummer</td>
<td>Die MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Ja</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NameDerTechnischenLokation</td>
<td>Name der technischen Lokation</td>
<td>string</td>
<td>Nein</td>
<td>54-Haupt-3354</td>
</tr>
<tr>
<td>Lokationtyp</td>
<td>Typ der Lokation</td>
<td><a href="#lokationtypenum">LokationTypEnum</a></td>
<td>Ja</td>
<td>Stromerzeugungslokation</td>
</tr>
<tr>
<td>AnzahlNetzanschlusspunkte</td>
<td>Anzahl der Netzanschlusspunkte</td>
<td>int</td>
<td>Ja</td>
<td>3</td>
</tr>
</table>

## Marktakteur
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>MarktakteurMastrNummer</td>
<td>MaStR-Nummer des Marktakteurs</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>Personenart</td>
<td>Angabe der Personenart des Marktakteurs: natürliche Person oder Organisation</td>
<td><a href="#personenartenum">PersonenartEnum</a></td>
<td>Ja</td>
<td>Organisation</td>
</tr>
<tr>
<td>Marktakteur</td>
<td>Name der Organisation mit dem rechtsformergänzenden Namenszusatz</td>
<td>string</td>
<td>Ja</td>
<td>Stromnetz Land AG</td>
</tr>
<tr>
<td>Marktfunktion</td>
<td>Marktfunktion des Marktakteurs</td>
<td><a href="#marktfunktionenum">MarktfunktionEnum</a></td>
<td>Ja</td>
<td>Stromnetzbetreiber</td>
</tr>
<tr>
<td>Marktrollen[]</td>
<td>Auflistung der zugeordneten Marktrollen und deren Daten</td>
<td><a href="#marktrolle">Marktrolle</a></td>
<td>Nein</td>
<td>z.B.: NetzbetreiberAnschlussnetzbetreiberStrom</td>
</tr>
<tr>
<td>Bundesland</td>
<td>Das Bundesland, in dem der Marktakteur seinen Sitz hat.</td>
<td><a href="#bundeslaenderenum">BundeslaenderEnum</a></td>
<td>Nein</td>
<td>Bayern</td>
</tr>
<tr>
<td>Postleitzahl</td>
<td>Die Postleitzahl, in deren Gebiet der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>1600</td>
</tr>
<tr>
<td>Ort</td>
<td>Der Ort des Marktakteurs</td>
<td>string</td>
<td>Ja</td>
<td>Magdeburg</td>
</tr>
<tr>
<td>Strasse</td>
<td>Die Straße, in der der Marktakteur seinen Sitz hat.</td>
<td>string</td>
<td>Nein</td>
<td>Musterfrau-Str.</td>
</tr>
<tr>
<td>Hausnummer</td>
<td>Die Hausnummer, an der der Marktakteur seinen Sitz hat.</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>2</td>
</tr>
<tr>
<td>Land</td>
<td>Das Land, in dem der Marktakteur seinen Sitz hat</td>
<td><a href="#landenum">LandEnum</a></td>
<td>Nein</td>
<td>Oesterreich</td>
</tr>
<tr>
<td>RegistrierungsdatumMarktakteur</td>
<td>Registrierungsdatum</td>
<td>date</td>
<td>Nein</td>
<td>2000-12-31-</td>
</tr>
<tr>
<td>DatumLetzeAktualisierung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>AcerCode</td>
<td>Der ACER-Code des Marktakteurs</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Nein</td>
<td>ACE2442523454</td>
</tr>
<tr>
<td>GeschlossenesVerteilernetz</td>
<td>Geschlossenes Verteilernetz gemäß §110 EnWG</td>
<td>boolean</td>
<td>Ja</td>
<td>true</td>
</tr>
<tr>
<td>Taetigkeitsbeginn</td>
<td>Tätigkeitsbeginn des Marktakteurs</td>
<td>date</td>
<td>Nein</td>
<td>2014-02-04</td>
</tr>
<tr>
<td>Taetigkeitsende</td>
<td>Tätigkeitsende des Marktakteurs</td>
<td><a href="#erweitertesdate">ErweitertesDate</a></td>
<td>Nein</td>
<td>2012-05-06</td>
</tr>
<tr>
<td>Status</td>
<td>Der Status des Marktakteurs</td>
<td><a href="#marktakteurstatusenum">MarktakteurStatusEnum</a></td>
<td>Ja</td>
<td>Aktiviert</td>
</tr>
<tr>
<td>Marktakteursvertreter</td>
<td>Der zugeordnete, verantwortliche Marktakteursvertreter</td>
<td>string</td>
<td>Ja</td>
<td>Frau Erika Mustermann</td>
</tr>
<tr>
<td>RollenImMarktakteur[]</td>
<td>Die Rollen des Webdienst-Benutzers in diesem Marktakteur</td>
<td><a href="#rollenenum">RollenEnum</a></td>
<td>Nein</td>
<td>MarktakteursVertreter</td>
</tr>
</table>

## Marktrolle
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>MarktrolleMastrNummerId</td>
<td>Die MaStR-Nummer der Marktrolle des Marktakteurs entsprechend dem Nummernkreis</td>
<td><a href="#marktrollemastrnummerid">MarktrolleMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890AN</td>
</tr>
<tr>
<td>Marktrolle</td>
<td>Die Marktrolle des Marktakteurs</td>
<td><a href="#marktrollenenum">MarktrollenEnum</a></td>
<td>Ja</td>
<td>EnergiemarktakteureStromlieferant</td>
</tr>
<tr>
<td>BundesnetzagenturBetriebsnummer</td>
<td>BNetzA-Betriebsnummer (nur bei Messtellenbetreiber, Stromlieferanten, Transportkunden)</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>12345678</td>
</tr>
<tr>
<td>Marktpartneridentifikationsnummer</td>
<td>Die Marktpartneridentifikationsnummer (MP-ID) (nicht bei Übertragungsnetzbetreiber, Marktgebietsverantwortlichen)</td>
<td><a href="#erweiterterstring">ErweiterterString</a></td>
<td>Ja</td>
<td>9906550000000</td>
</tr>
<tr>
<td>KontaktdatenMarktrolle</td>
<td>vMAV und die Telefonnummer,</td>
<td>string</td>
<td>Nein</td>
<td>Max Mustermann, 0170 000000</td>
</tr>
</table>

## Netz
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>GeschlossenesVerteilernetz</td>
<td>Geschlossenes Verteilernetz gemäß §110 EnWG</td>
<td>boolean</td>
<td>Ja</td>
<td>true</td>
</tr>
<tr>
<td>Bundeslaender[]</td>
<td>Bundesländer des Netzgebietes</td>
<td><a href="#bundeslaendereinheitenenum">BundeslaenderEinheitenEnum</a></td>
<td>Ja</td>
<td>SachsenAnhalt</td>
</tr>
<tr>
<td>MehrAls100000Kunden</td>
<td>Mehr als 100.000 Kunden im Netzgebiet</td>
<td>boolean</td>
<td>Ja</td>
<td>true</td>
</tr>
<tr>
<td>Bilanzierungsgebiete[]</td>
<td>Bilanzierungsgebiete des Netzgebietes (bei Stromnetzbetreibern)</td>
<td><a href="#bilanzierungsgebiet">Bilanzierungsgebiet</a></td>
<td>Nein</td>
<td>14, 11YV00000007046U, Stromareal ABC, Amprion</td>
</tr>
</table>

## NetzanschlusspunktGas
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>NetzbetreiberMastrNummer</td>
<td>MaStR-Nummer des Netzbetreibers</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>NetzanschlusspunktMastrNummer</td>
<td>MaStR-Nummer des Netzanschlusspunktes</td>
<td><a href="#netzanschlusspunktmastrnummerid">NetzanschlusspunktMastrNummerId</a></td>
<td>Nein</td>
<td>GAN91234567890</td>
</tr>
<tr>
<td>NetzanschlusspunktBezeichnung</td>
<td>Bezeichnung des Netzanschlusspunktes</td>
<td>string</td>
<td>Nein</td>
<td>GAS-34524-1234-Q</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>GeplanterNetzanschlusspunkt</td>
<td>Befindet sich der Netzanschlusspunkt noch in Planung?</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>Messlokation</td>
<td>Messlokation gemäß Metering Code, VDE-AR-N 4400</td>
<td>string</td>
<td>Nein</td>
<td>DE00056266802…</td>
</tr>
<tr>
<td>MaximaleEinspeiseleistung</td>
<td>Maximale Einspeiseleistung am Netzanschlusspunkt</td>
<td>decimal</td>
<td>Nein</td>
<td>2569.321</td>
</tr>
<tr>
<td>MaximaleAusspeiseleistung</td>
<td>Technisch maximale Ausspeiseleistung am jeweiligen Netzanschlusspunkt (nur bei Gasverbrauchern)</td>
<td>decimal</td>
<td>Nein</td>
<td>2569.321</td>
</tr>
<tr>
<td>Gasqualitaet</td>
<td>Gasqualität am Netzanschlusspunkt</td>
<td><a href="#gasqualitaetenum">GasqualitaetEnum</a></td>
<td>Nein</td>
<td>LGas</td>
</tr>
</table>

## NetzanschlusspunktStrom
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>NetzbetreiberMastrNummer</td>
<td>MaStR-Nummer des Netzbetreibers</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Ja</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>NetzanschlusspunktMastrNummer</td>
<td>MaStR-Nummer des Netzanschlusspunktes</td>
<td><a href="#netzanschlusspunktmastrnummerid">NetzanschlusspunktMastrNummerId</a></td>
<td>Nein</td>
<td>SAN91234567890</td>
</tr>
<tr>
<td>NetzanschlusspunktBezeichnung</td>
<td>Bezeichnung des Netzanschlusspunktes</td>
<td>string</td>
<td>Nein</td>
<td>STR-34524-1234-Q</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>GeplanterNetzanschlusspunkt</td>
<td>Befindet sich der Netzanschlusspunkt noch in Planung?</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>Messlokation</td>
<td>Messlokation gemäß Metering Code, VDE-AR-N 4400</td>
<td>string</td>
<td>Nein</td>
<td>DE00056266802…</td>
</tr>
<tr>
<td>Spannungsebene</td>
<td>Spannungsebene des Netzanschlusspunktes</td>
<td><a href="#spannungsebeneenum">SpannungsebeneEnum</a></td>
<td>Ja</td>
<td>Mittelspannung</td>
</tr>
<tr>
<td>Nettoengpassleistung</td>
<td>Erzielbare Dauerleistung der Erzeugungseinheiten am jeweiligen Netzanschlusspunkt</td>
<td>decimal</td>
<td>Nein</td>
<td>2569.321</td>
</tr>
<tr>
<td>BilanzierungsgebietNetzanschlusspunkt</td>
<td>Id des Bilanzierungsgebietes</td>
<td><a href="#bilanzierungsgebietid">BilanzierungsgebietId</a></td>
<td>Ja</td>
<td>14</td>
</tr>
<tr>
<td>Netzanschlusskapazitaet</td>
<td>Kapazität des Netzanschlusspunktes</td>
<td>decimal</td>
<td>Nein</td>
<td>2569.321</td>
</tr>
</table>

## NetzanschlusspunktStromUndGas
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>NetzanschlusspunktMastrNummer</td>
<td>MaStR-Nummer des Netzanschlusspunktes</td>
<td><a href="#netzanschlusspunktmastrnummerid">NetzanschlusspunktMastrNummerId</a></td>
<td>Ja</td>
<td>SAN91234567890</td>
</tr>
<tr>
<td>NetzanschlusspunktBezeichnung</td>
<td>Bezeichnung des Netzanschlusspunktes</td>
<td>string</td>
<td>Nein</td>
<td>STR-34524-1234-Q</td>
</tr>
<tr>
<td>LetzteAenderung</td>
<td>Datum der letzten Aktualisierung an diesem Objekt</td>
<td>dateTime</td>
<td>Ja</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>LokationMastrNummer</td>
<td>Die MaStR-Nummer der Lokation</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>NameDerTechnischenLokation</td>
<td>Name der technischen Lokation</td>
<td>string</td>
<td>Nein</td>
<td>54-Haupt-3354</td>
</tr>
<tr>
<td>Lokationtyp</td>
<td>Typ der Lokation</td>
<td><a href="#lokationtypenum">LokationTypEnum</a></td>
<td>Nein</td>
<td>Stromerzeugungslokation</td>
</tr>
<tr>
<td>Messlokation</td>
<td>Messlokation gemäß Metering Code, VDE-AR-N 4400</td>
<td>string</td>
<td>Nein</td>
<td>DE00056266802…</td>
</tr>
<tr>
<td>Spannungsebene</td>
<td>Spannungsebene des Netzanschlusspunktes</td>
<td><a href="#spannungsebeneenum">SpannungsebeneEnum</a></td>
<td>Nein</td>
<td>Mittelspannung</td>
</tr>
<tr>
<td>Nettoengpassleistung</td>
<td>Erzielbare Dauerleistung der Erzeugungseinheiten am jeweiligen Netzanschlusspunkt</td>
<td>decimal</td>
<td>Nein</td>
<td>2569.321</td>
</tr>
<tr>
<td>BilanzierungsgebietNetzanschlusspunkt</td>
<td>Id des Bilanzierungsgebietes</td>
<td><a href="#bilanzierungsgebietid">BilanzierungsgebietId</a></td>
<td>Nein</td>
<td>14</td>
</tr>
<tr>
<td>Netzanschlusskapazitaet</td>
<td>Kapazität des Netzanschlusspunktes</td>
<td>decimal</td>
<td>Nein</td>
<td>2569.321</td>
</tr>
<tr>
<td>MaximaleEinspeiseleistung</td>
<td>Maximale Einspeiseleistung am Netzanschlusspunkt</td>
<td>decimal</td>
<td>Nein</td>
<td>2569.321</td>
</tr>
<tr>
<td>MaximaleAusspeiseleistung</td>
<td>Technisch maximale Ausspeiseleistung am jeweiligen Netzanschlusspunkt (nur bei Gasverbrauchern)</td>
<td>decimal</td>
<td>Nein</td>
<td>2569.321</td>
</tr>
<tr>
<td>Gasqualitaet</td>
<td>Gasqualität am Netzanschlusspunkt</td>
<td><a href="#gasqualitaetenum">GasqualitaetEnum</a></td>
<td>Nein</td>
<td>LGas</td>
</tr>
<tr>
<td>RegelzoneNetzanschlusspunkt</td>
<td>Regelzone des Netzanschlusspunktes</td>
<td><a href="#regelzoneenum">RegelzoneEnum</a></td>
<td>Nein</td>
<td>Amprion</td>
</tr>
<tr>
<td>GeplanterNetzanschlusspunkt</td>
<td>Befindet sich der Netzanschlusspunkt noch in Planung?</td>
<td>boolean</td>
<td>Ja</td>
<td>false</td>
</tr>
<tr>
<td>EinheitMitOrtUndPlz[]</td>
<td>Die verknüpfte Einheit zu diesem Objekt</td>
<td><a href="#einheitmitortundplz">EinheitMitOrtUndPlz</a></td>
<td>Nein</td>
<td>EINHEIT</td>
</tr>
</table>

## Netzbetreiberpruefung
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>netzbetreiberpruefungId</td>
<td>Die Ticketprozess-Id als eindeutige Id der Prüfung</td>
<td><a href="#netzbetreiberpruefungid">NetzbetreiberpruefungId</a></td>
<td>Ja</td>
<td>131433</td>
</tr>
<tr>
<td>netzbetreiberpruefungTicketId</td>
<td>Die aktuelle Ticket-Id des Prozesses</td>
<td><a href="#netzbetreiberpruefungticketid">NetzbetreiberpruefungTicketId</a></td>
<td>Ja</td>
<td>7890</td>
</tr>
<tr>
<td>pruefungsstartTermin</td>
<td>Erstmaliger Start der Prüfung.</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>pruefungsendTermin</td>
<td>Datum, an dem die Prüfung abgeschlossen wurde</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-26T08:47:54.1004464</td>
</tr>
<tr>
<td>Inbetriebnahmedatum</td>
<td>Datum der Inbetriebnahme</td>
<td>date</td>
<td>Nein</td>
<td>1998-01-02</td>
</tr>
<tr>
<td>Registrierungsdatum</td>
<td>Das Registrierungsdatum der betroffenen Einheit</td>
<td>date</td>
<td>Nein</td>
<td>2022-01-21</td>
</tr>
<tr>
<td>letzteAenderung</td>
<td>Originaldatum der letzten Änderung an diesem Objekt</td>
<td>dateTime</td>
<td>Nein</td>
<td>2017-07-25T08:36:54.1004464</td>
</tr>
<tr>
<td>lokationMastrNummer</td>
<td>MaStR-Nummer der Lokation der zu prüfenden Einheit (keine Angabe bei neuen Einheiten)</td>
<td><a href="#lokationmastrnummerid">LokationMastrNummerId</a></td>
<td>Nein</td>
<td>SEL91234567890</td>
</tr>
<tr>
<td>lokationsTyp</td>
<td>Art der Lokation (keine Angabe bei neuen Einheiten)</td>
<td><a href="#lokationtypenum">LokationTypEnum</a></td>
<td>Nein</td>
<td>Stromerzeugungslokation</td>
</tr>
<tr>
<td>verknuepfteEinheit</td>
<td>Die verknüpfte Einheit zu diesem Objekt</td>
<td><a href="#verknuepfteeinheit">VerknuepfteEinheit</a></td>
<td>Ja</td>
<td>EINHEIT</td>
</tr>
<tr>
<td>anlagenbetreiberMastrNummer</td>
<td>MaStR-Nummer des Anlagenbetreibers</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>ABR91234567890</td>
</tr>
<tr>
<td>netzbetreiberMastrNummer</td>
<td>MaStR-Nummer des Netzbetreibers</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>identifikationsnummer</td>
<td>Optionale Angabe eines eindeutigen Identifikators vom Netzbetreiber für die Einheit</td>
<td>string</td>
<td>Nein</td>
<td>FDHIK764-0086-HGD</td>
</tr>
<tr>
<td>bemerkung</td>
<td>Anzeige der letzten Bemerkung des Tickets</td>
<td>string</td>
<td>Nein</td>
<td>Die Angabe des Codes finden wir falsch</td>
</tr>
<tr>
<td>einheitVorschlag</td>
<td>Vorschlag eines Anlagenbetreibers zum Verbinden der Einheiten untereinander und zum Verweisen auf eine Fremdanlage</td>
<td><a href="#einheitmastrnummerid">EinheitMastrNummerId</a></td>
<td>Nein</td>
<td>SEE91234567899</td>
</tr>
<tr>
<td>korrekturVorschlagIds[]</td>
<td>Die IDs der Korrekturvorschläge, insofern welche zu dieser Prüfung existieren, sonst NULL</td>
<td><a href="#korrekturvorschlagid">KorrekturVorschlagId</a></td>
<td>Nein</td>
<td>5975654</td>
</tr>
<tr>
<td>spannungsebene</td>
<td>Spannungsebene, Angabe nur bei Stromerzeugungs und -verbrauchseinheiten</td>
<td><a href="#spannungsebeneenum">SpannungsebeneEnum</a></td>
<td>Nein</td>
<td>Mittelspannung</td>
</tr>
<tr>
<td>status</td>
<td>Status der Netzbetreiberprüfung</td>
<td><a href="#netzbetreiberpruefungsstatusenum">NetzbetreiberpruefungsStatusEnum</a></td>
<td>Ja</td>
<td>Ungeprueft</td>
</tr>
<tr>
<td>TicketMitStatus[]</td>
<td>Eine Liste von TicketIds und Status</td>
<td><a href="#ticketmitstatus">TicketMitStatus</a></td>
<td>Nein</td>
<td>334551 - Offen</td>
</tr>
<tr>
<td>kategorie</td>
<td>Kategorie der Netzbetreiberprüfung</td>
<td><a href="#netzbetreiberpruefungskategorieenum">NetzbetreiberpruefungsKategorieEnum</a></td>
<td>Ja</td>
<td>WiedervorlageNetzbetreiberpruefung</td>
</tr>
<tr>
<td>klaerungsGrund</td>
<td>Angabe des Grunds für die Klärung bei der BNetzA</td>
<td><a href="#klaerungsgrundenum">KlaerungsGrundEnum</a></td>
<td>Nein</td>
<td>EinheitExistiertNicht</td>
</tr>
<tr>
<td>neustartGrund</td>
<td>Der Grund des Neustarts einer Netzbetreiberprüfung</td>
<td>string</td>
<td>Nein</td>
<td></td>
</tr>
<tr>
<td>aenderungsGrundArtDerStromerzeugung</td>
<td>Angabe des Grunds zur Änderung der Art der Stromerzeugung</td>
<td>string</td>
<td>Nein</td>
<td>Änderung auf Biomasse</td>
</tr>
<tr>
<td>StartgrundNetzbetreiberpruefung</td>
<td>Angabe des Grunds für den Start der Netzbetreiberprüfung</td>
<td><a href="#startgrundnetzbetreiberpruefung">StartgrundNetzbetreiberpruefung</a></td>
<td>Nein</td>
<td>Inbetriebnahme</td>
</tr>
<tr>
<td>AbbruchgrundNetzbetreiberpruefung</td>
<td>Angabe des Grunds für den Abbruch der Netzbetreiberprüfung</td>
<td><a href="#abbruchgrundnetzbetreiberpruefung">AbbruchgrundNetzbetreiberpruefung</a></td>
<td>Nein</td>
<td>Betreiberwechsel</td>
</tr>
<tr>
<td>LetzterVorgang</td>
<td>Letzter Vorgang des Prozesses</td>
<td>string</td>
<td>Nein</td>
<td>Die Einheit wurde in Betrieb genommen.</td>
</tr>
<tr>
<td>NetzbetreiberpruefungTicketErstellungsDatum</td>
<td>Erstellungsdatum des aktuellen Tickets des Prozesses</td>
<td>date</td>
<td>Nein</td>
<td>2020-01-21</td>
</tr>
<tr>
<td>FristverlaengerungAntragstellungDatum</td>
<td>Datum der Antragstellung der Fristverlängerung</td>
<td>date</td>
<td>Nein</td>
<td>2021-02-21</td>
</tr>
<tr>
<td>FristverlaengerungGrund</td>
<td>Angabe des Grunds für die Fristverlängerung</td>
<td><a href="#fristverlaengerunggrundenum">FristverlaengerungGrundEnum</a></td>
<td>Nein</td>
<td>BetreiberwechselmeldungFehlt</td>
</tr>
<tr>
<td>FristverlaengerungErlaeuterung</td>
<td>Begründungstext (nur möglich bei Katalogwert technischer Fehler oder sonstiges)</td>
<td>string</td>
<td>Nein</td>
<td>Bearbeitung nicht möglich</td>
</tr>
<tr>
<td>FristverlaengerungBearbeitungsStatus</td>
<td>Der Status, in dem sich der Antrag befindet</td>
<td><a href="#fristverlaengerungbearbeitungsstatus">FristverlaengerungBearbeitungsStatus</a></td>
<td>Nein</td>
<td>Offen</td>
</tr>
<tr>
<td>AktuelleFrist</td>
<td>Die aktuelle Frist</td>
<td>date</td>
<td>Nein</td>
<td>2022-12-31</td>
</tr>
<tr>
<td>Frist</td>
<td>Datum der Frist für die Ticketbearbeitung</td>
<td>date</td>
<td>Nein</td>
<td>2022-12-31</td>
</tr>
<tr>
<td>FristverlaengerungAblehnungstext</td>
<td>Grund der Ablehnung</td>
<td>string</td>
<td>Nein</td>
<td>Antrag abgelehnt</td>
</tr>
</table>

## Netzbetreiberzuordnung
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>NetzbetreiberMastrNummer</td>
<td>MaStR-Nummer des Netzbetreibers</td>
<td><a href="#marktakteurmastrnummerid">MarktakteurMastrNummerId</a></td>
<td>Nein</td>
<td>SNB91234567890</td>
</tr>
<tr>
<td>NetzbetreiberpruefungsDatum</td>
<td>Datum der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td>date</td>
<td>Nein</td>
<td>2017-08-02</td>
</tr>
<tr>
<td>NetzbetreiberpruefungsStatus</td>
<td>Der Status der letzten Netzbetreiberprüfung, insofern eine durchgeführt wurde</td>
<td><a href="#netzbetreiberzuordnungsstatusenum">NetzbetreiberzuordnungsStatusEnum</a></td>
<td>Nein</td>
<td>Geprueft</td>
</tr>
</table>

## NutsZweiRegion
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>nuts2Id</td>
<td>NUTS-Code der Region</td>
<td><a href="#nuts2id">Nuts2Id</a></td>
<td>Ja</td>
<td>AT130</td>
</tr>
<tr>
<td>nuts2Beschreibung</td>
<td>Beschreibung der Region</td>
<td>string</td>
<td>Ja</td>
<td>Wien</td>
</tr>
</table>

## TicketMitStatus
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>NetzbetreiberpruefungTicketId</td>
<td>Die aktuelle Ticket-Id des Prozesses</td>
<td><a href="#netzbetreiberpruefungticketid">NetzbetreiberpruefungTicketId</a></td>
<td>Nein</td>
<td>7890</td>
</tr>
<tr>
<td>Ticketstatus</td>
<td>Status des Tickets</td>
<td><a href="#ticketstatusenum">TicketStatusEnum</a></td>
<td>Nein</td>
<td>Offen</td>
</tr>
</table>

## VerknuepfteEinheit
<table><tr><td style="width:15%">Name</td><td style="width:55%">Beschreibung</td><td style="width:5%">Typ</td><td style="width:5%">Pflicht</td><td style="width:20%">Beispiel</td></tr><tr>
<td>MaStRNummer</td>
<td></td>
<td><a href="#mastrnummerid">MaStRNummerId</a></td>
<td>Ja</td>
<td></td>
</tr>
<tr>
<td>Einheittyp</td>
<td></td>
<td><a href="#einheittypenum">EinheitTypEnum</a></td>
<td>Ja</td>
<td></td>
</tr>
<tr>
<td>Einheitart</td>
<td></td>
<td><a href="#einheitartenum">EinheitArtEnum</a></td>
<td>Ja</td>
<td></td>
</tr>
</table>

# Datentypen

## AbbruchgrundNetzbetreiberpruefung

Basistyp: `string`

### Erlaubte Werte:

* `Deaktivierung` Die Einheit wurde deaktiviert. 
* `Loeschung` Die Einheit wurde gelöscht. 
* `Betreiberwechsel` Der Betreiber der Einheit hat sich geändert. 
* `EndgueltigeStilllegung` Die Einheit wurde als endgültig stillgelegt registriert. 
* `Netzuebertragung` Die Einheit wurde in ein anderes Netz übertragen. 
* `ErneuteNetzbetreiberpruefungDurchBundesnetzagentur` Es wurde eine erneute Netzbetreiberprüfung durch einen Fachadministrator ausgelöst. 
* `ErneuteNetzbetreiberpruefungDurchNetzbetreiber` Es wurde eine erneute Netzbetreiberprüfung durch einen Netzbetreiber ausgelöst. 
* `EegKwkSpeicherVerknuepfungGeaendert` Der Einheit wurde eine EEG/KWK/Speicher Anlage hinzugefügt/entfernt 
* `ZustaendigkeitAbgelehnt` Der Netzbetreiber hat die Zuständigkeit abgelehnt 
* `StilllegungAbgelehnt` Registrierung der endgültigen Stilllegung wurde abgelehnt 
* `AenderungBetriebsstatusEinheit` Änderung des Betriebsstatus der Einheit 
* `AenderungArtDerStromerzeugung` Änderung der Art der Stromerzeugung 

## AnlageErzeugungseinheitenEigenerzeugungEnum

Basistyp: `string`

### Erlaubte Werte:

* `EigenerzeugungMitNetzdurchleitungUndRaeumlichenZusammenhang` Eigenerzeugung mit Netzdurchleitung und räumlichen Zusammenhang 
* `EigenerzeugungOhneNetzdurchleitungUndOhneRaeumlichenZusammenhang` Eigenerzeugung ohne Netzdurchleitung und ohne räumlichen Zusammenhang 
* `EigenerzeugungOhneNetzdurchleitung` Eigenerzeugung ohne Netzdurchleitung 

## AnlagenBetriebsStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `InPlanung` In Planung 
* `InBetrieb` In Betrieb 
* `VoruebergehendStillgelegt` Vorübergehend stillgelegt 
* `EndgueltigStillgelegt` Endgültig stillgelegt 

## AnlagenSystemStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Aktiv` Aktiviert 
* `Deaktiviert` Deaktiviert 
* `Unvollstaendig` Unvollständig 
* `Geloescht` Gelöscht 

## AnlagenTypStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `InUebertragung` In Übertragung 
* `Uebertragung` Übertragen 

## AnlagenUebertragungStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `Angeboten` Angeboten 
* `Angenommen` Angenommen 
* `Abgelehnt` Abgelehnt 
* `Zurueckgenommen` Zurückgenommen 

## AnlagenartEnum

Basistyp: `string`

### Erlaubte Werte:

* `Gasanlage` Gasanlage 
* `StromspeicherOhneWasserkraft` Stromspeicher ohne Wasserkraft 
* `Stromverbrauchsanlage` Stromverbrauchsanlage 
* `Solaranlage` Solaranlage 
* `SonstigeAnlage` Sonstige Anlage 
* `Verbrennungsanlage` Verbrennungsanlage 
* `Wasserkraftanlage` Wasserkraftanlage 
* `Windanlage` Windanlage 
* `Gasverbrauchsanlage` Gasverbrauchsanlage 

## AnlagenartSolarAusrichtungEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Nord` Nord 
* `NordOst` Nord-Ost 
* `Ost` Ost 
* `SuedOst` Süd-Ost 
* `Sued` Süd 
* `SuedWest` Süd-West 
* `West` West 
* `NordWest` Nord-West 
* `Nachgefuehrt` nachgeführt 
* `OstWest` Ost-West 

## AnlagenartSolarNeigungswinkelEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Fassadenintegriert` fassadenintegriert 
* `Ueber60` über 60 Grad 
* `Grad40Bis60` 40 - 60 Grad 
* `Grad20Bis40` 20 - 40 Grad 
* `Unter20` unter 20 Grad 
* `Nachgefuehrt` nachgeführt 

## AnlagentypEnum

Basistyp: `string`

### Erlaubte Werte:

* `SolareStrahlungsenergie` andere Gase 
* `Wind` Biomasse 
* `Verbrennungsanlage` Braunkohle 
* `VerbrennungsanlageBiomasse` Erdgas 
* `Wasser` Solarthermie 
* `SonstigeAnlage` Gas 
* `Geothermie` Gasanlage 
* `Kernenergie` Netzersatzanlage 
* `Speicher` Stromverbrauchsanlage 
* `Gaserzeugungsanlage` Solaranlage 
* `Stromverbrauchsanlage` Sonstige Anlage 
* `Gasverbrauchsanlage` Verbrennungsanlage 

## ArtDerStilllegungEnum

Basistyp: `string`

### Erlaubte Werte:

* `Voruebergehend` Vorübergehend 
* `Endgueltig` Endgültig 

## ArtDerWasserkraftanlageEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Laufwasseranlage` Laufwasseranlage 
* `Speicherwasseranlage` Speicherwasseranlage 
* `WasserkraftanlageInTrinkwassersystem` Wasserkraftanlage in Trinkwassersystem 
* `WasserkraftanlageInBrauchwassersystem` Wasserkraftanlage in Brauchwassersystem 
* `Abwasserkraftanlage` Abwasserkraftanlage 
* `Meeresenergie` Meeresenergie 

## BatterieTechnologieEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `LithiumBatterie` Lithium-Ionen-Batterie 
* `BleiBatterie` Blei-Säure-Batterie 
* `RedoxFlowBatterie` Redox-Flow-Batterie 
* `Hochtemperaturbatterie` Hochtemperaturbatterie 
* `NickelCadmiumOrNickelMetallhydridbatterie` Nickel-Cadmium- / Nickel-Metallhydridbatterie 
* `SonstigeBatterie` Sonstige Batterie 

## BenutzerRollenGruppenEnum

Basistyp: `string`

### Erlaubte Werte:

* `Standard` andere Gase 
* `Bundesnetzagentur` Bundesnetzagentur 

## BenutzerStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Aktiv` aktiviert 
* `Inaktiv` deaktiviert 
* `Geloescht` gelöscht 
* `WartetAufAktivierungNachSelbstregistrierung` wartet auf Aktivierung nach Selbstregistrierung 
* `WartetAufAktivierungNachFremdregistrierung` wartet auf Aktivierung nach Fremdregistrierung 

## BilanzierungsgebietId

Basistyp: `int`

## BiomasseArtEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `FluessigeBiomasse` Flüssige Biomasse 
* `FesteBiomasse` Feste Biomasse 
* `GasfoermigeBiomasse` Gasförmige Biomasse 

## BiomasseBrennstoffEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `FesteBiogeneStoffeUndAbfaelleOhneHolz` Feste biogene Stoffe und Abfälle (ohne Holz) 
* `FluessigeBiogeneStoffeUndAbfaelle` Flüssige biogene Stoffe und Abfälle 
* `AltholzGebrauchtholzHolzmuell` Altholz, Gebrauchtholz, Holz(sperr)müll 
* `Biodiesel` Biodiesel 
* `Biogas` Biogas 
* `BiomethanBioerdgas` Biomethan (Bioerdgas) 
* `Biomethanol` Biomethanol 
* `TierUndBlutmehl` Tier- und Blutmehl 
* `BrennlaugeSchwarzlaugeSulfitablauge` Brennlauge, Schwarzlauge, Sulfitablauge 
* `Deponiegas` Deponiegas 
* `FesteBiogeneStoffe` Feste biogene Stoffe 
* `Harzoel` Harzöl 
* `WaldHolzhackschnitzelWaldScheitholzWaldKronenholz` Wald-Holzhackschnitzel, Wald-Scheitholz, -Kronenholz 
* `Holzreste` Holzreste (z.B. aus Schreinereien, auch Spanholz) 
* `HolzspaeneSaegemehl` Holzspäne, Sägemehl 
* `Klaergas` Klärgas 
* `RindeLandschaftspflegeholz` Rinde und Landschaftspflegeholz 
* `PalmoelPflanzenoel` Palmöl u.a. Pflanzenöle 
* `PelletsHolz` Holz-Pellets, Holz-Briketts 
* `SchleifstaubBiogen` Schleifstaub, biogen 
* `StrohStrohpellets` Stroh, Strohpellets 
* `Terpentin` Terpentin 
* `Tierfett` Tierfett 
* `HolzgasGasBiomasse` Holzgas (Gas Biomasse) 
* `Holzkohle` Holzkohle 
* `WaldStammholzRundholz` Wald-Stammholz, Rundholz 
* `EnergiepflanzenZurVerbrennung` Energiepflanzen zur Verbrennung (z.B. Kurzumtriebs-Holz) 

## BrennstoffLageEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `WindkraftAnLand` Windkraft an Land 
* `WindkraftAufSee` Windkraft auf See 
* `BaulicheAnlagenGebaeudeUndFassade` Bauliche Anlagen (Gebäude und Fassade) 
* `BaulicheAnlagenSonstige` Bauliche Anlagen (Sonstige) 
* `Freiflaeche` Freifläche 
* `AbfallFestReinBiogen` Abfall, fest, rein biogen 
* `Altholz` Altholz 
* `Blutmehl` Blutmehl 
* `Brennholz` Brennholz 
* `Brennlauge` Brennlauge 
* `FesteBiogeneStoffe` Feste biogene Stoffe 
* `Holz` Holz 
* `Holzhackschnitzel` Holzhackschnitzel 
* `HolzresteZbSchreinereien` Holzreste (z.B. Schreinereien) 
* `HolzspaeneSaegemehl` Holzspäne, Sägemehl 
* `Landschaftspflegeholz` Landschaftspflegeholz 
* `PelletsHolz` Pellets (Holz) 
* `Rauchspan` Rauchspan 
* `Restholz` Restholz 
* `Rinde` Rinde 
* `SchleifstaubBiogen` Schleifstaub, biogen 
* `Schwarzlauge` Schwarzlauge 
* `StrohStrohpellets` Stroh, Strohpellets 
* `Sulfitablauge` Sulfitablauge 
* `Tierfett` Tierfett 
* `Tiermehl` Tiermehl 
* `WarmbrennstoffeBiogenerGewerbeabfall` Warmbrennstoffe (biogener Gewerbeabfall) 
* `AbfallFluessigBiogen` Abfall, flüssig, biogen 
* `Biodiesel` Biodiesel 
* `Biomethanol` Biomethanol 
* `FluessigeBiogeneStoffe` Flüssige biogene Stoffe 
* `Harzoel` Harzöl 
* `IsoHexan` Iso-Hexan 
* `Palmoel` Palmöl 
* `Pflanzenoel` Pflanzenöl 
* `Terpentin` Terpentin 
* `Biogas` Biogas 
* `Biomethan` Biomethan 
* `Deponiegas` Deponiegas 
* `Klaergas` Klärgas 
* `Abwasserkraftanlage` Abwasserkraftanlage 
* `Laufwasseranlage` Laufwasseranlage 
* `Meeresenergie` Meeresenergie 
* `Speicherwasseranlage` Speicherwasseranlage 
* `WasserkraftanlageInBrauchwassersystem` Wasserkraftanlage in Brauchwassersystem 
* `WasserkraftanlageInTrinkwassersystem` Wasserkraftanlage in Trinkwassersystem 
* `Geothermie` Geothermie 
* `Solarthermie` Solarthermie 
* `Klaerschlamm` Klärschlamm 
* `Grubengas` Grubengas 
* `KohlenwertstoffeAusSteinkohle` Kohlenwertstoffe aus Steinkohle 
* `Steinkohlen` Steinkohlen 
* `Steinkohlenbriketts` Steinkohlenbriketts 
* `Steinkohlenkoks` Steinkohlenkoks 
* `Braunkohlenbriketts` Braunkohlenbriketts 
* `Braunkohlenkoks` Braunkohlenkoks 
* `Hartbraunkohlen` Hartbraunkohlen 
* `Rohbraunkohlen` Rohbraunkohlen 
* `StaubUndTrockenkohle` Staub- und Trockenkohle 
* `Wirbelschichtkohle` Wirbelschichtkohle 
* `Dieselkraftstoff` Dieselkraftstoff 
* `HeizoelLeicht` Heizöl, leicht 
* `HeizoelSchwer` Heizöl, schwer 
* `Fluessiggas` Flüssiggas 
* `Petrolkoks` Petrolkoks 
* `Raffineriegas` Raffineriegas 
* `AndereMineraloelprodukte` Andere Mineralölprodukte 
* `ErdgasErdoelgas` Erdgas, Erdölgas 
* `GrubengasVerbrennung` Grubengas 
* `Hochofengas Konvertergas` Hochofengas, Konvertergas 
* `Kokereigas` Kokereigas 
* `AndereGase` Andere Gase 
* `SonstigeHergestellteGase` Sonstige hergestellte Gase 
* `NichtBiogenerIndustrieabfall` nicht biogener Industrieabfall 
* `NichtBiogenerAbfallHausmuellSiedlungsabfaelle` nicht biogener Abfall (Hausmüll, Siedlungsabfälle) 
* `Prozessdampf` Prozessdampf 
* `DampfFremdbezogen` Dampf (fremdbezogen) 
* `SonstigeWaerme` Sonstige Wärme 
* `Kernenergie` Kernenergie 
* `Speicher` Speicher 

## BrennstoffSonstigeEnum

Basistyp: `string`

### Erlaubte Werte:

* `Geothermie` Geothermie 
* `Solarthermie` Solarthermie 
* `Grubengas` Grubengas 

## BrennstoffeVerbrennungsanlagenEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Abfall` Nicht biogener Müll 
* `Biomasse` Biogener Müll 
* `Braunkohle` Braunkohle 
* `Deponiegas` Deponiegas 
* `Erdgas` Erdgas 
* `Geothermie` Geothermie 
* `Grubengas` Grubengas 
* `Klaergas` Klärgas 
* `MehrereEnergietraegerNichtErneuerbar` Mehrere Energieträger (nicht erneuerbar) 
* `Mineraloelprodukte` Mineralölprodukte 
* `SolareStrahlungsenergie` Solare Strahlungsenergie 
* `Sonstige` Sonstige 
* `Steinkohle` Steinkohle 
* `Wasserstoff` Wasserstoff 
* `Raffineriegas` Raffineriegas 
* `HochofenUndKokereigas` Hochofen-/ und Kokereigas 
* `Keiner` Keiner 
* `Kernenergie` Kernenergie 

## BundeslaenderEinheitenEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `AusschliesslicheWirtschaftszone` Ausschließliche Wirtschaftszone 
* `BadenWuerttemberg` Baden-Württemberg 
* `Bayern` Bayern 
* `Berlin` Berlin 
* `Brandenburg` Brandenburg 
* `Bremen` Bremen 
* `Hamburg` Hamburg 
* `Hessen` Hessen 
* `MecklenburgVorpommern` Mecklenburg-Vorpommern 
* `Niedersachsen` Niedersachsen 
* `NordrheinWestfalen` Nordrhein-Westfalen 
* `RheinlandPfalz` Rheinland-Pfalz 
* `Saarland` Saarland 
* `Sachsen` Sachsen 
* `SachsenAnhalt` Sachsen-Anhalt 
* `SchleswigHolstein` Schleswig-Holstein 
* `Thueringen` Thüringen 

## BundeslaenderEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `BadenWuerttemberg` Baden-Württemberg 
* `Bayern` Bayern 
* `Berlin` Berlin 
* `Brandenburg` Brandenburg 
* `Bremen` Bremen 
* `Hamburg` Hamburg 
* `Hessen` Hessen 
* `MecklenburgVorpommern` Mecklenburg-Vorpommern 
* `Niedersachsen` Niedersachsen 
* `NordrheinWestfalen` Nordrhein-Westfalen 
* `RheinlandPfalz` Rheinland-Pfalz 
* `Saarland` Saarland 
* `Sachsen` Sachsen 
* `SachsenAnhalt` Sachsen-Anhalt 
* `SchleswigHolstein` Schleswig-Holstein 
* `Thueringen` Thüringen 

## ClusterNordseeEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `KeinCluster` Kein Cluster 
* `O` 0 
* `I` 1 
* `II` 2 
* `III` 3 
* `IV` 4 
* `V` 5 
* `VI` 6 
* `VII` 7 
* `VIII` 8 
* `IX` 9 
* `X` 10 
* `XI` 11 
* `XII` 12 
* `XIII` 13 
* `XIV` 14 
* `XV` 15 
* `XVI` 16 
* `XVII` 17 
* `XVIII` 18 
* `XIX` 19 

## ClusterOstseeEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `KeinCluster` Kein Cluster 
* `I` 1 
* `II` 2 
* `III` 3 
* `IV` 4 
* `V` 5 
* `VI` 6 
* `VII` 7 
* `VIII` 8 
* `IX` 9 
* `X` 10 

## EegMastrNummerId

Basistyp: `string`

## EegTypEnum

Basistyp: `string`

### Erlaubte Werte:

* `UnbekannteEegAnlage`  
* `EegBiomasse`  
* `EegSolar`  
* `EegWasser`  
* `EegWind`  
* `EegGeothermie`  
* `EegStromspeicher`  

## EinheitArtEnum

Basistyp: `string`

### Erlaubte Werte:

* `Stromerzeugungseinheit`  
* `Stromverbrauchseinheit`  
* `Gaserzeugungseinheit`  
* `Gasverbrauchseinheit`  

## EinheitLetzteAktualisierungObjektEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Anlagenbetreiber` Anlagenbetreiber 
* `Lokation` Lokation 
* `EEG` EEG 
* `KWK` KWK 
* `Genehmigung` Genehmigung 
* `Speicher` Speicher 
* `Netzbetreiberpruefungsprozess` Netzbetreiberpruefungsprozess 

## EinheitMastrNummerId

Basistyp: `string`

## EinheitSparteEnum

Basistyp: `string`

### Erlaubte Werte:

* `None`  
* `Strom`  
* `Gas`  

## EinheitTypEnum

Basistyp: `string`

### Erlaubte Werte:

* `Solareinheit`  
* `Windeinheit`  
* `Biomasse`  
* `Wasser`  
* `Geothermie`  
* `Verbrennung`  
* `Kernenergie`  
* `Stromspeichereinheit`  
* `Stromverbrauchseinheit`  
* `Gasverbrauchseinheit`  
* `Gaserzeugungseinheit`  
* `Gasspeichereinheit`  

## EinheitenGruppierungsTypEnum

Basistyp: `string`

### Erlaubte Werte:

* `None`  
* `Eeg`  
* `Kwk`  
* `Speicher`  
* `Genehmigung`  

## EinsatzortEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Haushalt` Haushalt 
* `AltenPflegeheime` Alten-/Pflegeheime 
* `Bahn` Bahn 
* `Bank` Bank 
* `Bergbau` Bergbau 
* `Flughafen` Flughafen 
* `Hochhaus` Hochhaus 
* `Hotel` Hotel 
* `Industrie` Industrie 
* `Kaufhaus` Kaufhaus 
* `Kraftwerke` Kraftwerke 
* `Krankenhaus` Krankenhaus 
* `KulturMesse` Kultur und Messe 
* `Logistikzentren` Logistikzentren (z.B. Kühlhäuser) 
* `Mastbetriebe` Mastbetriebe 
* `MilitaerPolizeiJustiz` Militär, Polizei und Justiz 
* `Rechenzentrum` Rechenzentrum 
* `Regierungsgebaeude` Regierungsgebäude 
* `Sendeanstalten` Sendeanstalten 
* `Sportstaetten` Sportstätten 
* `Telekommunikationsbranche` Telekommunikationsbranche 
* `TunnelStrassen` Tunnel und Straßen 
* `Veranstaltungsgebaeude` Veranstaltungsgebäude 
* `Verlagshaeuser` Verlagshäuser 
* `Versicherungen` Versicherungen 
* `WasserKlaerwerke` Wasser- und Klärwerke 
* `Wohngebaeude` Wohngebäude 
* `Sonstige` Sonstige 

## EinsatzverantwortlicherMaStRNummerId

Basistyp: `string`

## EinspeisungsartEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Volleinspeisung` Volleinspeisung 
* `TeileinspeisungEigenverbrauch` Teileinspeisung (einschließlich Eigenverbrauch) 

## EnergietraegerEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `AndereGase` andere Gase 
* `Biomasse` Biomasse 
* `Braunkohle` Braunkohle 
* `Erdgas` Erdgas 
* `Geothermie` Geothermie 
* `Grubengas` Grubengas 
* `Kernenergie` Kernenergie 
* `Klaerschlamm` Klärschlamm 
* `Mineraloelprodukte` Mineralölprodukte 
* `NichtBiogenerAbfall` nicht biogener Abfall 
* `SolareStrahlungsenergie` Solare Strahlungsenergie 
* `Solarthermie` Solarthermie 
* `Speicher` Speicher 
* `Steinkohle` Steinkohle 
* `Waerme` Wärme 
* `Wind` Wind 
* `Wasser` Wasser 
* `DruckAusGasleitungen` Druck aus Gasleitungen 
* `DruckAusWasserleitungen` Druck aus Wasserleitungen 
* `Wasserstoff` Wasserstoff 

## ErgebniscodeTyp

Basistyp: `string`

### Erlaubte Werte:

* `OK` Die Anfrage wurde korrekt verarbeitet. 
* `OkWeitereDatenVorhanden` Bei Listenabfragen sind weitere Elemente der Liste vorhanden, aber nicht Bestandteil des aktuellen Abrufs. 
* `KeineDatenVorhanden` Daten wurden nicht gefunden. 

## ErtuechtigungId

Basistyp: `string`

## ErtuechtigungsmassnahmeWasserkraftEnum

Basistyp: `string`

### Erlaubte Werte:

* `AustauschvonGeneratorenGetriebenTurbinenoderLaufraedern` Austausch von Generatoren, Getrieben, Turbinen oder Laufrädern 
* `ErweiterungderAnlagedurchErhoehungdesAusbaudurchflussesundoderderFallhoehe` Erweiterung der Anlage durch Erhöhung des Ausbaudurchflusses und/oder der Fallhöhe 
* `AutomatischeWasserstandsregelung` Automatische Wasserstandsregelung 
* `AutomatischeRechenreinigung` Automatische Rechenreinigung 
* `AutomatischeEinsatzoptimierungbeiKraftwerkenmitmehrerenTurbinen` Automatische Einsatzoptimierung bei Kraftwerken mit mehreren Turbinen 
* `EinsatzpermanenterregterGeneratoren` Einsatz permanent erregter Generatoren 
* `Sonstige` Sonstige 
* `VerbesserungderZuundAbstroemungHydraulikTurbinenzustroemungOberundUnterwasserkanal` Verbesserung der Zu- und Abströmung (Hydraulik-Turbinenzuströmung, Ober- und Unterwasserkanal) 

## FristverlaengerungBearbeitungsStatus

Basistyp: `string`

### Erlaubte Werte:

* `Offen` Offen 
* `Gewaehrt` Gewährt 
* `Abgelehnt` Abgelehnt 
* `Zurueckgezogen` Zurückgezogen 
* `Storniert` Storniert 

## FristverlaengerungGrundEnum

Basistyp: `string`

### Erlaubte Werte:

* `PruefungsrelevanteUnterlagenFehlen` Inbetriebnahmeprotokoll oder andere prüfungsrelevante Unterlagen liegen nicht vor 
* `BetreiberwechselmeldungFehlt` Betreiberwechselmeldung liegt nicht vor 
* `LaufendeVerfahrenGerichtClearingstelle` Zu dieser Einheit läuft gerade ein Verfahren vor Gericht oder bei der Clearingstelle, das zu prüfenden Daten im MaStR tangiert. 
* `Sonstiges` Sonstiges 

## GasSpeicherMastrNummerId

Basistyp: `string`

## GasSpeicherartEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Kavernenspeicher` Kavernenspeicher 
* `Porenspeicher` Porenspeicher 
* `Aquiferspeicher` Aquiferspeicher 

## GasartDerErzeugungEnum

Basistyp: `string`

### Erlaubte Werte:

* `Biomethan` Biomethan 
* `Erdgas` Erdgas 
* `Wasserstoff` Wasserstoff 

## GasqualitaetEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `LGas` L-Gas 
* `HGas` H-Gas 

## GenMastrNummerId

Basistyp: `string`

## GenehmigungsartEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `NachBImSchG17BImSchV` nach BImSchG i.V.m nach 17. BImSchV 
* `Sonstige` Sonstige 
* `NachBaurecht` nach Baurecht 
* `NachBImSchGandere` nach BImSchG andere 
* `NachBImSchG4BBImSchV` nach BImSchG i.V.m nach 4. BImSchV 
* `NachBImSchG13BImSchV` nach BImSchG i.V.m nach 13. BImSchV 
* `NachWasserhaushaltsgesetz` nach Wasserhaushaltsgesetz 
* `NachWindenergieAufSeeGesetz` nach Windenergieaufseegesetz 

## KatalogkategorieId

Basistyp: `int`

## KatalogwertId

Basistyp: `int`

## KlaerungsGrundEnum

Basistyp: `string`

### Erlaubte Werte:

* `UneinigkeitBeiDenDaten` Uneinigkeit bei den Daten 
* `UneinigkeitBeiDenDatenMitNetzbetreiber` Uneinigkeit mit dem Netzbetreiber bei den Daten 
* `KlaerungRegistrierungspflicht` Klärung der Registrierungspflicht 
* `BetreiberwechselNichtRegistriert` Betreiberwechsel wurde nicht registriert 
* `EventuellesDuplikat` Eventuelles Duplikat 
* `FragenZurBearbeitungKorrekturvorschlag` Fragen zur Bearbeitung des Korrekturvorschlages 
* `LaufendesGerichtsverfahren` Laufendes Gerichtsverfahren 
* `SystemfehlerFehlermeldung` Systemfehler - Fehlermeldung 

## KorrekturBetriebsStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `InPlanung` In Planung 
* `EndgueltigStillgelegt` Endgültig stillgelegt 

## KorrekturVorschlagId

Basistyp: `int`

## KwkMastrNummerId

Basistyp: `string`

## LaenderEinheitenEnum

Basistyp: `string`

### Erlaubte Werte:

* `Deutschland` Deutschland 
* `Daenemark` Dänemark 
* `Niederlande` Niederlande 
* `Belgien` Belgien 
* `Luxemburg` Luxemburg 
* `Frankreich` Frankreich 
* `Schweiz` Schweiz 
* `Oesterreich` Österreich 
* `Polen` Polen 
* `TschechischeRepublik` Tschechische Republik 

## LandEnum

Basistyp: `string`

### Erlaubte Werte:

* `Afghanistan` Afghanistan 
* `Aegypten` Ägypten 
* `Aland` Åland 
* `Albanien` Albanien 
* `Algerien` Algerien 
* `AmerikanischeJungferninseln` Amerikanische Jungferninseln 
* `AmerikanischSamoa` Amerikanisch-Samoa 
* `Andorra` Andorra 
* `Angola` Angola 
* `Anguilla` Anguilla 
* `Antarktis` Antarktis 
* `AntiguaundBarbuda` Antigua und Barbuda 
* `Aequatorialguinea` Äquatorialguinea 
* `Argentinien` Argentinien 
* `Armenien` Armenien 
* `Aruba` Aruba 
* `Aserbaidschan` Aserbaidschan 
* `Aethiopien` Äthiopien 
* `Australien` Australien 
* `Bahamas` Bahamas 
* `Bahrain` Bahrain 
* `Bangladesch` Bangladesch 
* `Barbados` Barbados 
* `Belarus` Belarus 
* `Belgien` Belgien 
* `Belize` Belize 
* `Benin` Benin 
* `Bermuda` Bermuda 
* `Bhutan` Bhutan 
* `Bolivien` Bolivien 
* `BonaireSabaundStEustatius` Bonaire, Saba und St. Eustatius 
* `BosnienHerzegowina` Bosnien-Herzegowina 
* `Botsuana` Botsuana 
* `Bouvetinsel` Bouvetinsel 
* `Brasilien` Brasilien 
* `BritischeJungferninseln` Britische Jungferninseln 
* `BritischesTerritoriumimIndOzean` Britisches Territorium im Ind. Ozean 
* `BruneiDarussalam` Brunei Darussalam 
* `Bulgarien` Bulgarien 
* `BurkinaFaso` Burkina Faso 
* `Burundi` Burundi 
* `CapoVerde` Capo Verde 
* `Deutschland` Deutschland 
* `China` China 
* `Cookinseln` Cookinseln 
* `CostaRica` Costa Rica 
* `CoteDIvoire` Côte D'Ivoire 
* `Curacao` Curacao 
* `Daenemark` Dänemark 
* `DemokratischeBundesrepublikNepal` Demokratische Bundesrepublik Nepal 
* `DemokratischeRepublikKongo` Demokratische Republik Kongo 
* `DemokratischeVolksrepublikKorea` Demokratische Volksrepublik Korea 
* `Chile` Chile 
* `Dominica` Dominica 
* `DominikanischeRepublik` Dominikanische Republik 
* `Dschibuti` Dschibuti 
* `Ecuador` Ecuador 
* `ElSalvador` El Salvador 
* `Eritrea` Eritrea 
* `Estland` Estland 
* `Falklandinseln` Falklandinseln 
* `Faeroeer` Färöer 
* `Fidschi` Fidschi 
* `Finnland` Finnland 
* `Frankreich` Frankreich 
* `FranzoesischeSuedundAntarktisgebiete` Französische Süd- und Antarktisgebiete 
* `FranzoesischGuayana` Französisch-Guayana 
* `FranzoesischPolynesien` Französisch-Polynesien 
* `Gabun` Gabun 
* `Gambia` Gambia 
* `Georgien` Georgien 
* `Ghana` Ghana 
* `Gibraltar` Gibraltar 
* `Grenada` Grenada 
* `Griechenland` Griechenland 
* `Groenland` Grönland 
* `Guadeloupe` Guadeloupe 
* `Guam` Guam 
* `Guatemala` Guatemala 
* `Guayana` Guayana 
* `Guernsey` Guernsey 
* `Guinea` Guinea 
* `GuineaBissau` Guinea-Bissau 
* `Haiti` Haiti 
* `HeardunddieMcdonaldinseln` Heard und die Mcdonaldinseln 
* `HeiligerStuhl` Heiliger Stuhl 
* `Honduras` Honduras 
* `Hongkong` Hongkong 
* `Indien` Indien 
* `Indonesien` Indonesien 
* `InselMan` Insel Man 
* `Irak` Irak 
* `Iran` Iran 
* `Irland` Irland 
* `Island` Island 
* `Israel` Israel 
* `Italien` Italien 
* `Jamaika` Jamaika 
* `Japan` Japan 
* `Jemen` Jemen 
* `Jersey` Jersey 
* `Jordanien` Jordanien 
* `Kaimaninseln` Kaimaninseln 
* `Kambodscha` Kambodscha 
* `Kamerun` Kamerun 
* `Kanada` Kanada 
* `Kasachstan` Kasachstan 
* `Katar` Katar 
* `Kenia` Kenia 
* `Kirgisistan` Kirgisistan 
* `Kiribati` Kiribati 
* `KleinereAmerikanischeueberseeinseln` Kleinere Amerikanische Überseeinseln 
* `Kokosinseln` Kokosinseln 
* `Kolumbien` Kolumbien 
* `Komoren` Komoren 
* `Kosovo` Kosovo 
* `Kroatien` Kroatien 
* `Kuba` Kuba 
* `Kuwait` Kuwait 
* `Laos` Laos 
* `Lesotho` Lesotho 
* `Lettland` Lettland 
* `Libanon` Libanon 
* `Liberia` Liberia 
* `Libyen` Libyen 
* `Liechtenstein` Liechtenstein 
* `Litauen` Litauen 
* `Luxemburg` Luxemburg 
* `Macau` Macau 
* `Madagaskar` Madagaskar 
* `Malawi` Malawi 
* `Malaysia` Malaysia 
* `Malediven` Malediven 
* `Mali` Mali 
* `Malta` Malta 
* `Marokko` Marokko 
* `Marshallinseln` Marshallinseln 
* `Martinique` Martinique 
* `Mauretanien` Mauretanien 
* `Mauritius` Mauritius 
* `Mayotte` Mayotte 
* `Mazedonien` Mazedonien 
* `Mexiko` Mexiko 
* `Mikronesien` Mikronesien 
* `Moldau` Moldau 
* `Monaco` Monaco 
* `Mongolei` Mongolei 
* `Montenegro` Montenegro 
* `Montserrat` Montserrat 
* `Mosambik` Mosambik 
* `Myanmar` Myanmar 
* `Namibia` Namibia 
* `Nauru` Nauru 
* `Neukaledonien` Neukaledonien 
* `Neuseeland` Neuseeland 
* `Nicaragua` Nicaragua 
* `Niederlande` Niederlande 
* `Niger` Niger 
* `Nigeria` Nigeria 
* `Niue` Niue 
* `NoerdlicheMarianen` Nördliche Marianen 
* `Norfolkinsel` Norfolkinsel 
* `Norwegen` Norwegen 
* `Oman` Oman 
* `Oesterreich` Österreich 
* `Pakistan` Pakistan 
* `Palau` Palau 
* `Panama` Panama 
* `PapuaNeuguinea` Papua-Neuguinea 
* `Paraguay` Paraguay 
* `Peru` Peru 
* `Philippinen` Philippinen 
* `Pitcairninseln` Pitcairninseln 
* `Polen` Polen 
* `Portugal` Portugal 
* `PuertoRico` Puerto Rico 
* `RepublikKongo` Republik Kongo 
* `RepublikKorea` Republik Korea 
* `Reunion` Réunion 
* `Ruanda` Ruanda 
* `Rumaenien` Rumänien 
* `RussischeFoederation` Russische Föderation 
* `Salomonen` Salomonen 
* `Sambia` Sambia 
* `Samoa` Samoa 
* `SanMarino` San Marino 
* `SaoTomeundPrincipe` São Tomè und Principe 
* `SaudiArabien` Saudi-Arabien 
* `Schweden` Schweden 
* `Schweiz` Schweiz 
* `Senegal` Senegal 
* `Serbien` Serbien 
* `Seychellen` Seychellen 
* `SierraLeone` Sierra Leone 
* `Simbabwe` Simbabwe 
* `Singapur` Singapur 
* `Slowakei` Slowakei 
* `Slowenien` Slowenien 
* `Somalia` Somalia 
* `Spanien` Spanien 
* `SriLanka` Sri Lanka 
* `StBarthelemy` St. Barthélemy 
* `StHelenaAscensionundTristandaCunha` St. Helena, Ascension und Tristan da Cunha 
* `StKittsUndNevis` St. Kitts Und Nevis 
* `StLucia` St. Lucia 
* `StMartinFranzoesischerTeil` St. Martin (Französischer Teil) 
* `StMartinNiederlaendischerTeil` St. Martin (Niederländischer Teil) 
* `StPierreundMiquelon` St. Pierre und Miquelon 
* `StVincentunddieGrenadinen` St. Vincent und die Grenadinen 
* `Suedafrika` Südafrika 
* `Sudan` Sudan 
* `SuedgeorgienUSuedlSandwichinseln` Südgeorgien+Südl. Sandwichinseln 
* `Suedsudan` Südsudan 
* `Suriname` Suriname 
* `SvalbardundJanMayen` Svalbard und Jan Mayen 
* `Swasiland` Swasiland 
* `Syrien` Syrien 
* `Tadschikistan` Tadschikistan 
* `Taiwan` Taiwan 
* `Tansania` Tansania 
* `Thailand` Thailand 
* `TimorLeste` Timor-Leste 
* `Togo` Togo 
* `Tokelau` Tokelau 
* `Tonga` Tonga 
* `TrinidadundTobago` Trinidad und Tobago 
* `Tschad` Tschad 
* `TschechischeRepublik` Tschechische Republik 
* `Tunesien` Tunesien 
* `Tuerkei` Türkei 
* `Turkmenistan` Turkmenistan 
* `TurksundCaicosinseln` Turks- und Caicosinseln 
* `Tuvalu` Tuvalu 
* `Uganda` Uganda 
* `Ukraine` Ukraine 
* `Ungarn` Ungarn 
* `Uruguay` Uruguay 
* `Usbekistan` Usbekistan 
* `Vanuatu` Vanuatu 
* `Vatikanstadt` Vatikanstadt 
* `Venezuela` Venezuela 
* `VereinigteArabischeEmirate` Vereinigte Arabische Emirate 
* `VereinigteStaatenvonAmerika` Vereinigte Staaten von Amerika 
* `VereinigtesKoenigreich` Vereinigtes Königreich 
* `Vietnam` Vietnam 
* `WallisundFutuna` Wallis und Futuna 
* `Weihnachtsinsel` Weihnachtsinsel 
* `Westsahara` Westsahara 
* `ZentralafrikanischeRepublik` Zentralafrikanische Republik 
* `Zypern` Zypern 

## LeistungsAenderungEnum

Basistyp: `string`

### Erlaubte Werte:

* `Veraenderung` Veränderung 
* `Inbetriebnahme` Inbetriebnahme 

## LeistungsaenderungsAnlagenartEnum

Basistyp: `string`

### Erlaubte Werte:

* `Sonstiges` Sonstiges 
* `SolarOderSpeicher` Solar oder Speicher 
* `Windanlage` Windlage 

## LeistungsaenderungsartEnum

Basistyp: `string`

### Erlaubte Werte:

* `Datenkorrektur`  
* `Leistungsaenderungmelden`  

## LokationMastrNummerId

Basistyp: `string`

## LokationTypEnum

Basistyp: `string`

### Erlaubte Werte:

* `None`  
* `Stromerzeugungslokation`  
* `Stromverbrauchslokation`  
* `Gaserzeugungslokation`  
* `Gasverbrauchslokation`  

## MaStRNummerId

Basistyp: `string`

## MarktakteurMastrNummerId

Basistyp: `string`

## MarktakteurStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `Unvollstaendig` unvollständig 
* `Ungeprueft` ungeprüft 
* `Aktiviert` aktiviert 
* `Deaktiviert` deaktiviert 
* `Geloescht` gelöscht 
* `Delegiert` erfasst 

## MarktfunktionEnum

Basistyp: `string`

### Erlaubte Werte:

* `Stromnetzbetreiber`  
* `Anlagenbetreiber`  
* `AkteurImStrommarkt`  
* `OrganisierteMarktplaetze`  
* `Behoerden`  
* `SonstigeMarktakteure`  
* `Bundesnetzagentur`  
* `Gasnetzbetreiber`  
* `AkteurImGasmarkt`  
* `Supportpartner`  

## MarktfunktionStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `Aktiviert` aktiv 
* `Deaktiviert` inaktiv 

## MarktrolleMastrNummerId

Basistyp: `string`

## MarktrollenEnum

Basistyp: `string`

### Erlaubte Werte:

* `NetzbetreiberUebertragungsnetzbetreiber`  
* `NetzbetreiberAnschlussnetzbetreiberStrom`  
* `NetzbetreiberBilanzkreisverantwortlicherStrom`  
* `NetzbetreiberBilanzkoordinatorStrom`  
* `NetzbetreiberMessstellenbetreiberStrom`  
* `NetzbetreiberFernleitungsnetzbetreiberGas`  
* `NetzbetreiberMarktgebietsverantwortlicheGas`  
* `NetzbetreiberAnschlussnetzbetreiberGas`  
* `NetzbetreiberMessstellenbetreiberGas`  
* `EnergiemarktakteureStromlieferant`  
* `EnergiemarktakteureBilanzkreisverantwortlicherStrom`  
* `EnergiemarktakteureMessstellenbetreiberStrom`  
* `EnergiemarktakteureBilanzkreisverantwortlicherGas`  
* `EnergiemarktakteureMessstellenbetreiberGas`  
* `EnergiemarktakteureGastransportkunden`  
* `OrganisierteMarktplaetzeCaoCasc`  
* `OrganisierteMarktplaetzeBoerse`  
* `OrganisierteMarktplaetzeOTCPlattform`  
* `OrganisierteMarktplaetzeBetreiberEinerBuchungsplattformFuerGasspeicher`  
* `OrganisierteMarktplaetzeBetreiberEinerBuchungsplattformfuerGaskapazitaeten`  
* `BehoerdenBehoerden`  
* `BehoerdenenergiewirtschaftlicherVerband`  
* `BehoerdenenergiewirtschaftlicheInstitution`  
* `SonstigeMarktakteureDienstleister`  
* `SonstigeMarktakteureSonstige`  

## MastrZugangStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `None`  
* `Unvollstaendig` unvollständig 
* `Ungeprueft` ungeprüft 
* `Aktiviert` aktiviert 
* `Deaktiviert` deaktiviert 
* `Geloescht` gelöscht 

## NaceAbschnittEnum

Basistyp: `string`

### Erlaubte Werte:

* `AbschnittALandundForstwirtschaftFischerei` Abschnitt A - Land- und Forstwirtschaft, Fischerei 
* `AbschnittBBergbauundGewinnungvonSteinenundErden` Abschnitt B - Bergbau und Gewinnung von Steinen und Erden 
* `AbschnittCVerarbeitendesGewerbe` Abschnitt C - Verarbeitendes Gewerbe 
* `AbschnittDEnergieversorgung` Abschnitt D - Energieversorgung 
* `AbschnittEWasserversorgungAbwasserundAbfallentsorgungundBeseitigungvonUmweltverschmutzungen` Abschnitt E - Wasserversorgung; Abwasser- und Abfallentsorgung und Beseitigung von Umweltverschmutzungen 
* `AbschnittFBaugewerbe` Abschnitt F - Baugewerbe 
* `AbschnittGHandelInstandhaltungundReparaturvonKraftfahrzeugen` Abschnitt G - Handel; Instandhaltung und Reparatur von Kraftfahrzeugen 
* `AbschnittHVerkehrundLagerei` Abschnitt H - Verkehr und Lagerei 
* `AbschnittIGastgewerbe` Abschnitt I - Gastgewerbe 
* `AbschnittJInformationundKommunikation` Abschnitt J - Information und Kommunikation 
* `AbschnittKErbringungvonFinanzundVersicherungsdienstleistungen` Abschnitt K - Erbringung von Finanz- und Versicherungsdienstleistungen 
* `AbschnittLGrundstuecksundWohnungswesen` Abschnitt L - Grundstücks- und Wohnungswesen 
* `AbschnittMErbringungvonfreiberuflichenwissenschaftlichenundtechnischenDienstleistungen` Abschnitt M - Erbringung von freiberuflichen, wissenschaftlichen und technischen Dienstleistungen 
* `AbschnittNErbringungvonsonstigenwirtschaftlichenDienstleistungen` Abschnitt N - Erbringung von sonstigen wirtschaftlichen Dienstleistungen 
* `AbschnittOOeffentlicheVerwaltungVerteidigungSozialversicherung` Abschnitt O - Öffentliche Verwaltung, Verteidigung; Sozialversicherung 
* `AbschnittPErziehungundUnterricht` Abschnitt P - Erziehung und Unterricht 
* `AbschnittQGesundheitsundSozialwesen` Abschnitt Q - Gesundheits- und Sozialwesen 
* `AbschnittRKunstUnterhaltungundErholung` Abschnitt R - Kunst, Unterhaltung und Erholung 
* `AbschnittSErbringungvonsonstigenDienstleistungen` Abschnitt S - Erbringung von sonstigen Dienstleistungen 
* `AbschnittTPrivateHaushaltemitHauspersonalHerstellungvonWarenundErbringungvonDienstleistungendurchprivateHaushaltefuerdenEigenbedarfohneausgepraegtenSchwerpunkt` Abschnitt T - Private Haushalte mit Hauspersonal; Herstellung von Waren und Erbringung von Dienstleistungen durch private Haushalte für den Eigenbedarf ohne ausgeprägten Schwerpunkt 
* `AbschnittUExterritorialeOrganisationenundKoerperschaften` Abschnitt U - Exterritoriale Organisationen und Körperschaften 

## NaceAbteilungEnum

Basistyp: `string`

### Erlaubte Werte:

* `LandwirtschaftJagdunddamitverbundeneTaetigkeiten` Landwirtschaft, Jagd und damit verbundene Tätigkeiten 
* `ForstwirtschaftundHolzeinschlag` Forstwirtschaft und Holzeinschlag 
* `FischereiundAquakultur` Fischerei und Aquakultur 
* `Kohlenbergbau` Kohlenbergbau 
* `GewinnungvonErdoelundErdgas` Gewinnung von Erdöl und Erdgas 
* `Erzbergbau` Erzbergbau 
* `GewinnungvonSteinenundErdensonstigerBergbau` Gewinnung von Steinen und Erden, sonstiger Bergbau 
* `ErbringungvonDienstleistungenfuerdenBergbauundfuerdieGewinnungvonSteinenundErden` Erbringung von Dienstleistungen für den Bergbau und für die Gewinnung von Steinen und Erden 
* `HerstellungvonNahrungsundFuttermitteln` Herstellung von Nahrungs- und Futtermitteln 
* `Getraenkeherstellung` Getränkeherstellung 
* `Tabakverarbeitung` Tabakverarbeitung 
* `HerstellungvonTextilien` Herstellung von Textilien 
* `HerstellungvonBekleidung` Herstellung von Bekleidung 
* `HerstellungvonLederLederwarenundSchuhen` Herstellung von Leder, Lederwaren und Schuhen 
* `HerstellungvonHolzFlechtKorbundKorkwarenohneMoebel` Herstellung von Holz-, Flecht-, Korb- und Korkwaren (ohne Möbel) 
* `HerstellungvonPapierPappeundWarendaraus` Herstellung von Papier, Pappe und Waren daraus 
* `HerstellungvonDruckerzeugnissenVervielfaeltigungvonbespieltenTonBildundDatentraegern` Herstellung von Druckerzeugnissen; Vervielfältigung von bespielten Ton-, Bild- und Datenträgern 
* `KokereiundMineraloelverarbeitung` Kokerei und Mineralölverarbeitung 
* `HerstellungvonchemischenErzeugnissen` Herstellung von chemischen Erzeugnissen 
* `HerstellungvonpharmazeutischenErzeugnissen` Herstellung von pharmazeutischen Erzeugnissen 
* `HerstellungvonGummiundKunststoffwaren` Herstellung von Gummi- und Kunststoffwaren 
* `HerstellungvonGlasundGlaswarenKeramikVerarbeitungvonSteinenundErden` Herstellung von Glas und Glaswaren, Keramik, Verarbeitung von Steinen und Erden 
* `Metallerzeugungundbearbeitung` Metallerzeugung und -bearbeitung 
* `HerstellungvonMetallerzeugnissen` Herstellung von Metallerzeugnissen 
* `HerstellungvonDatenverarbeitungsgeraetenelektronischenundoptischenErzeugnissen` Herstellung von Datenverarbeitungsgeräten, elektronischen und optischen Erzeugnissen 
* `HerstellungvonelektrischenAusruestungen` Herstellung von elektrischen Ausrüstungen 
* `Maschinenbau` Maschinenbau 
* `HerstellungvonKraftwagenundKraftwagenteilen` Herstellung von Kraftwagen und Kraftwagenteilen 
* `SonstigerFahrzeugbau` Sonstiger Fahrzeugbau 
* `HerstellungvonMoebeln` Herstellung von Möbeln 
* `HerstellungvonsonstigenWaren` Herstellung von sonstigen Waren 
* `ReparaturundInstallationvonMaschinenundAusruestungen` Reparatur und Installation von Maschinen und Ausrüstungen 
* `Energieversorgung` Energieversorgung 
* `Wasserversorgung` Wasserversorgung 
* `Abwasserentsorgung` Abwasserentsorgung 
* `SammlungBehandlungundBeseitigungvonAbfaellenRueckgewinnung` Sammlung, Behandlung und Beseitigung von Abfällen; Rückgewinnung 
* `BeseitigungvonUmweltverschmutzungenundsonstigeEntsorgung` Beseitigung von Umweltverschmutzungen und sonstige Entsorgung 
* `Hochbau` Hochbau 
* `Tiefbau` Tiefbau 
* `VorbereitendeBaustellenarbeitenBauinstallationundsonstigesAusbaugewerbe` Vorbereitende Baustellenarbeiten, Bauinstallation und sonstiges Ausbaugewerbe 
* `HandelmitKraftfahrzeugenInstandhaltungundReparaturvonKraftfahrzeugen` Handel mit Kraftfahrzeugen; Instandhaltung und Reparatur von Kraftfahrzeugen 
* `GrosshandelohneHandelmitKraftfahrzeugen` Großhandel (ohne Handel mit Kraftfahrzeugen) 
* `EinzelhandelohneHandelmitKraftfahrzeugen` Einzelhandel (ohne Handel mit Kraftfahrzeugen) 
* `LandverkehrundTransportinRohrfernleitungen` Landverkehr und Transport in Rohrfernleitungen 
* `Schifffahrt` Schifffahrt 
* `Luftfahrt` Luftfahrt 
* `LagereisowieErbringungvonsonstigenDienstleistungenfuerdenVerkehr` Lagerei sowie Erbringung von sonstigen Dienstleistungen für den Verkehr 
* `PostKurierundExpressdienste` Post-, Kurier- und Expressdienste 
* `Beherbergung` Beherbergung 
* `Gastronomie` Gastronomie 
* `Verlagswesen` Verlagswesen 
* `HerstellungVerleihundVertriebvonFilmenundFernsehprogrammenKinosTonstudiosundVerlegenvonMusik` Herstellung, Verleih und Vertrieb von Filmen und Fernsehprogrammen; Kinos; Tonstudios und Verlegen von Musik 
* `Rundfunkveranstalter` Rundfunkveranstalter 
* `Telekommunikation` Telekommunikation 
* `ErbringungvonDienstleistungenderInformationstechnologie` Erbringung von Dienstleistungen der Informationstechnologie 
* `Informationsdienstleistungen` Informationsdienstleistungen 
* `ErbringungvonFinanzdienstleistungen` Erbringung von Finanzdienstleistungen 
* `VersicherungenRueckversicherungenundPensionskassenohneSozialversicherung` Versicherungen, Rückversicherungen und Pensionskassen (ohne Sozialversicherung) 
* `MitFinanzundVersicherungsdienstleistungenverbundeneTaetigkeiten` Mit Finanz- und Versicherungsdienstleistungen verbundene Tätigkeiten 
* `GrundstuecksundWohnungswesen` Grundstücks- und Wohnungswesen 
* `RechtsundSteuerberatungWirtschaftspruefung` Rechts- und Steuerberatung, Wirtschaftsprüfung 
* `VerwaltungundFuehrungvonUnternehmenundBetriebenUnternehmensberatung` Verwaltung und Führung von Unternehmen und Betrieben; Unternehmensberatung 
* `ArchitekturundIngenieurbuerostechnischephysikalischeundchemischeUntersuchung` Architektur- und Ingenieurbüros; technische, physikalische und chemische Untersuchung 
* `ForschungundEntwicklung` Forschung und Entwicklung 
* `WerbungundMarktforschung` Werbung und Marktforschung 
* `SonstigefreiberuflichewissenschaftlicheundtechnischeTaetigkeiten` Sonstige freiberufliche, wissenschaftliche und technische Tätigkeiten 
* `Veterinaerwesen` Veterinärwesen 
* `VermietungvonbeweglichenSachen` Vermietung von beweglichen Sachen 
* `VermittlungundUeberlassungvonArbeitskraeften` Vermittlung und Überlassung von Arbeitskräften 
* `ReisebuerosReiseveranstalterundErbringungsonstigerReservierungsdienstleistungen` Reisebüros, Reiseveranstalter und Erbringung sonstiger Reservierungsdienstleistungen 
* `WachundSicherheitsdienstesowieDetekteien` Wach- und Sicherheitsdienste sowie Detekteien 
* `GebaeudebetreuungGartenundLandschaftsbau` Gebäudebetreuung; Garten- und Landschaftsbau 
* `ErbringungvonwirtschaftlichenDienstleistungenfuerUnternehmenundPrivatpersonenang` Erbringung von wirtschaftlichen Dienstleistungen für Unternehmen und Privatpersonen a. n. g. 
* `OeffentlicheVerwaltungVerteidigungSozialversicherung` Öffentliche Verwaltung, Verteidigung; Sozialversicherung 
* `ErziehungundUnterricht` Erziehung und Unterricht 
* `Gesundheitswesen` Gesundheitswesen 
* `HeimeohneErholungsundFerienheime` Heime (ohne Erholungs- und Ferienheime) 
* `SozialwesenohneHeime` Sozialwesen (ohne Heime) 
* `KreativekuenstlerischeundunterhaltendeTaetigkeiten` Kreative, künstlerische und unterhaltende Tätigkeiten 
* `BibliothekenArchiveMuseenbotanischeundzoologischeGaerten` Bibliotheken, Archive, Museen, botanische und zoologische Gärten 
* `SpielWettundLotteriewesen` Spiel-, Wett- und Lotteriewesen 
* `ErbringungvonDienstleistungendesSportsderUnterhaltungundderErholung` Erbringung von Dienstleistungen des Sports, der Unterhaltung und der Erholung 
* `InteressenvertretungensowiekirchlicheundsonstigereligioeseVereinigungenohneSozialwesenundSport` Interessenvertretungen sowie kirchliche und sonstige religiöse Vereinigungen (ohne Sozialwesen und Sport) 
* `ReparaturvonDatenverarbeitungsgeraetenundGebrauchsguetern` Reparatur von Datenverarbeitungsgeräten und Gebrauchsgütern 
* `ErbringungvonsonstigenueberwiegendpersoenlichenDienstleistungen` Erbringung von sonstigen überwiegend persönlichen Dienstleistungen 
* `PrivateHaushaltemitHauspersonal` Private Haushalte mit Hauspersonal 
* `HerstellungvonWarenundErbringungvonDienstleistungendurchprivateHaushaltefuerdenEigenbedarfohneausgepraegtenSchwerpunkt` Herstellung von Waren und Erbringung von Dienstleistungen durch private Haushalte für den Eigenbedarf ohne ausgeprägten Schwerpunkt 
* `ExterritorialeOrganisationenundKoerperschaften` Exterritoriale Organisationen und Körperschaften 

## NaceGruppeEnum

Basistyp: `string`

### Erlaubte Werte:

* `AnbaueinjaehrigerPflanzen` Anbau einjähriger Pflanzen 
* `AnbaumehrjaehrigerPflanzen` Anbau mehrjähriger Pflanzen 
* `BetriebvonBaumschulensowieAnbauvonPflanzenzuVermehrungszwecken` Betrieb von Baumschulen sowie Anbau von Pflanzen zu Vermehrungszwecken 
* `Tierhaltung` Tierhaltung 
* `GemischteLandwirtschaft` Gemischte Landwirtschaft 
* `ErbringungvonlandwirtschaftlichenDienstleistungen` Erbringung von landwirtschaftlichen Dienstleistungen 
* `JagdFallenstellereiunddamitverbundeneTaetigkeiten` Jagd, Fallenstellerei und damit verbundene Tätigkeiten 
* `Forstwirtschaft` Forstwirtschaft 
* `Holzeinschlag` Holzeinschlag 
* `SammelnvonwildwachsendenProduktenohneHolz` Sammeln von wild wachsenden Produkten (ohne Holz) 
* `ErbringungvonDienstleistungenfuerForstwirtschaftundHolzeinschlag` Erbringung von Dienstleistungen für Forstwirtschaft und Holzeinschlag 
* `Fischerei` Fischerei 
* `Aquakultur` Aquakultur 
* `Steinkohlenbergbau` Steinkohlenbergbau 
* `Braunkohlenbergbau` Braunkohlenbergbau 
* `GewinnungvonErdoel` Gewinnung von Erdöl 
* `GewinnungvonErdgas` Gewinnung von Erdgas 
* `Eisenerzbergbau` Eisenerzbergbau 
* `NEMetallerzbergbau` NE-Metallerzbergbau 
* `GewinnungvonNatursteinenKiesSandTonundKaolin` Gewinnung von Natursteinen, Kies, Sand, Ton und Kaolin 
* `SonstigerBergbauGewinnungvonSteinenundErdenang` Sonstiger Bergbau; Gewinnung von Steinen und Erden a. n. g. 
* `ErbringungvonDienstleistungenfuerdieGewinnungvonErdoelundErdgas` Erbringung von Dienstleistungen für die Gewinnung von Erdöl und Erdgas 
* `ErbringungvonDienstleistungenfuerdensonstigenBergbauunddieGewinnungvonSteinenundErden` Erbringung von Dienstleistungen für den sonstigen Bergbau und die Gewinnung von Steinen und Erden 
* `Getraenkeherstellung` Getränkeherstellung 
* `HerstellungvonBekleidungohnePelzbekleidung` Herstellung von Bekleidung (ohne Pelzbekleidung) 
* `HerstellungvonPelzwaren` Herstellung von Pelzwaren 
* `HerstellungvonBekleidungausgewirktemundgestricktemStoff` Herstellung von Bekleidung aus gewirktem und gestricktem Stoff 
* `HerstellungvonchemischenGrundstoffenDuengemittelnundStickstoffverbindungenKunststoffeninPrimaerformenundsynthetischemKautschukinPrimaerformen` Herstellung von chemischen Grundstoffen, Düngemitteln und Stickstoffverbindungen, Kunststoffen in Primärformen und synthetischem Kautschuk in Primärformen 
* `HerstellungvonSchaedlingsbekaempfungsPflanzenschutzundDesinfektionsmitteln` Herstellung von Schädlingsbekämpfungs-, Pflanzenschutz- und Desinfektionsmitteln 
* `HerstellungvonAnstrichmittelnDruckfarbenundKitten` Herstellung von Anstrichmitteln, Druckfarben und Kitten 
* `HerstellungvonSeifenWaschReinigungsundKoerperpflegemittelnsowievonDuftstoffen` Herstellung von Seifen, Wasch-, Reinigungs- und Körperpflegemitteln sowie von Duftstoffen 
* `HerstellungvonsonstigenchemischenErzeugnissen` Herstellung von sonstigen chemischen Erzeugnissen 
* `HerstellungvonChemiefasern` Herstellung von Chemiefasern 
* `HerstellungvonelektronischenBauelementenundLeiterplatten` Herstellung von elektronischen Bauelementen und Leiterplatten 
* `HerstellungvonDatenverarbeitungsgeraetenundperipherenGeraeten` Herstellung von Datenverarbeitungsgeräten und peripheren Geräten 
* `HerstellungvonGeraetenundEinrichtungenderTelekommunikationstechnik` Herstellung von Geräten und Einrichtungen der Telekommunikationstechnik 
* `HerstellungvonGeraetenderUnterhaltungselektronik` Herstellung von Geräten der Unterhaltungselektronik 
* `HerstellungvonMessKontrollNavigationsuaeInstrumentenundVorrichtungenHerstellungvonUhren` Herstellung von Mess-, Kontroll-, Navigations- u. ä. Instrumenten und Vorrichtungen; Herstellung von Uhren 
* `HerstellungvonBestrahlungsundElektrotherapiegeraetenundelektromedizinischenGeraeten` Herstellung von Bestrahlungs- und Elektrotherapiegeräten und elektromedizinischen Geräten 
* `HerstellungvonoptischenundfotografischenInstrumentenundGeraeten` Herstellung von optischen und fotografischen Instrumenten und Geräten 
* `HerstellungvonmagnetischenundoptischenDatentraegern` Herstellung von magnetischen und optischen Datenträgern 
* `Elektrizitaetsversorgung` Elektrizitätsversorgung 
* `Gasversorgung` Gasversorgung 
* `WaermeKaelteversorgung` Wärme- und Kälteversorgung 
* `SchlachtenundFleischverarbeitung` Schlachten und Fleischverarbeitung 
* `Fischverarbeitung` Fischverarbeitung 
* `ObstundGemueseverarbeitung` Obst- und Gemüseverarbeitung 
* `HerstellungvonpflanzlichenundtierischenoelenundFetten` Herstellung von pflanzlichen und tierischen Ölen und Fetten 
* `Milchverarbeitung` Milchverarbeitung 
* `MahlundSchaelmuehlenHerstellungvonStaerkeundStaerkeerzeugnissen` Mahl- und Schälmühlen, Herstellung von Stärke und Stärkeerzeugnissen 
* `HerstellungvonBackundTeigwaren` Herstellung von Back- und Teigwaren 
* `HerstellungvonsonstigenNahrungsmitteln` Herstellung von sonstigen Nahrungsmitteln 
* `HerstellungvonFuttermitteln` Herstellung von Futtermitteln 
* `Tabakverarbeitung` Tabakverarbeitung 
* `SpinnstoffaufbereitungundSpinnerei` Spinnstoffaufbereitung und Spinnerei 
* `Weberei` Weberei 
* `VeredlungvonTextilienundBekleidung` Veredlung von Textilien und Bekleidung 
* `HerstellungvonsonstigenTextilwaren` Herstellung von sonstigen Textilwaren 
* `HerstellungvonLederundLederwarenohneHerstellungvonLederbekleidung` Herstellung von Leder und Lederwaren (ohne Herstellung von Lederbekleidung) 
* `HerstellungvonSchuhen` Herstellung von Schuhen 
* `SaegeHobelundHolzimpraegnierwerke` Säge-, Hobel- und Holzimprägnierwerke 
* `HerstellungvonsonstigenHolzKorkFlechtundKorbwarenohneMoebel` Herstellung von sonstigen Holz-, Kork-, Flecht- und Korbwaren (ohne Möbel) 
* `HerstellungvonHolzundZellstoffPapierKartonundPappe` Herstellung von Holz- und Zellstoff, Papier, Karton und Pappe 
* `HerstellungvonWarenausPapierKartonundPappe` Herstellung von Waren aus Papier, Karton und Pappe 
* `HerstellungvonDruckerzeugnissen` Herstellung von Druckerzeugnissen 
* `VervielfaeltigungvonbespieltenTonBildundDatentraegern` Vervielfältigung von bespielten Ton-, Bild- und Datenträgern 
* `Kokerei` Kokerei 
* `Mineraloelverarbeitung` Mineralölverarbeitung 
* `HerstellungvonpharmazeutischenGrundstoffen` Herstellung von pharmazeutischen Grundstoffen 
* `HerstellungvonpharmazeutischenSpezialitaetenundsonstigenpharmazeutischenErzeugnissen` Herstellung von pharmazeutischen Spezialitäten und sonstigen pharmazeutischen Erzeugnissen 
* `HerstellungvonGummiwaren` Herstellung von Gummiwaren 
* `HerstellungvonKunststoffwaren` Herstellung von Kunststoffwaren 
* `HerstellungvonGlasundGlaswaren` Herstellung von Glas und Glaswaren 
* `HerstellungvonfeuerfestenkeramischenWerkstoffenundWaren` Herstellung von feuerfesten keramischen Werkstoffen und Waren 
* `HerstellungvonkeramischenBaumaterialien` Herstellung von keramischen Baumaterialien 
* `HerstellungvonsonstigenPorzellanundkeramischenErzeugnissen` Herstellung von sonstigen Porzellan- und keramischen Erzeugnissen 
* `HerstellungvonZementKalkundgebranntemGips` Herstellung von Zement, Kalk und gebranntem Gips 
* `HerstellungvonErzeugnissenausBetonZementundGips` Herstellung von Erzeugnissen aus Beton, Zement und Gips 
* `BeundVerarbeitungvonNaturwerksteinenundNatursteinenang` Be- und Verarbeitung von Naturwerksteinen und Natursteinen a. n. g. 
* `HerstellungvonSchleifkoerpernundSchleifmittelnaufUnterlagesowiesonstigenErzeugnissenausnichtmetallischenMineralienang` Herstellung von Schleifkörpern und Schleifmitteln auf Unterlage sowie sonstigen Erzeugnissen aus nichtmetallischen Mineralien a. n. g. 
* `ErzeugungvonRoheisenStahlundFerrolegierungen` Erzeugung von Roheisen, Stahl und Ferrolegierungen 
* `HerstellungvonStahlrohrenRohrformRohrverschlussundRohrverbindungsstueckenausStahl` Herstellung von Stahlrohren, Rohrform-, Rohrverschluss- und Rohrverbindungsstücken aus Stahl 
* `SonstigeersteBearbeitungvonEisenundStahl` Sonstige erste Bearbeitung von Eisen und Stahl 
* `ErzeugungundersteBearbeitungvonNEMetallen` Erzeugung und erste Bearbeitung von NE-Metallen 
* `Giessereien` Gießereien 
* `StahlundLeichtmetallbau` Stahl- und Leichtmetallbau 
* `HerstellungvonMetalltanksundbehaelternHerstellungvonHeizkoerpernundkesselnfuerZentralheizungen` Herstellung von Metalltanks und -behältern; Herstellung von Heizkörpern und -kesseln für Zentralheizungen 
* `HerstellungvonDampfkesselnohneZentralheizungskessel` Herstellung von Dampfkesseln (ohne Zentralheizungskessel) 
* `HerstellungvonWaffenundMunition` Herstellung von Waffen und Munition 
* `HerstellungvonSchmiedePressZiehundStanzteilengewalztenRingenundpulvermetallurgischenErzeugnissen` Herstellung von Schmiede-, Press-, Zieh- und Stanzteilen, gewalzten Ringen und pulvermetallurgischen Erzeugnissen 
* `OberflaechenveredlungundWaermebehandlungMechanikang` Oberflächenveredlung und Wärmebehandlung; Mechanik a. n. g. 
* `HerstellungvonSchneidwarenWerkzeugenSchloessernundBeschlaegenausunedlenMetallen` Herstellung von Schneidwaren, Werkzeugen, Schlössern und Beschlägen aus unedlen Metallen 
* `HerstellungvonsonstigenMetallwaren` Herstellung von sonstigen Metallwaren 
* `HerstellungvonElektromotorenGeneratorenTransformatorenElektrizitaetsverteilungsundschalteinrichtungen` "Herstellung von Elektromotoren, Generatoren, Transformatoren, Elektrizitätsverteilungs- und -schalteinrichtungen" 
* `HerstellungvonBatterienundAkkumulatoren` Herstellung von Batterien und Akkumulatoren 
* `HerstellungvonKabelnundelektrischemInstallationsmaterial` Herstellung von Kabeln und elektrischem Installationsmaterial 
* `HerstellungvonelektrischenLampenundLeuchten` Herstellung von elektrischen Lampen und Leuchten 
* `HerstellungvonHaushaltsgeraeten` Herstellung von Haushaltsgeräten 
* `HerstellungvonsonstigenelektrischenAusruestungenundGeraetenang` Herstellung von sonstigen elektrischen Ausrüstungen und Geräten a. n. g. 
* `HerstellungvonnichtwirtschaftszweigspezifischenMaschinen` Herstellung von nicht wirtschaftszweigspezifischen Maschinen 
* `HerstellungvonsonstigennichtwirtschaftszweigspezifischenMaschinen` Herstellung von sonstigen nicht wirtschaftszweigspezifischen Maschinen 
* `HerstellungvonlandundforstwirtschaftlichenMaschinen` Herstellung von land- und forstwirtschaftlichen Maschinen 
* `HerstellungvonWerkzeugmaschinen` Herstellung von Werkzeugmaschinen 
* `HerstellungvonMaschinenfuersonstigebestimmteWirtschaftszweige` Herstellung von Maschinen für sonstige bestimmte Wirtschaftszweige 
* `HerstellungvonKraftwagenundKraftwagenmotoren` Herstellung von Kraftwagen und Kraftwagenmotoren 
* `HerstellungvonKarosserienAufbautenundAnhaengern` Herstellung von Karosserien, Aufbauten und Anhängern 
* `HerstellungvonTeilenundZubehoerfuerKraftwagen` Herstellung von Teilen und Zubehör für Kraftwagen 
* `SchiffundBootsbau` Schiff- und Bootsbau 
* `Schienenfahrzeugbau` Schienenfahrzeugbau 
* `LuftundRaumfahrzeugbau` Luft- und Raumfahrzeugbau 
* `HerstellungvonmilitaerischenKampffahrzeugen` Herstellung von militärischen Kampffahrzeugen 
* `HerstellungvonFahrzeugenang` Herstellung von Fahrzeugen a. n. g. 
* `HerstellungvonMoebeln` Herstellung von Möbeln 
* `HerstellungvonMuenzenSchmuckundaehnlichenErzeugnissen` Herstellung von Münzen, Schmuck und ähnlichen Erzeugnissen 
* `HerstellungvonMusikinstrumenten` Herstellung von Musikinstrumenten 
* `HerstellungvonSportgeraeten` Herstellung von Sportgeräten 
* `HerstellungvonSpielwaren` Herstellung von Spielwaren 
* `HerstellungvonmedizinischenundzahnmedizinischenApparatenundMaterialien` Herstellung von medizinischen und zahnmedizinischen Apparaten und Materialien 
* `HerstellungvonErzeugnissenang` Herstellung von Erzeugnissen a. n. g. 
* `ReparaturvonMetallerzeugnissenMaschinenundAusruestungen` Reparatur von Metallerzeugnissen, Maschinen und Ausrüstungen 
* `InstallationvonMaschinenundAusruestungenang` Installation von Maschinen und Ausrüstungen a. n. g. 
* `Wasserversorgung` Wasserversorgung 
* `Abwasserentsorgung` Abwasserentsorgung 
* `SammlungvonAbfaellen` Sammlung von Abfällen 
* `Abfallbehandlungundbeseitigung` Abfallbehandlung und -beseitigung 
* `Rueckgewinnung` Rückgewinnung 
* `BeseitigungvonUmweltverschmutzungenundsonstigeEntsorgung` Beseitigung von Umweltverschmutzungen und sonstige Entsorgung 
* `ErschliessungvonGrundstueckenBautraeger` Erschließung von Grundstücken; Bauträger 
* `BauvonGebaeuden` Bau von Gebäuden 
* `BauvonStrassenundBahnverkehrsstrecken` Bau von Straßen und Bahnverkehrsstrecken 
* `LeitungstiefbauundKlaeranlagenbau` Leitungstiefbau und Kläranlagenbau 
* `SonstigerTiefbau` Sonstiger Tiefbau 
* `AbbrucharbeitenundvorbereitendeBaustellenarbeiten` Abbrucharbeiten und vorbereitende Baustellenarbeiten 
* `Bauinstallation` Bauinstallation 
* `SonstigerAusbau` Sonstiger Ausbau 
* `SonstigespezialisierteBautaetigkeiten` Sonstige spezialisierte Bautätigkeiten 
* `HandelmitKraftwagen` Handel mit Kraftwagen 
* `InstandhaltungundReparaturvonKraftwagen` Instandhaltung und Reparatur von Kraftwagen 
* `HandelmitKraftwagenteilenundzubehoer` Handel mit Kraftwagenteilen und -zubehör 
* `HandelmitKraftraedernKraftradteilenundzubehoerInstandhaltungundReparaturvonKraftraedern` Handel mit Krafträdern, Kraftradteilen und -zubehör; Instandhaltung und Reparatur von Krafträdern 
* `Handelsvermittlung` Handelsvermittlung 
* `GrosshandelmitlandwirtschaftlichenGrundstoffenundlebendenTieren` Großhandel mit landwirtschaftlichen Grundstoffen und lebenden Tieren 
* `GrosshandelmitNahrungsundGenussmittelnGetraenkenundTabakwaren` Großhandel mit Nahrungs- und Genussmitteln, Getränken und Tabakwaren 
* `GrosshandelmitGebrauchsundVerbrauchsguetern` Großhandel mit Gebrauchs- und Verbrauchsgütern 
* `GrosshandelmitGeraetenderInformationsundKommunikationstechnik` Großhandel mit Geräten der Informations- und Kommunikationstechnik 
* `GrosshandelmitsonstigenMaschinenAusruestungenundZubehoer` Großhandel mit sonstigen Maschinen, Ausrüstungen und Zubehör 
* `SonstigerGrosshandel` Sonstiger Großhandel 
* `GrosshandelohneausgepraegtenSchwerpunkt` Großhandel ohne ausgeprägten Schwerpunkt 
* `EinzelhandelmitWarenverschiedenerArtinVerkaufsraeumen` Einzelhandel mit Waren verschiedener Art (in Verkaufsräumen) 
* `EinzelhandelmitNahrungsundGenussmittelnGetraenkenundTabakwareninVerkaufsraeumen` Einzelhandel mit Nahrungs- und Genussmitteln, Getränken und Tabakwaren (in Verkaufsräumen) 
* `EinzelhandelmitMotorenkraftstoffenTankstellen` Einzelhandel mit Motorenkraftstoffen (Tankstellen) 
* `EinzelhandelmitGeraetenderInformationsundKommunikationstechnikinVerkaufsraeumen` Einzelhandel mit Geräten der Informations- und Kommunikationstechnik (in Verkaufsräumen) 
* `EinzelhandelmitsonstigenHaushaltsgeraetenTextilienHeimwerkerundEinrichtungsbedarfinVerkaufsraeumen` Einzelhandel mit sonstigen Haushaltsgeräten, Textilien, Heimwerker- und Einrichtungsbedarf (in Verkaufsräumen) 
* `EinzelhandelmitVerlagsproduktenSportausruestungenundSpielwareninVerkaufsraeumen` Einzelhandel mit Verlagsprodukten, Sportausrüstungen und Spielwaren (in Verkaufsräumen) 
* `EinzelhandelmitsonstigenGueterninVerkaufsraeumen` Einzelhandel mit sonstigen Gütern (in Verkaufsräumen) 
* `EinzelhandelanVerkaufsstaendenundaufMaerkten` Einzelhandel an Verkaufsständen und auf Märkten 
* `EinzelhandelnichtinVerkaufsraeumenanVerkaufsstaendenoderaufMaerkten` Einzelhandel, nicht in Verkaufsräumen, an Verkaufsständen oder auf Märkten 
* `PersonenbefoerderungimEisenbahnfernverkehr` Personenbeförderung im Eisenbahnfernverkehr 
* `GueterbefoerderungimEisenbahnverkehr` Güterbeförderung im Eisenbahnverkehr 
* `SonstigePersonenbefoerderungimLandverkehr` Sonstige Personenbeförderung im Landverkehr 
* `GueterbefoerderungimStrassenverkehrUmzugstransporte` Güterbeförderung im Straßenverkehr, Umzugstransporte 
* `TransportinRohrfernleitungen` Transport in Rohrfernleitungen 
* `PersonenbefoerderunginderSeeundKuestenschifffahrt` Personenbeförderung in der See- und Küstenschifffahrt 
* `GueterbefoerderunginderSeeundKuestenschifffahrt` Güterbeförderung in der See- und Küstenschifffahrt 
* `PersonenbefoerderunginderBinnenschifffahrt` Personenbeförderung in der Binnenschifffahrt 
* `GueterbefoerderunginderBinnenschifffahrt` Güterbeförderung in der Binnenschifffahrt 
* `PersonenbefoerderunginderLuftfahrt` Personenbeförderung in der Luftfahrt 
* `GueterbefoerderunginderLuftfahrtundRaumtransport` Güterbeförderung in der Luftfahrt und Raumtransport 
* `Lagerei` Lagerei 
* `ErbringungvonsonstigenDienstleistungenfuerdenVerkehr` Erbringung von sonstigen Dienstleistungen für den Verkehr 
* `PostdienstevonUniversaldienstleistungsanbietern` Postdienste von Universaldienstleistungsanbietern 
* `SonstigePostKurierundExpressdienste` Sonstige Post-, Kurier- und Expressdienste 
* `HotelsGasthoefeundPensionen` Hotels, Gasthöfe und Pensionen 
* `FerienunterkuenfteundaehnlicheBeherbergungsstaetten` Ferienunterkünfte und ähnliche Beherbergungsstätten 
* `Campingplaetze` Campingplätze 
* `SonstigeBeherbergungsstaetten` Sonstige Beherbergungsstätten 
* `RestaurantsGaststaettenImbissstubenCafesEissalonsuae` Restaurants, Gaststätten, Imbissstuben, Cafés, Eissalons u. Ä. 
* `CatererundErbringungsonstigerVerpflegungsdienstleistungen` Caterer und Erbringung sonstiger Verpflegungsdienstleistungen 
* `AusschankvonGetraenken` Ausschank von Getränken 
* `VerlegenvonBuechernundZeitschriftensonstigesVerlagswesenohneSoftware` Verlegen von Büchern und Zeitschriften; sonstiges Verlagswesen (ohne Software) 
* `VerlegenvonSoftware` Verlegen von Software 
* `HerstellungvonFilmenundFernsehprogrammenderenVerleihundVertriebKinos` Herstellung von Filmen und Fernsehprogrammen, deren Verleih und Vertrieb; Kinos 
* `TonstudiosHerstellungvonHoerfunkbeitraegenVerlegenvonbespieltenTontraegernundMusikalien` Tonstudios; Herstellung von Hörfunkbeiträgen; Verlegen von bespielten Tonträgern und Musikalien 
* `Hoerfunkveranstalter` Hörfunkveranstalter 
* `Fernsehveranstalter` Fernsehveranstalter 
* `LeitungsgebundeneTelekommunikation` Leitungsgebundene Telekommunikation 
* `DrahtloseTelekommunikation` Drahtlose Telekommunikation 
* `Satellitentelekommunikation` Satellitentelekommunikation 
* `SonstigeTelekommunikation` Sonstige Telekommunikation 
* `ErbringungvonDienstleistungenderInformationstechnologie` Erbringung von Dienstleistungen der Informationstechnologie 
* `DatenverarbeitungHostingunddamitverbundeneTaetigkeitenWebportale` Datenverarbeitung, Hosting und damit verbundene Tätigkeiten; Webportale 
* `ErbringungvonsonstigenInformationsdienstleistungen` Erbringung von sonstigen Informationsdienstleistungen 
* `ZentralbankenundKreditinstitute` Zentralbanken und Kreditinstitute 
* `Beteiligungsgesellschaften` Beteiligungsgesellschaften 
* `TreuhandundsonstigeFondsundaehnlicheFinanzinstitutionen` Treuhand- und sonstige Fonds und ähnliche Finanzinstitutionen 
* `SonstigeFinanzierungsinstitutionen` Sonstige Finanzierungsinstitutionen 
* `Versicherungen` Versicherungen 
* `Rueckversicherungen` Rückversicherungen 
* `PensionskassenundPensionsfonds` Pensionskassen und Pensionsfonds 
* `MitFinanzdienstleistungenverbundeneTaetigkeiten` Mit Finanzdienstleistungen verbundene Tätigkeiten 
* `MitVersicherungsdienstleistungenundPensionskassenverbundeneTaetigkeiten` Mit Versicherungsdienstleistungen und Pensionskassen verbundene Tätigkeiten 
* `Fondsmanagement` Fondsmanagement 
* `KaufundVerkaufvoneigenenGrundstueckenGebaeudenundWohnungen` Kauf und Verkauf von eigenen Grundstücken, Gebäuden und Wohnungen 
* `VermietungVerpachtungvoneigenenodergeleastenGrundstueckenGebaeudenundWohnungen` Vermietung, Verpachtung von eigenen oder geleasten Grundstücken, Gebäuden und Wohnungen 
* `VermittlungundVerwaltungvonGrundstueckenGebaeudenundWohnungenfuerDritte` Vermittlung und Verwaltung von Grundstücken, Gebäuden und Wohnungen für Dritte 
* `Rechtsberatung` Rechtsberatung 
* `WirtschaftspruefungundSteuerberatungBuchfuehrung` Wirtschaftsprüfung und Steuerberatung; Buchführung 
* `VerwaltungundFuehrungvonUnternehmenundBetrieben` Verwaltung und Führung von Unternehmen und Betrieben 
* `PublicRelationsundUnternehmensberatung` Public-Relations- und Unternehmensberatung 
* `ArchitekturundIngenieurbueros` Architektur- und Ingenieurbüros 
* `TechnischephysikalischeundchemischeUntersuchung` Technische, physikalische und chemische Untersuchung 
* `ForschungundEntwicklungimBereichNaturIngenieurAgrarwissenschaftenundMedizin` Forschung und Entwicklung im Bereich Natur-, Ingenieur-, Agrarwissenschaften und Medizin 
* `ForschungundEntwicklungimBereichRechtsWirtschaftsundSozialwissenschaftensowieimBereichSprachKulturundKunstwissenschaften` Forschung und Entwicklung im Bereich Rechts-, Wirtschafts- und Sozialwissenschaften sowie im Bereich Sprach-, Kultur- und Kunstwissenschaften 
* `Werbung` Werbung 
* `MarktundMeinungsforschung` Markt- und Meinungsforschung 
* `AteliersfuerTextilSchmuckGrafikuaeDesign` Ateliers für Textil-, Schmuck-, Grafik- u. ä. Design 
* `FotografieundFotolabors` Fotografie und Fotolabors 
* `uebersetzenundDolmetschen` Übersetzen und Dolmetschen 
* `SonstigefreiberuflichewissenschaftlicheundtechnischeTaetigkeitenang` Sonstige freiberufliche, wissenschaftliche und technische Tätigkeiten a. n. g. 
* `Veterinaerwesen` Veterinärwesen 
* `VermietungvonKraftwagen` Vermietung von Kraftwagen 
* `VermietungvonGebrauchsguetern` Vermietung von Gebrauchsgütern 
* `VermietungvonMaschinenGeraetenundsonstigenbeweglichenSachen` Vermietung von Maschinen, Geräten und sonstigen beweglichen Sachen 
* `LeasingvonnichtfinanziellenimmateriellenVermoegensgegenstaendenohneCopyrights` Leasing von nichtfinanziellen immateriellen Vermögensgegenständen (ohne Copyrights) 
* `VermittlungvonArbeitskraeften` Vermittlung von Arbeitskräften 
* `BefristeteueberlassungvonArbeitskraeften` Befristete Überlassung von Arbeitskräften 
* `SonstigeueberlassungvonArbeitskraeften` Sonstige Überlassung von Arbeitskräften 
* `ReisebuerosundReiseveranstalter` Reisebüros und Reiseveranstalter 
* `ErbringungsonstigerReservierungsdienstleistungen` Erbringung sonstiger Reservierungsdienstleistungen 
* `PrivateWachundSicherheitsdienste` Private Wach- und Sicherheitsdienste 
* `SicherheitsdienstemithilfevonueberwachungsundAlarmsystemen` Sicherheitsdienste mithilfe von Überwachungs- und Alarmsystemen 
* `Detekteien` Detekteien 
* `Hausmeisterdienste` Hausmeisterdienste 
* `ReinigungvonGebaeudenStrassenundVerkehrsmitteln` Reinigung von Gebäuden, Straßen und Verkehrsmitteln 
* `GartenundLandschaftsbausowieErbringungvonsonstigengaertnerischenDienstleistungen` Garten- und Landschaftsbau sowie Erbringung von sonstigen gärtnerischen Dienstleistungen 
* `SekretariatsundSchreibdiensteCopyShops` Sekretariats- und Schreibdienste, Copy-Shops 
* `CallCenter` Call Center 
* `MesseAusstellungsundKongressveranstalter` Messe-, Ausstellungs- und Kongressveranstalter 
* `ErbringungsonstigerwirtschaftlicherDienstleistungenfuerUnternehmenundPrivatpersonen` Erbringung sonstiger wirtschaftlicher Dienstleistungen für Unternehmen und Privatpersonen 
* `OeffentlicheVerwaltung` Öffentliche Verwaltung 
* `AuswaertigeAngelegenheitenVerteidigungRechtspflegeoeffentlicheSicherheitundOrdnung` Auswärtige Angelegenheiten, Verteidigung, Rechtspflege, öffentliche Sicherheit und Ordnung 
* `Sozialversicherung` Sozialversicherung 
* `KindergaertenundVorschulen` Kindergärten und Vorschulen 
* `Grundschulen` Grundschulen 
* `WeiterfuehrendeSchulen` Weiterführende Schulen 
* `TertiaererundpostsekundaerernichttertiaererUnterricht` Tertiärer und post-sekundärer, nicht tertiärer Unterricht 
* `SonstigerUnterricht` Sonstiger Unterricht 
* `ErbringungvonDienstleistungenfuerdenUnterricht` Erbringung von Dienstleistungen für den Unterricht 
* `Krankenhaeuser` Krankenhäuser 
* `ArztundZahnarztpraxen` Arzt- und Zahnarztpraxen 
* `Gesundheitswesenang` Gesundheitswesen a. n. g. 
* `Pflegeheime` Pflegeheime 
* `StationaereEinrichtungenzurpsychosozialenBetreuungSuchtbekaempfunguae` Stationäre Einrichtungen zur psychosozialen Betreuung, Suchtbekämpfung u. Ä. 
* `AltenheimeAltenundBehindertenwohnheime` Altenheime; Alten- und Behindertenwohnheime 
* `SonstigeHeimeohneErholungsundFerienheime` Sonstige Heime (ohne Erholungs- und Ferienheime) 
* `SozialeBetreuungaeltererMenschenundBehinderter` Soziale Betreuung älterer Menschen und Behinderter 
* `SonstigesSozialwesenohneHeime` Sonstiges Sozialwesen (ohne Heime) 
* `KreativekuenstlerischeundunterhaltendeTaetigkeiten` Kreative, künstlerische und unterhaltende Tätigkeiten 
* `BibliothekenArchiveMuseenbotanischeundzoologischeGaerten` Bibliotheken, Archive, Museen, botanische und zoologische Gärten 
* `SpielWettundLotteriewesen` Spiel-, Wett- und Lotteriewesen 
* `ErbringungvonDienstleistungendesSports` Erbringung von Dienstleistungen des Sports 
* `ErbringungvonsonstigenDienstleistungenderUnterhaltungundderErholung` Erbringung von sonstigen Dienstleistungen der Unterhaltung und der Erholung 
* `WirtschaftsundArbeitgeberverbaendeBerufsorganisationen` Wirtschafts- und Arbeitgeberverbände, Berufsorganisationen 
* `Arbeitnehmervereinigungen` Arbeitnehmervereinigungen 
* `KirchlicheVereinigungenpolitischeParteiensowiesonstigeInteressenvertretungenundVereinigungenang` Kirchliche Vereinigungen; politische Parteien sowie sonstige Interessenvertretungen und Vereinigungen a. n. g. 
* `ReparaturvonDatenverarbeitungsundTelekommunikationsgeraeten` Reparatur von Datenverarbeitungs- und Telekommunikationsgeräten 
* `ReparaturvonGebrauchsguetern` Reparatur von Gebrauchsgütern 
* `ErbringungvonsonstigenueberwiegendpersoenlichenDienstleistungen` Erbringung von sonstigen überwiegend persönlichen Dienstleistungen 
* `PrivateHaushaltemitHauspersonal` Private Haushalte mit Hauspersonal 
* `HerstellungvonWarendurchprivateHaushaltefuerdenEigenbedarfohneausgepraegtenSchwerpunkt` Herstellung von Waren durch private Haushalte für den Eigenbedarf ohne ausgeprägten Schwerpunkt 
* `ErbringungenvonDienstleistungendurchprivateHaushaltefuerdenEigenbedarfohneausgepraegtenSchwerpunkt` Erbringungen von Dienstleistungen durch private Haushalte für den Eigenbedarf ohne ausgeprägten Schwerpunkt 
* `ExterritorialeOrganisationenundKoerperschaften` Exterritoriale Organisationen und Körperschaften 

## NetzanschlusspunktMastrNummerId

Basistyp: `string`

## NetzbetreiberpruefungId

Basistyp: `int`

## NetzbetreiberpruefungTicketId

Basistyp: `int`

## NetzbetreiberpruefungsKategorieEnum

Basistyp: `string`

### Erlaubte Werte:

* `AnlagenbetreiberWuenschtKlaerung`  
* `NetzbetreiberkorrekturErforderlich`  
* `DatenkorrekturErforderlich`  
* `NetzbetreiberWuenschtKlaerung`  
* `NetzbetreiberpruefungGestartet`  
* `RueckmeldungBundesnetzagentur`  
* `WiedervorlageNachKlaerung`  
* `WiedervorlageNetzbetreiberpruefung`  
* `Betriebsstatuskorrektur`  
* `BetriebsstatuskorrekturNachKlaerung`  
* `WiedervorlageBetriebsstatuskorrektur`  

## NetzbetreiberpruefungsStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Ungeprueft` . 
* `Datenkorrektur` . 
* `Abgelehnt` . 
* `Klaerung` . 
* `Geprueft` . 
* `Abgebrochen` . 

## NetzbetreiberzuordnungsStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Ungeprueft` Ungeprüft 
* `InPruefung` In Prüfung 
* `DatenKorrekturErforderlich` Daten-Korrektur erforderlich 
* `BetriebsstatusKorrekturErforderlich` Betriebsstatus-Korrektur erforderlich 
* `NetzbetreiberKorrekturErforderlich` Netzbetreiber-Korrektur erforderlich 
* `NetzbetreiberWuenschtKlaerung` Netzbetreiber wünscht Klärung 
* `AnlagenbetreiberWuenschtKlaerung` Anlagenbetreiber wünscht Klärung 
* `Geprueft` Geprüft 
* `Abgebrochen` Abgebrochen 
* `WiedervorlageNachKlaerung` Wiedervorlage nach Klärung 
* `RueckmeldungBundesnetzagentur` Rückmeldung Bundesnetzagentur 
* `Wiedervorlage` Wiedervorlage 

## NummernkreisTypenEnum

Basistyp: `string`

### Erlaubte Werte:

* `Stromerzeugungslokation` Stromerzeugungslokation 
* `Stromverbrauchslokation` Stromverbrauchslokation 
* `Stromerzeugungseinheit` Stromerzeugungseinheit 
* `Stromverbrauchseinheit` Stromverbrauchseinheit 
* `Stromspeichereinheit` Stromspeichereinheit 
* `EEGAnlage` EEG Anlage 
* `KWKGAnlage` KWKG Anlage 
* `GenehmigungStrom` GenehmigungStrom 
* `Stromnetz` Stromnetz 
* `Gaserzeugungslokation` Gaserzeugungslokation 
* `Gasverbrauchslokation` Gasverbrauchslokation 
* `Gaserzeugungseinheit` Gaserzeugungseinheit 
* `Gasverbrauchseinheit` Gasverbrauchseinheit 
* `Gasspeichereinheit` Gasspeichereinheit 
* `Gasnetz` Gasnetz 
* `Stromnetzanschlusspunkt` Stromnetzanschlusspunkt 
* `Gasnetzanschlusspunkt` Gasnetzanschlusspunkt 
* `GenehmigungGas` GenehmigungGas 
* `Speichergruppierungsobjekt` Speichergruppierungsobjekt 
* `UnbekannterNummernkreisTyp` Unbekannter Nummernkreistyp 

## Nuts2Id

Basistyp: `string`

## NutzungsbereichEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Haushalt` Haushalt 
* `GewerbeHandelDienstleistungen` Gewerbe, Handel und Dienstleistungen 
* `Industrie` Industrie 
* `Landwirtschaft` Landwirtschaft 
* `OeffentlichesGebaeude` Öffentliches Gebäude 
* `Sonstige` Sonstige 

## PersonenartEnum

Basistyp: `string`

### Erlaubte Werte:

* `Organisation` Organisation (Unternehmen, Personengesellschaft, juristische Person, Behörde, Verband) 
* `NatuerlichePerson` Natürliche Person 

## PumpspeichertechnologieEnum

Basistyp: `string`

### Erlaubte Werte:

* `PumpspeicheranlageMitNatuerlichemZufluss` Pumpspeicher mit natürlichem Zufluss 
* `PumpspeicheranlageOhneNatuerlichemZufluss` Pumpspeicher ohne natürlichem Zufluss 

## RegelzoneEnum

Basistyp: `string`

### Erlaubte Werte:

* `FuenfzigHertz` 50Hertz 
* `Amprion` Amprion 
* `Tennet` Tennet 
* `TransnetBW` TransnetBW 

## RegisterNrPraefixEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `HRA` HRA 
* `HRB` HRB 
* `GnR` GnR 
* `PR` PR 
* `VR` VR 

## RegistrierungsnummerId

Basistyp: `string`

## RollenEnum

Basistyp: `string`

### Erlaubte Werte:

* `SystemAdministrator` . 
* `FachAdministrator` . 
* `Standardbenutzer` . 
* `MastrZugangsAdministrator` . 
* `LesenderVertreter` . 
* `MarktakteursVertreter` . 
* `WebdienstBenutzer` . 
* `RegiocomSupport` . 
* `UnangemeldeterGast` . 
* `FachAdministratorPlus` . 
* `MarktakteursvertreterMantelobjekt` . 
* `LesenderVertreterMantelobjekt` . 
* `MastrZugangsAdministratorPapier` . 
* `MarktakteursVertreterPapier` . 

## SalutationEnum

Basistyp: `string`

### Erlaubte Werte:

* `Familie` Familie 
* `Herr` Herr 
* `Frau` Frau 
* `Eheleute` Eheleute 
* `Divers` Divers 
* `Erbengemeinschaft` Erbengemeinschaft 
* `AndereOrganisationMitPersonenbezug` Andere Organisation Mit Personenbezug 

## SeelageEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Ostsee` Ostsee 
* `Nordsee` Nordsee 

## SolarFlaechenartEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `BebauungspanVor2003UndNichtGeaendert` Bebauungsplan vor 01.09.2003 und nicht geändert 
* `BebauungspanVor2010AlsGewerbeOderIndustriegebietAusgewiesen` Im Bebauungsplan vor 01.01.2010 als Gewerbe- oder Industriegebiet ausgewiesen 
* `Ackerland` Ackerland 
* `EigentumOderBesitzOderVerwaltungDesBundesamtes` Eigentum des Bundes oder Besitz oder Verwaltung des Bundesamtes für Immobilienaufgaben 
* `Konversionsflaeche` Konversionsfläche 
* `Planfeststellungsverfahren` Planfeststellungsverfahren oder sonstiges Verfahren gemäß § 37 Absatz 1 Nummer 2 f) EEG 
* `110MeterRandstreifenLaengsVonAutobahnenOderSchienenwegen` 110 Meter Randstreifen längs von Autobahnen oder Schienenwegen 
* `200MeterMitMindestabstandVon15MeternLaengsVonAutobahnenOderSchienenwegen` 200 Meter Randstreifen mit Mindestabstand von 15 Metern längs von Autobahnen oder Schienenwegen 
* `500MeterRandstreifenLaengsVonAutobahnenOderSchienenwegen` 500 Meter Randstreifen längs von Autobahnen oder Schienenwegen 
* `VersiegelteFlaeche` Versiegelte Fläche 
* `Gruenland` Grünland 
* `BesondereSolaranlageAufAckerflaecheBeiLandwirtschaftlicherNutzung` Besondere Solaranlage auf Ackerfläche bei gleichzeitiger landwirtschaftlicher Nutzung 
* `BesondereSolaranlageDauerkulturenBeiLandwirtschaftlicherNutzung` Besondere Solaranlage Dauerkulturen bei gleichzeitiger landwirtschaftlicher Nutzung 
* `BesondereSolaranlageGruenlandBeiLandwirtschaftlicherNutzung` Besondere Solaranlage Grünland bei gleichzeitiger landwirtschaftlicher Nutzung 
* `BesondereSolaranlageMoorboeden` Besondere Solaranlage Moorböden 
* `Sonstiges` Sonstiges 

## SolarLageEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Freiflaeche` Freifläche 
* `BaulicheAnlagen` Bauliche Anlagen (Hausdach, Gebäude und Fassade) 
* `BaulicheAnlagenSonstige` Bauliche Anlagen (Sonstige) 
* `SteckerfertigeErzeugungsanlage` Steckerfertige Erzeugungsanlage (sog. Plug-In- oder Balkon-PV-Anlage) 
* `Gewaesser` Gewässer 
* `Grossparkplatz` Großparkplatz 

## SolarLeistungsbegrenzungEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Nein` Nein 
* `Ja70Prozent` Ja, 70% 
* `Ja60Prozent` Ja, 60% 
* `Ja50Prozent` Ja, 50% 
* `JaSonstige` Ja, sonstige 

## SpannungsebeneEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Hoechstspannung` Höchstspannung (HöS) 
* `UmspannungZurHochspannung` Umspannung zur Hochspannung (HöS/HS) 
* `Hochspannung` Hochspannung (HS) 
* `UmspannungZurMittelspannung` Umspannung zur Mittelspannung (HS/MS) 
* `Mittelspannung` Mittelspannung (MS) 
* `UmspannungZurNiederspannung` Umspannung zur Niederspannung (MS/NS) 
* `Niederspannung` NS (z.B.: Haushaltsstrom) 

## SparteEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Strom` Strom 
* `Gas` Gas 

## SpeicherTypEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `SpeicherStrom` andere Gase 
* `SpeicherGas` Biomasse 

## StandortangabeEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Flurdaten` Über Flurdaten 
* `Adressdaten` Postalische Adresse 

## StartgrundNetzbetreiberpruefung

Basistyp: `string`

### Erlaubte Werte:

* `Inbetriebnahme` Die Einheit wurde in Betrieb genommen. 
* `ReaktivierungNachDeaktivierung` Die Einheit wurde nach einer Deaktivierung reaktiviert. 
* `Betreiberwechsel` Der Betreiber der Einheit hat sich geändert. 
* `InbetriebnahmeNachVoruebergehenderStilllegung` Die Einheit wurde nach einer vorübergehenden Stilllegung wieder in Betrieb genommen. 
* `EndgueltigeStilllegung` Die Einheit wurde als endgueltig stillgelegt registriert. 
* `UmzugEinheitAnAndereLokation` Die Einheit wurde an eine andere Lokation umgezogen. 
* `DatenaenderungGepruefteEinheit` Es wurden NBP-relevante Daten an der Einheit verändert, wobei die Einheit bereits geprüft war. 
* `Netzuebertragung` Die Einheit wurde in ein anderes Netz übertragen. 
* `ErneuteNetzbetreiberpruefungDurchBundesnetzagentur` Es wurde eine erneute Netzbetreiberprüfung durch einen Fachadministrator ausgelöst. 
* `ErneuteNetzbetreiberpruefungDurchNetzbetreiber` Es wurde eine erneute Netzbetreiberprüfung durch den Anschlussnetzbetreiber ausgelöst. 
* `EegKwkSpeicherVerknuepfungGeaendert` Der Einheit wurde eine EEG/KWK/Speicher Anlage hinzugefügt/entfernt 
* `DatenaenderungGepruefterABR` Es wurden NBP-relevante Daten am Anlagenbetreiber verändert, wobei die Einheit bereits geprüft war. 
* `StilllegungAbgelehnt` Registrierung der endgültigen Stilllegung wurde abgelehnt 
* `DatenaenderungGepruefteEinheitNachMaStRQSProzess` An der Einheit wurden auf Grund einer MaStR-QS Datenkorrekturaufforderung NBP-relevante Daten verändert 
* `DatenaenderungGepruefterABRNachMaStRQSProzess` Am Anlagenbetreiber wurden auf Grund einer MaStR-QS Datenkorrekturaufforderung NBP-relevante Daten verändert 
* `AenderungBetriebsstatusEinheit` Änderung des Betriebsstatus der Einheit 
* `AenderungArtDerStromerzeugung` Änderung der Art der Stromerzeugung 

## StromSpeicherMastrNummerId

Basistyp: `string`

## SystemkopplungEnum

Basistyp: `string`

### Erlaubte Werte:

* `None`  
* `ACgekoppeltesSystem` AC gekoppeltes System 
* `DCgekoppeltesSystem` DC gekoppeltes System 

## TechnologieGasErzeugungEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `FoerderungFossilenErdgases` Förderung fossilen Erdgases 
* `BiomethanErzeugung` Biomethan-Erzeugung 
* `PowerToGasWasserstoff` Power-to-Gas (Wasserstoff) 
* `PowerToGasMethan` Power-to-Gas (Methan) 
* `Gasspeicher` Gasspeicher 
* `LiquifidNaturalGas` Liquifid Natural Gas 

## TechnologieKernkraftEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Druckwasserreaktor` Druckwasserreaktor 
* `Siedewasserreaktor` Siedewasserreaktor 

## TechnologieSpeicherEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Batterie` Batterie 
* `Druckluft` Druckluft 
* `Schwungrad` Schwungrad 
* `Sonstige` Sonstige 
* `Pumpspeicher` Pumpspeicher 

## TechnologieVerbrennungsanlageEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Verbrennungsmotor` Verbrennungsmotor 
* `Brennstoffzelle` Brennstoffzelle 
* `Stirlingmotor` Stirlingmotor 
* `Dampfmotor` Dampfmotor 
* `ORCOrganicRankineCycleAnlage` ORC (Organic Rankine Cycle)-Anlage 
* `GegendruckmaschinemitEntnahme` Gegendruckmaschine mit Entnahme 
* `GegendruckmaschineohneEntnahme` Gegendruckmaschine ohne Entnahme 
* `GasturbinenohneAbhitzekessel` Gasturbinen ohne Abhitzekessel 
* `GasturbinenmitAbhitzekessel` Gasturbinen mit Abhitzekessel 
* `GasturbinenmitnachgeschalteterDampfturbine` Gasturbinen mit nachgeschalteter Dampfturbine 
* `KondensationsmaschinemitEntnahme` Kondensationsmaschine mit Entnahme 
* `KondensationsmaschineohneEntnahme` Kondensationsmaschine ohne Entnahme 
* `Sonstige` Sonstige 
* `KalinaCycle` Kalina-Cycle 

## TicketProzessKategorieEnum

Basistyp: `string`

### Erlaubte Werte:

* `EinheitenPlausibilitaetspruefung` Plausibilitätsprüfung:Einheit 
* `Netzbetreiberpruefung` Netzbetreiberprüfung 
* `AnlageLoeschen` Einheit löschen 
* `MastrZugangLoeschung` MaStR-Zugang löschen 
* `DatenAlsFehlerhaftGemeldet` Daten als fehlerhaft gemeldet 
* `Datenaenderung` Datenänderung 
* `Legitimationspruefung` Legitimierung 
* `AnlageUebertragen` Einheiten übertragen 
* `MarktakteurUebertragen` Marktakteur übertragen 
* `AutomatischeAnlagenueberpruefung` Automatische Einheitenprüfung 
* `ExternerMelder` Externe Meldung 

## TicketStatusEnum

Basistyp: `string`

### Erlaubte Werte:

* `Offen` In Übertragung 
* `InBearbeitung` Das Ticket befindet sich in Bearbeitung. 
* `WartetAufRueckmeldung` Das Ticket wartet auf die Rückmeldung. 
* `Abgeschlossen` Das Ticket ist abgeschlossen. 

## TitelEnum

Basistyp: `string`

### Erlaubte Werte:

* `Dr` Dr. 
* `Prof` Prof. 
* `ProfDr` Prof. Dr. 

## VerbrennungArtEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `AndereGase` andere Gase 
* `Braunkohle` Braunkohle 
* `Erdgas` Erdgas 
* `Mineraloelprodukte` Mineralölprodukte 
* `NichtBiogenerAbfall` nicht biogener Abfall 
* `Steinkohle` Steinkohle 
* `Waerme` Wärme 

## VerbrennungBrennstoffEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `KohlenwertstoffeAusSteinkohle` Kohlenwertstoffe aus Steinkohle 
* `Steinkohlen` Steinkohlen 
* `Steinkohlenbriketts` Steinkohlenbriketts 
* `Steinkohlenkoks` Steinkohlenkoks 
* `Braunkohlenbriketts` Braunkohlenbriketts 
* `Braunkohlenkoks` Braunkohlenkoks 
* `Hartbraunkohlen` Hartbraunkohlen 
* `Rohbraunkohlen` Rohbraunkohlen 
* `StaubUndTrockenkohle` Staub- und Trockenkohle 
* `Wirbelschichtkohle` Wirbelschichtkohle 
* `Dieselkraftstoff` Dieselkraftstoff 
* `HeizoelLeicht` Heizöl, leicht 
* `HeizoelSchwer` Heizöl, schwer 
* `Fluessiggas` Flüssiggas 
* `Petrolkoks` Petrolkoks 
* `Raffineriegas` Raffineriegas 
* `AndereMineraloelprodukte` Andere Mineralölprodukte 
* `ErdgasErdoelgas` Erdgas, Erdölgas 
* `GrubengasVerbrennung` Grubengas 
* `HochofengasKonvertergas` Hochofengas, Konvertergas 
* `Kokereigas` Kokereigas 
* `AndereGase` Andere Gase 
* `SonstigeHergestellteGase` Sonstige hergestellte Gase 
* `Industrieabfall` Industrieabfall 
* `AbfallHausmuellSiedlungsabfaelle` Abfall (Hausmüll, Siedl.abf.) 
* `Dampf` Dampf (zum Beispiel Prozesswärme) 
* `Waerme` Wärme 
* `Wasserstoff` Wasserstoff 

## WechselrichterEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `StromspeicherVorhandenGemeinsamerWechselrichterMitSolaranlage` Gemeinsamer Wechselrichter mit Stromspeicher 
* `StromspeicherVorhandenKeinGemeinsamerWechselrichterMitSolaranlage` Kein gemeinsamer Wechselrichter mit Stromspeicher 
* `KeinStromspeicherVorhanden` Kein Stromspeicher vorhanden 

## WeitereBrennstoffeEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `AbfallHausmuellSiedlungsabfaelle` Abfall (Hausmüll, Siedl.abf.) 
* `AltholzGebrauchtholzHolzmuell` Altholz, Gebrauchtholz, Holz(sperr)müll 
* `AndereGase` Andere Gase 
* `AndereMineraloelprodukte` Andere Mineralölprodukte 
* `Biodiesel` Biodiesel 
* `Biogas` Biogas 
* `BiomethanBioerdgas` Biomethan (Bioerdgas) 
* `Biomethanol` Biomethanol 
* `Braunkohlenbriketts` Braunkohlenbriketts 
* `Braunkohlenkoks` Braunkohlenkoks 
* `BrennlaugeSchwarzlaugeSulfitablauge` Brennlauge, Schwarzlauge, Sulfitablauge 
* `Dampf` Dampf (zum Beispiel Prozesswärme) 
* `Deponiegas` Deponiegas 
* `Dieselkraftstoff` Dieselkraftstoff 
* `EnergiepflanzenZurVerbrennung` Energiepflanzen zur Verbrennung (z.B. Kurzumtriebs-Holz) 
* `ErdgasErdoelgas` Erdgas, Erdölgas 
* `FesteBiogeneStoffe` Feste biogene Stoffe 
* `FesteBiogeneStoffeUndAbfaelleOhneHolz` Feste biogene Stoffe und Abfälle (ohne Holz) 
* `FluessigeBiogeneStoffeUndAbfaelle` Flüssige biogene Stoffe und Abfälle 
* `Fluessiggas` Flüssiggas 
* `GrubengasVerbrennung` Grubengas 
* `Hartbraunkohlen` Hartbraunkohlen 
* `Harzoel` Harzöl 
* `HeizoelLeicht` Heizöl, leicht 
* `HeizoelSchwer` Heizöl, schwer 
* `HochofengasKonvertergas` Hochofengas, Konvertergas 
* `HolzgasGasBiomasse` Holzgas (Gas Biomasse) 
* `Holzkohle` Holzkohle 
* `Holzreste` Holzreste (z.B. aus Schreinereien, auch Spanholz) 
* `HolzspaeneSaegemehl` Holzspäne, Sägemehl 
* `Industrieabfall` Industrieabfall 
* `Klaergas` Klärgas 
* `KohlenwertstoffeAusSteinkohle` Kohlenwertstoffe aus Steinkohle 
* `Kokereigas` Kokereigas 
* `PalmoelPflanzenoel` Palmöl u.a. Pflanzenöle 
* `PelletsHolz` Holz-Pellets, Holz-Briketts 
* `Petrolkoks` Petrolkoks 
* `Raffineriegas` Raffineriegas 
* `RindeLandschaftspflegeholz` Rinde und Landschaftspflegeholz 
* `Rohbraunkohlen` Rohbraunkohlen 
* `SchleifstaubBiogen` Schleifstaub, biogen 
* `SonstigeHergestellteGase` Sonstige hergestellte Gase 
* `StaubUndTrockenkohle` Staub- und Trockenkohle 
* `Steinkohlen` Steinkohlen 
* `Steinkohlenbriketts` Steinkohlenbriketts 
* `Steinkohlenkoks` Steinkohlenkoks 
* `StrohStrohpellets` Stroh, Strohpellets 
* `Terpentin` Terpentin 
* `Tierfett` Tierfett 
* `TierUndBlutmehl` Tier- und Blutmehl 
* `Waerme` Wärme 
* `WaldHolzhackschnitzelWaldScheitholzWaldKronenholz` Wald-Holzhackschnitzel, Wald-Scheitholz, -Kronenholz 
* `WaldStammholzRundholz` Wald-Stammholz, Rundholz 
* `Wasserstoff` Wasserstoff 
* `Wirbelschichtkohle` Wirbelschichtkohle 

## WindLageEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `WindAnLand` Windkraft an Land 
* `WindAufSee` Windkraft auf See 

## WindanlageTechnologieEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Horizontallaeufer` Horizontalläufer 
* `Vertikallaeufer` Vertikalläufer 

## ZuflussartEnum

Basistyp: `string`

### Erlaubte Werte:

* `None` None 
* `Flusskraftwerk` Flusskraftwerk 
* `Restwasserkraftwerk` Restwasserkraftwerk 
* `Ausleitungskraftwerk` Ausleitungskraftwerk 

