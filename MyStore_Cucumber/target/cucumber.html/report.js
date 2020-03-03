$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/featurefile/Register.feature");
formatter.feature({
  "name": "Registration",
  "description": "In Order to create an account\nAs a user\nI want to enter my details",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "create an account",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in the register page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinations.StepDefination.user_is_in_the_register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter following details",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefinations.StepDefination.user_enter_following_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on register",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinations.StepDefination.clicks_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "successful registration should happen",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinations.StepDefination.successful_registration_should_happen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});