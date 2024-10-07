document.getElementById('service-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const customerName = document.getElementById('customerName').value;
    const acType = document.getElementById('acType').value;
    const serviceType = document.getElementById('serviceType').value;
    const email = document.getElementById('email').value;
    const yearlyMaintenance = document.getElementById('yearlyMaintenance').checked;

    let serviceCharge;

    if (serviceType === "Cleaning") {
        serviceCharge = 500;
    } else if (serviceType === "Repair") {
        serviceCharge = 1000;
    } else if (serviceType === "Gas Refill") {
        serviceCharge = 1500;
    }

    if (yearlyMaintenance) {
        serviceCharge += 1000;
    }

    const resultMessage = `Hello ${customerName}, your service appointment for ${acType} AC ${serviceType} ${yearlyMaintenance ? 'with' : 'without'} yearly maintenance will be sent to your email ID ${email} and the estimated service charge will be Rs ${serviceCharge}.`;

    const resultDiv = document.getElementById('result');
    resultDiv.textContent = resultMessage;
    resultDiv.style.display = 'block';
});
