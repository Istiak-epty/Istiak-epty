- 👋 Hi, I’m @Istiak-epty


<script src="https://www.paypal.com/sdk/js?client-id=YOUR_CLIENT_ID"></script>

import { loadScript } from "@paypal/paypal-js";
loadScript({ "client-id": YOUR_CLIENT_ID })
.then((paypal) => {
    // start to use the PayPal JS SDK script
})
.catch((err) => {
    console.error("failed to load the PayPal JS SDK script", err);
});

<script src="https://www.paypal.com/sdk/js?client-id=test"></script>
<script>
    paypal.Buttons().render("body");
</script>
