<?php

abstract class Video {
    abstract public function calculaInteresse();
}


class Movie extends Video {
    public function calculaInteresse() {
        // calcula
    }
}

class TVShow extends Movie {
    public function calculaInteresse() {
        // calcula
    }
}