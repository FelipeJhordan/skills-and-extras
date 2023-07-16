<?php

interface Category {

}

class DramaCategory implements Category {

}

class Movie {
    public function __construct($name, Category $category) {
        $this->name = $name;

        $this->category = $category;
        
    }
}