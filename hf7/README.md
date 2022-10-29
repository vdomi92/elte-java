Készíte el a verem (Stack) adatszerkezet egy egyszerű implementációját!

-A Stack csak int -eket tud tárolni.
-Két fő művelete van:
-push(): behelyez egy elemet a verem tetejére,
-pop(): eltávolítja az utoljára behelyezett elemet a veremből is vissza adja annak az értékét.
-Továbbá ellenőrizhető, hogy üres-e a verem (empty()) és lekérdezhető a mérete (size()).
-Amennyiben egy üres veremből próbálunk adatot kivenni, váltódjon ki NoSuchElementException (java.util csomag)!

Tesztelje le a verem implementációt (a tanult tesztkörnyezetben) a következőképp:

-ellenőrizze, hogy az utoljára behelyezett elem az első, amit kikerül,
-egy frissen létrehozott verem üres,
-egy elemmel rendelkező verem nem üres,
-üres veremből nem lehet elemet kivenni (teszteljük, hogy dobódik-e kivétel),
-jól működik a size() metódus extremális értékeken (0,1),
-ha az utolsó elem is kikerül, a verem üres.
