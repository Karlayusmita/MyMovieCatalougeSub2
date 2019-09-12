package com.example.mymoviecatalougesub2;

import java.util.ArrayList;

import static com.example.mymoviecatalougesub2.TVData.tvData;

public class MovieData {
    public static String[][] movieData = new String[][]{
            {String.valueOf(R.drawable.poster_krystal),
                "Krystal",
                "A young man living a sheltered life develops a crush on a stripper and joins her Alcoholics Anonymous group just so he can be in the same room with her.",
                "April 13, 2018",
                "William H. Macy",
                "1h 30m"},
            {String.valueOf(R.drawable.poster_iruttu),
                "Iruttu Araiyil Murattu Kuthu ",
                    "A sexually-starved spirit traps two couples in a bungalow in Bangkok where they have planned to stay for a week. The spirit wants one of the two men to have sex with her. Can they manage to escape?",
                "May 4, 2018",
                "Santhosh P. Jayakumar",
                "1h 58m"},
            {String.valueOf(R.drawable.poster_super_troopers2),
                "Super Troopers 2",
                    "When an international border dispute arises between the U.S. and Canada, the Super Troopers- Mac, Thorny, Foster, Rabbit and Farva, are called in to set up a new Highway Patrol station in the disputed area.",
                " July 17, 2018",
                "Jay Chandrasekhar",
                "1h 40m"},
            {String.valueOf(R.drawable.poster_imagine),
                "Imagine",
                    "A surreal, half-fiction, half real life footage of a day in the life of John lennon and Yoko Ono, composed to music from John's historic 'Imagine' album and Yoko's 'Fly'.",
                "December 23, 1972",
                "Yoko Ono, John Lennon",
                "1h 8m"},
            {String.valueOf(R.drawable.poster_the_utsider),
                "The Outsider",
                "A former American G.I. joins a yakuza family after his release from prison in post-World War II Osaka.",
                "March 9, 2018",
                "Martin Zandvliet",
                "2h 0m"},
            {String.valueOf(R.drawable.poster_edge),
                    "Edge",
                    "EDGE. On the surface, it's the story of a madman terrorizing a helpless city, taking lives without a second thought. Blood is this man's water. Enter Jack Rivers, detective for the city's police department and ace headhunter who always gets his man. Stymied by the difficulty of catching this serial murderer, Jack begins to stumble in a blind fury and the line between 'justice' and 'murder' becomes blurred. This is the story of a man whose life is about to change forever. He's about to go over the EDGE.",
                    "August 3, 2018",
                    "Jacob Whitley",
                    "1h 16m"},
            {String.valueOf(R.drawable.poster_voyoucratie),
                    "Voyoucratie",
                    "Voyoucratie is FGKO’s new film project. It’s a dramatic fiction about a young gangster’s chaotic path into life crushed by a criminal universe that he can’t escape from. It’s also about a frozen portrait of a youth trapped by a system that leads you to delinquency as the only way to exist. The pitch: Sam, a little bandit, finds himself trapped by a corrupted police officer who forces him to get information about Ali, one of the high crime boss known to be very dangerous.",
                    "January 31, 2018",
                    "FGKO",
                    "1h 24m"},
            {String.valueOf(R.drawable.poster_deadpool),
                    "Once Upon a Deadpool",
                    "A kidnapped Fred Savage is forced to endure Deadpool\'s PG-13 rendition of Deadpool 2 as a Princess Bride-esque story that\'s full of magic, wonder and zero F\'s.",
                    "December 11, 2018",
                    "David Leitch",
                    "1h 57m"},
            {String.valueOf(R.drawable.poster_dragon),
                    "How to Train Your Dragon: The Hidden World",
                    "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless\' discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup\'s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                    "January 3, 2019",
                    "Dean DeBlois",
                    "1h 44m"},
            {String.valueOf(R.drawable.poster_glass),
                    "Glass",
                    "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                    "January 16, 2019",
                    "M. Night Shyamalan",
                    "2h 9m"},
            {String.valueOf(R.drawable.poster_hunterkiller),
                    "Hunter Killer",
                    "Captain Glass of the USS Arkansas discovers that a coup d\'état is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war.",
                    "October 19, 2018",
                    "Donovan Marsh",
                    "2h 2m"},
            {String.valueOf(R.drawable.poster_marrypopins),
                    "Mary Poppins Returns",
                    "In Depression-era London, a now-grown Jane and Michael Banks, along with Michael\'s three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives.",
                    "December 13, 2018",
                    "Rob Marshall",
                    "2h 11m"},
            {String.valueOf(R.drawable.poster_mortalengine),
                    "Mortal Engines",
                    "Many thousands of years in the future, Earth\'s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                    "November 27, 2018",
                    "Christian Rivers",
                    "2h 9m"},
            {String.valueOf(R.drawable.poster_robinhood),
                    "Robin Hood",
                    "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                    "November 20, 2018",
                    "Otto Bathurst",
                    "1h 56m"},
            {String.valueOf(R.drawable.poster_thegirl),
                    "The Girl in the Spider",
                    "In Stockholm, Sweden, hacker Lisbeth Salander is hired by Frans Balder, a computer engineer, to retrieve a program that he believes it is too dangerous to exist.",
                    "October 25, 2018",
                    "Fede Alvarez",
                    "1h 57m"}
    };

    public static ArrayList<Movie> getListDataMovie(){
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : movieData){
            Movie movie = new Movie();
            movie.setPoster(aData[0]);
            movie.setTitle(aData[1]);
            movie.setOverview(aData[2]);
            movie.setRelease_date(aData[3]);
            movie.setDirector_name(aData[4]);
            movie.setRuntime(aData[5]);
            list.add(movie);
        }
        return list;
    }
}
