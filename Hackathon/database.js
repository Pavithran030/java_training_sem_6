const arr=[
    {
        id:1,
        name:"Harish",
        email:"harishmohankumar03@gmail.com",
        password:"harish",
    },{
        id:2,
        name:"pavithran",
        email:"pavithran03@gmail.com",
        password:"pavithran",
    },{
        id:3,
        name:"Joel",
        email:"joel03@gmail.com",
        password:"joel",
    },{
        id:4,
        name:"praveen",
        email:"praveen03@gmail.com",
        password:"praveen",
    },{
        id:5,
        name:"Adhi",
        email:"adhi03@gmail.com",
        password:"adhi",
    },{
        id:6,
        name:"Saran",
        email:"saran03@gmail.com",
        password:"saran",
    }
]



// Get elements
const loginBtn = document.getElementById('login');
const emailInput = document.getElementById('mail');
const passInput = document.getElementById('pass');
const errorMsg = document.getElementById('errorMsg');
const userDetailsDiv = document.getElementById('userDetails');
const loginForm = document.getElementById('loginForm');

// Login button click event
loginBtn.addEventListener('click', function(e) {
    e.preventDefault();
    
    const email = emailInput.value.trim();
    const password = passInput.value.trim();
    
    // Clear previous error
    errorMsg.textContent = '';
    
    // Validate inputs
    if (!email || !password) {
        errorMsg.textContent = 'Please enter both email and password';
        return;
    }
    
    // Find user in array
    const user = arr.find(u => u.email === email && u.password === password);
    
    if (user) {
        // Successful login - display user details
        displayUserDetails(user);
        // Hide login form
        loginForm.style.display = 'none';
    } else {
        // Invalid credentials
        errorMsg.textContent = 'Invalid email or password';
    }
});

// Function to display user details
function displayUserDetails(user) {
    userDetailsDiv.innerHTML = `
        <div class="user-card">
            <h2>Welcome, ${user.name}!</h2>
            <div class="detail-row">
                <span class="label">ID:</span>
                <span class="value">${user.id}</span>
            </div>
            <div class="detail-row">
                <span class="label">Name:</span>
                <span class="value">${user.name}</span>
            </div>
            <div class="detail-row">
                <span class="label">Email:</span>
                <span class="value">${user.email}</span>
            </div>
            <button id="logoutBtn" class="logout-btn">Logout</button>
        </div>
    `;
    
    // Add logout functionality
    document.getElementById('logoutBtn').addEventListener('click', logout);
}

// Logout function
function logout() {
    // Clear inputs
    emailInput.value = '';
    passInput.value = '';
    
    // Show login form
    loginForm.style.display = 'block';
    
    // Clear user details
    userDetailsDiv.innerHTML = '';
}