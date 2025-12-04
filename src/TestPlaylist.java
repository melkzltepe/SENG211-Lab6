public class TestPlaylist {
    public static void main(String[] args) {
        Playlist playlist1 = new Playlist("Favourites");
        playlist1.addSong("Emre Fel - Hayır Gelmez");
        playlist1.addSong("Emre Fel - Sana El Pençe Durmam");
        playlist1.addSong("Emre Fel - Veda Türküsü");
        playlist1.addSong("Pera - Zemheri");
        playlist1.addSong("Pera - Biri Vardı");
        playlist1.addSong("Pera - Aşk Biter");
        playlist1.addSong("Pera - Son Bir Defa");
        playlist1.addSong("Emre Fel - Elveda");
        playlist1.printSongs();
        System.out.println("Number of songs: " + playlist1.getSongCount());
        playlist1.removeSong("Emre Fel - Sana El Pençe Durmam");
        playlist1.printSongs();
        System.out.println("Number of songs: " + playlist1.getSongCount());
    }
}
