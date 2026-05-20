const formulario = document.getElementById("formEvento");

formulario.addEventListener("submit", function(event) {

  event.preventDefault();

  const nome = document.getElementById("nome").value;
  const email = document.getElementById("email").value;

  if(nome === "" || email === "") {
    alert("Preencha todos os campos!");
    return;
  }

  alert(`🎉 Inscrição realizada com sucesso, ${nome}!`);

  formulario.reset();
});