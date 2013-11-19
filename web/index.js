function setBGColor(color) {
    document.body.style.background = color;
}

server.ready( function() {
    server.send("hello");
});