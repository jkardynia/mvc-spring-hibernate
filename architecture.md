Architektura
===================
System sk³ada siê z trzech g³ownych pakietów:

config
=========
Tutaj powinny znajeœæ siê definicje klas zawieraj¹cych metody fabrykuj¹ce tworz¹ce serwisy, które mog¹ byæ wykorzystane np. w DI.

web
========
Miejsce na elementy systemu dedykowane dla aplikacji webowej (kontrolery, widoki i model maj¹cy zastosowanie
jedynie w aplikacji webowej (np. koszyk))

core
=======
Logika boznesowa systemu. Tutaj znajduje siê g³ówny model, który powinien byæ odseparowany od innych modeli (Bounded Context).
Sk³ada siê on z kilku podpakietów:

domain
=====
Stanowi serce systemu. Powinien zawieraæ Agregaty, Policy itp.. Mo¿na tutaj tak¿e wydzieliæ serwisy domenowe (DAO itp), jednak¿e wiêkszoœæ systemów raczej nie bêdzie
na tyle du¿a by by³o to konieczne.

persistence
=====
Encje anemiczne dla ORM.

service
=====
Serwisy aplikacyjne. Za ich poœrednictwem powinna nastêpowaæ komunikacja z modelem zawartym w tym Bounded Contexcie.

dto
=====
Serwisy aplikacyjne powinny siê komunkowaæ ze œwiatem za pomoc¹ DTO (Request/Response, który przyjmuj¹/zwracaj¹), poza model nie powinny byæ zwraca encje, które mog¹ pracowaæ bezpoœrednio na danych.
Zapewne w wiêkszoœci niedu¿ych aplikacji narzut zwi¹zany z przepisywaniem danych z encji na DTO bêdzie zbyt du¿y by je stosowaæ.