<!-- As Subclasses podem ser substituidas por suas classes pai -->

<?php

class Movie {
    public function play() {
        // play no video
    }

    public function increaseVolume() {

    }
}

class TheLionKing extends Movie {

}

class ModernTimes extends Movie {
    public function increaseVolume() {
        // puts
    }
}

$movie = new TheLionKing();

?>