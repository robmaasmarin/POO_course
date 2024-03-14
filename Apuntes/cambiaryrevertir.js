
    // CAMBIAR FONDO Y REVERTIR CAMBIOS ONCLICK
    var flag = true;
        function changeColor() {
          let bckg =  document.body;
          let el =  document.getElementById("maindiv");
          el.style.backgroundColor = flag? "red": "";
          bckg.style.background = flag? "pink" : "";

          flag = !flag; 
            
        }
  