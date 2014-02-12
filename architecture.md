Architektura
===================
System składa się z trzech głownych pakietów:

config
=========
Tutaj powinny znajeść się definicje klas zawierających metody fabrykujące tworzące serwisy, które mogą być wykorzystane np. w DI.

web
========
Miejsce na elementy systemu dedykowane dla aplikacji webowej (kontrolery, widoki i model mający zastosowanie
jedynie w aplikacji webowej (np. koszyk))

W naszym podejsciu Single Page - będą tutaj podstawowe strony, które następnie będą ogrywane za pomocą angulara, który będzie korzystał z REST API

rest
=======
Kontrolery dla REST API

core
=======
Logika boznesowa systemu. Tutaj znajduje się główny model, który powinien być odseparowany od innych modeli (Bounded Context).
Składa się on z kilku podpakietów:

domain
=====
Stanowi serce systemu. Powinien zawierać Agregaty, Policy itp.. Można tutaj także wydzielić serwisy domenowe, jednakże większość systemów raczej nie będzie
na tyle duża by było to konieczne.

persistence
=====
Encje anemiczne dla ORM.
Repozytoria (DAO)

service
=====
Serwisy aplikacyjne. Za ich pośrednictwem powinna następować komunikacja z modelem zawartym w tym Bounded Contexcie.

dto
=====
Serwisy aplikacyjne powinny się komunkować ze światem za pomocą DTO (Request/Response, który przyjmują/zwracają), poza model nie powinny być zwraca encje, które mogą pracować bezpośrednio na danych.
Zapewne w większości niedużych aplikacji narzut związany z przepisywaniem danych z encji na DTO będzie zbyt duży by je stosować.