function Taschenrechner() {
}

function Check (Eingabe) {
  var nur_das = "0123456789[]()-+*%/.";
  for (var i = 0; i < Eingabe.length; i++)
    if (nur_das.indexOf(Eingabe.charAt(i)) < 0)
      return false;
  return true;
}

function Ergebnis () {
  var x = 0;
  if (Check(window.document.Rechner.Display.value))
    x = eval(window.document.Rechner.Display.value);
  window.document.Rechner.Display.value = x;
}

function Hinzufuegen (Zeichen) {
  window.document.Rechner.Display.value = window.document.Rechner.Display.value + Zeichen;
}

function Sonderfunktion (Funktion) {
  if (Check(window.document.Rechner.Display.value)) {
    if (Funktion == "sqrt") {
      var x = 0;
      x = eval(window.document.Rechner.Display.value);
      window.document.Rechner.Display.value = Math.sqrt(x);
    }
    if (Funktion == "pow") {
      var x = 0;
      x = eval(window.document.Rechner.Display.value);
      window.document.Rechner.Display.value = x * x;
    }
    if (Funktion == "ln") {
      var x = 0;
      x = eval(window.document.Rechner.Display.value);
      window.document.Rechner.Display.value = Math.log(x);
    }
  } else
    window.document.Rechner.Display.value = 0}