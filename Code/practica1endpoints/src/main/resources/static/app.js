document.getElementById('saludoForm').addEventListener('submit', function(e) {
    e.preventDefault();

    var nombre = document.getElementById('nombre').value;
    var cargo = document.getElementById('cargo').value;

    fetch('http://localhost:7070/saludojson', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            nombre: nombre,
            cargo: cargo
        })
    })
    .then(response => response.json())
    .then(data => {
        alert(`Nombre: ${data.nombre}, Cargo: ${data.cargo}`);
    })
    .catch(error => {
        console.error('Error:', error);
    });
});