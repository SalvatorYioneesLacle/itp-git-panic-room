# 🕵️ Git Detective – Ermittlungsprotokoll

Ziel dieser Station ist es, das Repository zu **verstehen**, nicht es zu reparieren.

- Es wird **(noch) nichts geändert**
- Es wird **(noch) nichts repariert**
- Es wird **(noch) nichts committed**

Reparaturen folgen erst im **Panic Room** 🚨

Ausgearbeitet von: Salvator Yionees Lacle



## #1 -  Überblick über die Git-History
Welche 2 Commits fallen euch in der History bereits zu Beginn negativ auf? Und warum? 

- Commit-Message "update", man weiß nicht, was geändert wurde
- Commit-Message "update more", wo sehr viel geändert wurde


## #2 - Ab welchem Commit ist das Projekt nicht mehr stabil?
Woran erkennt ihr, dass es ab hier ein Problem gibt?
Mit welche(n) Befehl(en) könnt ihr das herausfinden?
(Antwort: Commit-ID, Message, Begründung)

- 50da5b1, Update, Es wird ab dem Commit immer durch 0 dividiert
- fc9bdcf, Update more, Der Fehler im Programm wird ausgegeben

## #3 - Welche Datei wurde dabei verändert?
Welche Datei(en) wurden im verdächtigen Commit verändert?
Mit welche(n) Befehlen könnt ihr das herausfinden?
(Antwort: Commit-ID, geänderte Datei(en), Kurzbeschreibung der Änderung)

- 50da5b1, Calculator.java, git show

## #4 - Wer hat die entscheidende Stelle verändert?
Welche Datei ist besonders relevant und warum?
Mit welche(n) Befehlen kannst du dies rausfinden? 
(Antwort: Datei, Commit-ID der relevanten Änderung, Commit Message, betroffene Code-Stelle, warum ist diese Stelle wichtig?)

- Calculator.java, 50da5b1, Update, Zeilen 9 - 12, Der Bug wird dort eingefügt

## #5: Vergleich vor und nach der Änderung
Was ist der Unterschied im Code, bevor und nachdem das Problem entstanden ist? Mit welchem Befehl kannst du das rausfinden? 

- Git diff \
Vor der Änderung stand im Programm "return a/b", nach der Änderung "return a/0"
