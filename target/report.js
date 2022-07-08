$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MAGicbricks/Vastuservices.feature");
formatter.feature({
  "name": "Checking the user is able to connect with Vastu services.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Vastuservices"
    }
  ]
});
formatter.scenario({
  "name": "To validate the user should be able to connect with Vastu services.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Vastuservices"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Vastuservices.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on the sell button",
  "keyword": "When "
});
formatter.match({
  "location": "Vastuservices.i_Click_on_the_sell_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the vastu services.",
  "keyword": "And "
});
formatter.match({
  "location": "Vastuservices.click_on_the_vastu_services()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat magicbricks_step_definitions.Vastuservices.click_on_the_vastu_services(Vastuservices.java:88)\r\n\tat ✽.Click on the vastu services.(MAGicbricks/Vastuservices.feature:7)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Click on to add to my ordres.",
  "keyword": "And "
});
formatter.match({
  "location": "Vastuservices.click_on_to_add_to_my_ordres()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on go to cart.",
  "keyword": "Then "
});
formatter.match({
  "location": "Vastuservices.click_on_go_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on payment.",
  "keyword": "Then "
});
formatter.match({
  "location": "Vastuservices.click_on_payment()"
});
formatter.result({
  "status": "skipped"
});
});