<?php

class DramaCategory {

}

class Movie {
    private $name;
    private $category;



    public function setCategory(DramaCategory $category) {
        $this->category = $category;
    }


    public function getCategory(DramaCategory $category) {
        return $this->category;
    }
}