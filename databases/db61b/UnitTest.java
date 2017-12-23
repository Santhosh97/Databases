package db61b;

import org.junit.Test;
import ucb.junit.textui;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Santhosh Subramanian
 */

public class UnitTest {
    String[] playertitles = {"Team", "First", "Last", "Position", "Jersey"};
    String[] lebron = {"Cavs", "Lebron", "James", "SF", "30"};
    String[] dwyane = {"Cavs", "Dwyane", "Wade", "SF", "15"};
    String[] curry = {"Warriors", "Stephen", "Curry", "PG", "40"};
    String[] westbrook = {"Thunder", "Russell", "Westbrook", "PG", "29"};
    String[] harden = {"Rockets", "James", "Harden", "SG", "27"};
    String[] paul = {"Thunder", "Paul", "George", "SF", "25"};
    String[] giannis = {"Bucks", "Giannis", "Antente", "SF", "45"};
    Table nbaplayers = new Table(playertitles);

    String[] playerstatstitles = {"First", "Points", "Rebounds",
                                  "Assists", "Blocks", "Steals"};
    String[] lebronstats = {"Lebron", "40", "6.5", "3.4", "1.0", "0.3"};
    String[] dwyanestats = {"Dwyane", "21", "5.7", "2", "1.4", "0.5"};
    String[] currystats = {"Stephen", "45", "3", "8", "2", "1"};
    String[] westbrookstats = {"Russell", "50", "12", "11", "3", "3"};
    String[] hardenstats = {"Harden", "36", "14", "3", "2", "0"};
    String[] paulstats = {"Paul", "25", "9", "4", "3", "2"};
    String[] giannisstats = {"Giannis", "40", "20", "10", "6", "2"};
    Table stats = new Table(playerstatstitles);

    String[] league = {"Team", "Name", "Position", "Region"};
    String[] soren = {"TSM", "Bjersen", "Mid", "NA"};
    String[] khan = {"Longzhu", "Khan", "Top", "KR"};
    String[] faker = {"SKT", "Faker", "Mid", "KR"};
    String[] rekkles = {"Fnatic", "Rekkles", "ADC", "EU"};
    String[] uzi = {"RNG", "Uzi", "ADC", "China"};
    String[] jensen = {"C9", "Jensen", "Mid", "NA"};
    String[] pray = {"Longzhu", "Pray", "ADC", "KR"};
    String[] doublelift = {"TSM", "Doublelift", "ADC", "NA"};
    String[] crown = {"SSG", "Crown", "Mid", "KR"};
    String[] aphromoo = {"CLG", "Aphromoo", "Support", "NA"};
    String[] gorilla = {"Longzhu", "Gorilla", "Support", "KR"};
    String[] huni = {"SKT", "Huni", "Top", "KR"};
    String[] bang = {"SKT", "Bang", "ADC", "KR"};
    String[] biofrost = {"TSM", "Biofrost", "Support", "NA"};
    Table leagueplayers = new Table(league);


    String[] leaguestats = {"Name", "Kills", "Deaths", "Assists", "Rating"};
    String[] khanstats = {"Khan", "3.3", "2.2", "5.8", "159"};
    String[] sorenstats = {"Bjersen", "4.2", "1.8", "5.9", "152"};
    String[] fakerstats = {"Faker", "3.7", "2.1", "4.9", "148"};
    String[] rekklesstats = {"Rekkles", "4.4", "1.1", "4.8", "162"};
    String[] uzistats = {"Uzi", "4.4", "1.5", "4.5", "188"};
    String[] jensenstats = {"Jensen", "5.1", "1.6", "5.5", "160"};
    String[] praystats = {"Pray", "3.1", "2.1", "5.1", "133"};
    String[] doubleliftstats = {"Doublelift", "3.4", "2.1", "5.6", "138"};
    String[] crownstats = {"Crown", "2.9", "2", "4", "133"};
    String[] aphromoostats = {"Aphromoo", "1.7", "3.2", "9.2", "100"};
    String[] gorillastats = {"Gorilla", "1.0", "2.5", "7.7", "101"};
    String[] hunistats = {"Huni", "2.5", "2.4", "5.6", "124"};
    String[] bangstats = {"Bang", "4.7", "1.0", "4", "199"};
    String[] biofroststats = {"Biofrost", "1.0", "2.1", "9.2", "109"};
    Table playerstats = new Table(leaguestats);


    String[] one = {"Col1", "Col2", "Col3"};
    String[] two = {"001", "002", "003"};
    String[] three = {"004", "005", "006"};
    String[] four = {"007", "008", "009"};
    String[] five = {"010", "011", "112"};
    Table generic1 = new Table(one);

    String[] one1 = {"Col4", "Col2", "Col1"};
    String[] two1 = {"113", "001", "002"};
    String[] three1 = {"114", "002", "001"};
    String[] four1 = {"116", "008", "004"};
    String[] five1 = {"117", "011", "010"};
    String[] six1 = {"118", "008", "007"};
    Table generic2 = new Table(one1);

    public static void main(String[] ignored) {

        textui.runClasses(new Class[]{UnitTest.class});
    }

    @Test
    /*Testing if the columns() function for each test,
    returns the number of columns*/
    public void testcolumns() {
        assertEquals(5, nbaplayers.columns());
        assertEquals(playertitles.length, nbaplayers.columns());
        assertEquals(6, stats.columns());
        assertEquals(playerstatstitles.length, stats.columns());
        assertEquals(4, leagueplayers.columns());
        assertEquals(league.length, leagueplayers.columns());
        assertEquals(5, playerstats.columns());
        assertEquals(leaguestats.length, playerstats.columns());
        assertEquals(3, generic1.columns());
        assertEquals(one.length, generic1.columns());
        assertEquals(3, generic2.columns());
        assertEquals(one1.length, generic1.columns());
    }

    @Test
    /*Testing the findColumn function for each table*/
    public void testfindColumn() {
        assertEquals(0, nbaplayers.findColumn("Team"));
        assertEquals(-1, nbaplayers.findColumn("Points"));
        assertEquals(2, stats.findColumn("Rebounds"));
        assertEquals(-1, stats.findColumn("Position"));
        assertEquals(3, leagueplayers.findColumn("Region"));
        assertEquals(-1, leagueplayers.findColumn("Points"));
        assertEquals(3, playerstats.findColumn("Assists"));
        assertEquals(-1, playerstats.findColumn("Points"));
        assertEquals(2, generic1.findColumn("Col3"));
        assertEquals(-1, generic1.findColumn("Col4"));
        assertEquals(0, generic2.findColumn("Col4"));
        assertEquals(-1, generic2.findColumn("Col3"));
    }

    @Test
    /*Testing getTitle function for each table*/
    public void getTitle() {
        assertEquals("Team", nbaplayers.getTitle(0));
        assertEquals("Rebounds", stats.getTitle(2));
        assertEquals("Region", leagueplayers.getTitle(3));
        assertEquals("Deaths", playerstats.getTitle(2));
        assertNotEquals("Col3", generic1.getTitle(1));
        assertNotEquals("Col4", generic2.getTitle(2));
    }

    @Test
    /*Testing the add function, lexographic order,
    select function, and get(row, col) function of
    the tables relating to NBA Players */
    public void testnba() {
        nbaplayers.add(lebron); nbaplayers.add(dwyane); nbaplayers.add(curry);
        nbaplayers.add(westbrook); nbaplayers.add(harden); nbaplayers.add(paul);
        nbaplayers.add(giannis);

        assertEquals(7, nbaplayers.size());
        assertEquals("Bucks", nbaplayers.get(0, 0));
        assertEquals("James", nbaplayers.get(3, 1));
        assertEquals("Westbrook", nbaplayers.get(5, 2));
        assertEquals("25", nbaplayers.get(4, 4));
        assertEquals("Lebron", nbaplayers.get(2, 1));

        stats.add(lebronstats); stats.add(dwyanestats);
        stats.add(paulstats);
        stats.add(currystats); stats.add(westbrookstats);
        stats.add(hardenstats); stats.add(giannisstats);

        assertEquals(7, stats.size());
        assertEquals("21", stats.get(0, 1));
        assertEquals("3", stats.get(4, 4));
        assertEquals("4", stats.get(4, 3));
        assertEquals("Lebron", stats.get(3, 0));
        assertEquals("3", stats.get(2, 3));
        assertEquals("2", stats.get(1, 5));

        List<Condition> conditionList = new ArrayList<Condition>();
        List<String> columnNames = new ArrayList<String>();
        columnNames.add("First");
        columnNames.add("Last");
        Column condition = new Column("Position", nbaplayers);
        Condition filter = new Condition(condition, "=", "SF");
        conditionList.add(filter);
        Table result = nbaplayers.select(columnNames, conditionList);
        assertEquals("Dwyane", result.get(0, 0));
        assertEquals("Antente", result.get(1, 1));
        assertEquals("Lebron", result.get(2, 0));
        assertEquals("George", result.get(3, 1));
        assertEquals("Giannis", result.get(1, 0));
        assertEquals("Paul", result.get(3, 0));
        assertEquals(4, result.size());
        assertEquals(2, result.columns());
        conditionList.clear();
        columnNames.clear();

        columnNames.add("First");
        columnNames.add("Points");
        Column conditionone = new Column("Points", stats);
        Condition filterone = new Condition(conditionone, ">", "36");
        conditionList.add(filterone);
        Table statsresult = stats.select(columnNames, conditionList);
        assertEquals("Giannis", statsresult.get(0, 0));
        assertEquals("Stephen", statsresult.get(statsresult.size() - 1, 0));
        assertEquals("40", statsresult.get(1, 1));
        conditionList.clear();
        columnNames.clear();

    }

    @Test
    public void nbatestselect() {
        List<Condition> conditionList = new ArrayList<Condition>();
        List<String> columnNames = new ArrayList<String>();

        nbaplayers.add(lebron); nbaplayers.add(dwyane);
        nbaplayers.add(curry); nbaplayers.add(westbrook);
        nbaplayers.add(harden); nbaplayers.add(paul);
        nbaplayers.add(giannis);

        stats.add(lebronstats); stats.add(dwyanestats);
        stats.add(paulstats); stats.add(currystats);
        stats.add(westbrookstats); stats.add(hardenstats);
        stats.add(giannisstats);

        columnNames.add("First");
        columnNames.add("Team");
        columnNames.add("Position");
        columnNames.add("Points");
        columnNames.add("Rebounds");
        Column condition1 = new Column("Team", nbaplayers);
        Condition conditionone = new Condition(condition1, "=", "Cavs");
        conditionList.add(conditionone);
        Table selecttworesult = nbaplayers.select2(stats,
                columnNames, conditionList);

        assertEquals("Dwyane", selecttworesult.get(0, 0));
        assertEquals("Lebron", selecttworesult.get(1, 0));
        assertEquals("Points", selecttworesult.getTitle(3));
        assertEquals("Rebounds", selecttworesult.getTitle(4));
        conditionList.clear();
        columnNames.clear();
    }

    @Test
    public void testleagueplayersselect() {
        leagueplayers.add(soren); leagueplayers.add(khan);
        leagueplayers.add(faker); leagueplayers.add(rekkles);
        leagueplayers.add(uzi); leagueplayers.add(jensen);
        leagueplayers.add(pray); leagueplayers.add(doublelift);
        leagueplayers.add(crown); leagueplayers.add(aphromoo);
        leagueplayers.add(gorilla); leagueplayers.add(huni);
        leagueplayers.add(bang); leagueplayers.add(biofrost);

        assertEquals("Team", leagueplayers.getTitle(0));
        assertEquals("Gorilla", leagueplayers.get(3, 1));
        assertEquals("KR", leagueplayers.get(10, 3));
        assertEquals("ADC", leagueplayers.get(7, 2));
        assertEquals("Doublelift", leagueplayers.get(13, 1));
        assertEquals(14, leagueplayers.size());
        assertEquals(4, leagueplayers.columns());
    }

    @Test
    public void testleagueplayersstatsselect() {
        playerstats.add(sorenstats); playerstats.add(khanstats);
        playerstats.add(fakerstats); playerstats.add(rekklesstats);
        playerstats.add(uzistats); playerstats.add(jensenstats);
        playerstats.add(praystats); playerstats.add(doubleliftstats);
        playerstats.add(crownstats); playerstats.add(aphromoostats);
        playerstats.add(gorillastats); playerstats.add(hunistats);
        playerstats.add(bangstats); playerstats.add(biofroststats);


        assertEquals("Uzi", playerstats.get(playerstats.size() - 1, 0));
        assertEquals("Aphromoo", playerstats.get(0, 0));
        assertEquals("100", playerstats.get(0, 4));
        assertEquals("152", playerstats.get(3, 4));
        assertEquals("4", playerstats.get(1, 3));
        assertEquals("2.1", playerstats.get(2, 2));
        assertNotEquals("138", playerstats.get(4, 2));
        assertEquals(14, playerstats.size());
        assertEquals(5, playerstats.columns());
    }

    @Test
    public void selectleague() {
        leagueplayers.add(soren); leagueplayers.add(khan);
        leagueplayers.add(faker); leagueplayers.add(rekkles);
        leagueplayers.add(uzi); leagueplayers.add(jensen);
        leagueplayers.add(pray); leagueplayers.add(doublelift);
        leagueplayers.add(crown); leagueplayers.add(aphromoo);
        leagueplayers.add(gorilla); leagueplayers.add(huni);
        leagueplayers.add(bang); leagueplayers.add(biofrost);

        List<Condition> conditionList = new ArrayList<Condition>();
        List<String> columnNames = new ArrayList<String>();
        columnNames.add("Team");
        columnNames.add("Name");
        columnNames.add("Position");
        columnNames.add("Region");
        Column condition = new Column("Team", leagueplayers);
        Condition filter = new Condition(condition, "=", "SKT");
        conditionList.add(filter);
        Table result = leagueplayers.select(columnNames, conditionList);
        assertEquals("Bang", result.get(0, 1));
        assertEquals("Faker", result.get(1, 1));
        assertEquals("Huni", result.get(2, 1));
        assertEquals("KR", result.get(2, 3));
        assertEquals("Top", result.get(2, 2));
    }

    @Test
    public void selectleaguestats() {
        List<Condition> conditionList = new ArrayList<Condition>();
        List<String> columnNames = new ArrayList<String>();
        playerstats.add(sorenstats); playerstats.add(khanstats);
        playerstats.add(fakerstats); playerstats.add(rekklesstats);
        playerstats.add(uzistats); playerstats.add(jensenstats);
        playerstats.add(praystats); playerstats.add(doubleliftstats);
        playerstats.add(crownstats); playerstats.add(aphromoostats);
        playerstats.add(gorillastats); playerstats.add(hunistats);
        playerstats.add(bangstats); playerstats.add(biofroststats);
        columnNames.add("Name");
        columnNames.add("Kills");
        columnNames.add("Rating");
        Column conditionone = new Column("Rating", playerstats);
        Condition filterone = new Condition(conditionone, ">", "150");
        conditionList.add(filterone);
        Table resultone = playerstats.select(columnNames, conditionList);
        assertEquals(6, resultone.size());
        assertEquals(3, resultone.columns());
        assertEquals("Name", resultone.getTitle(0));
        assertEquals("Kills", resultone.getTitle(1));
        assertEquals("Rating", resultone.getTitle(2));
        assertEquals("Bang", resultone.get(0, 0));
        assertEquals("162", resultone.get(4, 2));
        assertEquals("Uzi", resultone.get(5, 0));
    }

    @Test
    public void testleague() {

        List<Condition> conditionList = new ArrayList<Condition>();
        List<String> columnNames = new ArrayList<String>();

        leagueplayers.add(soren); leagueplayers.add(khan);
        leagueplayers.add(faker); leagueplayers.add(rekkles);
        leagueplayers.add(uzi); leagueplayers.add(jensen);
        leagueplayers.add(pray); leagueplayers.add(doublelift);
        leagueplayers.add(crown); leagueplayers.add(aphromoo);
        leagueplayers.add(gorilla); leagueplayers.add(huni);
        leagueplayers.add(bang); leagueplayers.add(biofrost);
        playerstats.add(sorenstats); playerstats.add(khanstats);
        playerstats.add(fakerstats); playerstats.add(rekklesstats);
        playerstats.add(uzistats); playerstats.add(jensenstats);
        playerstats.add(praystats); playerstats.add(doubleliftstats);
        playerstats.add(crownstats); playerstats.add(aphromoostats);
        playerstats.add(gorillastats); playerstats.add(hunistats);
        playerstats.add(bangstats); playerstats.add(biofroststats);
        columnNames.add("Name");
        columnNames.add("Team");
        columnNames.add("Position");
        columnNames.add("Rating");
        Table resultofstats = leagueplayers.select2(playerstats,
                                                    columnNames, conditionList);
        assertEquals(playerstats.get(13, 4), resultofstats.get(13, 3));
        assertEquals(playerstats.get(5, 4), resultofstats.get(5, 3));
        assertEquals(playerstats.get(9, 4), resultofstats.get(9, 3));
        assertEquals(playerstats.get(7, 4), resultofstats.get(7, 3));
        assertEquals(playerstats.get(1, 4), resultofstats.get(1, 3));
        assertEquals(playerstats.get(3, 4), resultofstats.get(3, 3));
        conditionList.clear();
        columnNames.clear();
        List<Condition> newList = new ArrayList<Condition>();
        columnNames.add("Name");
        columnNames.add("Team");
        columnNames.add("Region");
        columnNames.add("Position");
        columnNames.add("Deaths");
        columnNames.add("Rating");
        Column condition1 = new Column("Team", leagueplayers);
        Column condition2 = new Column("Position", leagueplayers);
        Condition conditionone = new Condition(condition1, "=", "SKT");
        Condition conditiontwo = new Condition(condition2, ">", "ADC");
        newList.add(conditionone);
        newList.add(conditiontwo);
        Table resulting = leagueplayers.select2(playerstats,
                                                columnNames, newList);
        assertEquals("Faker", resulting.get(0, 0));
        assertEquals("Deaths", resulting.getTitle(4));
        assertEquals("Name", resulting.getTitle(0));
        assertEquals("KR", resulting.get(0, 2));
        assertEquals("KR", resulting.get(1, 2));
        assertEquals("SKT", resulting.get(0, 1));
        assertEquals("SKT", resulting.get(1, 1));
        assertEquals(2, resulting.size());
        assertEquals(6, resulting.columns());
        assertEquals(playerstats.size(), leagueplayers.size());
    }

    @Test
    public void testgeneric() {
        List<Condition> conditionList = new ArrayList<Condition>();
        List<String> columnNames = new ArrayList<String>();
        generic1.add(two);
        generic1.add(three);
        generic1.add(four);
        generic1.add(five);

        generic2.add(two1);
        generic2.add(three1);
        generic2.add(four1);
        generic2.add(five1);
        generic2.add(six1);

        columnNames.add("Col1");
        columnNames.add("Col2");
        columnNames.add("Col3");
        columnNames.add("Col4");
        Table result = generic1.select2(generic2, columnNames, conditionList);
        assertEquals(4, result.columns());
        assertEquals(3, result.size());
        assertEquals("Col1", result.getTitle(0));
        assertEquals("Col2", result.getTitle(1));
        assertEquals("114", result.get(0, 3));
        assertEquals("112", result.get(2, 2));
        assertEquals("008", result.get(1, 1));
    }

    @Test
    public void testequijoin() {
        List<Column> columnone = new ArrayList<Column>();
        List<Column> columntwo = new ArrayList<Column>();
        leagueplayers.add(soren); leagueplayers.add(khan);
        leagueplayers.add(faker); leagueplayers.add(rekkles);
        leagueplayers.add(uzi); leagueplayers.add(jensen);
        leagueplayers.add(pray); leagueplayers.add(doublelift);
        leagueplayers.add(crown); leagueplayers.add(aphromoo);
        leagueplayers.add(gorilla); leagueplayers.add(huni);
        leagueplayers.add(bang); leagueplayers.add(biofrost);

        playerstats.add(sorenstats);
        playerstats.add(khanstats);
        playerstats.add(fakerstats);
        playerstats.add(rekklesstats);
        playerstats.add(uzistats);
        playerstats.add(jensenstats);
        playerstats.add(praystats);
        playerstats.add(doubleliftstats);
        playerstats.add(crownstats);
        playerstats.add(aphromoostats);
        playerstats.add(gorillastats);
        playerstats.add(hunistats);
        playerstats.add(bangstats);
        playerstats.add(biofroststats);

        Column namesfromleagueplayers = new Column("Name", leagueplayers);
        columnone.add(namesfromleagueplayers);

        Column namesfromstats = new Column("Name", playerstats);
        columntwo.add(namesfromstats);

        assertEquals(false, leagueplayers.equijoin(columnone, columntwo, 0, 0));
        assertEquals(true, leagueplayers.equijoin(columnone, columnone, 0, 0));
        assertEquals(false, leagueplayers.equijoin(columnone, columnone, 5, 0));
    }

    @Test
    public void testDatabase() {
        Database db = new Database();
        nbaplayers.add(lebron); nbaplayers.add(dwyane); nbaplayers.add(curry);
        nbaplayers.add(westbrook); nbaplayers.add(harden); nbaplayers.add(paul);
        nbaplayers.add(giannis);

        stats.add(lebronstats); stats.add(dwyanestats);
        stats.add(currystats); stats.add(westbrookstats);
        stats.add(hardenstats); stats.add(paulstats);
        stats.add(giannisstats);

        playerstats.add(sorenstats); playerstats.add(khanstats);
        playerstats.add(fakerstats); playerstats.add(rekklesstats);
        playerstats.add(uzistats); playerstats.add(jensenstats);
        playerstats.add(praystats); playerstats.add(doubleliftstats);
        playerstats.add(crownstats); playerstats.add(aphromoostats);
        playerstats.add(gorillastats); playerstats.add(hunistats);
        playerstats.add(bangstats); playerstats.add(biofroststats);

        leagueplayers.add(soren); leagueplayers.add(khan);
        leagueplayers.add(faker); leagueplayers.add(rekkles);
        leagueplayers.add(uzi); leagueplayers.add(jensen);
        leagueplayers.add(pray); leagueplayers.add(doublelift);
        leagueplayers.add(crown); leagueplayers.add(aphromoo);
        leagueplayers.add(gorilla); leagueplayers.add(huni);
        leagueplayers.add(bang); leagueplayers.add(biofrost);

        generic1.add(two); generic1.add(three);
        generic1.add(four); generic1.add(five);

        generic2.add(two1); generic2.add(three1);
        generic2.add(four1); generic2.add(five1);
        generic2.add(six1);

        db.put("NBA Players", nbaplayers);
        db.put("NBA Players Stats", stats);
        db.put("League Players", leagueplayers);
        db.put("League Players Stats", playerstats);
        db.put("Generic1", generic1);
        db.put("Generic2", generic2);
        assertEquals(nbaplayers, db.get("NBA Players"));
        assertEquals(stats, db.get("NBA Players Stats"));
        assertEquals(leagueplayers, db.get("League Players"));
        assertEquals(playerstats, db.get("League Players Stats"));
        assertEquals(generic1, db.get("Generic1"));
        assertEquals(generic2, db.get("Generic2"));
        assertEquals(null, db.get("Generic3"));
    }

}
