

var c = document.getElementsByTagName("h3")
var inc = 0;
let countp = () => {
    inc++;
    c[0].innerHTML = inc;
};

let countm = () => {
    inc--;
    c[0].innerHTML = inc;
};

let clears = () => {
    c[0].innerHTML = 0;

};