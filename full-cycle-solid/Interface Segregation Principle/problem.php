<!-- As Subclasses podem ser substituidas por suas classes pai -->

<?php

interface  Movie {
    public function play();
    public function increaseVolume();
}

class TheLionKing implements Movie {
   public function play() {}
   public function increaseVolume() {

   }
}

class ModernTimes implements Movie {
    public function play() {}

    public function increaseVolume() {
        // puts
    }
}

$movie = new TheLionKing();

?>