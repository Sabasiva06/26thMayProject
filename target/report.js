$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "name": "Validating Adacting Hotel page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Adacting page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userIsOnAdactingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userShouldEnterUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.userShouldClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking with Fields marked with Red asterix are mandatory",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user on Serach page need to enter Select location , noofroom,cid,cod,adult per room",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userOnSerachPageNeedToEnterSelectLocationNoofroomCidCodAdultPerRoom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User need to clik search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.userNeedToClikSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Adacting page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.userIsOnAdactingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userShouldEnterUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.userShouldClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking with Fileds Without marked with Red asterix",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user need to select hotels,roomtype,child per room",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userNeedToSelectHotelsRoomtypeChildPerRoom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to proceed search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.userNeedToProceedSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to validate error message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.userNeedToValidateErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});