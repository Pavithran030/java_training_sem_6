
// Select elements
const emailInput = document.getElementById("mail");
const passwordInput = document.getElementById("pass");
const loginButton = document.getElementById("login");
const loginpage=document.getElementsByClassName("login");
const formpage=document.getElementsByClassName("forms");

const formsub=document.getElementById("submit");

// Add click event
loginButton.addEventListener("click", function (even) {

    // Prevent page refresh (important if inside form)
    even.preventDefault();

    // Get values
    const emailValue = emailInput.value;
    const passwordValue = passwordInput.value;
    if(emailValue!=="" || passwordValue!==""){
        
        //hide the login page
        loginpage[0].style.display="none"

        //show the login page
        formpage[0].style.display="block"
    }
    else{
        alert("Enter the details to Login..")
    }

});


const names=document.getElementById("na")
const gender=document.getElementById("gen")
const phone=document.getElementById("ph")
const address=document.getElementById("ad")
const tick=document.getElementById("ter")

formsub.addEventListener("click", function(ev){
    ev.preventDefault();

    if(names.value && gender.value && phone.value && address.value && tick.value){
        console.log("Form submitted Successfully...");
        alert("✅Form submitted Successfully")
    }
    else{
        alert("⚠️Please fill all fields!")
        
    }
    
});