<?php
    // 自分の得意な言語で
    // Let's チャレンジ！！
    $input_line = fgets(STDIN);
    $string_length = strlen($input_line) - 1;
    for($i = 0; $i < $string_length + 2; $i++){
        echo "+";
    }
    echo PHP_EOL;
    echo "+" . substr($input_line, 0, $string_length) . "+" . PHP_EOL;
    
    for($i = 0; $i < $string_length + 2; $i++){
        echo "+";
    }
?>