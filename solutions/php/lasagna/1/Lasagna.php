<?php

class Lasagna
{    
    public function expectedCookTime()
    {
        return 40;
    }

    public function remainingCookTime($elapsed_minutes)
    {    
        $lasagna = new Lasagna();
        return $lasagna->expectedCookTime()-$elapsed_minutes;
    }

    public function totalPreparationTime($layers_to_prep)
    {
        $time = 2;
        return $time * $layers_to_prep;
    }

    public function totalElapsedTime($layers_to_prep, $elapsed_minutes)
    {
        return (2 * $layers_to_prep) + $elapsed_minutes;
    }

    public function alarm()
    {
       return 'Ding!';
    }
}
