package Controllers;

import Model.Map.Province;

import java.util.Set;

/**
 * Created by jaln on 10/12/15.
 */
public class MapController {

    /**
     * Creates the Provinces
     */
    public void createProvinces() {
        Province castleBlack = new Province("CastleBlack", 0, 1, 0, true, false);
        Province karhold = new Province("Karhold", 0, 1, 0, true, false);
        Province shiveringSea = new Province("The Shivering Sea", 0, 0, 0, false, false);
        Province bayOfIce = new Province("Bay Of Ice", 0, 0, 0, false, false);
        Province winterfell = new Province("Winterfell", 2, 1, 1, true, true);
        Province stonyShore = new Province("The Stony Shore", 0, 0, 1, true, false);
        Province whiteHarbour = new Province("White Harbour", 1, 0, 0, true, true);
        Province widowsWatchs = new Province("Widow's Watch", 0, 0, 1, true, false);
        Province moatCaitlin = new Province("Moat Caitlin", 1, 0, 0, true, false);
        Province narrowSea = new Province("The Narrow Sea", 0, 0, 0, false, false);
        Province flintsFinger = new Province("Flint's Finger", 1, 0, 0, true, false);
        Province greyWaterWatch = new Province("Greywater Watch", 0, 0, 1, true, false);
        Province seagard = new Province("Seagard", 2, 1, 1, true, false);
        Province twins = new Province("The Twins", 0, 1, 0, true, false);
        Province fingers = new Province("The Fingers", 0, 0, 1, true, false);
        Province mountainsOfTheMoon = new Province("The Mountains of the Moon", 0, 0, 1, true, false);
        Province eyrie = new Province("The Eyrie", 1, 1, 1, true, false);
        Province ironmansBay = new Province("The Ironman's Bay", 0, 0, 0, false, false);
        Province pyke = new Province("Pyke", 2, 0, 1, true, true);
        Province riverrun = new Province("Riverrun", 2, 1, 1, true, false);
        Province harrenhall = new Province("Harrenhall", 1, 1, 0, true, false);
        Province crackclawPoint = new Province("Crackclaw Point", 1, 0, 0, true, false);
        Province dragonstone = new Province("Dragonstone", 2, 1, 1, true, true);
        Province shipbreakerBay = new Province("Shipbreaker Bay", 0, 0, 0, false, false);
        Province blackwaterBay = new Province("Blackwater Bay", 0, 0, 0, false, false);
        Province kingsLanding = new Province("King's Landing", 2, 2, 0, true, false);
        Province blackwater = new Province("Blackwater", 0, 0, 2, true, false);
        Province stoneySept = new Province("Stoney Sept", 0,1,0, true, false);
        Province lannisport = new Province("Lannisport", 2, 0, 2, true, true);
        Province goldenSound = new Province("The Golden Sound", 0, 0, 0, false, false);
        Province sunsetSea = new Province("Sunset Sea", 0, 0, 0, false, false);
        Province searoadMarches = new Province("Searoad Marches", 0, 0, 1, true, false);
        Province reach = new Province("The Reach", 1, 0, 0, true, false);
        Province kingswood = new Province("Kingswood", 0, 1, 1, true, false);
        Province stormsEnd = new Province("Storm's End", 1, 0, 0, true, true);
        Province seaOfDorne = new Province("Sea of Dorne", 0, 0, 0, false, false);
        Province boneway = new Province("The Boneway", 0, 1, 0, true, false);
        Province dornishMarches = new Province("Dornish Marches", 0, 1, 0, true, false);
        Province highgarden = new Province("Highgarden", 2, 0, 2, true, false);
        Province oldtown = new Province("Oldtown", 2, 0, 0, true, true);
        Province redwyneStraights = new Province("Redwyne Straights", 0, 0, 0, false, false);
        Province threeTowers = new Province("Three Towers", 0, 0, 1, true, false);
        Province princesPass = new Province("Prince's Pass", 0, 1, 1, true, false);
        Province starfall = new Province("Starfall", 1, 0, 1, true, false);
        Province yronwood = new Province("Yronwood", 1, 0, 0, true, false);
        Province saltShore = new Province("Salt Shore", 0, 0, 1, true, false);
        Province sunspear = new Province("Sunspear", 2, 1, 1, true, true);
        Province eastSummerSea = new Province("East Summer Sea", 0, 0, 0, false, false);
        Province westSummerSea = new Province("West Summer Sea", 0, 0, 0, false, false);
        Province arbor = new Province("The Arbor", 0, 1, 0, true, false);
        // Link Provinces
        joinNeighbours(castleBlack, karhold);
        joinNeighbours(castleBlack, bayOfIce);
        joinNeighbours(castleBlack, winterfell);
        joinNeighbours(castleBlack, shiveringSea);
        joinNeighbours(karhold, shiveringSea);
        joinNeighbours(karhold, winterfell);
        joinNeighbours(winterfell, bayOfIce);
        joinNeighbours(winterfell, stonyShore);
        joinNeighbours(winterfell, whiteHarbour);
        joinNeighbours(winterfell, shipbreakerBay);
        joinNeighbours(winterfell, moatCaitlin);
        joinNeighbours(shiveringSea, widowsWatchs);
        joinNeighbours(shiveringSea, narrowSea);
        joinNeighbours(bayOfIce, stonyShore);
        joinNeighbours(bayOfIce, greyWaterWatch);
        joinNeighbours(bayOfIce, flintsFinger);
        joinNeighbours(bayOfIce, sunsetSea);
        joinNeighbours(whiteHarbour, widowsWatchs);
        joinNeighbours(whiteHarbour, narrowSea);
        joinNeighbours(moatCaitlin, narrowSea);
        joinNeighbours(moatCaitlin, twins);
        joinNeighbours(moatCaitlin, seagard);
        joinNeighbours(moatCaitlin, greyWaterWatch);
        joinNeighbours(greyWaterWatch, flintsFinger);
        joinNeighbours(greyWaterWatch, seagard);
        joinNeighbours(greyWaterWatch, ironmansBay);
        joinNeighbours(flintsFinger, ironmansBay);
        joinNeighbours(flintsFinger, sunsetSea);
        joinNeighbours(ironmansBay, seagard);
        joinNeighbours(ironmansBay, riverrun);
        joinNeighbours(ironmansBay, pyke);
        joinNeighbours(fingers, twins);
        joinNeighbours(fingers, mountainsOfTheMoon);
        joinNeighbours(fingers, narrowSea);
        joinNeighbours(seagard, twins);
        joinNeighbours(seagard, riverrun);
        joinNeighbours(twins, narrowSea);
        joinNeighbours(mountainsOfTheMoon, eyrie);
        joinNeighbours(mountainsOfTheMoon, crackclawPoint);
        joinNeighbours(mountainsOfTheMoon, narrowSea);
        joinNeighbours(crackclawPoint, narrowSea);
        joinNeighbours(crackclawPoint, harrenhall);
        joinNeighbours(crackclawPoint, blackwater);
        joinNeighbours(crackclawPoint, kingsLanding);
        joinNeighbours(crackclawPoint, blackwaterBay);
        joinNeighbours(crackclawPoint, shipbreakerBay);
        joinNeighbours(dragonstone, shipbreakerBay);
        joinNeighbours(blackwaterBay, kingsLanding);
        joinNeighbours(blackwaterBay, kingswood);
        joinNeighbours(blackwaterBay, shipbreakerBay);
        joinNeighbours(harrenhall, riverrun);
        joinNeighbours(harrenhall, stoneySept);
        joinNeighbours(harrenhall, blackwater);
        joinNeighbours(riverrun, goldenSound);
        joinNeighbours(riverrun, lannisport);
        joinNeighbours(riverrun, stoneySept);
        joinNeighbours(riverrun, goldenSound);
        joinNeighbours(lannisport, goldenSound);
        joinNeighbours(lannisport, stoneySept);
        joinNeighbours(lannisport, searoadMarches);
        joinNeighbours(goldenSound, sunsetSea);
        joinNeighbours(stoneySept, searoadMarches);
        joinNeighbours(stoneySept, blackwater);
        joinNeighbours(kingsLanding, kingswood);
        joinNeighbours(kingsLanding, reach);
        joinNeighbours(kingsLanding, blackwater);
        joinNeighbours(searoadMarches, sunsetSea);
        joinNeighbours(searoadMarches, westSummerSea);
        joinNeighbours(searoadMarches, highgarden);
        joinNeighbours(searoadMarches, reach);
        joinNeighbours(sunsetSea, westSummerSea);
        joinNeighbours(reach, kingswood);
        joinNeighbours(reach, highgarden);
        joinNeighbours(reach, dornishMarches);
        joinNeighbours(reach, boneway);
        joinNeighbours(reach, kingswood);
        joinNeighbours(kingswood, shipbreakerBay);
        joinNeighbours(kingswood, stormsEnd);
        joinNeighbours(kingswood, boneway);
        joinNeighbours(stormsEnd, shipbreakerBay);
        joinNeighbours(stormsEnd, seaOfDorne);
        joinNeighbours(stormsEnd, eastSummerSea);
        joinNeighbours(stormsEnd, boneway);
        joinNeighbours(shipbreakerBay, eastSummerSea);
        joinNeighbours(highgarden, westSummerSea);
        joinNeighbours(highgarden, redwyneStraights);
        joinNeighbours(highgarden, oldtown);
        joinNeighbours(highgarden, dornishMarches);
        joinNeighbours(dornishMarches, oldtown);
        joinNeighbours(dornishMarches, threeTowers);
        joinNeighbours(dornishMarches, princesPass);
        joinNeighbours(dornishMarches, boneway);
        joinNeighbours(boneway, seaOfDorne);
        joinNeighbours(boneway, yronwood);
        joinNeighbours(boneway, princesPass);
        joinNeighbours(redwyneStraights, arbor);
        joinNeighbours(redwyneStraights, westSummerSea);
        joinNeighbours(redwyneStraights, threeTowers);
        joinNeighbours(threeTowers, westSummerSea);
        joinNeighbours(arbor, westSummerSea);
        joinNeighbours(westSummerSea, eastSummerSea);
        joinNeighbours(westSummerSea, starfall);
        joinNeighbours(princesPass, yronwood);
        joinNeighbours(princesPass, starfall);
        joinNeighbours(yronwood, starfall);
        joinNeighbours(yronwood, saltShore);
        joinNeighbours(yronwood, sunspear);
        joinNeighbours(yronwood, seaOfDorne);
        joinNeighbours(starfall, eastSummerSea);
        joinNeighbours(starfall, saltShore);
        joinNeighbours(saltShore, sunspear);
        joinNeighbours(saltShore, eastSummerSea);
        joinNeighbours(eastSummerSea, seaOfDorne);
        joinNeighbours(eastSummerSea, sunspear);
        joinNeighbours(seaOfDorne, sunspear);
    }

    /**
     * Joins two provinces together as neighbours
     * @param province1
     * @param province2
     */
    public void joinNeighbours(Province province1, Province province2) {
        province1.addNeighbour(province2);
        province2.addNeighbour(province1);
    }

}
