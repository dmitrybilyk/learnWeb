<script>
  function myFunction(p1, p2) {
    document.getElementById("lenaTestId").innerHTML = p1 * p2;
  }
  function openShahkar() {
    window.open("https://sportarena.com/basketball/");
  }
  function validateForm(formObject) {
    for (i = 0; i < formObject.length; i++) {
      if ((formObject.elements[i].value == "")) {
        alert("error - " + formObject.elements[i].name);
        return false;
      }
    }
    return true;
  }
</script>
