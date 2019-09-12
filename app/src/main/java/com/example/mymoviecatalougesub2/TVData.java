package com.example.mymoviecatalougesub2;

import java.util.ArrayList;

public class TVData {
    public static String [][] tvData = new String [][]{
            {String.valueOf(R.drawable.poster_the_fix),
                    "The Fix",
                    "Comedians Jimmy Carr, D.L. Hughley and Katherine Ryan tackle the world's woes with help from a rotating crew of funny guests and an actual expert.",
                    "NETFLIX",
                    "30m",
                    "TALK, COMEDY"},
            {String.valueOf(R.drawable.poster_drain_the_oceans),
                    "Drain the Oceans",
                    "Maritime mysteries -- old and new -- come to life in this 10-episode series, combining scientific data and digital re-creations to reveal shipwrecks, treasures, and sunken cities on the bottom of lakes, seas and oceans around the world.",
                    "NATIONAL GEOGRAPHIC",
                    "47m",
                    "DOCUMENTARY"},
            {String.valueOf(R.drawable.postre__when_i_grow_up),
                    "When I Grow Up",
                    "Mikaela explores different careers to figure out what she wants to be when she grows up",
                    "-",
                    "-",
                    "KIDS"},
            {String.valueOf(R.drawable.poster_wannabe),
                    "Wannabe",
                    "Maxine never made it to the big time as part of girl group Variety, but is still desperately trying to cling on to her dream as the (failing) music manager for teenage pop group Sweet Gyal. However Maxine finds herself in crisis when, fed up of her trying to live vicariously through them and her embarrassing attempts to get them a record deal, Sweet Gyal threaten to drop her.\n" +
                            "\n" +
                            "But Maxine has come up with a plan. A come back. This time bigger, bolder and, well... older. Who cares about a hip young girl group anyway?! What the world is really missing is Mum Pop.\n" +
                            "\n" +
                            "Featured Crew",
                    "BBC THREE",
                    "25m",
                    "COMEDY"},
            {String.valueOf(R.drawable.poster_hadaka),
                    "Hadaka no Shounen",
                    "Cooking show with two Johnny Jr. groups, HiHi Jets and Sexy Bishounen.",
                    "TV ASAHI",
                    "-",
                    "No Gendres have been"},
            {String.valueOf(R.drawable.poster_freefonix),
                    "Freefonix ",
                    "Freefonix is a British CGI animated television series about the adventures of fictional band of the same name.\n" +
                            "\n" +
                            "The series launched on 4 January 2008 and aired on children channel CBBC's on their daily segment on BBC One for thirteen weeks. The rest of the series, which consists of 40 x 24 minute episodes, along with the first thirteen, broadcast over the winter period on weekends on CBBC from 8 December 2008 into the January of 2009.",
                    "BBC ONE",
                    "30m, 24m",
                    "ANIMATION"},
            {String.valueOf(R.drawable.poster_cities),
                    "Cities: Nature's New Wild ",
                    "Discover the remarkable ways animals of all shapes and sizes are adapting to make the most of opportunities in the newest and fastest changing habitat on the planet - our cities.",
                    "BBC TWO",
                    "60m",
                    "DOCUMENTARY"},
            {String.valueOf(R.drawable.poster_buy_it_now),
                    "Buy It Now",
                    "Inventors, creators and sellers of new products have just 90 seconds to demonstrate their item before an audience of buyers in the hope of securing an order for their product. Hosted by Brian Conley.",
                    "CHANEL 4",
                    "23m",
                    "REALITY"},
            {String.valueOf(R.drawable.poster_kom_faek),
                    "Kom Faek",
                    "We don't have an overview translated in English. Help us expand our database by adding one.",
                    "-",
                    "-",
                    "DRAMA"},
            {String.valueOf(R.drawable.poster_love_is),
                    "LOVE IS ___",
                    "Follow a young black couple in 1990s Los Angeles, two people from opposite worlds, as they go through the trials and tribulations of chasing their dreams and learning how to follow their hearts. Nuri is bubbly and has big dreams, but she is struggling to make a name for herself as a sitcom staff writer while juggling a string of romances. Yasir is an aspiring director/writer who has hit a snag and is on-and-off again with his ex. The program is told from the perspective of Nuri and Yasir's present-selves while they revisit the social issues and the vibrant black culture that helped shape who they are today.",
                    "OWN",
                    "45m",
                    "DRAMA"},
            {String.valueOf(R.drawable.poster_marvel),
                    "Marvel's Cloak & Dagger ",
                    "Two teenagers from very different backgrounds awaken to newly acquired superpowers which mysteriously link them to one another.",
                    "FREEFORM",
                    "44m",
                    "ACTION&ADVENTURE, DRAMA, SCI-FI & FANTASY"},
            {String.valueOf(R.drawable.poster_diablo),
                    "Diablo Guardián ",
                    "The story of Violetta, a young woman who flees her native Mexico to start anew in New York City. But instead of a living a dream, Violetta is awoken to a harsh reality when she runs out of money, sending her into the arms of the villainous Nefastófeles.",
                    "AMAZONE",
                    "40m",
                    "DRAMA"},
            {String.valueOf(R.drawable.poster_hom_from_home),
                    "Home from Home",
                    "Uptight, try-hard dad Neil Hackett's decision to buy a lodge in the Lake District proves disastrous when he discovers he is living next door to the uber successful, effortlessly superior Dillons.",
                    "BBC TWO",
                    "27m",
                    "COMEDY"},
            {String.valueOf(R.drawable.poster_moeyo),
                    "Moeyo Ken TV",
                    "Since the era changed from Edo to Meiji, Japan has been changing rapidly with the current government's policy of modernization. Kyoto where Expo was being held. The government issued licenses to monsters that lived with humans. There was a company that arrested unregistered monsters to keep the peace. The name of the company is \"Kido Shinsengumi Co. Ltd.\" Meanwhile, a young guy came back to Kyoto from Shanghai with his monster buddy, Nekomaru. He was Sakamoto Ryunosuke, the son of Sakamoto Ryoma.",
                    "ANIMAX",
                    "25m",
                    "SCI-FI & FANTASY"},
            {String.valueOf(R.drawable.poster_all_together),
                    "All Together Now - The 100",
                    "Seven has started promoting the biggest TV judging panel ever – 99 judges joining captain Ronan Keating on All Together Now. With 100 judges, a six-storey high set and Julia Zemiro as host, it doesn’t get any bigger. Headed up by singing superstar Ronan Keating, The 100 is made up of singers and industry professionals with big voices and even bigger opinions.",
                    "GMA",
                    "45m",
                    "COMEDY, REALITY"}
    };

    public static ArrayList<TV> getListDataTV(){
        ArrayList<TV> list = new ArrayList<>();
        for (String[] aData : tvData){
            TV tv = new TV();
            tv.setPoster(aData[0]);
            tv.setTitle(aData[1]);
            tv.setOverview(aData[2]);
            tv.setNetwork(aData[3]);
            tv.setRuntime(aData[4]);
            tv.setGenre(aData[5]);
            list.add(tv);
        }
        return list;
    }
}
