$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/google_search.feature");
formatter.feature({
  "name": "Search for a term in google search",
  "description": "  Entering a term in google search and verifying result page is displayed",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TC_Google_Search"
    }
  ]
});
formatter.scenario({
  "name": "Single term serach",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC_Google_Search"
    },
    {
      "name": "@scenario_001"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to google search page",
  "keyword": "Given "
});
formatter.match({
  "location": "googlesteps.i_navigate_to_google_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I type the term in google search bar and click on serach results",
  "keyword": "When "
});
formatter.match({
  "location": "googlesteps.i_type_the_term_in_google_search_bar_and_click_on_serach_results()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I should get the results page",
  "keyword": "Then "
});
formatter.match({
  "location": "googlesteps.i_should_get_the_results_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});