<?

$n =  43951789;
$u = -43951789;
$c = 65; // ASCII 65 is 'A'

// заметьте, двойной %% выводится как одинарный '%'
printf("b = '%b'; ", $n); // двоичное представление
printf("c = '%c'; ", $c); // выводит символ ascii, аналогично функции chr()
printf("d = '%d'; ", $n); // обычное целое число
printf("e = '%e'; ", $n); // научная нотация
printf("u = '%u'; ", $n); // беззнаковое целое представление положительного числа
printf("u = '%u'; ", $u); // беззнаковое целое представление отрицательного числа
printf("f = '%f'; ", $n); // представление числа с плавающей точкой
printf("o = '%o'; ", $n); // восьмеричное представление
printf("s = '%s'; ", $n); // строка
printf("x = '%x'; ", $n); // шестнадцатеричное представление (нижний регистр)
printf("X = '%X'; ", $n); // шестнадцатеричное представление (верхний регистр)

printf("+d = '%+d'; ", $n); // описатель знака с положительным целым числом
printf("+d = '%+d'; ", $u); // описатель знака с отрицательным целым числом
