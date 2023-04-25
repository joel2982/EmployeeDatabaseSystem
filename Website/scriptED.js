// Get the modal
var modal = document.getElementById("myModal");

// Get the button that opens the modal
var btn = document.getElementById("myBtn");
console.log(btn);

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks on the button, open the modal
btn.onclick = function() {
  modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}

var val = document.getElementById('emp_id');
console.log(val);

document.getElementById("del").onclick = function(event){
    event.preventDefault();
    var req = new XMLHttpRequest();
    var link="http://localhost:8080/employees/" + val;
    console.log(link);
    req.delete(link);
    req.onreadystatechange = function () {
    if (req.readyState === 4 && req.status === 200) {
        console.log(req.responseText);
        }
    };
};
<script src="scriptED.js"></script>
