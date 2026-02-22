let a=document.getElementById("s1").value;
let b=document.getElementById("s2").value;
let c=document.getElementById("s3").value;
let d=document.getElementById("s4").value;
let e=document.getElementById("s5").value;
let total=a+b+c+d+e;
let avg=(a+b+c+d+e)/5;
document.getElementById("res").innerHTML=total;
document.getElementById("res").innerHTML=total;

function display(){
    if(total>50){
        send="Pass"
}
}
