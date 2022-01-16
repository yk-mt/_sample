<?php
    // 自分の得意な言語で
    // Let's チャレンジ！！
    $input_line = explode(" ",trim(fgets(STDIN)));
    $singer_count = intval($input_line[0]);
    $bar_length = intval($input_line[1]);
    $bar_levels = [];
    
    for($n = 0; $n < $bar_length; $n++){
        $bar_levels[] = intval(trim(fgets(STDIN)));
    }
    $menbar_points = [];
    for($i = 0; $i < $singer_count; $i++){
        $temp_member = 100;
        for($j =0; $j < $bar_length; $j++){
            $tempbar = intval(trim(fgets(STDIN)));
            $temp_difference = 0;
            if($bar_levels[$j] > $tempbar){
                $temp_difference = ($bar_levels[$j] - $tempbar);
            }else{
                $temp_difference = ($tempbar - $bar_levels[$j]);
            }
            /*
            ・誤差 5 Hz 以内なら減点しない
            ・上記に当てはまらず、誤差 10 Hz 以内なら 1 点減点
            ・上記に当てはまらず、誤差 20 Hz 以内なら 2 点減点
            ・上記に当てはまらず、誤差 30 Hz 以内なら 3 点減点
            ・上記に当てはまらない場合、5 点減点
            */
            if($temp_difference <= 5){
            }elseif ($temp_difference <= 10) {
                $temp_member = $temp_member - 1;
            }elseif ($temp_difference <= 20) {
                $temp_member = $temp_member - 2;
            }elseif ($temp_difference <= 30) {
                $temp_member = $temp_member - 3;
            }elseif ($temp_difference){
                $temp_member = $temp_member - 5;
            }
            
        }
        $menbar_points[] = max($temp_member,0);
    }
    echo max($menbar_points).PHP_EOL;
?>