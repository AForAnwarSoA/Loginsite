Gruppemedlemmer: Anwar, Najib, Kevin & Lucas

Hvad programmet gør:
Vores program er et simpelt login-system. Brugeren skriver sit brugernavn og sin adgangskode. 
Programmet tjekker, om brugeren findes, og om adgangskoden er korrekt. Brugeren har maks. 3 forsøg.
Ved forkert kode får man besked om, hvor mange forsøg der er tilbage, og efter 3 fejl bliver kontoen låst.

Vores regler:
- Brugernavnet skal findes i vores ArrayList.
- Brugernavne tjekkes med equalsIgnoreCase(), så store og små bogstaver ikke betyder noget.
- Adgangskoden skal passe præcist.
- Brugeren har maks. 3 forsøg.
- Ved korrekt login vises en velkomstbesked.
- Efter 3 forkerte forsøg bliver kontoen låst.

  
Vores udvidelse:
Vi har brugt ArrayList i stedet for normale arrays og opdelt programmet i flere metoder. 
Det gør koden mere overskuelig og gør det lettere at tilføje flere brugere.

Noget vi syntes var svært:
Det var lidt svært at forstå, hvordan brugernavne og adgangskoder skulle hænge sammen gennem deres index. 
Det var også udfordrende at sende vores ArrayList mellem metoder og få while-løkken med de 3 forsøg til at fungere rigtigt.

Noget vi gerne vil have feedback på:
Er vores opdeling i metoder overskuelig, og er det en god løsning at bruge to separate ArrayList til brugernavne og adgangskoder?
