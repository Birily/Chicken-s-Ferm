public class PhraseOMatic {

    public static void main(String[] args) {
	String[] wordsListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based",
                            "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
	String[] wordsListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered",
                            "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
                            "targeted", "shared", "cooperative", "accelerated"};
	String[] wordsListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy",
                               "mind-share", "portal", "space", "vision", "paradigm", "mission"};

	int oneLength = wordsListOne.length;
	int twoLength = wordsListTwo.length;
	int threeLength = wordsListThree.length;

	int rand1 = (int) (Math.random()*oneLength);
	int rand2 = (int) (Math.random()*twoLength);
	int rand3 = (int) (Math.random()*threeLength);

	String phrase = wordsListOne[rand1] + " " + wordsListTwo[rand2] + " " + wordsListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
