fun main() {
    val song = Song("Hype Boy", "NewJeans", 2022, 100000)
    println(song.isPopular)
    song.songDescription()
}

class Song(val title: String, val artist: String, val release: Int, val playTime: Int) {

    val isPopular: Boolean
        get() = playTime >= 1000
    
    fun songDescription() {
        println("[${title}, ${artist}, ${release}]")
    }
}