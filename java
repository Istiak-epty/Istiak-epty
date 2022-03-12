<script src="https://www.paypal.com/sdk/js?client-id=YOUR_CLIENT_ID&components=YOUR_COMPONENTS"></script>
paypal.Buttons({
  style: {
    layout: 'vertical',
    color:  'blue',
    shape:  'rect',
    label:  'paypal'
  }
}).render('#paypal-button-container');

<script>
  paypal.Buttons({
    createOrder: function(data, actions) {
      // Set up the transaction
      return actions.order.create({
        purchase_units: [{
          amount: {
            value: '0.01'
          }
        }]
      });
    }
  }).render('#paypal-button-container');
</script>
paypal.Buttons({
  createSubscription: function(data, actions) {
    return actions.subscription.create({
      'plan_id': 'P-2UF78835G6983425GLSM44MA'
    });
  },

  onApprove: function(data, actions) {
    alert('You have successfully created subscription ' + data.subscriptionID);
  }
}).render('#paypal-button-container');
// Loop over each funding source / payment method
paypal.getFundingSources().forEach(function(fundingSource) {

  // Initialize the buttons
  var button = paypal.Buttons({
    fundingSource: fundingSource
  });

  // Check if the button is eligible
  if (button.isEligible()) {

    // Render the standalone button for that funding source
    button.render('#paypal-button-container');
  }
});
