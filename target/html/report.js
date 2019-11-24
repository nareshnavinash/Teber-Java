$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/is_it_friday.feature");
formatter.feature({
  "name": "Is it Friday yet?",
  "description": "  Everybody wants to know when it\u0027s Friday",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Sunday isn\u0027t Friday",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "today is Sunday",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.today_is_Sunday()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I ask whether it\u0027s Friday yet",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.i_ask_whether_it_s_Friday_yet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be told \"Nope\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.i_should_be_told(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/is_it_monday.feature");
formatter.feature({
  "name": "Is it Moday yet?",
  "description": "  Everybody wants to know when it\u0027s Friday",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "name": "Monday isn\u0027t Friday",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "today is Sunday",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.today_is_Sunday()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I ask whether it\u0027s Friday yet",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.i_ask_whether_it_s_Friday_yet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be told \"Nope\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.i_should_be_told(String)"
});
formatter.result({
  "status": "passed"
});
});