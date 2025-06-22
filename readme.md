Для размещения тестовых методов были созданы три класса:

	- TestsGeneral;                                                                                                                                            
	- TestsElementaryOperations;
	- TestsComparisons.

Класс **TestsElementaryOperations** предназначен для тестирования элементарных операций (сложение, вычитание, умножение, деление).
Класс **TestsComparisons** предназначен для тестирования сравнений (равно, меньше, меньше или равно).
Класс **TestsGeneral** предназначен для тестирования базовых методов класса Rational.

Класс **TestsGeneral** включает в себя следующие тестовые методы:

	- testStandardConstructor(): проверка значения числителя и знаменателя стандартного экземпляра класса;
	- testConstructor(): проверка значения числителя и знаменателя экземпляра класса, определенного пользователем;
	- testZeroDenominatorConstructor(): проверка исключения при попытке создания дроби с нулевым знаменателем;
	- testReductionRational(): проверка сокращения дроби;
	- testMinusBeforeNumerator(): проверка, что минус стоит перед числителем дроби;
	- testToString(): проверка отображения дроби в корректном формате (a/b);
	- testSetNumerator(): проверка изменения числителя дроби;
	- testSetDenominator(): проверка изменения знаменателя дроби.

Класс **TestsComparisons** включает в себя аннотацию *@BeforeClass*, в которой были предопределены два объекта Rational: *firstFraction* и *secondFraction* (первая и вторая дроби). Это было сделано для того, чтобы в различных тестовых методах не создавать каждый раз новые объекты, а обращаться к предопределенным.  
Класс **TestsComparisons** включает в себя следующие тестовые методы:

	- testEquals_Equal(): проверка, что две одинаковые дроби равны;
	- testEquals_NotEqual(): проверка, что две разные дроби не равны;
	- testLess_Less(): проверка, что меньшая дробь меньше большей дроби;
	- testLess_Equal(): проверка, что дробь не меньше той же самой дроби;
	- testLess_Greater(): проверка, что бОльшая дробь не меньше меньшей дроби;
	- testLessOrEqual_Less(): проверка, что меньшая дробь меньше или равна большей дроби;
	- testLessOrEqual_Equal(): проверка, что дробь меньше или равна той же дроби;
	- testLessOrEqual_Greater(): проверка, что бОльшая дробь не меньше или равна меньшей дроби.

Класс **TestsElementaryOperations** включает в себя аннотацию *@BeforeClass*, в которой были предопределены следующие объекты класса Rational:

	- firstPositiveFraction: положительная дробь №1 (1/2);
	- secondPositiveFraction: положительная дробь №2 (3/4);
	- zeroFraction: нулевая дробь (0/1);
	- firstNegativeFraction: отрицательная дробь №1 (-2/3);
	- secondNegativeFraction: отрицательная дробь №2 (-4/5);
	- unitFraction: единичная дробь (1/1).
Кроме того, для каждой арифмитечской операции были предопределены строковые переменные, информирующие, что тест был не пройден. Это было сделано для того, чтобы не вводить каждый раз в качестве параметра assertion сообщение, а ввести предопределенную переменную.
Были определены следующие строковые переменные:

	- msgPlus: "The sum of first term and second term is not equal to the correct value" - результат суммы двух переменных имеет неправильное значение;
	- msgMultiply: "The product of first multiplier and second multiplier is not equal to the correct value" - результат произведения двух множителей имеет неправильное значение;
	- msgMinus: "The difference of minuend and subtrahend is not equal to the correct value" - результат разности уменьшаемого и вычитаемого имеет не правильное значение;
	- msgDivide: "The quotient of dividend and divider is not equal to the correct value" - результат деления делимого и делителя имеет не правильное значение.
Для различных операций были определены классы эквивалентности и были сформированы соответствующие тестовые методы:

*Сложение*:

	- положительное + положительное: testPlus_PositiveAndPositive();
	- положительное + отрицательное: testPlus_PositiveAndNegative();  
	- отрицательное + положительное: testPlus_NegativeAndPositive();
	- отрицательное + отрицательное: testPlus_NegativeAndNegative();
	- прибавление нулевой дроби: testPlus_PlusZero();
	- прибавление к нулевой дроби: testPlus_ZeroPlus().
*Умножение*:

	- положительное & положительное: testMultiply_PositiveAndPositive();
	- положительное & отрицательное: testMultiply_PositiveAndNegative();
	- отрицательное & положительное: testMultiply_NegativeAndPositive();
	- отрицательное & отрицательное: testMultiply_NegativeAndNegative();
	- умножение на нулевую дробь: testMultiply_MultiplyByZero();
	- умножение нулевой дроби: testMultiply_MultiplyOfZero();
	- умножение на единичную дробь: testMultiply_MultiplyByUnit();
	- умножение единичной дроби: testMultiply_MultiplyOfUnit().
*Вычитание*:

	- положительное - положительное: testMinus_PositiveAndPositive();
	- положительное - отрицательное: testMinus_PositiveAndNegative();
	- отрицательное - положительное: testMinus_NegativeAndPositive();
	- отрицательное - отрицательное: testMinus_NegativeAndNegative();
	- вычитание нулевой дроби: testMinus_ZeroSubtrahend();
	- вычитание из нулевой дроби: testMinus_ZeroMinuend().
*Деление*:

	- положительное / положительное: testDivide_PositiveAndPositive();
	- положительное / отрицательное: testDivide_PositiveAndNegative();
	- отрицательное / положительное: testDivide_NegativeAndPositive();
	- отрицательное / отрицательное: testDivide_NegativeAndNegative();
	- деление нулевой дроби: testDivide_ZeroDividend();
	- деление на нулевую дробь: testDivide_ZeroDivider();
	- деление единичной дроби: testDivide_UnitDividend();
	- деление на единичную дробь: testDivide_UnitDivider().






